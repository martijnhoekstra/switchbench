
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object IntMemberData16 {
  import IntMemberData._

  @State(Scope.Benchmark)
  class Sorted {
    var s = sortedlist.take(16)
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var s = new scala.util.Random(16).shuffle(sortedlist.take(16))
  }

}

class IntMemberBenchmark16 {
  import IntMemberData16._
  import IntMemberData._
  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(16)
  def benchSelectorSorted(bh: Blackhole, state: Sorted) = {

    def selectSelf(caze: WithIntMember) = {
      val sel = caze.selector
      (sel: @switch) match {

        case 1 => bh.consume(caze.asInstanceOf[NthSelectorSwitch1].p)
        case 2 => bh.consume(caze.asInstanceOf[NthSelectorSwitch2].p)
        case 3 => bh.consume(caze.asInstanceOf[NthSelectorSwitch3].p)
        case 4 => bh.consume(caze.asInstanceOf[NthSelectorSwitch4].p)
        case 5 => bh.consume(caze.asInstanceOf[NthSelectorSwitch5].p)
        case 6 => bh.consume(caze.asInstanceOf[NthSelectorSwitch6].p)
        case 7 => bh.consume(caze.asInstanceOf[NthSelectorSwitch7].p)
        case 8 => bh.consume(caze.asInstanceOf[NthSelectorSwitch8].p)
        case 9 => bh.consume(caze.asInstanceOf[NthSelectorSwitch9].p)
        case 10 => bh.consume(caze.asInstanceOf[NthSelectorSwitch10].p)
        case 11 => bh.consume(caze.asInstanceOf[NthSelectorSwitch11].p)
        case 12 => bh.consume(caze.asInstanceOf[NthSelectorSwitch12].p)
        case 13 => bh.consume(caze.asInstanceOf[NthSelectorSwitch13].p)
        case 14 => bh.consume(caze.asInstanceOf[NthSelectorSwitch14].p)
        case 15 => bh.consume(caze.asInstanceOf[NthSelectorSwitch15].p)
        case 16 => bh.consume(caze.asInstanceOf[NthSelectorSwitch16].p)
        case _ => ???
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(16)
  def benchSelectorUnsorted(bh: Blackhole, state: Shuffled) = {

    def selectSelf(caze: WithIntMember): Unit = {
      val sel = caze.selector
      (sel: @switch) match {

        case 1 => bh.consume(caze.asInstanceOf[NthSelectorSwitch1].p)
        case 2 => bh.consume(caze.asInstanceOf[NthSelectorSwitch2].p)
        case 3 => bh.consume(caze.asInstanceOf[NthSelectorSwitch3].p)
        case 4 => bh.consume(caze.asInstanceOf[NthSelectorSwitch4].p)
        case 5 => bh.consume(caze.asInstanceOf[NthSelectorSwitch5].p)
        case 6 => bh.consume(caze.asInstanceOf[NthSelectorSwitch6].p)
        case 7 => bh.consume(caze.asInstanceOf[NthSelectorSwitch7].p)
        case 8 => bh.consume(caze.asInstanceOf[NthSelectorSwitch8].p)
        case 9 => bh.consume(caze.asInstanceOf[NthSelectorSwitch9].p)
        case 10 => bh.consume(caze.asInstanceOf[NthSelectorSwitch10].p)
        case 11 => bh.consume(caze.asInstanceOf[NthSelectorSwitch11].p)
        case 12 => bh.consume(caze.asInstanceOf[NthSelectorSwitch12].p)
        case 13 => bh.consume(caze.asInstanceOf[NthSelectorSwitch13].p)
        case 14 => bh.consume(caze.asInstanceOf[NthSelectorSwitch14].p)
        case 15 => bh.consume(caze.asInstanceOf[NthSelectorSwitch15].p)
        case 16 => bh.consume(caze.asInstanceOf[NthSelectorSwitch16].p)
        case _ => ???
      }
    }

    state.s.foreach(selectSelf)

  }

}