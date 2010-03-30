package com.shorrockin.cascal.model

import java.util.Date

case class ColumnValue[Owner](val name:StandardColumn[Owner],
                              val value:Array[Byte],
                              val time:Long) extends ByteValue {

  def this(name:StandardColumn[Owner], value:Array[Byte]) = this(name, value, System.currentTimeMillis)
  def this(name:StandardColumn[Owner], value:Array[Byte], date:Date) = this(name, value, date.getTime)

  val owner    = name.owner
  val family   = name.family
  val keyspace = name.keyspace
  val key      = name.key
}