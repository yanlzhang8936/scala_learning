package main

/**
 * Created by yanlzhang on 2015/4/26.
 */
class Point(x: Int,y: Int){
    var xc: Int = x
    var yc: Int = y
    def move(dx: Int,dy: Int): Unit ={
      xc = xc + dx
      yc = yc + dy
      println("x moves from " + x + " to "+xc)
      println("y moves from " + y + " to "+yc)
    }
}
