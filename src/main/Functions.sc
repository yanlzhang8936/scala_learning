import scala.math._
val num = 3.14
val fun = ceil _
val r1 = fun(num)
val r2 = Array(2.13, 31.43, 23)
val r3 = r2.map(fun)
val triple = (x: Double) => 2 * x
val r4 = triple(2)
val r5 = r2.map(2 * _)
val r6 = mul(2, 3)
val r7 = mulOne(3)
val r8 = r7(2)
val r9 = mulOne(2)(7)
val st = "hdfs://stampy/apps/risk/det/madmen20/golden/source=golden/date=2015-11-01/dsds"
val r = st.split("/").filter(_.contains("date")).apply(0)
val sss = "yyyy-MM-dd HH:mm:ss.d"
indexOf("name", 'm')

//(1 to 10).map("*" * _).reduce(_+"\n"+_)
def mul(x: Int, y: Int) = x * y

def mulOne(x: Int) = (y: Int) => x * y
print(r)
def indexOf(str: String, ch: Char): Int = {
  var i = 0
  while (i != str.length) {
    if (str(i) == ch) return i
    i += 1
  }
  return i
}
sss.substring(0, 10)


