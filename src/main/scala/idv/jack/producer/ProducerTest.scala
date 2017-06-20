package idv.jack.producer

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}


object ProducerTest {

  def main(args: Array[String]): Unit ={
    val properties = new Properties()
    properties.put("zookeeper.connect", "172.18.0.190:2181")
    properties.put("bootstrap.servers", "172.18.0.2:9092,172.18.0.3:9092,172.18.0.4:9092")
    properties.put("key.serializer", "org.apache.kafka.common.serialization.IntegerSerializer")
    properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

    def newKafkaProducer = new KafkaProducer[Integer, String](properties)
    val record = new ProducerRecord[Integer, String]("topic", 1, "line")
    newKafkaProducer.send(record)

  }

}
