package com.davih.tst.web.test.kafka;

import cn.hutool.core.util.StrUtil;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.ListTopicsOptions;
import org.apache.kafka.clients.admin.ListTopicsResult;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Component;

import java.util.Properties;
import java.util.Set;

public class KafkaTest {

    private static final String BOOT_SERVER = "10.128.15.236:9092,10.128.15.237:9092,10.128.15.238:9092";

    public static void main(String[] args) {
//        test01();
        String log="SLF4J: Class path contains multiple SLF4J bindings.\n" +
                "SLF4J: Found binding in [jar:file:/usr/lib/flink/lib/log4j-slf4j-impl-2.17.2.jar!/org/slf4j/impl/StaticLoggerBinder.class]\n" +
                "SLF4J: Found binding in [jar:file:/usr/lib/flink/lib/slf4j-jdk14-1.7.30.jar!/org/slf4j/impl/StaticLoggerBinder.class]\n" +
                "SLF4J: Found binding in [jar:file:/usr/lib/hadoop/lib/slf4j-reload4j-1.7.36.jar!/org/slf4j/impl/StaticLoggerBinder.class]\n" +
                "SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.\n" +
                "SLF4J: Actual binding is of type [org.apache.logging.slf4j.Log4jLoggerFactory]\n" +
                "WARNING: An illegal reflective access operation has occurred\n" +
                "WARNING: Illegal reflective access by org.apache.flink.api.java.ClosureCleaner (file:/usr/lib/flink/lib/flink-dist-1.17.0.jar) to field java.lang.Class.ANNOTATION\n" +
                "WARNING: Please consider reporting this to the maintainers of org.apache.flink.api.java.ClosureCleaner\n" +
                "WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations\n" +
                "WARNING: All illegal access operations will be denied in a future release\n" +
                "2025-04-02 05:06:45,843 WARN  org.apache.flink.yarn.configuration.YarnLogConfigUtil        [] - The configuration directory ('/usr/lib/flink/conf') already contains a LOG4J config file.If you want to use logback, then please delete or rename the log configuration file.\n" +
                "2025-04-02 05:06:46,236 INFO  org.apache.hadoop.yarn.client.AHSProxy                       [] - Connecting to Application History server at cluster-mercury-v1-m-0.us-central1-a.c.goose-gcpproject.internal./10.128.0.91:10200\n" +
                "2025-04-02 05:06:46,247 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - No path for the flink jar passed. Using the location of class org.apache.flink.yarn.YarnClusterDescriptor to locate the jar\n" +
                "2025-04-02 05:06:46,263 WARN  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Job Clusters are deprecated since Flink 1.15. Please use an Application Cluster/Application Mode instead.\n" +
                "2025-04-02 05:06:46,457 INFO  org.apache.hadoop.conf.Configuration                         [] - resource-types.xml not found\n" +
                "2025-04-02 05:06:46,458 INFO  org.apache.hadoop.yarn.util.resource.ResourceUtils           [] - Unable to find 'resource-types.xml'.\n" +
                "2025-04-02 05:06:46,469 WARN  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Neither the HADOOP_CONF_DIR nor the YARN_CONF_DIR environment variable is set. The Flink YARN Client needs one of these to be set to properly load the Hadoop configuration for accessing YARN.\n" +
                "2025-04-02 05:06:46,528 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Cluster specification: ClusterSpecification{masterMemoryMB=2048, taskManagerMemoryMB=7144, slotsPerTaskManager=3}\n" +
                "2025-04-02 05:06:47,899 WARN  org.apache.hadoop.hdfs.shortcircuit.DomainSocketFactory      [] - The short-circuit local reads feature cannot be used because libhadoop cannot be loaded.\n" +
                "2025-04-02 05:06:52,396 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Removing 'localhost' Key: 'jobmanager.bind-host' , default: null (fallback keys: []) setting from effective configuration; using '0.0.0.0' instead.\n" +
                "2025-04-02 05:06:52,397 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Removing 'localhost' Key: 'taskmanager.bind-host' , default: null (fallback keys: []) setting from effective configuration; using '0.0.0.0' instead.\n" +
                "2025-04-02 05:06:52,443 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Cannot use kerberos delegation token manager, no valid kerberos credentials provided.\n" +
                "2025-04-02 05:06:52,448 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Submitting application master application_1742436628161_0129\n" +
                "2025-04-02 05:06:52,709 INFO  org.apache.hadoop.yarn.client.api.impl.YarnClientImpl        [] - Submitted application application_1742436628161_0129\n" +
                "2025-04-02 05:06:52,709 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Waiting for the cluster to be allocated\n" +
                "2025-04-02 05:06:52,711 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Deploying cluster, current state ACCEPTED\n" +
                "2025-04-02 05:07:02,266 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - YARN application has been deployed successfully.\n" +
                "2025-04-02 05:07:02,267 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - The Flink YARN session cluster has been started in detached mode. In order to stop Flink gracefully, use the following command:\n" +
                "$ echo \"stop\" | ./bin/yarn-session.sh -id application_1742436628161_0129\n" +
                "If this should not be possible, then you can also kill Flink via YARN's web interface or via:\n" +
                "$ yarn application -kill application_1742436628161_0129\n" +
                "Note that killing Flink might not clean up all job artifacts and temporary files.\n" +
                "2025-04-02 05:07:02,268 INFO  org.apache.flink.yarn.YarnClusterDescriptor                  [] - Found Web Interface cluster-mercury-v1-w-0.us-central1-a.c.goose-gcpproject.internal:44983 of application 'application_1742436628161_0129'.\n" +
                "Job has been submitted with JobID 48b0d93b98af576668aa0a7a691109a1\n";
        String[] strArr = log.split("Found Web Interface ");
        if(strArr.length == 2){
            String jobInfo = strArr[1].replace("\n","");
            String[] words = jobInfo.split(" ");
            String webUrl = words[0];
            String jobId = StrUtil.isNotBlank( words[words.length - 1]) ? words[words.length - 1] : words[words.length - 2];
            String appId = jobInfo.split("'")[1];
            System.out.println(appId);

        }else{
            throw new RuntimeException(StrUtil.format("Parse Log Failed: {}", log));
        }
    }

    public static void send() {

        // 1. 设置 Kafka 生产者的配置信息
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOT_SERVER); // Kafka 集群地址
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");

        // 2. 创建 Kafka 生产者
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);


        // 3. 发送消息到 Kafka
        String topic = "test01";  // 目标 Kafka 主题
        for (int i = 1; i <= 10; i++) {
            String key = "key-" + i;
            String value = "message-" + i;
            ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, value);

            // 异步发送消息并监听回调
            producer.send(record, (metadata, exception) -> {
                if (exception == null) {
                    System.out.printf("成功发送消息: topic=%s, partition=%d, offset=%d, key=%s, value=%s%n",
                            metadata.topic(), metadata.partition(), metadata.offset(), key, value);
                } else {
                    exception.printStackTrace();
                }
            });
        }

        // 4. 关闭生产者
        producer.close();
    }

    public static void test01() {
        // 设置 Kafka 连接属性
        Properties props = new Properties();
        props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, BOOT_SERVER); // Kafka 集群地址
        // 调整超时配置
        props.put("request.timeout.ms", 60000);  // 设置请求超时时间
        props.put("socket.connection.setup.timeout.ms", 60000);  // 设置连接设置超时时间
        props.put("metadata.fetch.timeout.ms", 60000);  // 设置元数据获取超时时间

        // 创建 AdminClient
        AdminClient adminClient = AdminClient.create(props);

        try {
            // 获取所有主题列表
            ListTopicsResult topicsResult = adminClient.listTopics(new ListTopicsOptions().listInternal(false));
            Set<String> topicNames = topicsResult.names().get();

            // 输出主题名称
            System.out.println("Kafka Topics:");
            for (String topic : topicNames) {
                System.out.println(topic);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭 AdminClient
            adminClient.close();
        }
    }
}
