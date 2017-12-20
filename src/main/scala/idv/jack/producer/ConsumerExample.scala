package idv.jack.producer

import java.util.{Collections, Properties}

import org.apache.kafka.clients.consumer.KafkaConsumer

object ConsumerExample {

   def main(args: Array[String]): Unit = {
     val props = new Properties()
     props.put("bootstrap.servers", "10.1.3.243:9092")
     props.put("group.id", "group2")
     props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
     props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")

     val consumer = new KafkaConsumer[String, String](props)
     consumer.subscribe(Collections.singletonList("connect-test"))
     while(true) {
       val records = consumer.poll(100)
       records.forEach(record =>{
            println(record.topic() + " " + record.partition() + " " + record.offset() + " " + record.key() + " " + record.value())
       })

     }

     consumer.close()
   }

}
