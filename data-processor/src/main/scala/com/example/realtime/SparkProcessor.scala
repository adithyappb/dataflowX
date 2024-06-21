package com.example.realtime

import org.apache.spark.sql.SparkSession

object SparkProcessor {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("RealTimeDataProcessor")
      .master("local[*]")
      .getOrCreate()

    val df = spark.read
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("subscribe", "topic")
      .load()

    df.selectExpr("CAST(key AS STRING)", "CAST(value AS STRING)")
      .write
      .format("mongo")
      .option("uri", "mongodb://localhost:27017/realtime.data")
      .mode("append")
      .save()
  }
}
