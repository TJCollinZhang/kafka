package cn.collin;

/**
 * Created by collin on 17-5-2.
 */
public class KafkaProperties {
    public static final String TOPIC = "topic01";
    public static final String KAFKA_SERVER_URL = "localhost";
    public static final int KAFKA_SERVER_PORT = 9092;
    public static final int KAFKA_PRODUCER_BUFFER_SIZE = 64 * 1024;
    public static final int CONNECTION_TIMEOUT = 100000;
    public static final String TOPIC2 = "topic02";
    public static final String TOPIC3 = "topic03";
    public static final String CLIENT_ID = "SimpleConsumerDemoClient";

    private KafkaProperties() {}
}
