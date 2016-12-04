
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object PlainData256 {

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
  case class NthSelector65(p: Int) extends Plain
  case class NthSelector66(p: Int) extends Plain
  case class NthSelector67(p: Int) extends Plain
  case class NthSelector68(p: Int) extends Plain
  case class NthSelector69(p: Int) extends Plain
  case class NthSelector70(p: Int) extends Plain
  case class NthSelector71(p: Int) extends Plain
  case class NthSelector72(p: Int) extends Plain
  case class NthSelector73(p: Int) extends Plain
  case class NthSelector74(p: Int) extends Plain
  case class NthSelector75(p: Int) extends Plain
  case class NthSelector76(p: Int) extends Plain
  case class NthSelector77(p: Int) extends Plain
  case class NthSelector78(p: Int) extends Plain
  case class NthSelector79(p: Int) extends Plain
  case class NthSelector80(p: Int) extends Plain
  case class NthSelector81(p: Int) extends Plain
  case class NthSelector82(p: Int) extends Plain
  case class NthSelector83(p: Int) extends Plain
  case class NthSelector84(p: Int) extends Plain
  case class NthSelector85(p: Int) extends Plain
  case class NthSelector86(p: Int) extends Plain
  case class NthSelector87(p: Int) extends Plain
  case class NthSelector88(p: Int) extends Plain
  case class NthSelector89(p: Int) extends Plain
  case class NthSelector90(p: Int) extends Plain
  case class NthSelector91(p: Int) extends Plain
  case class NthSelector92(p: Int) extends Plain
  case class NthSelector93(p: Int) extends Plain
  case class NthSelector94(p: Int) extends Plain
  case class NthSelector95(p: Int) extends Plain
  case class NthSelector96(p: Int) extends Plain
  case class NthSelector97(p: Int) extends Plain
  case class NthSelector98(p: Int) extends Plain
  case class NthSelector99(p: Int) extends Plain
  case class NthSelector100(p: Int) extends Plain
  case class NthSelector101(p: Int) extends Plain
  case class NthSelector102(p: Int) extends Plain
  case class NthSelector103(p: Int) extends Plain
  case class NthSelector104(p: Int) extends Plain
  case class NthSelector105(p: Int) extends Plain
  case class NthSelector106(p: Int) extends Plain
  case class NthSelector107(p: Int) extends Plain
  case class NthSelector108(p: Int) extends Plain
  case class NthSelector109(p: Int) extends Plain
  case class NthSelector110(p: Int) extends Plain
  case class NthSelector111(p: Int) extends Plain
  case class NthSelector112(p: Int) extends Plain
  case class NthSelector113(p: Int) extends Plain
  case class NthSelector114(p: Int) extends Plain
  case class NthSelector115(p: Int) extends Plain
  case class NthSelector116(p: Int) extends Plain
  case class NthSelector117(p: Int) extends Plain
  case class NthSelector118(p: Int) extends Plain
  case class NthSelector119(p: Int) extends Plain
  case class NthSelector120(p: Int) extends Plain
  case class NthSelector121(p: Int) extends Plain
  case class NthSelector122(p: Int) extends Plain
  case class NthSelector123(p: Int) extends Plain
  case class NthSelector124(p: Int) extends Plain
  case class NthSelector125(p: Int) extends Plain
  case class NthSelector126(p: Int) extends Plain
  case class NthSelector127(p: Int) extends Plain
  case class NthSelector128(p: Int) extends Plain
  case class NthSelector129(p: Int) extends Plain
  case class NthSelector130(p: Int) extends Plain
  case class NthSelector131(p: Int) extends Plain
  case class NthSelector132(p: Int) extends Plain
  case class NthSelector133(p: Int) extends Plain
  case class NthSelector134(p: Int) extends Plain
  case class NthSelector135(p: Int) extends Plain
  case class NthSelector136(p: Int) extends Plain
  case class NthSelector137(p: Int) extends Plain
  case class NthSelector138(p: Int) extends Plain
  case class NthSelector139(p: Int) extends Plain
  case class NthSelector140(p: Int) extends Plain
  case class NthSelector141(p: Int) extends Plain
  case class NthSelector142(p: Int) extends Plain
  case class NthSelector143(p: Int) extends Plain
  case class NthSelector144(p: Int) extends Plain
  case class NthSelector145(p: Int) extends Plain
  case class NthSelector146(p: Int) extends Plain
  case class NthSelector147(p: Int) extends Plain
  case class NthSelector148(p: Int) extends Plain
  case class NthSelector149(p: Int) extends Plain
  case class NthSelector150(p: Int) extends Plain
  case class NthSelector151(p: Int) extends Plain
  case class NthSelector152(p: Int) extends Plain
  case class NthSelector153(p: Int) extends Plain
  case class NthSelector154(p: Int) extends Plain
  case class NthSelector155(p: Int) extends Plain
  case class NthSelector156(p: Int) extends Plain
  case class NthSelector157(p: Int) extends Plain
  case class NthSelector158(p: Int) extends Plain
  case class NthSelector159(p: Int) extends Plain
  case class NthSelector160(p: Int) extends Plain
  case class NthSelector161(p: Int) extends Plain
  case class NthSelector162(p: Int) extends Plain
  case class NthSelector163(p: Int) extends Plain
  case class NthSelector164(p: Int) extends Plain
  case class NthSelector165(p: Int) extends Plain
  case class NthSelector166(p: Int) extends Plain
  case class NthSelector167(p: Int) extends Plain
  case class NthSelector168(p: Int) extends Plain
  case class NthSelector169(p: Int) extends Plain
  case class NthSelector170(p: Int) extends Plain
  case class NthSelector171(p: Int) extends Plain
  case class NthSelector172(p: Int) extends Plain
  case class NthSelector173(p: Int) extends Plain
  case class NthSelector174(p: Int) extends Plain
  case class NthSelector175(p: Int) extends Plain
  case class NthSelector176(p: Int) extends Plain
  case class NthSelector177(p: Int) extends Plain
  case class NthSelector178(p: Int) extends Plain
  case class NthSelector179(p: Int) extends Plain
  case class NthSelector180(p: Int) extends Plain
  case class NthSelector181(p: Int) extends Plain
  case class NthSelector182(p: Int) extends Plain
  case class NthSelector183(p: Int) extends Plain
  case class NthSelector184(p: Int) extends Plain
  case class NthSelector185(p: Int) extends Plain
  case class NthSelector186(p: Int) extends Plain
  case class NthSelector187(p: Int) extends Plain
  case class NthSelector188(p: Int) extends Plain
  case class NthSelector189(p: Int) extends Plain
  case class NthSelector190(p: Int) extends Plain
  case class NthSelector191(p: Int) extends Plain
  case class NthSelector192(p: Int) extends Plain
  case class NthSelector193(p: Int) extends Plain
  case class NthSelector194(p: Int) extends Plain
  case class NthSelector195(p: Int) extends Plain
  case class NthSelector196(p: Int) extends Plain
  case class NthSelector197(p: Int) extends Plain
  case class NthSelector198(p: Int) extends Plain
  case class NthSelector199(p: Int) extends Plain
  case class NthSelector200(p: Int) extends Plain
  case class NthSelector201(p: Int) extends Plain
  case class NthSelector202(p: Int) extends Plain
  case class NthSelector203(p: Int) extends Plain
  case class NthSelector204(p: Int) extends Plain
  case class NthSelector205(p: Int) extends Plain
  case class NthSelector206(p: Int) extends Plain
  case class NthSelector207(p: Int) extends Plain
  case class NthSelector208(p: Int) extends Plain
  case class NthSelector209(p: Int) extends Plain
  case class NthSelector210(p: Int) extends Plain
  case class NthSelector211(p: Int) extends Plain
  case class NthSelector212(p: Int) extends Plain
  case class NthSelector213(p: Int) extends Plain
  case class NthSelector214(p: Int) extends Plain
  case class NthSelector215(p: Int) extends Plain
  case class NthSelector216(p: Int) extends Plain
  case class NthSelector217(p: Int) extends Plain
  case class NthSelector218(p: Int) extends Plain
  case class NthSelector219(p: Int) extends Plain
  case class NthSelector220(p: Int) extends Plain
  case class NthSelector221(p: Int) extends Plain
  case class NthSelector222(p: Int) extends Plain
  case class NthSelector223(p: Int) extends Plain
  case class NthSelector224(p: Int) extends Plain
  case class NthSelector225(p: Int) extends Plain
  case class NthSelector226(p: Int) extends Plain
  case class NthSelector227(p: Int) extends Plain
  case class NthSelector228(p: Int) extends Plain
  case class NthSelector229(p: Int) extends Plain
  case class NthSelector230(p: Int) extends Plain
  case class NthSelector231(p: Int) extends Plain
  case class NthSelector232(p: Int) extends Plain
  case class NthSelector233(p: Int) extends Plain
  case class NthSelector234(p: Int) extends Plain
  case class NthSelector235(p: Int) extends Plain
  case class NthSelector236(p: Int) extends Plain
  case class NthSelector237(p: Int) extends Plain
  case class NthSelector238(p: Int) extends Plain
  case class NthSelector239(p: Int) extends Plain
  case class NthSelector240(p: Int) extends Plain
  case class NthSelector241(p: Int) extends Plain
  case class NthSelector242(p: Int) extends Plain
  case class NthSelector243(p: Int) extends Plain
  case class NthSelector244(p: Int) extends Plain
  case class NthSelector245(p: Int) extends Plain
  case class NthSelector246(p: Int) extends Plain
  case class NthSelector247(p: Int) extends Plain
  case class NthSelector248(p: Int) extends Plain
  case class NthSelector249(p: Int) extends Plain
  case class NthSelector250(p: Int) extends Plain
  case class NthSelector251(p: Int) extends Plain
  case class NthSelector252(p: Int) extends Plain
  case class NthSelector253(p: Int) extends Plain
  case class NthSelector254(p: Int) extends Plain
  case class NthSelector255(p: Int) extends Plain
  case class NthSelector256(p: Int) extends Plain

  @State(Scope.Benchmark)
  class Sorted {
    var s = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)).::(NthSelector33(33)).::(NthSelector34(34)).::(NthSelector35(35)).::(NthSelector36(36)).::(NthSelector37(37)).::(NthSelector38(38)).::(NthSelector39(39)).::(NthSelector40(40)).::(NthSelector41(41)).::(NthSelector42(42)).::(NthSelector43(43)).::(NthSelector44(44)).::(NthSelector45(45)).::(NthSelector46(46)).::(NthSelector47(47)).::(NthSelector48(48)).::(NthSelector49(49)).::(NthSelector50(50)).::(NthSelector51(51)).::(NthSelector52(52)).::(NthSelector53(53)).::(NthSelector54(54)).::(NthSelector55(55)).::(NthSelector56(56)).::(NthSelector57(57)).::(NthSelector58(58)).::(NthSelector59(59)).::(NthSelector60(60)).::(NthSelector61(61)).::(NthSelector62(62)).::(NthSelector63(63)).::(NthSelector64(64))) ++
      (List.empty[Plain].::(NthSelector65(65)).::(NthSelector66(66)).::(NthSelector67(67)).::(NthSelector68(68)).::(NthSelector69(69)).::(NthSelector70(70)).::(NthSelector71(71)).::(NthSelector72(72)).::(NthSelector73(73)).::(NthSelector74(74)).::(NthSelector75(75)).::(NthSelector76(76)).::(NthSelector77(77)).::(NthSelector78(78)).::(NthSelector79(79)).::(NthSelector80(80)).::(NthSelector81(81)).::(NthSelector82(82)).::(NthSelector83(83)).::(NthSelector84(84)).::(NthSelector85(85)).::(NthSelector86(86)).::(NthSelector87(87)).::(NthSelector88(88)).::(NthSelector89(89)).::(NthSelector90(90)).::(NthSelector91(91)).::(NthSelector92(92)).::(NthSelector93(93)).::(NthSelector94(94)).::(NthSelector95(95)).::(NthSelector96(96)).::(NthSelector97(97)).::(NthSelector98(98)).::(NthSelector99(99)).::(NthSelector100(100)).::(NthSelector101(101)).::(NthSelector102(102)).::(NthSelector103(103)).::(NthSelector104(104)).::(NthSelector105(105)).::(NthSelector106(106)).::(NthSelector107(107)).::(NthSelector108(108)).::(NthSelector109(109)).::(NthSelector110(110)).::(NthSelector111(111)).::(NthSelector112(112)).::(NthSelector113(113)).::(NthSelector114(114)).::(NthSelector115(115)).::(NthSelector116(116)).::(NthSelector117(117)).::(NthSelector118(118)).::(NthSelector119(119)).::(NthSelector120(120)).::(NthSelector121(121)).::(NthSelector122(122)).::(NthSelector123(123)).::(NthSelector124(124)).::(NthSelector125(125)).::(NthSelector126(126)).::(NthSelector127(127)).::(NthSelector128(128))) ++
      (List.empty[Plain].::(NthSelector129(129)).::(NthSelector130(130)).::(NthSelector131(131)).::(NthSelector132(132)).::(NthSelector133(133)).::(NthSelector134(134)).::(NthSelector135(135)).::(NthSelector136(136)).::(NthSelector137(137)).::(NthSelector138(138)).::(NthSelector139(139)).::(NthSelector140(140)).::(NthSelector141(141)).::(NthSelector142(142)).::(NthSelector143(143)).::(NthSelector144(144)).::(NthSelector145(145)).::(NthSelector146(146)).::(NthSelector147(147)).::(NthSelector148(148)).::(NthSelector149(149)).::(NthSelector150(150)).::(NthSelector151(151)).::(NthSelector152(152)).::(NthSelector153(153)).::(NthSelector154(154)).::(NthSelector155(155)).::(NthSelector156(156)).::(NthSelector157(157)).::(NthSelector158(158)).::(NthSelector159(159)).::(NthSelector160(160)).::(NthSelector161(161)).::(NthSelector162(162)).::(NthSelector163(163)).::(NthSelector164(164)).::(NthSelector165(165)).::(NthSelector166(166)).::(NthSelector167(167)).::(NthSelector168(168)).::(NthSelector169(169)).::(NthSelector170(170)).::(NthSelector171(171)).::(NthSelector172(172)).::(NthSelector173(173)).::(NthSelector174(174)).::(NthSelector175(175)).::(NthSelector176(176)).::(NthSelector177(177)).::(NthSelector178(178)).::(NthSelector179(179)).::(NthSelector180(180)).::(NthSelector181(181)).::(NthSelector182(182)).::(NthSelector183(183)).::(NthSelector184(184)).::(NthSelector185(185)).::(NthSelector186(186)).::(NthSelector187(187)).::(NthSelector188(188)).::(NthSelector189(189)).::(NthSelector190(190)).::(NthSelector191(191)).::(NthSelector192(192))) ++
      (List.empty[Plain].::(NthSelector193(193)).::(NthSelector194(194)).::(NthSelector195(195)).::(NthSelector196(196)).::(NthSelector197(197)).::(NthSelector198(198)).::(NthSelector199(199)).::(NthSelector200(200)).::(NthSelector201(201)).::(NthSelector202(202)).::(NthSelector203(203)).::(NthSelector204(204)).::(NthSelector205(205)).::(NthSelector206(206)).::(NthSelector207(207)).::(NthSelector208(208)).::(NthSelector209(209)).::(NthSelector210(210)).::(NthSelector211(211)).::(NthSelector212(212)).::(NthSelector213(213)).::(NthSelector214(214)).::(NthSelector215(215)).::(NthSelector216(216)).::(NthSelector217(217)).::(NthSelector218(218)).::(NthSelector219(219)).::(NthSelector220(220)).::(NthSelector221(221)).::(NthSelector222(222)).::(NthSelector223(223)).::(NthSelector224(224)).::(NthSelector225(225)).::(NthSelector226(226)).::(NthSelector227(227)).::(NthSelector228(228)).::(NthSelector229(229)).::(NthSelector230(230)).::(NthSelector231(231)).::(NthSelector232(232)).::(NthSelector233(233)).::(NthSelector234(234)).::(NthSelector235(235)).::(NthSelector236(236)).::(NthSelector237(237)).::(NthSelector238(238)).::(NthSelector239(239)).::(NthSelector240(240)).::(NthSelector241(241)).::(NthSelector242(242)).::(NthSelector243(243)).::(NthSelector244(244)).::(NthSelector245(245)).::(NthSelector246(246)).::(NthSelector247(247)).::(NthSelector248(248)).::(NthSelector249(249)).::(NthSelector250(250)).::(NthSelector251(251)).::(NthSelector252(252)).::(NthSelector253(253)).::(NthSelector254(254)).::(NthSelector255(255)).::(NthSelector256(256)))
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var sorted = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)).::(NthSelector33(33)).::(NthSelector34(34)).::(NthSelector35(35)).::(NthSelector36(36)).::(NthSelector37(37)).::(NthSelector38(38)).::(NthSelector39(39)).::(NthSelector40(40)).::(NthSelector41(41)).::(NthSelector42(42)).::(NthSelector43(43)).::(NthSelector44(44)).::(NthSelector45(45)).::(NthSelector46(46)).::(NthSelector47(47)).::(NthSelector48(48)).::(NthSelector49(49)).::(NthSelector50(50)).::(NthSelector51(51)).::(NthSelector52(52)).::(NthSelector53(53)).::(NthSelector54(54)).::(NthSelector55(55)).::(NthSelector56(56)).::(NthSelector57(57)).::(NthSelector58(58)).::(NthSelector59(59)).::(NthSelector60(60)).::(NthSelector61(61)).::(NthSelector62(62)).::(NthSelector63(63)).::(NthSelector64(64))) ++
      (List.empty[Plain].::(NthSelector65(65)).::(NthSelector66(66)).::(NthSelector67(67)).::(NthSelector68(68)).::(NthSelector69(69)).::(NthSelector70(70)).::(NthSelector71(71)).::(NthSelector72(72)).::(NthSelector73(73)).::(NthSelector74(74)).::(NthSelector75(75)).::(NthSelector76(76)).::(NthSelector77(77)).::(NthSelector78(78)).::(NthSelector79(79)).::(NthSelector80(80)).::(NthSelector81(81)).::(NthSelector82(82)).::(NthSelector83(83)).::(NthSelector84(84)).::(NthSelector85(85)).::(NthSelector86(86)).::(NthSelector87(87)).::(NthSelector88(88)).::(NthSelector89(89)).::(NthSelector90(90)).::(NthSelector91(91)).::(NthSelector92(92)).::(NthSelector93(93)).::(NthSelector94(94)).::(NthSelector95(95)).::(NthSelector96(96)).::(NthSelector97(97)).::(NthSelector98(98)).::(NthSelector99(99)).::(NthSelector100(100)).::(NthSelector101(101)).::(NthSelector102(102)).::(NthSelector103(103)).::(NthSelector104(104)).::(NthSelector105(105)).::(NthSelector106(106)).::(NthSelector107(107)).::(NthSelector108(108)).::(NthSelector109(109)).::(NthSelector110(110)).::(NthSelector111(111)).::(NthSelector112(112)).::(NthSelector113(113)).::(NthSelector114(114)).::(NthSelector115(115)).::(NthSelector116(116)).::(NthSelector117(117)).::(NthSelector118(118)).::(NthSelector119(119)).::(NthSelector120(120)).::(NthSelector121(121)).::(NthSelector122(122)).::(NthSelector123(123)).::(NthSelector124(124)).::(NthSelector125(125)).::(NthSelector126(126)).::(NthSelector127(127)).::(NthSelector128(128))) ++
      (List.empty[Plain].::(NthSelector129(129)).::(NthSelector130(130)).::(NthSelector131(131)).::(NthSelector132(132)).::(NthSelector133(133)).::(NthSelector134(134)).::(NthSelector135(135)).::(NthSelector136(136)).::(NthSelector137(137)).::(NthSelector138(138)).::(NthSelector139(139)).::(NthSelector140(140)).::(NthSelector141(141)).::(NthSelector142(142)).::(NthSelector143(143)).::(NthSelector144(144)).::(NthSelector145(145)).::(NthSelector146(146)).::(NthSelector147(147)).::(NthSelector148(148)).::(NthSelector149(149)).::(NthSelector150(150)).::(NthSelector151(151)).::(NthSelector152(152)).::(NthSelector153(153)).::(NthSelector154(154)).::(NthSelector155(155)).::(NthSelector156(156)).::(NthSelector157(157)).::(NthSelector158(158)).::(NthSelector159(159)).::(NthSelector160(160)).::(NthSelector161(161)).::(NthSelector162(162)).::(NthSelector163(163)).::(NthSelector164(164)).::(NthSelector165(165)).::(NthSelector166(166)).::(NthSelector167(167)).::(NthSelector168(168)).::(NthSelector169(169)).::(NthSelector170(170)).::(NthSelector171(171)).::(NthSelector172(172)).::(NthSelector173(173)).::(NthSelector174(174)).::(NthSelector175(175)).::(NthSelector176(176)).::(NthSelector177(177)).::(NthSelector178(178)).::(NthSelector179(179)).::(NthSelector180(180)).::(NthSelector181(181)).::(NthSelector182(182)).::(NthSelector183(183)).::(NthSelector184(184)).::(NthSelector185(185)).::(NthSelector186(186)).::(NthSelector187(187)).::(NthSelector188(188)).::(NthSelector189(189)).::(NthSelector190(190)).::(NthSelector191(191)).::(NthSelector192(192))) ++
      (List.empty[Plain].::(NthSelector193(193)).::(NthSelector194(194)).::(NthSelector195(195)).::(NthSelector196(196)).::(NthSelector197(197)).::(NthSelector198(198)).::(NthSelector199(199)).::(NthSelector200(200)).::(NthSelector201(201)).::(NthSelector202(202)).::(NthSelector203(203)).::(NthSelector204(204)).::(NthSelector205(205)).::(NthSelector206(206)).::(NthSelector207(207)).::(NthSelector208(208)).::(NthSelector209(209)).::(NthSelector210(210)).::(NthSelector211(211)).::(NthSelector212(212)).::(NthSelector213(213)).::(NthSelector214(214)).::(NthSelector215(215)).::(NthSelector216(216)).::(NthSelector217(217)).::(NthSelector218(218)).::(NthSelector219(219)).::(NthSelector220(220)).::(NthSelector221(221)).::(NthSelector222(222)).::(NthSelector223(223)).::(NthSelector224(224)).::(NthSelector225(225)).::(NthSelector226(226)).::(NthSelector227(227)).::(NthSelector228(228)).::(NthSelector229(229)).::(NthSelector230(230)).::(NthSelector231(231)).::(NthSelector232(232)).::(NthSelector233(233)).::(NthSelector234(234)).::(NthSelector235(235)).::(NthSelector236(236)).::(NthSelector237(237)).::(NthSelector238(238)).::(NthSelector239(239)).::(NthSelector240(240)).::(NthSelector241(241)).::(NthSelector242(242)).::(NthSelector243(243)).::(NthSelector244(244)).::(NthSelector245(245)).::(NthSelector246(246)).::(NthSelector247(247)).::(NthSelector248(248)).::(NthSelector249(249)).::(NthSelector250(250)).::(NthSelector251(251)).::(NthSelector252(252)).::(NthSelector253(253)).::(NthSelector254(254)).::(NthSelector255(255)).::(NthSelector256(256)))
    var s = new scala.util.Random(256).shuffle(sorted)
  }

}

class PlainBenchmark256 {
  import PlainData256._
  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(256)
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
        case NthSelector65(p) => bh.consume(p)
        case NthSelector66(p) => bh.consume(p)
        case NthSelector67(p) => bh.consume(p)
        case NthSelector68(p) => bh.consume(p)
        case NthSelector69(p) => bh.consume(p)
        case NthSelector70(p) => bh.consume(p)
        case NthSelector71(p) => bh.consume(p)
        case NthSelector72(p) => bh.consume(p)
        case NthSelector73(p) => bh.consume(p)
        case NthSelector74(p) => bh.consume(p)
        case NthSelector75(p) => bh.consume(p)
        case NthSelector76(p) => bh.consume(p)
        case NthSelector77(p) => bh.consume(p)
        case NthSelector78(p) => bh.consume(p)
        case NthSelector79(p) => bh.consume(p)
        case NthSelector80(p) => bh.consume(p)
        case NthSelector81(p) => bh.consume(p)
        case NthSelector82(p) => bh.consume(p)
        case NthSelector83(p) => bh.consume(p)
        case NthSelector84(p) => bh.consume(p)
        case NthSelector85(p) => bh.consume(p)
        case NthSelector86(p) => bh.consume(p)
        case NthSelector87(p) => bh.consume(p)
        case NthSelector88(p) => bh.consume(p)
        case NthSelector89(p) => bh.consume(p)
        case NthSelector90(p) => bh.consume(p)
        case NthSelector91(p) => bh.consume(p)
        case NthSelector92(p) => bh.consume(p)
        case NthSelector93(p) => bh.consume(p)
        case NthSelector94(p) => bh.consume(p)
        case NthSelector95(p) => bh.consume(p)
        case NthSelector96(p) => bh.consume(p)
        case NthSelector97(p) => bh.consume(p)
        case NthSelector98(p) => bh.consume(p)
        case NthSelector99(p) => bh.consume(p)
        case NthSelector100(p) => bh.consume(p)
        case NthSelector101(p) => bh.consume(p)
        case NthSelector102(p) => bh.consume(p)
        case NthSelector103(p) => bh.consume(p)
        case NthSelector104(p) => bh.consume(p)
        case NthSelector105(p) => bh.consume(p)
        case NthSelector106(p) => bh.consume(p)
        case NthSelector107(p) => bh.consume(p)
        case NthSelector108(p) => bh.consume(p)
        case NthSelector109(p) => bh.consume(p)
        case NthSelector110(p) => bh.consume(p)
        case NthSelector111(p) => bh.consume(p)
        case NthSelector112(p) => bh.consume(p)
        case NthSelector113(p) => bh.consume(p)
        case NthSelector114(p) => bh.consume(p)
        case NthSelector115(p) => bh.consume(p)
        case NthSelector116(p) => bh.consume(p)
        case NthSelector117(p) => bh.consume(p)
        case NthSelector118(p) => bh.consume(p)
        case NthSelector119(p) => bh.consume(p)
        case NthSelector120(p) => bh.consume(p)
        case NthSelector121(p) => bh.consume(p)
        case NthSelector122(p) => bh.consume(p)
        case NthSelector123(p) => bh.consume(p)
        case NthSelector124(p) => bh.consume(p)
        case NthSelector125(p) => bh.consume(p)
        case NthSelector126(p) => bh.consume(p)
        case NthSelector127(p) => bh.consume(p)
        case NthSelector128(p) => bh.consume(p)
        case NthSelector129(p) => bh.consume(p)
        case NthSelector130(p) => bh.consume(p)
        case NthSelector131(p) => bh.consume(p)
        case NthSelector132(p) => bh.consume(p)
        case NthSelector133(p) => bh.consume(p)
        case NthSelector134(p) => bh.consume(p)
        case NthSelector135(p) => bh.consume(p)
        case NthSelector136(p) => bh.consume(p)
        case NthSelector137(p) => bh.consume(p)
        case NthSelector138(p) => bh.consume(p)
        case NthSelector139(p) => bh.consume(p)
        case NthSelector140(p) => bh.consume(p)
        case NthSelector141(p) => bh.consume(p)
        case NthSelector142(p) => bh.consume(p)
        case NthSelector143(p) => bh.consume(p)
        case NthSelector144(p) => bh.consume(p)
        case NthSelector145(p) => bh.consume(p)
        case NthSelector146(p) => bh.consume(p)
        case NthSelector147(p) => bh.consume(p)
        case NthSelector148(p) => bh.consume(p)
        case NthSelector149(p) => bh.consume(p)
        case NthSelector150(p) => bh.consume(p)
        case NthSelector151(p) => bh.consume(p)
        case NthSelector152(p) => bh.consume(p)
        case NthSelector153(p) => bh.consume(p)
        case NthSelector154(p) => bh.consume(p)
        case NthSelector155(p) => bh.consume(p)
        case NthSelector156(p) => bh.consume(p)
        case NthSelector157(p) => bh.consume(p)
        case NthSelector158(p) => bh.consume(p)
        case NthSelector159(p) => bh.consume(p)
        case NthSelector160(p) => bh.consume(p)
        case NthSelector161(p) => bh.consume(p)
        case NthSelector162(p) => bh.consume(p)
        case NthSelector163(p) => bh.consume(p)
        case NthSelector164(p) => bh.consume(p)
        case NthSelector165(p) => bh.consume(p)
        case NthSelector166(p) => bh.consume(p)
        case NthSelector167(p) => bh.consume(p)
        case NthSelector168(p) => bh.consume(p)
        case NthSelector169(p) => bh.consume(p)
        case NthSelector170(p) => bh.consume(p)
        case NthSelector171(p) => bh.consume(p)
        case NthSelector172(p) => bh.consume(p)
        case NthSelector173(p) => bh.consume(p)
        case NthSelector174(p) => bh.consume(p)
        case NthSelector175(p) => bh.consume(p)
        case NthSelector176(p) => bh.consume(p)
        case NthSelector177(p) => bh.consume(p)
        case NthSelector178(p) => bh.consume(p)
        case NthSelector179(p) => bh.consume(p)
        case NthSelector180(p) => bh.consume(p)
        case NthSelector181(p) => bh.consume(p)
        case NthSelector182(p) => bh.consume(p)
        case NthSelector183(p) => bh.consume(p)
        case NthSelector184(p) => bh.consume(p)
        case NthSelector185(p) => bh.consume(p)
        case NthSelector186(p) => bh.consume(p)
        case NthSelector187(p) => bh.consume(p)
        case NthSelector188(p) => bh.consume(p)
        case NthSelector189(p) => bh.consume(p)
        case NthSelector190(p) => bh.consume(p)
        case NthSelector191(p) => bh.consume(p)
        case NthSelector192(p) => bh.consume(p)
        case NthSelector193(p) => bh.consume(p)
        case NthSelector194(p) => bh.consume(p)
        case NthSelector195(p) => bh.consume(p)
        case NthSelector196(p) => bh.consume(p)
        case NthSelector197(p) => bh.consume(p)
        case NthSelector198(p) => bh.consume(p)
        case NthSelector199(p) => bh.consume(p)
        case NthSelector200(p) => bh.consume(p)
        case NthSelector201(p) => bh.consume(p)
        case NthSelector202(p) => bh.consume(p)
        case NthSelector203(p) => bh.consume(p)
        case NthSelector204(p) => bh.consume(p)
        case NthSelector205(p) => bh.consume(p)
        case NthSelector206(p) => bh.consume(p)
        case NthSelector207(p) => bh.consume(p)
        case NthSelector208(p) => bh.consume(p)
        case NthSelector209(p) => bh.consume(p)
        case NthSelector210(p) => bh.consume(p)
        case NthSelector211(p) => bh.consume(p)
        case NthSelector212(p) => bh.consume(p)
        case NthSelector213(p) => bh.consume(p)
        case NthSelector214(p) => bh.consume(p)
        case NthSelector215(p) => bh.consume(p)
        case NthSelector216(p) => bh.consume(p)
        case NthSelector217(p) => bh.consume(p)
        case NthSelector218(p) => bh.consume(p)
        case NthSelector219(p) => bh.consume(p)
        case NthSelector220(p) => bh.consume(p)
        case NthSelector221(p) => bh.consume(p)
        case NthSelector222(p) => bh.consume(p)
        case NthSelector223(p) => bh.consume(p)
        case NthSelector224(p) => bh.consume(p)
        case NthSelector225(p) => bh.consume(p)
        case NthSelector226(p) => bh.consume(p)
        case NthSelector227(p) => bh.consume(p)
        case NthSelector228(p) => bh.consume(p)
        case NthSelector229(p) => bh.consume(p)
        case NthSelector230(p) => bh.consume(p)
        case NthSelector231(p) => bh.consume(p)
        case NthSelector232(p) => bh.consume(p)
        case NthSelector233(p) => bh.consume(p)
        case NthSelector234(p) => bh.consume(p)
        case NthSelector235(p) => bh.consume(p)
        case NthSelector236(p) => bh.consume(p)
        case NthSelector237(p) => bh.consume(p)
        case NthSelector238(p) => bh.consume(p)
        case NthSelector239(p) => bh.consume(p)
        case NthSelector240(p) => bh.consume(p)
        case NthSelector241(p) => bh.consume(p)
        case NthSelector242(p) => bh.consume(p)
        case NthSelector243(p) => bh.consume(p)
        case NthSelector244(p) => bh.consume(p)
        case NthSelector245(p) => bh.consume(p)
        case NthSelector246(p) => bh.consume(p)
        case NthSelector247(p) => bh.consume(p)
        case NthSelector248(p) => bh.consume(p)
        case NthSelector249(p) => bh.consume(p)
        case NthSelector250(p) => bh.consume(p)
        case NthSelector251(p) => bh.consume(p)
        case NthSelector252(p) => bh.consume(p)
        case NthSelector253(p) => bh.consume(p)
        case NthSelector254(p) => bh.consume(p)
        case NthSelector255(p) => bh.consume(p)
        case NthSelector256(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(256)
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
        case NthSelector65(p) => bh.consume(p)
        case NthSelector66(p) => bh.consume(p)
        case NthSelector67(p) => bh.consume(p)
        case NthSelector68(p) => bh.consume(p)
        case NthSelector69(p) => bh.consume(p)
        case NthSelector70(p) => bh.consume(p)
        case NthSelector71(p) => bh.consume(p)
        case NthSelector72(p) => bh.consume(p)
        case NthSelector73(p) => bh.consume(p)
        case NthSelector74(p) => bh.consume(p)
        case NthSelector75(p) => bh.consume(p)
        case NthSelector76(p) => bh.consume(p)
        case NthSelector77(p) => bh.consume(p)
        case NthSelector78(p) => bh.consume(p)
        case NthSelector79(p) => bh.consume(p)
        case NthSelector80(p) => bh.consume(p)
        case NthSelector81(p) => bh.consume(p)
        case NthSelector82(p) => bh.consume(p)
        case NthSelector83(p) => bh.consume(p)
        case NthSelector84(p) => bh.consume(p)
        case NthSelector85(p) => bh.consume(p)
        case NthSelector86(p) => bh.consume(p)
        case NthSelector87(p) => bh.consume(p)
        case NthSelector88(p) => bh.consume(p)
        case NthSelector89(p) => bh.consume(p)
        case NthSelector90(p) => bh.consume(p)
        case NthSelector91(p) => bh.consume(p)
        case NthSelector92(p) => bh.consume(p)
        case NthSelector93(p) => bh.consume(p)
        case NthSelector94(p) => bh.consume(p)
        case NthSelector95(p) => bh.consume(p)
        case NthSelector96(p) => bh.consume(p)
        case NthSelector97(p) => bh.consume(p)
        case NthSelector98(p) => bh.consume(p)
        case NthSelector99(p) => bh.consume(p)
        case NthSelector100(p) => bh.consume(p)
        case NthSelector101(p) => bh.consume(p)
        case NthSelector102(p) => bh.consume(p)
        case NthSelector103(p) => bh.consume(p)
        case NthSelector104(p) => bh.consume(p)
        case NthSelector105(p) => bh.consume(p)
        case NthSelector106(p) => bh.consume(p)
        case NthSelector107(p) => bh.consume(p)
        case NthSelector108(p) => bh.consume(p)
        case NthSelector109(p) => bh.consume(p)
        case NthSelector110(p) => bh.consume(p)
        case NthSelector111(p) => bh.consume(p)
        case NthSelector112(p) => bh.consume(p)
        case NthSelector113(p) => bh.consume(p)
        case NthSelector114(p) => bh.consume(p)
        case NthSelector115(p) => bh.consume(p)
        case NthSelector116(p) => bh.consume(p)
        case NthSelector117(p) => bh.consume(p)
        case NthSelector118(p) => bh.consume(p)
        case NthSelector119(p) => bh.consume(p)
        case NthSelector120(p) => bh.consume(p)
        case NthSelector121(p) => bh.consume(p)
        case NthSelector122(p) => bh.consume(p)
        case NthSelector123(p) => bh.consume(p)
        case NthSelector124(p) => bh.consume(p)
        case NthSelector125(p) => bh.consume(p)
        case NthSelector126(p) => bh.consume(p)
        case NthSelector127(p) => bh.consume(p)
        case NthSelector128(p) => bh.consume(p)
        case NthSelector129(p) => bh.consume(p)
        case NthSelector130(p) => bh.consume(p)
        case NthSelector131(p) => bh.consume(p)
        case NthSelector132(p) => bh.consume(p)
        case NthSelector133(p) => bh.consume(p)
        case NthSelector134(p) => bh.consume(p)
        case NthSelector135(p) => bh.consume(p)
        case NthSelector136(p) => bh.consume(p)
        case NthSelector137(p) => bh.consume(p)
        case NthSelector138(p) => bh.consume(p)
        case NthSelector139(p) => bh.consume(p)
        case NthSelector140(p) => bh.consume(p)
        case NthSelector141(p) => bh.consume(p)
        case NthSelector142(p) => bh.consume(p)
        case NthSelector143(p) => bh.consume(p)
        case NthSelector144(p) => bh.consume(p)
        case NthSelector145(p) => bh.consume(p)
        case NthSelector146(p) => bh.consume(p)
        case NthSelector147(p) => bh.consume(p)
        case NthSelector148(p) => bh.consume(p)
        case NthSelector149(p) => bh.consume(p)
        case NthSelector150(p) => bh.consume(p)
        case NthSelector151(p) => bh.consume(p)
        case NthSelector152(p) => bh.consume(p)
        case NthSelector153(p) => bh.consume(p)
        case NthSelector154(p) => bh.consume(p)
        case NthSelector155(p) => bh.consume(p)
        case NthSelector156(p) => bh.consume(p)
        case NthSelector157(p) => bh.consume(p)
        case NthSelector158(p) => bh.consume(p)
        case NthSelector159(p) => bh.consume(p)
        case NthSelector160(p) => bh.consume(p)
        case NthSelector161(p) => bh.consume(p)
        case NthSelector162(p) => bh.consume(p)
        case NthSelector163(p) => bh.consume(p)
        case NthSelector164(p) => bh.consume(p)
        case NthSelector165(p) => bh.consume(p)
        case NthSelector166(p) => bh.consume(p)
        case NthSelector167(p) => bh.consume(p)
        case NthSelector168(p) => bh.consume(p)
        case NthSelector169(p) => bh.consume(p)
        case NthSelector170(p) => bh.consume(p)
        case NthSelector171(p) => bh.consume(p)
        case NthSelector172(p) => bh.consume(p)
        case NthSelector173(p) => bh.consume(p)
        case NthSelector174(p) => bh.consume(p)
        case NthSelector175(p) => bh.consume(p)
        case NthSelector176(p) => bh.consume(p)
        case NthSelector177(p) => bh.consume(p)
        case NthSelector178(p) => bh.consume(p)
        case NthSelector179(p) => bh.consume(p)
        case NthSelector180(p) => bh.consume(p)
        case NthSelector181(p) => bh.consume(p)
        case NthSelector182(p) => bh.consume(p)
        case NthSelector183(p) => bh.consume(p)
        case NthSelector184(p) => bh.consume(p)
        case NthSelector185(p) => bh.consume(p)
        case NthSelector186(p) => bh.consume(p)
        case NthSelector187(p) => bh.consume(p)
        case NthSelector188(p) => bh.consume(p)
        case NthSelector189(p) => bh.consume(p)
        case NthSelector190(p) => bh.consume(p)
        case NthSelector191(p) => bh.consume(p)
        case NthSelector192(p) => bh.consume(p)
        case NthSelector193(p) => bh.consume(p)
        case NthSelector194(p) => bh.consume(p)
        case NthSelector195(p) => bh.consume(p)
        case NthSelector196(p) => bh.consume(p)
        case NthSelector197(p) => bh.consume(p)
        case NthSelector198(p) => bh.consume(p)
        case NthSelector199(p) => bh.consume(p)
        case NthSelector200(p) => bh.consume(p)
        case NthSelector201(p) => bh.consume(p)
        case NthSelector202(p) => bh.consume(p)
        case NthSelector203(p) => bh.consume(p)
        case NthSelector204(p) => bh.consume(p)
        case NthSelector205(p) => bh.consume(p)
        case NthSelector206(p) => bh.consume(p)
        case NthSelector207(p) => bh.consume(p)
        case NthSelector208(p) => bh.consume(p)
        case NthSelector209(p) => bh.consume(p)
        case NthSelector210(p) => bh.consume(p)
        case NthSelector211(p) => bh.consume(p)
        case NthSelector212(p) => bh.consume(p)
        case NthSelector213(p) => bh.consume(p)
        case NthSelector214(p) => bh.consume(p)
        case NthSelector215(p) => bh.consume(p)
        case NthSelector216(p) => bh.consume(p)
        case NthSelector217(p) => bh.consume(p)
        case NthSelector218(p) => bh.consume(p)
        case NthSelector219(p) => bh.consume(p)
        case NthSelector220(p) => bh.consume(p)
        case NthSelector221(p) => bh.consume(p)
        case NthSelector222(p) => bh.consume(p)
        case NthSelector223(p) => bh.consume(p)
        case NthSelector224(p) => bh.consume(p)
        case NthSelector225(p) => bh.consume(p)
        case NthSelector226(p) => bh.consume(p)
        case NthSelector227(p) => bh.consume(p)
        case NthSelector228(p) => bh.consume(p)
        case NthSelector229(p) => bh.consume(p)
        case NthSelector230(p) => bh.consume(p)
        case NthSelector231(p) => bh.consume(p)
        case NthSelector232(p) => bh.consume(p)
        case NthSelector233(p) => bh.consume(p)
        case NthSelector234(p) => bh.consume(p)
        case NthSelector235(p) => bh.consume(p)
        case NthSelector236(p) => bh.consume(p)
        case NthSelector237(p) => bh.consume(p)
        case NthSelector238(p) => bh.consume(p)
        case NthSelector239(p) => bh.consume(p)
        case NthSelector240(p) => bh.consume(p)
        case NthSelector241(p) => bh.consume(p)
        case NthSelector242(p) => bh.consume(p)
        case NthSelector243(p) => bh.consume(p)
        case NthSelector244(p) => bh.consume(p)
        case NthSelector245(p) => bh.consume(p)
        case NthSelector246(p) => bh.consume(p)
        case NthSelector247(p) => bh.consume(p)
        case NthSelector248(p) => bh.consume(p)
        case NthSelector249(p) => bh.consume(p)
        case NthSelector250(p) => bh.consume(p)
        case NthSelector251(p) => bh.consume(p)
        case NthSelector252(p) => bh.consume(p)
        case NthSelector253(p) => bh.consume(p)
        case NthSelector254(p) => bh.consume(p)
        case NthSelector255(p) => bh.consume(p)
        case NthSelector256(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

}