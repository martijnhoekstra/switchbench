
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

class NameHashBenchmark16 {
  import PlainData16._
  import PlainData._

  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(16)
  def benchSelectorSorted(bh: Blackhole, state: Sorted) = {

    def selectSelf(caze: Plain) = {
      val name = caze.getClass().getName()
      val namehash = name.hashCode
      (namehash: @switch) match {

        case 1083914443 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain5].p)
        case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
        case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
        case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
        case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
        case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
        case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
        case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
        case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
        case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
        case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
        case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
        case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
        case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
        case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
        case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
        case _ => ???
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(16)
  def benchSelectorUnsorted(bh: Blackhole, state: Shuffled) = {

    def selectSelf(caze: Plain): Unit = {
      val name = caze.getClass().getName()
      val namehash = name.hashCode
      (namehash: @switch) match {

        case 1083914443 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain5].p)
        case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
        case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
        case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
        case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
        case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
        case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
        case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
        case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
        case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
        case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
        case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
        case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
        case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
        case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
        case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
        case _ => ???
      }
    }

    state.s.foreach(selectSelf)

  }

}