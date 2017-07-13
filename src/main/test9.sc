import java.util.zip.DataFormatException
import scala.util.Try
val m1 = Map("a" -> "aa","b" -> "ab", "c" -> "ac")
val v1 = Map("a" -> "new_a", "b" -> "new_b", "c" -> "new_c")
val old = "c"
val s = m1 ++ Map(v1.apply(old) -> m1.apply(old)) - old
val n1 = List(0,0,0,0,0,0)
val n2 = n1.toIterator
val n3 = n2.aggregate((0, 0.0))((x, y) => (x._1 + y, x._2 + 1.0),
  (x, y) => (x._1 + y._1, x._2 + y._2))

val _missingSet = Set("", "null", "none", ".", "_missing_", "missing")

def _checkChar(value: String): Int = {
  if (_missingSet.contains(value.toLowerCase)) 0 else {
    val parsed = Try(Some(value.toDouble)).getOrElse(None)
    if (parsed.isEmpty) 1 else 0
  }
}
val data = Array(("a","b"),("c","3"))
val m2 = data.toMap
val m3 = m2.mapValues(_checkChar)

val m4 = Try(Some("1".toDouble)).getOrElse(None)

val m5 = Seq("casdcasp1","pcdcasdcsd2")
val ds = Seq("|","|")
val m6 = m5.zip(ds).map(x=>(x._1,x._2))

val m7 = Seq(("v1",1),("v2",2))
val m8 = Seq(("w1",1),("w2",2))
val mm = m7 ++ m8
val mm1 = mm.toMap
val m9 = Seq(m7,m8)
val m10 = m9.map(_.toMap)
val m11 = Seq(("v1","w1"),("v2","w2")).toMap
val m12 = m10.zip(Seq(m11,Map.empty[String, String]))
println("Hello World!")
var li= List(1,2,3,4)
var res = li.flatMap(x => x match {
  case 3 => List(3.1,3.2)
  case _ => List(x*2)
})
println(res)
li= List(1,2,3,4)
var  res2 = li.map(x => x match {
  case 3 => List(3.1,3.2)
  case _ => x*2
})
println(res2)
