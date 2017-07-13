
case class Delimiters(left: String, right: String)

def quote(what: String)(implicit delimiters: Delimiters) = delimiters.left + what + delimiters.right

quote("hello")(Delimiters("<",">"))

def smaller[T](a: T,b: T)(implicit order: T => Ordered[T])=if ((a)<b) a else b
smaller(123, 234)
