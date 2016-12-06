
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object IntMemberData58 {
  import IntMemberData._

  @State(Scope.Benchmark)
  class Sorted {
    var s = sortedlist.take(58)
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var s = new scala.util.Random(58).shuffle(sortedlist.take(58))
  }

}

class IntMemberBenchmark58 {
  import IntMemberData58._
  import IntMemberData._
  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(58)
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
        case 17 => bh.consume(caze.asInstanceOf[NthSelectorSwitch17].p)
        case 18 => bh.consume(caze.asInstanceOf[NthSelectorSwitch18].p)
        case 19 => bh.consume(caze.asInstanceOf[NthSelectorSwitch19].p)
        case 20 => bh.consume(caze.asInstanceOf[NthSelectorSwitch20].p)
        case 21 => bh.consume(caze.asInstanceOf[NthSelectorSwitch21].p)
        case 22 => bh.consume(caze.asInstanceOf[NthSelectorSwitch22].p)
        case 23 => bh.consume(caze.asInstanceOf[NthSelectorSwitch23].p)
        case 24 => bh.consume(caze.asInstanceOf[NthSelectorSwitch24].p)
        case 25 => bh.consume(caze.asInstanceOf[NthSelectorSwitch25].p)
        case 26 => bh.consume(caze.asInstanceOf[NthSelectorSwitch26].p)
        case 27 => bh.consume(caze.asInstanceOf[NthSelectorSwitch27].p)
        case 28 => bh.consume(caze.asInstanceOf[NthSelectorSwitch28].p)
        case 29 => bh.consume(caze.asInstanceOf[NthSelectorSwitch29].p)
        case 30 => bh.consume(caze.asInstanceOf[NthSelectorSwitch30].p)
        case 31 => bh.consume(caze.asInstanceOf[NthSelectorSwitch31].p)
        case 32 => bh.consume(caze.asInstanceOf[NthSelectorSwitch32].p)
        case 33 => bh.consume(caze.asInstanceOf[NthSelectorSwitch33].p)
        case 34 => bh.consume(caze.asInstanceOf[NthSelectorSwitch34].p)
        case 35 => bh.consume(caze.asInstanceOf[NthSelectorSwitch35].p)
        case 36 => bh.consume(caze.asInstanceOf[NthSelectorSwitch36].p)
        case 37 => bh.consume(caze.asInstanceOf[NthSelectorSwitch37].p)
        case 38 => bh.consume(caze.asInstanceOf[NthSelectorSwitch38].p)
        case 39 => bh.consume(caze.asInstanceOf[NthSelectorSwitch39].p)
        case 40 => bh.consume(caze.asInstanceOf[NthSelectorSwitch40].p)
        case 41 => bh.consume(caze.asInstanceOf[NthSelectorSwitch41].p)
        case 42 => bh.consume(caze.asInstanceOf[NthSelectorSwitch42].p)
        case 43 => bh.consume(caze.asInstanceOf[NthSelectorSwitch43].p)
        case 44 => bh.consume(caze.asInstanceOf[NthSelectorSwitch44].p)
        case 45 => bh.consume(caze.asInstanceOf[NthSelectorSwitch45].p)
        case 46 => bh.consume(caze.asInstanceOf[NthSelectorSwitch46].p)
        case 47 => bh.consume(caze.asInstanceOf[NthSelectorSwitch47].p)
        case 48 => bh.consume(caze.asInstanceOf[NthSelectorSwitch48].p)
        case 49 => bh.consume(caze.asInstanceOf[NthSelectorSwitch49].p)
        case 50 => bh.consume(caze.asInstanceOf[NthSelectorSwitch50].p)
        case 51 => bh.consume(caze.asInstanceOf[NthSelectorSwitch51].p)
        case 52 => bh.consume(caze.asInstanceOf[NthSelectorSwitch52].p)
        case 53 => bh.consume(caze.asInstanceOf[NthSelectorSwitch53].p)
        case 54 => bh.consume(caze.asInstanceOf[NthSelectorSwitch54].p)
        case 55 => bh.consume(caze.asInstanceOf[NthSelectorSwitch55].p)
        case 56 => bh.consume(caze.asInstanceOf[NthSelectorSwitch56].p)
        case 57 => bh.consume(caze.asInstanceOf[NthSelectorSwitch57].p)
        case 58 => bh.consume(caze.asInstanceOf[NthSelectorSwitch58].p)
        case _ => ???
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(58)
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
        case 17 => bh.consume(caze.asInstanceOf[NthSelectorSwitch17].p)
        case 18 => bh.consume(caze.asInstanceOf[NthSelectorSwitch18].p)
        case 19 => bh.consume(caze.asInstanceOf[NthSelectorSwitch19].p)
        case 20 => bh.consume(caze.asInstanceOf[NthSelectorSwitch20].p)
        case 21 => bh.consume(caze.asInstanceOf[NthSelectorSwitch21].p)
        case 22 => bh.consume(caze.asInstanceOf[NthSelectorSwitch22].p)
        case 23 => bh.consume(caze.asInstanceOf[NthSelectorSwitch23].p)
        case 24 => bh.consume(caze.asInstanceOf[NthSelectorSwitch24].p)
        case 25 => bh.consume(caze.asInstanceOf[NthSelectorSwitch25].p)
        case 26 => bh.consume(caze.asInstanceOf[NthSelectorSwitch26].p)
        case 27 => bh.consume(caze.asInstanceOf[NthSelectorSwitch27].p)
        case 28 => bh.consume(caze.asInstanceOf[NthSelectorSwitch28].p)
        case 29 => bh.consume(caze.asInstanceOf[NthSelectorSwitch29].p)
        case 30 => bh.consume(caze.asInstanceOf[NthSelectorSwitch30].p)
        case 31 => bh.consume(caze.asInstanceOf[NthSelectorSwitch31].p)
        case 32 => bh.consume(caze.asInstanceOf[NthSelectorSwitch32].p)
        case 33 => bh.consume(caze.asInstanceOf[NthSelectorSwitch33].p)
        case 34 => bh.consume(caze.asInstanceOf[NthSelectorSwitch34].p)
        case 35 => bh.consume(caze.asInstanceOf[NthSelectorSwitch35].p)
        case 36 => bh.consume(caze.asInstanceOf[NthSelectorSwitch36].p)
        case 37 => bh.consume(caze.asInstanceOf[NthSelectorSwitch37].p)
        case 38 => bh.consume(caze.asInstanceOf[NthSelectorSwitch38].p)
        case 39 => bh.consume(caze.asInstanceOf[NthSelectorSwitch39].p)
        case 40 => bh.consume(caze.asInstanceOf[NthSelectorSwitch40].p)
        case 41 => bh.consume(caze.asInstanceOf[NthSelectorSwitch41].p)
        case 42 => bh.consume(caze.asInstanceOf[NthSelectorSwitch42].p)
        case 43 => bh.consume(caze.asInstanceOf[NthSelectorSwitch43].p)
        case 44 => bh.consume(caze.asInstanceOf[NthSelectorSwitch44].p)
        case 45 => bh.consume(caze.asInstanceOf[NthSelectorSwitch45].p)
        case 46 => bh.consume(caze.asInstanceOf[NthSelectorSwitch46].p)
        case 47 => bh.consume(caze.asInstanceOf[NthSelectorSwitch47].p)
        case 48 => bh.consume(caze.asInstanceOf[NthSelectorSwitch48].p)
        case 49 => bh.consume(caze.asInstanceOf[NthSelectorSwitch49].p)
        case 50 => bh.consume(caze.asInstanceOf[NthSelectorSwitch50].p)
        case 51 => bh.consume(caze.asInstanceOf[NthSelectorSwitch51].p)
        case 52 => bh.consume(caze.asInstanceOf[NthSelectorSwitch52].p)
        case 53 => bh.consume(caze.asInstanceOf[NthSelectorSwitch53].p)
        case 54 => bh.consume(caze.asInstanceOf[NthSelectorSwitch54].p)
        case 55 => bh.consume(caze.asInstanceOf[NthSelectorSwitch55].p)
        case 56 => bh.consume(caze.asInstanceOf[NthSelectorSwitch56].p)
        case 57 => bh.consume(caze.asInstanceOf[NthSelectorSwitch57].p)
        case 58 => bh.consume(caze.asInstanceOf[NthSelectorSwitch58].p)
        case _ => ???
      }
    }

    state.s.foreach(selectSelf)

  }

}