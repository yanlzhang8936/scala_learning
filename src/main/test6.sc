
val s =Array("hello","world")
s.mkString
s(0)="good"
import scala.collection.mutable.ArrayBuffer
import scala.io.Source

val b = ArrayBuffer[Int]()
b += 1

val b1 = b.insert(1,3)
val c = Array(2,3,4,5)
for (i <- c if i %2 ==1) println(i)
c.filter( _ %2 ==0).map(2+_)
//map
val scope = Map("A"->1,"B"->2,"C"->3)
val scope1 = Map("A"->2,"B"->4,"D"->3)
val scope2 = scope ++ scope1
val va1 = scope2("A")
val va2 = scope2.getOrElse("F",0)
scope2.keys
new Array(2)
def sum()=1+2
sum()
val addOne=(x:Int)=>x+2
addOne(2)
def timesTwo(n:Int):Int={
  println("hello")
  n*2
}
timesTwo(3)
//¿ÆÀï»¯
val add = (m:Int,n:Int) => m+n
val add2 = add(2,_:Int)
add2(3)
def multiply(m:Int)(n:Int)=m*n
val multiply2 = multiply(2)(_)
multiply2(3)

