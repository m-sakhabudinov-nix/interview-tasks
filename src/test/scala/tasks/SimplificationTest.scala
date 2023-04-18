package tasks

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import solutions.SimplificationTest.Item

class SimplificationTest extends AnyFlatSpec with Matchers {

  it should "work correctly" in {
    process(Seq(Item(1, 2), Item(3, 4), Item(5, 6))) shouldEqual Item(9, 48)
    process(Seq.empty) shouldEqual Item.Identity
  }

  // Simplify this method
  private def process(seq: Seq[Item]): Item = {
    var acc: Item = Item.Identity
    seq.foreach(x => acc = Item(acc.a + x.a, acc.b * x.b))
    acc
  }

}

object SimplificationTest {

  case class Item(a: Long, b: Long)

  object Item {
    val Identity: Item = Item(0, 1)
  }

}
