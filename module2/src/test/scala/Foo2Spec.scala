import org.specs2.mutable._

class Foo2Spec extends Specification {

  "Foo2" should {
    "sum two numbers" in {
      Foo2.sum(1, 2) mustEqual 3
    }
  }
}
