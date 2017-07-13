def firstLast[A,C](it: C)(implicit ev: C <:< Iterable[A]) = (it.head, it.last)
firstLast(List(1,2,3))
trait Friend[-T] {
  def befriend(someone: T)
}

