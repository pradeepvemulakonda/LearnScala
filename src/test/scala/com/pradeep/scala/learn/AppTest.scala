package com.pradeep.scala.learn

import org.scalatest.FlatSpec
import org.scalatest.Matchers


/**
 * @author pradeepv
 */
class ExampleSpec extends FlatSpec with Matchers {

  "Upper" should "convert string to uppercase" in {
    var upper = new Upper
    upper.upper("lowercase").head should be eq(Seq("LOWERCASE").head) 
  }
}