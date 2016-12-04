
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object PlainData4 {

  sealed trait Plain

  case class NthSelector1(p: Int) extends Plain
  case class NthSelector2(p: Int) extends Plain
  case class NthSelector3(p: Int) extends Plain
  case class NthSelector4(p: Int) extends Plain

  @State(Scope.Benchmark)
  class Sorted {
    var s = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)))
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var sorted = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)))
    var s = new scala.util.Random(4).shuffle(sorted)
  }

}

class PlainBenchmark4 {
  import PlainData4._
  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(4)
  def benchSelectorSorted(bh: Blackhole, state: Sorted) = {

    def selectSelf(caze: Plain) = {
      caze match {

        case NthSelector1(p) => bh.consume(p)
        case NthSelector2(p) => bh.consume(p)
        case NthSelector3(p) => bh.consume(p)
        case NthSelector4(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(4)
  def benchSelectorUnsorted(bh: Blackhole, state: Shuffled) = {

    def selectSelf(caze: Plain) = {
      caze match {

        case NthSelector1(p) => bh.consume(p)
        case NthSelector2(p) => bh.consume(p)
        case NthSelector3(p) => bh.consume(p)
        case NthSelector4(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

}