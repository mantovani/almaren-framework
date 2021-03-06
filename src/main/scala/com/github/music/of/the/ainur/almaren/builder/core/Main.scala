package com.github.music.of.the.ainur.almaren.builder.core

import com.github.music.of.the.ainur.almaren.Container
import com.github.music.of.the.ainur.almaren.builder.Core
import com.github.music.of.the.ainur.almaren.state.core._

private[almaren] trait Main extends Core {
  def sql(sql: String): Option[List[Container]] =
    new Sql(sql)

  def alias(alias:String): Option[List[Container]] =
    new Alias(alias)

  def cache(opType:Boolean = true,tableName:Option[String] = None): Option[List[Container]] = 
    new Cache(opType, tableName)

  def coalesce(size:Int): Option[List[Container]] =
    new Coalesce(size:Int)

  def repartition(size:Int): Option[List[Container]] =
    new Repartition(size:Int)

  def pipe(command:String): Option[List[Container]] =
    new Pipe(command:String)

  def dsl(dsl:String): Option[List[Container]] =
    new Dsl(dsl:String)
}
