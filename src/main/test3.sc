val m1 = Map(1 -> "a",2 -> "b", 3 -> "c")
val m2 = Map(3 -> "e",4 -> "f", 5 -> "d")
for (k <- m2.keys.filter(m1.contains(_)))
  println(k)
val m3 = m1.++(m2)
val m4 = m1 ++ m2
m4.keys.foreach{
  i => print(i)
    println(m4(i))
}
for (i <- m4.values) {
  print(i)
}
val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 4)
val scores1 = scala.collection.mutable.Map(("Alice",1), ("Bob",2))
val bobScore = scores.getOrElse("Bob", 0)
val ss1 = scores1 -= "Alice"
//import scala.collection.mutable.ArrayBuffer
val a = Array(1,2,3,5,12,9)
val b = for (e <- a if e % 3 == 0 ) yield 3+2*e
val c = a.filter( _ % 2 ==0 ).map( 2 * _ )
val aa2 = a.filter(_%2==1).map(3*_).reverse
val num_s = new Array[Int](10)
for(i <- 0 until num_s.length) print(i+": "+(num_s(i)+i*2))
def deco(str:String, left: String = "[", right: String = "]")=left+str+right
deco(" hello ")
def sum(args: Int *)={
  var result = 0
  for(arg <- args) result += arg
  result
}
sum(1,2,3,4)
def rec(args : Int*):Int = {
  if (args.length == 0) 0
  else args.head + rec(args.tail : _*)
}
rec(2,3,4)
for ( i <- 0 to 3; from = 4-i; j <- from to 4) print((10*i+j) + "\n")
for (i <- 0 to 3; b <- "hello") yield (b+i).toString.toInt
val m11 = Map("a" -> "aa","b" -> "ab", "c" -> "ac")
val v1 = Map("a" -> "new_a", "b" -> "new_b", "c" -> "new_c")
val old = "c"
val s = m11 ++ Map(v1.apply(old) -> m11.apply(old)) - old

