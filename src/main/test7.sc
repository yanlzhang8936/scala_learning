def count[A](l: List[_]) = l.size
count(List(1,3,"h"))
implicit def strToInt(x: String) = x.toInt
implicit def intToStr(y: Int) = y.toString
val xxx: String = 23
val zz: Int = "123"

class Calculate(brand: String){
  val color: String = if (brand =="TI"){"BLUE"}
  else if (brand == "HP"){"red"}
  else {"white"}
  def add(m: Int,n: Int): Int = m+n}
val v1 = new Calculate("HP")
print(v1.color)
class sciCalculate(brand: String) extends Calculate(brand) {
  def log(x: Double,y: Double) = math.log(x)/math.log(y)}
class evenCalculate(brand: String) extends sciCalculate(brand) {
  def log(z: Int): Double = log(z,math.exp(2))}
val cal2 = new evenCalculate("TI")
class AddOne extends (Int => Int){def apply(h: Int) = h + 1}
val addOne1 = new AddOne()
def ch(times: Int): Int =
  times match{
    case i if i > 0 => i+1
    case y if y < -3 => y-1
    case _ => 0
}
val v2 = ch(3)
val numbers = Range(0,10).toList
numbers.apply(0)
numbers.foldRight(2){(q: Int,w: Int) => print("q: "+q+" w: "+w);q+w}
val extendMap = Map("bob" -> 100, "jone" -> 103,"cai" ->200)
extendMap.filter((par:(String,Int)) => par._2<200)
def addUmm(x: String) = x + "umm"
def addAhem(x: String) = x + "ahem"
val UmmthenAhem = addUmm _ compose addAhem _
UmmthenAhem("hi")
val one: PartialFunction[Int,String] = {case 1 => "one";case _ =>"none"}
one(2)
def drop1[A](l: List[A])=l.tail
drop1(List(1,2,3))

