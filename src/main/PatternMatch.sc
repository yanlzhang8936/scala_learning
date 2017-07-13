val ch = '1'
val sign = ch match {
  case '+' => 1
  case '_' => -1
  case _ if Character.isDigit(ch) => println(Character.digit(ch, 10))
  case _   => 0
}

import scala.math._
val n = 3.14
var sss: Int = 0
val x =  n match {
  case Pi => 3
  case _ if n.toInt == Pi.toInt => sss = n.toInt
  case _ => 0
}

val pa = "([0-9]+) ([a-z]+)".r
"99 bottles" match {
  case pa(num, item) => println(item+" : "+num)
}

pa.unapplySeq("99 bottles").toList.apply(0)

//for expression
import scala.collection.JavaConversions.propertiesAsScalaMap
for((k, v) <- System.getProperties )
  println(k + " -> " + v)
for((k, "") <- System.getProperties )
  println(k + " -> PayPal ")

abstract class Amount
case class Dollar(value: Double) extends Amount

