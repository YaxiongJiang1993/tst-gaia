package com.davih.tst.test.spring.spring;

import com.davih.tst.test.spring.spring.annotation.Autowired;
import com.davih.tst.test.spring.spring.annotation.Component;
import com.davih.tst.test.spring.spring.annotation.ComponentScan;
import com.davih.tst.test.spring.spring.annotation.Scope;
import org.apache.commons.lang3.StringUtils;

import java.beans.Introspector;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DavihApplicationContext {

    private Class<?> configClas;

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();
    private Map<String, Object> singletonObjects = new HashMap<>();

    private List<BeanPostProcessor> beanPostProcessorList = new ArrayList<>();

    public DavihApplicationContext(Class<?> configClas) {
        this.configClas = configClas;

        scan(configClas);

        // create
        beanDefinitionMap.forEach((beanName, beanDefinition) -> {
            if (beanDefinition.getType().equals("singleton")) {
                Object bean = createBean(beanName, beanDefinition);
                singletonObjects.put(beanName, bean);
            }
        });
    }

    private Object createBean(String beanName, BeanDefinition beanDefinition) {
        Class<?> clazz = beanDefinition.getClazz();
        Object instance = null;
        try {

            // instance
            instance = clazz.getConstructor().newInstance();

            // populate
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(Autowired.class)) {
                    field.setAccessible(true);
                    String filedName = field.getName();
                    field.set(instance, getBean(filedName));
                }
            }

            // aware

            // postProcessor before
            for (BeanPostProcessor postProcessor : beanPostProcessorList) {
                instance = postProcessor.postProcessorBeforeInitialization(instance, beanName);
            }

            // initializing
            if (instance instanceof InitializingBean) {
                InitializingBean initializingBean = (InitializingBean) instance;
                try {
                    initializingBean.afterPropertiesSet();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            // postProcessor after
            for (BeanPostProcessor postProcessor : beanPostProcessorList) {
                instance = postProcessor.postProcessorAfterInitialization(instance, beanName);
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        return instance;
    }

    private void scan(Class<?> configClas) {
        // 扫描
        if (configClas.isAnnotationPresent(ComponentScan.class)) {

            ComponentScan componentScanAnnotation = configClas.getAnnotation(ComponentScan.class);
            String path = componentScanAnnotation.value();

            System.out.println(path);

            path = path.replace(".", "/");

            ClassLoader classLoader = DavihApplicationContext.class.getClassLoader();
            URL url = classLoader.getResource(path);

            File file = new File(url.getFile());
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    String absolutePath = f.getAbsolutePath();
                    System.out.println(absolutePath);

                    absolutePath = absolutePath.substring(absolutePath.indexOf("com"), absolutePath.indexOf(".class"));
                    absolutePath = absolutePath.replace("/", ".");
                    System.out.println(absolutePath);

                    try {
                        Class<?> clazz = classLoader.loadClass(absolutePath);

                        if (clazz.isAnnotationPresent(Component.class)) {

                            if (BeanPostProcessor.class.isAssignableFrom(clazz)) {
                                try {
                                    BeanPostProcessor postProcessor = (BeanPostProcessor) clazz.getConstructor().newInstance();
                                    beanPostProcessorList.add(postProcessor);
                                } catch (InstantiationException e) {
                                    throw new RuntimeException(e);
                                } catch (IllegalAccessException e) {
                                    throw new RuntimeException(e);
                                } catch (InvocationTargetException e) {
                                    throw new RuntimeException(e);
                                } catch (NoSuchMethodException e) {
                                    throw new RuntimeException(e);
                                }
                            }

                            Component component = clazz.getAnnotation(Component.class);
                            String beanName = component.value();

                            if (StringUtils.isBlank(beanName)) {
                                beanName = Introspector.decapitalize(absolutePath);
                            }

                            BeanDefinition beanDefinition = new BeanDefinition();
                            beanDefinition.setClazz(clazz);

                            if (clazz.isAnnotationPresent(Scope.class)) {
                                Scope scope = clazz.getAnnotation(Scope.class);
                                String type = scope.value();
                                beanDefinition.setType(type);
                            } else {
                                beanDefinition.setType("singleton");
                            }

                            beanDefinitionMap.put(beanName, beanDefinition);

                        }
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    public Object getBean(String beanName) {

        if (!beanDefinitionMap.containsKey(beanName)) {
            throw new NullPointerException(beanName + "not existed");
        }

        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        Object bean = null;
        if ("singleton".equals(beanDefinition.getType())) {
            bean = singletonObjects.get(beanName);
        } else {
            bean = createBean(beanName, beanDefinition);

        }

        return bean;
    }
}
