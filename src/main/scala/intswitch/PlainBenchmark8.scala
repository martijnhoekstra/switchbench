
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object PlainData8 {
  import PlainData._

  val mylist = sortedlist.take(8)

  @State(Scope.Benchmark)
  class Sorted {
    var s = mylist
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var s = new scala.util.Random(8).shuffle(mylist)
  }

}

class PlainBenchmark8 {
  import PlainData8._

  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(8)
  def benchSelectorSorted(bh: Blackhole, state: Sorted) = {

    def selectSelf(caze: Plain) = {
      caze match {

        case NthSelectorPlain1(p) => bh.consume(p)
        case NthSelectorPlain2(p) => bh.consume(p)
        case NthSelectorPlain3(p) => bh.consume(p)
        case NthSelectorPlain4(p) => bh.consume(p)
        case NthSelectorPlain5(p) => bh.consume(p)
        case NthSelectorPlain6(p) => bh.consume(p)
        case NthSelectorPlain7(p) => bh.consume(p)
        case NthSelectorPlain8(p) => bh.consume(p)
        case _ => ???
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(8)
  def benchSelectorUnsorted(bh: Blackhole, state: Shuffled) = {

    def selectSelf(caze: Plain): Unit = {
      caze match {

        case NthSelectorPlain1(p) => bh.consume(p)
        case NthSelectorPlain2(p) => bh.consume(p)
        case NthSelectorPlain3(p) => bh.consume(p)
        case NthSelectorPlain4(p) => bh.consume(p)
        case NthSelectorPlain5(p) => bh.consume(p)
        case NthSelectorPlain6(p) => bh.consume(p)
        case NthSelectorPlain7(p) => bh.consume(p)
        case NthSelectorPlain8(p) => bh.consume(p)
        case _ => ???
      }
    }

    state.s.foreach(selectSelf)

  }

}