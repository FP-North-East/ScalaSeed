package fpne

import org.scalatest.{ FlatSpec, Matchers }

class TestSpec extends FlatSpec with Matchers {

  def myTrue: Boolean = true

  "this function" should "return true" in {
    myTrue shouldBe true
  }
}
