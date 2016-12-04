
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object IntMemberData16 {

  sealed trait WithIntMember {
    val selector: Int
  }

  case class NthSelector1(p: Int) extends WithIntMember { val selector = 1 }
  case class NthSelector2(p: Int) extends WithIntMember { val selector = 2 }
  case class NthSelector3(p: Int) extends WithIntMember { val selector = 3 }
  case class NthSelector4(p: Int) extends WithIntMember { val selector = 4 }
  case class NthSelector5(p: Int) extends WithIntMember { val selector = 5 }
  case class NthSelector6(p: Int) extends WithIntMember { val selector = 6 }
  case class NthSelector7(p: Int) extends WithIntMember { val selector = 7 }
  case class NthSelector8(p: Int) extends WithIntMember { val selector = 8 }
  case class NthSelector9(p: Int) extends WithIntMember { val selector = 9 }
  case class NthSelector10(p: Int) extends WithIntMember { val selector = 10 }
  case class NthSelector11(p: Int) extends WithIntMember { val selector = 11 }
  case class NthSelector12(p: Int) extends WithIntMember { val selector = 12 }
  case class NthSelector13(p: Int) extends WithIntMember { val selector = 13 }
  case class NthSelector14(p: Int) extends WithIntMember { val selector = 14 }
  case class NthSelector15(p: Int) extends WithIntMember { val selector = 15 }
  case class NthSelector16(p: Int) extends WithIntMember { val selector = 16 }

  @State(Scope.Benchmark)
  class Sorted {
    var s = List.empty[WithIntMember] ++
      (List.empty[WithIntMember].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)))
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var sorted = List.empty[WithIntMember] ++
      (List.empty[WithIntMember].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)))
    var s = new scala.util.Random(16).shuffle(sorted)
  }

}

class IntMemberBenchmark16 {
  import IntMemberData16._
  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(16)
  def benchSelectorSorted(bh: Blackhole, state: Sorted) = {

    def selectSelf(caze: WithIntMember) = {
      val sel = caze.selector
      (sel: @switch) match {

        case 1 => bh.consume(caze.asInstanceOf[NthSelector1].p)
        case 2 => bh.consume(caze.asInstanceOf[NthSelector2].p)
        case 3 => bh.consume(caze.asInstanceOf[NthSelector3].p)
        case 4 => bh.consume(caze.asInstanceOf[NthSelector4].p)
        case 5 => bh.consume(caze.asInstanceOf[NthSelector5].p)
        case 6 => bh.consume(caze.asInstanceOf[NthSelector6].p)
        case 7 => bh.consume(caze.asInstanceOf[NthSelector7].p)
        case 8 => bh.consume(caze.asInstanceOf[NthSelector8].p)
        case 9 => bh.consume(caze.asInstanceOf[NthSelector9].p)
        case 10 => bh.consume(caze.asInstanceOf[NthSelector10].p)
        case 11 => bh.consume(caze.asInstanceOf[NthSelector11].p)
        case 12 => bh.consume(caze.asInstanceOf[NthSelector12].p)
        case 13 => bh.consume(caze.asInstanceOf[NthSelector13].p)
        case 14 => bh.consume(caze.asInstanceOf[NthSelector14].p)
        case 15 => bh.consume(caze.asInstanceOf[NthSelector15].p)
        case 16 => bh.consume(caze.asInstanceOf[NthSelector16].p)
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(16)
  def benchSelectorUnsorted(bh: Blackhole, state: Shuffled) = {

    def selectSelf(caze: WithIntMember) = {
      val sel = caze.selector
      (sel: @switch) match {

        case 1 => bh.consume(caze.asInstanceOf[NthSelector1].p)
        case 2 => bh.consume(caze.asInstanceOf[NthSelector2].p)
        case 3 => bh.consume(caze.asInstanceOf[NthSelector3].p)
        case 4 => bh.consume(caze.asInstanceOf[NthSelector4].p)
        case 5 => bh.consume(caze.asInstanceOf[NthSelector5].p)
        case 6 => bh.consume(caze.asInstanceOf[NthSelector6].p)
        case 7 => bh.consume(caze.asInstanceOf[NthSelector7].p)
        case 8 => bh.consume(caze.asInstanceOf[NthSelector8].p)
        case 9 => bh.consume(caze.asInstanceOf[NthSelector9].p)
        case 10 => bh.consume(caze.asInstanceOf[NthSelector10].p)
        case 11 => bh.consume(caze.asInstanceOf[NthSelector11].p)
        case 12 => bh.consume(caze.asInstanceOf[NthSelector12].p)
        case 13 => bh.consume(caze.asInstanceOf[NthSelector13].p)
        case 14 => bh.consume(caze.asInstanceOf[NthSelector14].p)
        case 15 => bh.consume(caze.asInstanceOf[NthSelector15].p)
        case 16 => bh.consume(caze.asInstanceOf[NthSelector16].p)
      }
    }

    state.s.foreach(selectSelf)

  }

}