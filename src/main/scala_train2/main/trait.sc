import java.util.Date
trait Logger {
  def log(msg: String)
  def info(msg: String) { log("Info: " + msg) }
  def warn(msg: String) { log("Warn: " + msg) }
}
class ConsoleLogger extends Logger
with Cloneable with Serializable{ // no implements
  def log(msg: String) { println(msg) } //no need override
}
trait Logged {
  def log(msg: String) { }
}
trait TimestampLogged extends Logged {
  override def log(msg: String): Unit = {
    super.log(new Date() + " " + msg)
  }
}
trait TimeStampLogger extends Logger {
  abstract override def log(msg: String): Unit = {
    super.log(new Date() + " " + msg)
  }
}
val tsl = new ConsoleLogger with TimeStampLogger
tsl.log("hello")

//val tsld = new ConsoleLogger with TimestampLogged
//tsld.log("hi")
val r1 = 2.unary_+
val r2 = 2.unary_-
val r3 = ~2