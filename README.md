Create Kafka topic command:
```
# kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic test2
```

List Kafka topic:
```
# kafka-topics.sh --list --zookeeper zookeeper:2181
```

Run Kafka Producer command:
```
# $KAFKA_HOME/bin/kafka-console-producer.sh --topic=test --broker-list=`broker-list.sh`
```

Run Kafka Consumer command:
```
# $KAFKA_HOME/bin/kafka-console-consumer.sh --zookeeper zookeeper:2181 --topic=test --from-beginning
```


```
# /opt/kafka_2.12-0.10.2.1/bin/kafka-topics.sh --create --zookeeper 10.1.3.211:2181 --replication-factor 1 --partitions 1 --topic test

# /opt/kafka_2.12-0.10.2.1/bin/kafka-topics.sh --list --zookeeper 10.1.3.211:2181

# /opt/kafka_2.12-0.10.2.1/bin/kafka-console-producer.sh  --broker-list 10.1.3.211:9092,10.1.3.212:9092 --topic test

# /opt/kafka_2.12-0.10.2.1/bin/kafka-console-consumer.sh --zookeeper 10.1.3.211:2181 --topic=test --from-beginning
```
