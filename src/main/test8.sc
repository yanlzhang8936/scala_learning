import scala.collection.mutable.ArrayBuffer
val src = "edge,spear,ars"
val src_list1 = src.split(",")
def st(i:String) = i match {
  case "edge" => "edge_acct,edge_ip".split(",").toList
  case "spear" => "spear_week,spear_mep".split(",").toList
  case _ => (i).split(",").toList
}
val ss = src_list1.map(st(_)).reduce(_++_)

val sss = ss.mkString("\n")


def squVal = (a:Int) => a*a
def addOne(f:Int => Int,arg: Int) = f(arg+1)
println(squVal(2))
println(addOne(squVal,3))
private var _age = 0
def age = _age
def age_=(newAge: Int) = _age = newAge



