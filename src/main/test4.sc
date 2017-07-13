//String
val str:String= "hello world!"
val r1:Any = str.charAt(0)
str.split("l",2)
//Array
val arr = Array(1,2,3,4,5)
for (x <- arr){
  print(x)
}
var arr1=Array(1,2,3)
var arr2=Array(2,3,4)
arr1(2).+(arr2(1))
//concat can not be executed in Array.
//List
val lt = List("apple","banana","orange")
val lt1 = "apple"::"banana"::"oranege"::Nil
val ltAll = lt ::: lt1
lt.:::(lt1)
List.concat(lt,lt1)
val lt2 = List.fill(3)("apples",1)
val lt3 = List.tabulate(3)(_+2)
val lt4 = List.tabulate(2,3)(_+_)
lt4.reverse_:::(List(1,2,3))
lt4.drop(1)
lt4.dropRight(1)
lt4(1).max
lt4.take(1)
lt3.map(_*2+1)
//set
val st1 = Set(1,2,3,4,8)
val st2 = Set(2,3,3,12,2,10)
val st3 = st1.++(st2)
val st4 = st1.&(st2)
val st5 = st1.&~(st2)
val st6 = st1.+(90)
val st7 = st1.apply(3)
//tuple
val tp1 = new Tuple3(1,"ho",3)


