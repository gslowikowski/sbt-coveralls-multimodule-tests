import org.specs2.mutable._

class Foo1Spec extends Specification {

  "Foo1" should {
    "sum two numbers" in {
      Foo1.sum(1, 2) mustEqual 3
    }
  }
}
