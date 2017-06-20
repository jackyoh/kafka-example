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
