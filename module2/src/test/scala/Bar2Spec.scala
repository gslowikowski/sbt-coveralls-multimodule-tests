import org.specs2.mutable._

class Bar2Spec extends Specification {

  "Bar2" should {
    "sum two numbers" in {
      Bar2.sum(1, 2) mustEqual 3
    }
  }
}
