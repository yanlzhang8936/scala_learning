
val n1 = Iterator(1,3,4)
n1.next()
val dig = List(3, 2)
dig.tail
val dig1 = 3 :: dig
val s1 = Set(1,2,3,4)
val s2 = Set(2,3,5)
val s3 = List(1,2,4) :+ 2
val s4 = Set(1,3,4) ++ Set(22,3)
val s5 = List(12,3,4) ::: List(2,3,6)
val s7 =  s5.slice(1,4)
val s8 = s3.grouped(3)
val s9 = s3.sliding(2)
val s10 = List(1,7,2,9).reduceRight(_-_)
val s11 = (1 to 10).scanLeft(0)(_+_)

(0 to 10).map(math.pow(10, _)).map(1 / _)
var sigh = 0
var ch = '+'
ch match {
  case '+' => sigh = 1
  case '_' => sigh = -1
  case _ => sigh = 0
}
for ((k, v) <- Map(1->2,3->4))
  println(k+ " ::: " + v)
