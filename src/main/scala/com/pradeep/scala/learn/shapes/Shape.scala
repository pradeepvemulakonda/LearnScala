package com.pradeep.scala.learn.shapes

/**
 * @author pradeepv
 * f is a function
 * Unit it is totally side-effecting.So returning a Unit is like returning void in java. 
 */
class Shape {
  def draw(f:String => Unit):Unit = {
    f(s"draw: ${this.toString}")
  }
}