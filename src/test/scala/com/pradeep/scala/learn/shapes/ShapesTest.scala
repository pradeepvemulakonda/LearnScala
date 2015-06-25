package com.pradeep.scala.learn.shapes

import org.scalatest.FlatSpec
import org.scalatest.Matchers

/**
 * @author pradeepv
 */
class ShapesTest extends FlatSpec with Matchers {
  "A Shape" should "return a string when draw is called" in {
    var shape = new Rectangle(new Point(0,0), 1, 2)
    shape.draw { x => x.toString }
  }
}