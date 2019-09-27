package com.github.music.of.the.ainur.almaren

import com.typesafe.scalalogging.LazyLogging
import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object Almaren extends LazyLogging {

  val sparkConf = new SparkConf
  lazy val spark = SparkSession.builder().config(sparkConf)

}

class Almaren {

}
