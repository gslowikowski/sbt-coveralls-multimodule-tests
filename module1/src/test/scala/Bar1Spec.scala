import org.specs2.mutable._

class Bar1Spec extends Specification {

  "Bar1" should {
    "sum two numbers" in {
      Bar1.sum(1, 2) mustEqual 3
    }
  }
}
