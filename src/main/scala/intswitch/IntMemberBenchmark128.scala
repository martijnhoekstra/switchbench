
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object IntMemberData128 {

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
  case class NthSelector17(p: Int) extends WithIntMember { val selector = 17 }
  case class NthSelector18(p: Int) extends WithIntMember { val selector = 18 }
  case class NthSelector19(p: Int) extends WithIntMember { val selector = 19 }
  case class NthSelector20(p: Int) extends WithIntMember { val selector = 20 }
  case class NthSelector21(p: Int) extends WithIntMember { val selector = 21 }
  case class NthSelector22(p: Int) extends WithIntMember { val selector = 22 }
  case class NthSelector23(p: Int) extends WithIntMember { val selector = 23 }
  case class NthSelector24(p: Int) extends WithIntMember { val selector = 24 }
  case class NthSelector25(p: Int) extends WithIntMember { val selector = 25 }
  case class NthSelector26(p: Int) extends WithIntMember { val selector = 26 }
  case class NthSelector27(p: Int) extends WithIntMember { val selector = 27 }
  case class NthSelector28(p: Int) extends WithIntMember { val selector = 28 }
  case class NthSelector29(p: Int) extends WithIntMember { val selector = 29 }
  case class NthSelector30(p: Int) extends WithIntMember { val selector = 30 }
  case class NthSelector31(p: Int) extends WithIntMember { val selector = 31 }
  case class NthSelector32(p: Int) extends WithIntMember { val selector = 32 }
  case class NthSelector33(p: Int) extends WithIntMember { val selector = 33 }
  case class NthSelector34(p: Int) extends WithIntMember { val selector = 34 }
  case class NthSelector35(p: Int) extends WithIntMember { val selector = 35 }
  case class NthSelector36(p: Int) extends WithIntMember { val selector = 36 }
  case class NthSelector37(p: Int) extends WithIntMember { val selector = 37 }
  case class NthSelector38(p: Int) extends WithIntMember { val selector = 38 }
  case class NthSelector39(p: Int) extends WithIntMember { val selector = 39 }
  case class NthSelector40(p: Int) extends WithIntMember { val selector = 40 }
  case class NthSelector41(p: Int) extends WithIntMember { val selector = 41 }
  case class NthSelector42(p: Int) extends WithIntMember { val selector = 42 }
  case class NthSelector43(p: Int) extends WithIntMember { val selector = 43 }
  case class NthSelector44(p: Int) extends WithIntMember { val selector = 44 }
  case class NthSelector45(p: Int) extends WithIntMember { val selector = 45 }
  case class NthSelector46(p: Int) extends WithIntMember { val selector = 46 }
  case class NthSelector47(p: Int) extends WithIntMember { val selector = 47 }
  case class NthSelector48(p: Int) extends WithIntMember { val selector = 48 }
  case class NthSelector49(p: Int) extends WithIntMember { val selector = 49 }
  case class NthSelector50(p: Int) extends WithIntMember { val selector = 50 }
  case class NthSelector51(p: Int) extends WithIntMember { val selector = 51 }
  case class NthSelector52(p: Int) extends WithIntMember { val selector = 52 }
  case class NthSelector53(p: Int) extends WithIntMember { val selector = 53 }
  case class NthSelector54(p: Int) extends WithIntMember { val selector = 54 }
  case class NthSelector55(p: Int) extends WithIntMember { val selector = 55 }
  case class NthSelector56(p: Int) extends WithIntMember { val selector = 56 }
  case class NthSelector57(p: Int) extends WithIntMember { val selector = 57 }
  case class NthSelector58(p: Int) extends WithIntMember { val selector = 58 }
  case class NthSelector59(p: Int) extends WithIntMember { val selector = 59 }
  case class NthSelector60(p: Int) extends WithIntMember { val selector = 60 }
  case class NthSelector61(p: Int) extends WithIntMember { val selector = 61 }
  case class NthSelector62(p: Int) extends WithIntMember { val selector = 62 }
  case class NthSelector63(p: Int) extends WithIntMember { val selector = 63 }
  case class NthSelector64(p: Int) extends WithIntMember { val selector = 64 }
  case class NthSelector65(p: Int) extends WithIntMember { val selector = 65 }
  case class NthSelector66(p: Int) extends WithIntMember { val selector = 66 }
  case class NthSelector67(p: Int) extends WithIntMember { val selector = 67 }
  case class NthSelector68(p: Int) extends WithIntMember { val selector = 68 }
  case class NthSelector69(p: Int) extends WithIntMember { val selector = 69 }
  case class NthSelector70(p: Int) extends WithIntMember { val selector = 70 }
  case class NthSelector71(p: Int) extends WithIntMember { val selector = 71 }
  case class NthSelector72(p: Int) extends WithIntMember { val selector = 72 }
  case class NthSelector73(p: Int) extends WithIntMember { val selector = 73 }
  case class NthSelector74(p: Int) extends WithIntMember { val selector = 74 }
  case class NthSelector75(p: Int) extends WithIntMember { val selector = 75 }
  case class NthSelector76(p: Int) extends WithIntMember { val selector = 76 }
  case class NthSelector77(p: Int) extends WithIntMember { val selector = 77 }
  case class NthSelector78(p: Int) extends WithIntMember { val selector = 78 }
  case class NthSelector79(p: Int) extends WithIntMember { val selector = 79 }
  case class NthSelector80(p: Int) extends WithIntMember { val selector = 80 }
  case class NthSelector81(p: Int) extends WithIntMember { val selector = 81 }
  case class NthSelector82(p: Int) extends WithIntMember { val selector = 82 }
  case class NthSelector83(p: Int) extends WithIntMember { val selector = 83 }
  case class NthSelector84(p: Int) extends WithIntMember { val selector = 84 }
  case class NthSelector85(p: Int) extends WithIntMember { val selector = 85 }
  case class NthSelector86(p: Int) extends WithIntMember { val selector = 86 }
  case class NthSelector87(p: Int) extends WithIntMember { val selector = 87 }
  case class NthSelector88(p: Int) extends WithIntMember { val selector = 88 }
  case class NthSelector89(p: Int) extends WithIntMember { val selector = 89 }
  case class NthSelector90(p: Int) extends WithIntMember { val selector = 90 }
  case class NthSelector91(p: Int) extends WithIntMember { val selector = 91 }
  case class NthSelector92(p: Int) extends WithIntMember { val selector = 92 }
  case class NthSelector93(p: Int) extends WithIntMember { val selector = 93 }
  case class NthSelector94(p: Int) extends WithIntMember { val selector = 94 }
  case class NthSelector95(p: Int) extends WithIntMember { val selector = 95 }
  case class NthSelector96(p: Int) extends WithIntMember { val selector = 96 }
  case class NthSelector97(p: Int) extends WithIntMember { val selector = 97 }
  case class NthSelector98(p: Int) extends WithIntMember { val selector = 98 }
  case class NthSelector99(p: Int) extends WithIntMember { val selector = 99 }
  case class NthSelector100(p: Int) extends WithIntMember { val selector = 100 }
  case class NthSelector101(p: Int) extends WithIntMember { val selector = 101 }
  case class NthSelector102(p: Int) extends WithIntMember { val selector = 102 }
  case class NthSelector103(p: Int) extends WithIntMember { val selector = 103 }
  case class NthSelector104(p: Int) extends WithIntMember { val selector = 104 }
  case class NthSelector105(p: Int) extends WithIntMember { val selector = 105 }
  case class NthSelector106(p: Int) extends WithIntMember { val selector = 106 }
  case class NthSelector107(p: Int) extends WithIntMember { val selector = 107 }
  case class NthSelector108(p: Int) extends WithIntMember { val selector = 108 }
  case class NthSelector109(p: Int) extends WithIntMember { val selector = 109 }
  case class NthSelector110(p: Int) extends WithIntMember { val selector = 110 }
  case class NthSelector111(p: Int) extends WithIntMember { val selector = 111 }
  case class NthSelector112(p: Int) extends WithIntMember { val selector = 112 }
  case class NthSelector113(p: Int) extends WithIntMember { val selector = 113 }
  case class NthSelector114(p: Int) extends WithIntMember { val selector = 114 }
  case class NthSelector115(p: Int) extends WithIntMember { val selector = 115 }
  case class NthSelector116(p: Int) extends WithIntMember { val selector = 116 }
  case class NthSelector117(p: Int) extends WithIntMember { val selector = 117 }
  case class NthSelector118(p: Int) extends WithIntMember { val selector = 118 }
  case class NthSelector119(p: Int) extends WithIntMember { val selector = 119 }
  case class NthSelector120(p: Int) extends WithIntMember { val selector = 120 }
  case class NthSelector121(p: Int) extends WithIntMember { val selector = 121 }
  case class NthSelector122(p: Int) extends WithIntMember { val selector = 122 }
  case class NthSelector123(p: Int) extends WithIntMember { val selector = 123 }
  case class NthSelector124(p: Int) extends WithIntMember { val selector = 124 }
  case class NthSelector125(p: Int) extends WithIntMember { val selector = 125 }
  case class NthSelector126(p: Int) extends WithIntMember { val selector = 126 }
  case class NthSelector127(p: Int) extends WithIntMember { val selector = 127 }
  case class NthSelector128(p: Int) extends WithIntMember { val selector = 128 }

  @State(Scope.Benchmark)
  class Sorted {
    var s = List.empty[WithIntMember] ++
      (List.empty[WithIntMember].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)).::(NthSelector33(33)).::(NthSelector34(34)).::(NthSelector35(35)).::(NthSelector36(36)).::(NthSelector37(37)).::(NthSelector38(38)).::(NthSelector39(39)).::(NthSelector40(40)).::(NthSelector41(41)).::(NthSelector42(42)).::(NthSelector43(43)).::(NthSelector44(44)).::(NthSelector45(45)).::(NthSelector46(46)).::(NthSelector47(47)).::(NthSelector48(48)).::(NthSelector49(49)).::(NthSelector50(50)).::(NthSelector51(51)).::(NthSelector52(52)).::(NthSelector53(53)).::(NthSelector54(54)).::(NthSelector55(55)).::(NthSelector56(56)).::(NthSelector57(57)).::(NthSelector58(58)).::(NthSelector59(59)).::(NthSelector60(60)).::(NthSelector61(61)).::(NthSelector62(62)).::(NthSelector63(63)).::(NthSelector64(64))) ++
      (List.empty[WithIntMember].::(NthSelector65(65)).::(NthSelector66(66)).::(NthSelector67(67)).::(NthSelector68(68)).::(NthSelector69(69)).::(NthSelector70(70)).::(NthSelector71(71)).::(NthSelector72(72)).::(NthSelector73(73)).::(NthSelector74(74)).::(NthSelector75(75)).::(NthSelector76(76)).::(NthSelector77(77)).::(NthSelector78(78)).::(NthSelector79(79)).::(NthSelector80(80)).::(NthSelector81(81)).::(NthSelector82(82)).::(NthSelector83(83)).::(NthSelector84(84)).::(NthSelector85(85)).::(NthSelector86(86)).::(NthSelector87(87)).::(NthSelector88(88)).::(NthSelector89(89)).::(NthSelector90(90)).::(NthSelector91(91)).::(NthSelector92(92)).::(NthSelector93(93)).::(NthSelector94(94)).::(NthSelector95(95)).::(NthSelector96(96)).::(NthSelector97(97)).::(NthSelector98(98)).::(NthSelector99(99)).::(NthSelector100(100)).::(NthSelector101(101)).::(NthSelector102(102)).::(NthSelector103(103)).::(NthSelector104(104)).::(NthSelector105(105)).::(NthSelector106(106)).::(NthSelector107(107)).::(NthSelector108(108)).::(NthSelector109(109)).::(NthSelector110(110)).::(NthSelector111(111)).::(NthSelector112(112)).::(NthSelector113(113)).::(NthSelector114(114)).::(NthSelector115(115)).::(NthSelector116(116)).::(NthSelector117(117)).::(NthSelector118(118)).::(NthSelector119(119)).::(NthSelector120(120)).::(NthSelector121(121)).::(NthSelector122(122)).::(NthSelector123(123)).::(NthSelector124(124)).::(NthSelector125(125)).::(NthSelector126(126)).::(NthSelector127(127)).::(NthSelector128(128)))
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var sorted = List.empty[WithIntMember] ++
      (List.empty[WithIntMember].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)).::(NthSelector33(33)).::(NthSelector34(34)).::(NthSelector35(35)).::(NthSelector36(36)).::(NthSelector37(37)).::(NthSelector38(38)).::(NthSelector39(39)).::(NthSelector40(40)).::(NthSelector41(41)).::(NthSelector42(42)).::(NthSelector43(43)).::(NthSelector44(44)).::(NthSelector45(45)).::(NthSelector46(46)).::(NthSelector47(47)).::(NthSelector48(48)).::(NthSelector49(49)).::(NthSelector50(50)).::(NthSelector51(51)).::(NthSelector52(52)).::(NthSelector53(53)).::(NthSelector54(54)).::(NthSelector55(55)).::(NthSelector56(56)).::(NthSelector57(57)).::(NthSelector58(58)).::(NthSelector59(59)).::(NthSelector60(60)).::(NthSelector61(61)).::(NthSelector62(62)).::(NthSelector63(63)).::(NthSelector64(64))) ++
      (List.empty[WithIntMember].::(NthSelector65(65)).::(NthSelector66(66)).::(NthSelector67(67)).::(NthSelector68(68)).::(NthSelector69(69)).::(NthSelector70(70)).::(NthSelector71(71)).::(NthSelector72(72)).::(NthSelector73(73)).::(NthSelector74(74)).::(NthSelector75(75)).::(NthSelector76(76)).::(NthSelector77(77)).::(NthSelector78(78)).::(NthSelector79(79)).::(NthSelector80(80)).::(NthSelector81(81)).::(NthSelector82(82)).::(NthSelector83(83)).::(NthSelector84(84)).::(NthSelector85(85)).::(NthSelector86(86)).::(NthSelector87(87)).::(NthSelector88(88)).::(NthSelector89(89)).::(NthSelector90(90)).::(NthSelector91(91)).::(NthSelector92(92)).::(NthSelector93(93)).::(NthSelector94(94)).::(NthSelector95(95)).::(NthSelector96(96)).::(NthSelector97(97)).::(NthSelector98(98)).::(NthSelector99(99)).::(NthSelector100(100)).::(NthSelector101(101)).::(NthSelector102(102)).::(NthSelector103(103)).::(NthSelector104(104)).::(NthSelector105(105)).::(NthSelector106(106)).::(NthSelector107(107)).::(NthSelector108(108)).::(NthSelector109(109)).::(NthSelector110(110)).::(NthSelector111(111)).::(NthSelector112(112)).::(NthSelector113(113)).::(NthSelector114(114)).::(NthSelector115(115)).::(NthSelector116(116)).::(NthSelector117(117)).::(NthSelector118(118)).::(NthSelector119(119)).::(NthSelector120(120)).::(NthSelector121(121)).::(NthSelector122(122)).::(NthSelector123(123)).::(NthSelector124(124)).::(NthSelector125(125)).::(NthSelector126(126)).::(NthSelector127(127)).::(NthSelector128(128)))
    var s = new scala.util.Random(128).shuffle(sorted)
  }

}

class IntMemberBenchmark128 {
  import IntMemberData128._
  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(128)
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
        case 17 => bh.consume(caze.asInstanceOf[NthSelector17].p)
        case 18 => bh.consume(caze.asInstanceOf[NthSelector18].p)
        case 19 => bh.consume(caze.asInstanceOf[NthSelector19].p)
        case 20 => bh.consume(caze.asInstanceOf[NthSelector20].p)
        case 21 => bh.consume(caze.asInstanceOf[NthSelector21].p)
        case 22 => bh.consume(caze.asInstanceOf[NthSelector22].p)
        case 23 => bh.consume(caze.asInstanceOf[NthSelector23].p)
        case 24 => bh.consume(caze.asInstanceOf[NthSelector24].p)
        case 25 => bh.consume(caze.asInstanceOf[NthSelector25].p)
        case 26 => bh.consume(caze.asInstanceOf[NthSelector26].p)
        case 27 => bh.consume(caze.asInstanceOf[NthSelector27].p)
        case 28 => bh.consume(caze.asInstanceOf[NthSelector28].p)
        case 29 => bh.consume(caze.asInstanceOf[NthSelector29].p)
        case 30 => bh.consume(caze.asInstanceOf[NthSelector30].p)
        case 31 => bh.consume(caze.asInstanceOf[NthSelector31].p)
        case 32 => bh.consume(caze.asInstanceOf[NthSelector32].p)
        case 33 => bh.consume(caze.asInstanceOf[NthSelector33].p)
        case 34 => bh.consume(caze.asInstanceOf[NthSelector34].p)
        case 35 => bh.consume(caze.asInstanceOf[NthSelector35].p)
        case 36 => bh.consume(caze.asInstanceOf[NthSelector36].p)
        case 37 => bh.consume(caze.asInstanceOf[NthSelector37].p)
        case 38 => bh.consume(caze.asInstanceOf[NthSelector38].p)
        case 39 => bh.consume(caze.asInstanceOf[NthSelector39].p)
        case 40 => bh.consume(caze.asInstanceOf[NthSelector40].p)
        case 41 => bh.consume(caze.asInstanceOf[NthSelector41].p)
        case 42 => bh.consume(caze.asInstanceOf[NthSelector42].p)
        case 43 => bh.consume(caze.asInstanceOf[NthSelector43].p)
        case 44 => bh.consume(caze.asInstanceOf[NthSelector44].p)
        case 45 => bh.consume(caze.asInstanceOf[NthSelector45].p)
        case 46 => bh.consume(caze.asInstanceOf[NthSelector46].p)
        case 47 => bh.consume(caze.asInstanceOf[NthSelector47].p)
        case 48 => bh.consume(caze.asInstanceOf[NthSelector48].p)
        case 49 => bh.consume(caze.asInstanceOf[NthSelector49].p)
        case 50 => bh.consume(caze.asInstanceOf[NthSelector50].p)
        case 51 => bh.consume(caze.asInstanceOf[NthSelector51].p)
        case 52 => bh.consume(caze.asInstanceOf[NthSelector52].p)
        case 53 => bh.consume(caze.asInstanceOf[NthSelector53].p)
        case 54 => bh.consume(caze.asInstanceOf[NthSelector54].p)
        case 55 => bh.consume(caze.asInstanceOf[NthSelector55].p)
        case 56 => bh.consume(caze.asInstanceOf[NthSelector56].p)
        case 57 => bh.consume(caze.asInstanceOf[NthSelector57].p)
        case 58 => bh.consume(caze.asInstanceOf[NthSelector58].p)
        case 59 => bh.consume(caze.asInstanceOf[NthSelector59].p)
        case 60 => bh.consume(caze.asInstanceOf[NthSelector60].p)
        case 61 => bh.consume(caze.asInstanceOf[NthSelector61].p)
        case 62 => bh.consume(caze.asInstanceOf[NthSelector62].p)
        case 63 => bh.consume(caze.asInstanceOf[NthSelector63].p)
        case 64 => bh.consume(caze.asInstanceOf[NthSelector64].p)
        case 65 => bh.consume(caze.asInstanceOf[NthSelector65].p)
        case 66 => bh.consume(caze.asInstanceOf[NthSelector66].p)
        case 67 => bh.consume(caze.asInstanceOf[NthSelector67].p)
        case 68 => bh.consume(caze.asInstanceOf[NthSelector68].p)
        case 69 => bh.consume(caze.asInstanceOf[NthSelector69].p)
        case 70 => bh.consume(caze.asInstanceOf[NthSelector70].p)
        case 71 => bh.consume(caze.asInstanceOf[NthSelector71].p)
        case 72 => bh.consume(caze.asInstanceOf[NthSelector72].p)
        case 73 => bh.consume(caze.asInstanceOf[NthSelector73].p)
        case 74 => bh.consume(caze.asInstanceOf[NthSelector74].p)
        case 75 => bh.consume(caze.asInstanceOf[NthSelector75].p)
        case 76 => bh.consume(caze.asInstanceOf[NthSelector76].p)
        case 77 => bh.consume(caze.asInstanceOf[NthSelector77].p)
        case 78 => bh.consume(caze.asInstanceOf[NthSelector78].p)
        case 79 => bh.consume(caze.asInstanceOf[NthSelector79].p)
        case 80 => bh.consume(caze.asInstanceOf[NthSelector80].p)
        case 81 => bh.consume(caze.asInstanceOf[NthSelector81].p)
        case 82 => bh.consume(caze.asInstanceOf[NthSelector82].p)
        case 83 => bh.consume(caze.asInstanceOf[NthSelector83].p)
        case 84 => bh.consume(caze.asInstanceOf[NthSelector84].p)
        case 85 => bh.consume(caze.asInstanceOf[NthSelector85].p)
        case 86 => bh.consume(caze.asInstanceOf[NthSelector86].p)
        case 87 => bh.consume(caze.asInstanceOf[NthSelector87].p)
        case 88 => bh.consume(caze.asInstanceOf[NthSelector88].p)
        case 89 => bh.consume(caze.asInstanceOf[NthSelector89].p)
        case 90 => bh.consume(caze.asInstanceOf[NthSelector90].p)
        case 91 => bh.consume(caze.asInstanceOf[NthSelector91].p)
        case 92 => bh.consume(caze.asInstanceOf[NthSelector92].p)
        case 93 => bh.consume(caze.asInstanceOf[NthSelector93].p)
        case 94 => bh.consume(caze.asInstanceOf[NthSelector94].p)
        case 95 => bh.consume(caze.asInstanceOf[NthSelector95].p)
        case 96 => bh.consume(caze.asInstanceOf[NthSelector96].p)
        case 97 => bh.consume(caze.asInstanceOf[NthSelector97].p)
        case 98 => bh.consume(caze.asInstanceOf[NthSelector98].p)
        case 99 => bh.consume(caze.asInstanceOf[NthSelector99].p)
        case 100 => bh.consume(caze.asInstanceOf[NthSelector100].p)
        case 101 => bh.consume(caze.asInstanceOf[NthSelector101].p)
        case 102 => bh.consume(caze.asInstanceOf[NthSelector102].p)
        case 103 => bh.consume(caze.asInstanceOf[NthSelector103].p)
        case 104 => bh.consume(caze.asInstanceOf[NthSelector104].p)
        case 105 => bh.consume(caze.asInstanceOf[NthSelector105].p)
        case 106 => bh.consume(caze.asInstanceOf[NthSelector106].p)
        case 107 => bh.consume(caze.asInstanceOf[NthSelector107].p)
        case 108 => bh.consume(caze.asInstanceOf[NthSelector108].p)
        case 109 => bh.consume(caze.asInstanceOf[NthSelector109].p)
        case 110 => bh.consume(caze.asInstanceOf[NthSelector110].p)
        case 111 => bh.consume(caze.asInstanceOf[NthSelector111].p)
        case 112 => bh.consume(caze.asInstanceOf[NthSelector112].p)
        case 113 => bh.consume(caze.asInstanceOf[NthSelector113].p)
        case 114 => bh.consume(caze.asInstanceOf[NthSelector114].p)
        case 115 => bh.consume(caze.asInstanceOf[NthSelector115].p)
        case 116 => bh.consume(caze.asInstanceOf[NthSelector116].p)
        case 117 => bh.consume(caze.asInstanceOf[NthSelector117].p)
        case 118 => bh.consume(caze.asInstanceOf[NthSelector118].p)
        case 119 => bh.consume(caze.asInstanceOf[NthSelector119].p)
        case 120 => bh.consume(caze.asInstanceOf[NthSelector120].p)
        case 121 => bh.consume(caze.asInstanceOf[NthSelector121].p)
        case 122 => bh.consume(caze.asInstanceOf[NthSelector122].p)
        case 123 => bh.consume(caze.asInstanceOf[NthSelector123].p)
        case 124 => bh.consume(caze.asInstanceOf[NthSelector124].p)
        case 125 => bh.consume(caze.asInstanceOf[NthSelector125].p)
        case 126 => bh.consume(caze.asInstanceOf[NthSelector126].p)
        case 127 => bh.consume(caze.asInstanceOf[NthSelector127].p)
        case 128 => bh.consume(caze.asInstanceOf[NthSelector128].p)
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(128)
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
        case 17 => bh.consume(caze.asInstanceOf[NthSelector17].p)
        case 18 => bh.consume(caze.asInstanceOf[NthSelector18].p)
        case 19 => bh.consume(caze.asInstanceOf[NthSelector19].p)
        case 20 => bh.consume(caze.asInstanceOf[NthSelector20].p)
        case 21 => bh.consume(caze.asInstanceOf[NthSelector21].p)
        case 22 => bh.consume(caze.asInstanceOf[NthSelector22].p)
        case 23 => bh.consume(caze.asInstanceOf[NthSelector23].p)
        case 24 => bh.consume(caze.asInstanceOf[NthSelector24].p)
        case 25 => bh.consume(caze.asInstanceOf[NthSelector25].p)
        case 26 => bh.consume(caze.asInstanceOf[NthSelector26].p)
        case 27 => bh.consume(caze.asInstanceOf[NthSelector27].p)
        case 28 => bh.consume(caze.asInstanceOf[NthSelector28].p)
        case 29 => bh.consume(caze.asInstanceOf[NthSelector29].p)
        case 30 => bh.consume(caze.asInstanceOf[NthSelector30].p)
        case 31 => bh.consume(caze.asInstanceOf[NthSelector31].p)
        case 32 => bh.consume(caze.asInstanceOf[NthSelector32].p)
        case 33 => bh.consume(caze.asInstanceOf[NthSelector33].p)
        case 34 => bh.consume(caze.asInstanceOf[NthSelector34].p)
        case 35 => bh.consume(caze.asInstanceOf[NthSelector35].p)
        case 36 => bh.consume(caze.asInstanceOf[NthSelector36].p)
        case 37 => bh.consume(caze.asInstanceOf[NthSelector37].p)
        case 38 => bh.consume(caze.asInstanceOf[NthSelector38].p)
        case 39 => bh.consume(caze.asInstanceOf[NthSelector39].p)
        case 40 => bh.consume(caze.asInstanceOf[NthSelector40].p)
        case 41 => bh.consume(caze.asInstanceOf[NthSelector41].p)
        case 42 => bh.consume(caze.asInstanceOf[NthSelector42].p)
        case 43 => bh.consume(caze.asInstanceOf[NthSelector43].p)
        case 44 => bh.consume(caze.asInstanceOf[NthSelector44].p)
        case 45 => bh.consume(caze.asInstanceOf[NthSelector45].p)
        case 46 => bh.consume(caze.asInstanceOf[NthSelector46].p)
        case 47 => bh.consume(caze.asInstanceOf[NthSelector47].p)
        case 48 => bh.consume(caze.asInstanceOf[NthSelector48].p)
        case 49 => bh.consume(caze.asInstanceOf[NthSelector49].p)
        case 50 => bh.consume(caze.asInstanceOf[NthSelector50].p)
        case 51 => bh.consume(caze.asInstanceOf[NthSelector51].p)
        case 52 => bh.consume(caze.asInstanceOf[NthSelector52].p)
        case 53 => bh.consume(caze.asInstanceOf[NthSelector53].p)
        case 54 => bh.consume(caze.asInstanceOf[NthSelector54].p)
        case 55 => bh.consume(caze.asInstanceOf[NthSelector55].p)
        case 56 => bh.consume(caze.asInstanceOf[NthSelector56].p)
        case 57 => bh.consume(caze.asInstanceOf[NthSelector57].p)
        case 58 => bh.consume(caze.asInstanceOf[NthSelector58].p)
        case 59 => bh.consume(caze.asInstanceOf[NthSelector59].p)
        case 60 => bh.consume(caze.asInstanceOf[NthSelector60].p)
        case 61 => bh.consume(caze.asInstanceOf[NthSelector61].p)
        case 62 => bh.consume(caze.asInstanceOf[NthSelector62].p)
        case 63 => bh.consume(caze.asInstanceOf[NthSelector63].p)
        case 64 => bh.consume(caze.asInstanceOf[NthSelector64].p)
        case 65 => bh.consume(caze.asInstanceOf[NthSelector65].p)
        case 66 => bh.consume(caze.asInstanceOf[NthSelector66].p)
        case 67 => bh.consume(caze.asInstanceOf[NthSelector67].p)
        case 68 => bh.consume(caze.asInstanceOf[NthSelector68].p)
        case 69 => bh.consume(caze.asInstanceOf[NthSelector69].p)
        case 70 => bh.consume(caze.asInstanceOf[NthSelector70].p)
        case 71 => bh.consume(caze.asInstanceOf[NthSelector71].p)
        case 72 => bh.consume(caze.asInstanceOf[NthSelector72].p)
        case 73 => bh.consume(caze.asInstanceOf[NthSelector73].p)
        case 74 => bh.consume(caze.asInstanceOf[NthSelector74].p)
        case 75 => bh.consume(caze.asInstanceOf[NthSelector75].p)
        case 76 => bh.consume(caze.asInstanceOf[NthSelector76].p)
        case 77 => bh.consume(caze.asInstanceOf[NthSelector77].p)
        case 78 => bh.consume(caze.asInstanceOf[NthSelector78].p)
        case 79 => bh.consume(caze.asInstanceOf[NthSelector79].p)
        case 80 => bh.consume(caze.asInstanceOf[NthSelector80].p)
        case 81 => bh.consume(caze.asInstanceOf[NthSelector81].p)
        case 82 => bh.consume(caze.asInstanceOf[NthSelector82].p)
        case 83 => bh.consume(caze.asInstanceOf[NthSelector83].p)
        case 84 => bh.consume(caze.asInstanceOf[NthSelector84].p)
        case 85 => bh.consume(caze.asInstanceOf[NthSelector85].p)
        case 86 => bh.consume(caze.asInstanceOf[NthSelector86].p)
        case 87 => bh.consume(caze.asInstanceOf[NthSelector87].p)
        case 88 => bh.consume(caze.asInstanceOf[NthSelector88].p)
        case 89 => bh.consume(caze.asInstanceOf[NthSelector89].p)
        case 90 => bh.consume(caze.asInstanceOf[NthSelector90].p)
        case 91 => bh.consume(caze.asInstanceOf[NthSelector91].p)
        case 92 => bh.consume(caze.asInstanceOf[NthSelector92].p)
        case 93 => bh.consume(caze.asInstanceOf[NthSelector93].p)
        case 94 => bh.consume(caze.asInstanceOf[NthSelector94].p)
        case 95 => bh.consume(caze.asInstanceOf[NthSelector95].p)
        case 96 => bh.consume(caze.asInstanceOf[NthSelector96].p)
        case 97 => bh.consume(caze.asInstanceOf[NthSelector97].p)
        case 98 => bh.consume(caze.asInstanceOf[NthSelector98].p)
        case 99 => bh.consume(caze.asInstanceOf[NthSelector99].p)
        case 100 => bh.consume(caze.asInstanceOf[NthSelector100].p)
        case 101 => bh.consume(caze.asInstanceOf[NthSelector101].p)
        case 102 => bh.consume(caze.asInstanceOf[NthSelector102].p)
        case 103 => bh.consume(caze.asInstanceOf[NthSelector103].p)
        case 104 => bh.consume(caze.asInstanceOf[NthSelector104].p)
        case 105 => bh.consume(caze.asInstanceOf[NthSelector105].p)
        case 106 => bh.consume(caze.asInstanceOf[NthSelector106].p)
        case 107 => bh.consume(caze.asInstanceOf[NthSelector107].p)
        case 108 => bh.consume(caze.asInstanceOf[NthSelector108].p)
        case 109 => bh.consume(caze.asInstanceOf[NthSelector109].p)
        case 110 => bh.consume(caze.asInstanceOf[NthSelector110].p)
        case 111 => bh.consume(caze.asInstanceOf[NthSelector111].p)
        case 112 => bh.consume(caze.asInstanceOf[NthSelector112].p)
        case 113 => bh.consume(caze.asInstanceOf[NthSelector113].p)
        case 114 => bh.consume(caze.asInstanceOf[NthSelector114].p)
        case 115 => bh.consume(caze.asInstanceOf[NthSelector115].p)
        case 116 => bh.consume(caze.asInstanceOf[NthSelector116].p)
        case 117 => bh.consume(caze.asInstanceOf[NthSelector117].p)
        case 118 => bh.consume(caze.asInstanceOf[NthSelector118].p)
        case 119 => bh.consume(caze.asInstanceOf[NthSelector119].p)
        case 120 => bh.consume(caze.asInstanceOf[NthSelector120].p)
        case 121 => bh.consume(caze.asInstanceOf[NthSelector121].p)
        case 122 => bh.consume(caze.asInstanceOf[NthSelector122].p)
        case 123 => bh.consume(caze.asInstanceOf[NthSelector123].p)
        case 124 => bh.consume(caze.asInstanceOf[NthSelector124].p)
        case 125 => bh.consume(caze.asInstanceOf[NthSelector125].p)
        case 126 => bh.consume(caze.asInstanceOf[NthSelector126].p)
        case 127 => bh.consume(caze.asInstanceOf[NthSelector127].p)
        case 128 => bh.consume(caze.asInstanceOf[NthSelector128].p)
      }
    }

    state.s.foreach(selectSelf)

  }

}