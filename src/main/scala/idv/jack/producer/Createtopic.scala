package idv.jack.producer

import java.util.Properties
import kafka.admin.AdminUtils
import kafka.utils.ZkUtils

object Createtopic {

  def main(args: Array[String]): Unit ={
    val properties = new Properties()
    properties.load(getClass().getResourceAsStream("/kafka-producer.properties"))

    val zookeeperConnect = properties.getProperty("zookeeper.connect")
    val sessionTimeoutMs = 10 * 1000
    val connectionTimeoutMs = 8 * 1000

    val zkUtils = ZkUtils.apply(zookeeperConnect, sessionTimeoutMs, connectionTimeoutMs, false)

    val topic = "my-topic1"
    val partitions = 1
    val replication = 1

    if(!AdminUtils.topicExists(zkUtils, topic))
        AdminUtils.createTopic(zkUtils, topic, partitions, replication)
    else
        println(s"$topic topic already exists.")

    zkUtils.close()
  }

}
