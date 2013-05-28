package com.raphaelalmeida.first

import org.scalatra.test.specs2._

// For more on Specs2, see http://etorreborre.github.com/specs2/guide/org.specs2.guide.QuickStart.html
class FirstSpec extends ScalatraSpec { def is =
  "GET / on First"                     ^
    "should return status 200"                  ! root200^
                                                end

  addServlet(classOf[First], "/*")

  def root200 = get("/") {
    status must_== 200
  }
}
