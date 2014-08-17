package com.rabbitonweb.nnspc.p01

import org.scalatest.{FunSuite, Matchers}

class P01Test extends FunSuite with Matchers {

  val p01 = new P01[Int]()

  test("that returns element for single element's list") {
    p01.last(List(3)) should equal(3)
  }
}
