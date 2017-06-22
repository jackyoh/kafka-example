package idv.jack.producer

import java.util.Properties
import org.apache.kafka.clients.consumer.KafkaConsumer

object AdminTopic {

  def main(args: Array[String]): Unit ={
    val properties = new Properties()
    properties.load(getClass().getResourceAsStream("/kafka-producer.properties"))

    val consumer = new KafkaConsumer[String, String](properties)
    val topics = consumer.listTopics()
    topics.forEach((k, v) => println(s"key=$k  value=$v"))

  }
}
