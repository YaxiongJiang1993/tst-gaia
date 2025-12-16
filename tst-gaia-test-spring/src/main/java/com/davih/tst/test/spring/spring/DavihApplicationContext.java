package com.davih.tst.test.spring.spring;

import com.davih.tst.test.spring.spring.annotation.Component;
import com.davih.tst.test.spring.spring.annotation.ComponentScan;
import com.davih.tst.test.spring.spring.annotation.Scope;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DavihApplicationContext {

    private Class<?> configClas;

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();
    private Map<String, Object> singletonObjects = new HashMap<>();

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
            instance = clazz.getConstructor().newInstance();
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

                            Component component = clazz.getAnnotation(Component.class);
                            String beanName = component.value();

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
