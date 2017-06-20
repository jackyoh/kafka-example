Run Kafka Producer command:
```
# $KAFKA_HOME/bin/kafka-console-producer.sh --topic=test --broker-list=`broker-list.sh`
```

Run Kafka Consumer command:
```
# $KAFKA_HOME/bin/kafka-console-consumer.sh --zookeeper zookeeper:2181 --topic=test --from-beginning
```
