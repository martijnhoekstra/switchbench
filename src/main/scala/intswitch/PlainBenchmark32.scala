
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object PlainData32 {

  sealed trait Plain

  case class NthSelector1(p: Int) extends Plain
  case class NthSelector2(p: Int) extends Plain
  case class NthSelector3(p: Int) extends Plain
  case class NthSelector4(p: Int) extends Plain
  case class NthSelector5(p: Int) extends Plain
  case class NthSelector6(p: Int) extends Plain
  case class NthSelector7(p: Int) extends Plain
  case class NthSelector8(p: Int) extends Plain
  case class NthSelector9(p: Int) extends Plain
  case class NthSelector10(p: Int) extends Plain
  case class NthSelector11(p: Int) extends Plain
  case class NthSelector12(p: Int) extends Plain
  case class NthSelector13(p: Int) extends Plain
  case class NthSelector14(p: Int) extends Plain
  case class NthSelector15(p: Int) extends Plain
  case class NthSelector16(p: Int) extends Plain
  case class NthSelector17(p: Int) extends Plain
  case class NthSelector18(p: Int) extends Plain
  case class NthSelector19(p: Int) extends Plain
  case class NthSelector20(p: Int) extends Plain
  case class NthSelector21(p: Int) extends Plain
  case class NthSelector22(p: Int) extends Plain
  case class NthSelector23(p: Int) extends Plain
  case class NthSelector24(p: Int) extends Plain
  case class NthSelector25(p: Int) extends Plain
  case class NthSelector26(p: Int) extends Plain
  case class NthSelector27(p: Int) extends Plain
  case class NthSelector28(p: Int) extends Plain
  case class NthSelector29(p: Int) extends Plain
  case class NthSelector30(p: Int) extends Plain
  case class NthSelector31(p: Int) extends Plain
  case class NthSelector32(p: Int) extends Plain

  @State(Scope.Benchmark)
  class Sorted {
    var s = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)))
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var sorted = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)))
    var s = new scala.util.Random(32).shuffle(sorted)
  }

}

class PlainBenchmark32 {
  import PlainData32._
  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(32)
  def benchSelectorSorted(bh: Blackhole, state: Sorted) = {

    def selectSelf(caze: Plain) = {
      caze match {

        case NthSelector1(p) => bh.consume(p)
        case NthSelector2(p) => bh.consume(p)
        case NthSelector3(p) => bh.consume(p)
        case NthSelector4(p) => bh.consume(p)
        case NthSelector5(p) => bh.consume(p)
        case NthSelector6(p) => bh.consume(p)
        case NthSelector7(p) => bh.consume(p)
        case NthSelector8(p) => bh.consume(p)
        case NthSelector9(p) => bh.consume(p)
        case NthSelector10(p) => bh.consume(p)
        case NthSelector11(p) => bh.consume(p)
        case NthSelector12(p) => bh.consume(p)
        case NthSelector13(p) => bh.consume(p)
        case NthSelector14(p) => bh.consume(p)
        case NthSelector15(p) => bh.consume(p)
        case NthSelector16(p) => bh.consume(p)
        case NthSelector17(p) => bh.consume(p)
        case NthSelector18(p) => bh.consume(p)
        case NthSelector19(p) => bh.consume(p)
        case NthSelector20(p) => bh.consume(p)
        case NthSelector21(p) => bh.consume(p)
        case NthSelector22(p) => bh.consume(p)
        case NthSelector23(p) => bh.consume(p)
        case NthSelector24(p) => bh.consume(p)
        case NthSelector25(p) => bh.consume(p)
        case NthSelector26(p) => bh.consume(p)
        case NthSelector27(p) => bh.consume(p)
        case NthSelector28(p) => bh.consume(p)
        case NthSelector29(p) => bh.consume(p)
        case NthSelector30(p) => bh.consume(p)
        case NthSelector31(p) => bh.consume(p)
        case NthSelector32(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(32)
  def benchSelectorUnsorted(bh: Blackhole, state: Shuffled) = {

    def selectSelf(caze: Plain) = {
      caze match {

        case NthSelector1(p) => bh.consume(p)
        case NthSelector2(p) => bh.consume(p)
        case NthSelector3(p) => bh.consume(p)
        case NthSelector4(p) => bh.consume(p)
        case NthSelector5(p) => bh.consume(p)
        case NthSelector6(p) => bh.consume(p)
        case NthSelector7(p) => bh.consume(p)
        case NthSelector8(p) => bh.consume(p)
        case NthSelector9(p) => bh.consume(p)
        case NthSelector10(p) => bh.consume(p)
        case NthSelector11(p) => bh.consume(p)
        case NthSelector12(p) => bh.consume(p)
        case NthSelector13(p) => bh.consume(p)
        case NthSelector14(p) => bh.consume(p)
        case NthSelector15(p) => bh.consume(p)
        case NthSelector16(p) => bh.consume(p)
        case NthSelector17(p) => bh.consume(p)
        case NthSelector18(p) => bh.consume(p)
        case NthSelector19(p) => bh.consume(p)
        case NthSelector20(p) => bh.consume(p)
        case NthSelector21(p) => bh.consume(p)
        case NthSelector22(p) => bh.consume(p)
        case NthSelector23(p) => bh.consume(p)
        case NthSelector24(p) => bh.consume(p)
        case NthSelector25(p) => bh.consume(p)
        case NthSelector26(p) => bh.consume(p)
        case NthSelector27(p) => bh.consume(p)
        case NthSelector28(p) => bh.consume(p)
        case NthSelector29(p) => bh.consume(p)
        case NthSelector30(p) => bh.consume(p)
        case NthSelector31(p) => bh.consume(p)
        case NthSelector32(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

}