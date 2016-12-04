
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object PlainData64 {

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
  case class NthSelector33(p: Int) extends Plain
  case class NthSelector34(p: Int) extends Plain
  case class NthSelector35(p: Int) extends Plain
  case class NthSelector36(p: Int) extends Plain
  case class NthSelector37(p: Int) extends Plain
  case class NthSelector38(p: Int) extends Plain
  case class NthSelector39(p: Int) extends Plain
  case class NthSelector40(p: Int) extends Plain
  case class NthSelector41(p: Int) extends Plain
  case class NthSelector42(p: Int) extends Plain
  case class NthSelector43(p: Int) extends Plain
  case class NthSelector44(p: Int) extends Plain
  case class NthSelector45(p: Int) extends Plain
  case class NthSelector46(p: Int) extends Plain
  case class NthSelector47(p: Int) extends Plain
  case class NthSelector48(p: Int) extends Plain
  case class NthSelector49(p: Int) extends Plain
  case class NthSelector50(p: Int) extends Plain
  case class NthSelector51(p: Int) extends Plain
  case class NthSelector52(p: Int) extends Plain
  case class NthSelector53(p: Int) extends Plain
  case class NthSelector54(p: Int) extends Plain
  case class NthSelector55(p: Int) extends Plain
  case class NthSelector56(p: Int) extends Plain
  case class NthSelector57(p: Int) extends Plain
  case class NthSelector58(p: Int) extends Plain
  case class NthSelector59(p: Int) extends Plain
  case class NthSelector60(p: Int) extends Plain
  case class NthSelector61(p: Int) extends Plain
  case class NthSelector62(p: Int) extends Plain
  case class NthSelector63(p: Int) extends Plain
  case class NthSelector64(p: Int) extends Plain

  @State(Scope.Benchmark)
  class Sorted {
    var s = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)).::(NthSelector33(33)).::(NthSelector34(34)).::(NthSelector35(35)).::(NthSelector36(36)).::(NthSelector37(37)).::(NthSelector38(38)).::(NthSelector39(39)).::(NthSelector40(40)).::(NthSelector41(41)).::(NthSelector42(42)).::(NthSelector43(43)).::(NthSelector44(44)).::(NthSelector45(45)).::(NthSelector46(46)).::(NthSelector47(47)).::(NthSelector48(48)).::(NthSelector49(49)).::(NthSelector50(50)).::(NthSelector51(51)).::(NthSelector52(52)).::(NthSelector53(53)).::(NthSelector54(54)).::(NthSelector55(55)).::(NthSelector56(56)).::(NthSelector57(57)).::(NthSelector58(58)).::(NthSelector59(59)).::(NthSelector60(60)).::(NthSelector61(61)).::(NthSelector62(62)).::(NthSelector63(63)).::(NthSelector64(64)))
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var sorted = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)).::(NthSelector33(33)).::(NthSelector34(34)).::(NthSelector35(35)).::(NthSelector36(36)).::(NthSelector37(37)).::(NthSelector38(38)).::(NthSelector39(39)).::(NthSelector40(40)).::(NthSelector41(41)).::(NthSelector42(42)).::(NthSelector43(43)).::(NthSelector44(44)).::(NthSelector45(45)).::(NthSelector46(46)).::(NthSelector47(47)).::(NthSelector48(48)).::(NthSelector49(49)).::(NthSelector50(50)).::(NthSelector51(51)).::(NthSelector52(52)).::(NthSelector53(53)).::(NthSelector54(54)).::(NthSelector55(55)).::(NthSelector56(56)).::(NthSelector57(57)).::(NthSelector58(58)).::(NthSelector59(59)).::(NthSelector60(60)).::(NthSelector61(61)).::(NthSelector62(62)).::(NthSelector63(63)).::(NthSelector64(64)))
    var s = new scala.util.Random(64).shuffle(sorted)
  }

}

class PlainBenchmark64 {
  import PlainData64._
  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(64)
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
        case NthSelector33(p) => bh.consume(p)
        case NthSelector34(p) => bh.consume(p)
        case NthSelector35(p) => bh.consume(p)
        case NthSelector36(p) => bh.consume(p)
        case NthSelector37(p) => bh.consume(p)
        case NthSelector38(p) => bh.consume(p)
        case NthSelector39(p) => bh.consume(p)
        case NthSelector40(p) => bh.consume(p)
        case NthSelector41(p) => bh.consume(p)
        case NthSelector42(p) => bh.consume(p)
        case NthSelector43(p) => bh.consume(p)
        case NthSelector44(p) => bh.consume(p)
        case NthSelector45(p) => bh.consume(p)
        case NthSelector46(p) => bh.consume(p)
        case NthSelector47(p) => bh.consume(p)
        case NthSelector48(p) => bh.consume(p)
        case NthSelector49(p) => bh.consume(p)
        case NthSelector50(p) => bh.consume(p)
        case NthSelector51(p) => bh.consume(p)
        case NthSelector52(p) => bh.consume(p)
        case NthSelector53(p) => bh.consume(p)
        case NthSelector54(p) => bh.consume(p)
        case NthSelector55(p) => bh.consume(p)
        case NthSelector56(p) => bh.consume(p)
        case NthSelector57(p) => bh.consume(p)
        case NthSelector58(p) => bh.consume(p)
        case NthSelector59(p) => bh.consume(p)
        case NthSelector60(p) => bh.consume(p)
        case NthSelector61(p) => bh.consume(p)
        case NthSelector62(p) => bh.consume(p)
        case NthSelector63(p) => bh.consume(p)
        case NthSelector64(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(64)
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
        case NthSelector33(p) => bh.consume(p)
        case NthSelector34(p) => bh.consume(p)
        case NthSelector35(p) => bh.consume(p)
        case NthSelector36(p) => bh.consume(p)
        case NthSelector37(p) => bh.consume(p)
        case NthSelector38(p) => bh.consume(p)
        case NthSelector39(p) => bh.consume(p)
        case NthSelector40(p) => bh.consume(p)
        case NthSelector41(p) => bh.consume(p)
        case NthSelector42(p) => bh.consume(p)
        case NthSelector43(p) => bh.consume(p)
        case NthSelector44(p) => bh.consume(p)
        case NthSelector45(p) => bh.consume(p)
        case NthSelector46(p) => bh.consume(p)
        case NthSelector47(p) => bh.consume(p)
        case NthSelector48(p) => bh.consume(p)
        case NthSelector49(p) => bh.consume(p)
        case NthSelector50(p) => bh.consume(p)
        case NthSelector51(p) => bh.consume(p)
        case NthSelector52(p) => bh.consume(p)
        case NthSelector53(p) => bh.consume(p)
        case NthSelector54(p) => bh.consume(p)
        case NthSelector55(p) => bh.consume(p)
        case NthSelector56(p) => bh.consume(p)
        case NthSelector57(p) => bh.consume(p)
        case NthSelector58(p) => bh.consume(p)
        case NthSelector59(p) => bh.consume(p)
        case NthSelector60(p) => bh.consume(p)
        case NthSelector61(p) => bh.consume(p)
        case NthSelector62(p) => bh.consume(p)
        case NthSelector63(p) => bh.consume(p)
        case NthSelector64(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

}