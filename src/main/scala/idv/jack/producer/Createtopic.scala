package idv.jack.producer

import java.util.Properties

import idv.jack.producer.ProducerTest.getClass
import kafka.admin.AdminUtils
import kafka.utils.ZkUtils
import org.I0Itec.zkclient.{ZkClient, ZkConnection}


object Createtopic {

  def main(args: Array[String]): Unit ={
    val properties = new Properties()
    properties.load(getClass().getResourceAsStream("/kafka-producer.properties"))

    val zookeeperConnect = properties.getProperty("zookeeper.connect")
    val sessionTimeoutMs = 10 * 1000
    val connectionTimeoutMs = 8 * 1000

    //val zkClient = new ZkClient(zookeeperConnect, sessionTimeoutMs, connectionTimeoutMs, false)
    val zkUtils = ZkUtils.apply(zookeeperConnect, sessionTimeoutMs, connectionTimeoutMs, false)

    val topic = "my-topic1"
    val partitions = 1
    val replication = 1

    AdminUtils.createTopic(zkUtils, topic, partitions, replication, properties)
    zkUtils.close()
  }

  /*def CreateKafkaTopic(topic: String, zookeeperHosts: String, partitionSize: Int, replicationCount: Int, connectionTimeoutMs: Int = 10000, sessionTimeoutMs: Int = 10000): Boolean = {

    val zkUtils = ZkUtils.apply(zookeeperHosts, sessionTimeoutMs, connectionTimeoutMs, false)
    AdminUtils.createTopic( zkUtils, topic, partitionSize, replicationCount, new Properties())
    zkUtils.close()
    true
  }*/
}
