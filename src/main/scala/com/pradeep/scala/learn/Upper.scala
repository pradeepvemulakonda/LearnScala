package com.pradeep.scala.learn

/**
 * @author pradeepv
 */
class Upper {
  def upper(strings: String*) = {
    strings.map(_.toUpperCase())
  }
}