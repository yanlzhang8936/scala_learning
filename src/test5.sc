def matchTest(x: Any): Any = x match {
  case 1 => "one"
  case "two" => 2
  case y: Int => "scala.Int"
  case z: String => "scala.String"
  case _ => "many"
}
matchTest(1)
matchTest(3)
matchTest("two")
//case class
case class Person(name: String,age: Int)
val alice = new Person("Alice",12)
val bob = new Person("Bob",23)
val mark = new Person("Mark",32)
for (person <- List(alice,bob,mark)){
  person match {
    case Person(name,age) => println("name is "+name+"and age is "+age)
  }
}
val patten = "Scala".r
val str = "hello world!"
val str1 = "Scala worldScala"
println(patten findFirstIn(str))
println(patten replaceFirstIn(str1,"Java"))
//
def abs(x:Int):Int = if(x>0) x else x*(-1)
val addOne = (x: Int)=>x+1
addOne(2)
val addTwo = (m1: Int,m2: Int) => m1+m2
val addTwo2 = addTwo(2,_:Int)
addTwo2(1)
//def
def fun1(args:String *)={
  println(args.map{arg=>arg.capitalize})
}
fun1("dqw","dass","sdada")

def fac(n: Int):Int = if(n<=0)1 else n*fac(n-1)
fac(10)

var sigh = 100
val ch: Char ='2'

val re = ch match {
  case '+' => sigh = 1
  case _ if Character.isDigit(ch) => sigh=Character.digit(ch,10)
  case _ => sigh=0
}

