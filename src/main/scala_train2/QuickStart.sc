val v1 = 2 + "hello".toUpperCase + 'h'.toTitleCase

1.to(10)
1.until(10)
"hihihi".intersect("ashidhihadhiwhi")

import scala.math._
sqrt(3)+pow(2,3)+min(3,Pi)
//Scala没有静态方法，有类似特性，叫做单例对象（singleton object）
BigInt.probablePrime(10,scala.util.Random)

val x = -2
val v2 = if (x > 0) 1
val n = 4
var r = 2
def v3(e: Int) = for (i <- 1 to e) r=r*i;print(r)
v3(3)