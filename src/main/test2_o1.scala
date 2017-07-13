package main

/**
 * Created by yanlzhang on 2015/4/25.
 */
object test2_o1 {
  val greeting: String="hello world!"

  def apply(f: Int => String , v: Int): Any=f(v)
  def layout[T](x: T) = "[" + (x+" dol ").toString + "]"

  def main(args: Array[String]) {
    println(apply(layout,10))
    println(greeting.replace("hello","hi").toUpperCase)
    println("Input sth:")
    val line=Console.readLine()
    val line1 = Console.in.readLine()
    println("xxx " + line1)
    println("your input is "+line)
  }
}
