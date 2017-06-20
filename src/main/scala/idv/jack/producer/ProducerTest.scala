package idv.jack.producer

import java.util.Properties

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}


object ProducerTest {

  def main(args: Array[String]): Unit ={
    val properties = new Properties()
    properties.load(getClass().getResourceAsStream("/kafka-producer.properties"))
    println("run kafka producer....")
    
    def newKafkaProducer = new KafkaProducer[String, String](properties)
    val record = new ProducerRecord[String, String]("test", "key1", "line")
    newKafkaProducer.send(record)

  }

}
