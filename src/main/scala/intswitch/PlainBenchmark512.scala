
package intswitchbench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State
import org.openjdk.jmh.annotations.OperationsPerInvocation

object PlainData512 {

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
  case class NthSelector257(p: Int) extends Plain
  case class NthSelector258(p: Int) extends Plain
  case class NthSelector259(p: Int) extends Plain
  case class NthSelector260(p: Int) extends Plain
  case class NthSelector261(p: Int) extends Plain
  case class NthSelector262(p: Int) extends Plain
  case class NthSelector263(p: Int) extends Plain
  case class NthSelector264(p: Int) extends Plain
  case class NthSelector265(p: Int) extends Plain
  case class NthSelector266(p: Int) extends Plain
  case class NthSelector267(p: Int) extends Plain
  case class NthSelector268(p: Int) extends Plain
  case class NthSelector269(p: Int) extends Plain
  case class NthSelector270(p: Int) extends Plain
  case class NthSelector271(p: Int) extends Plain
  case class NthSelector272(p: Int) extends Plain
  case class NthSelector273(p: Int) extends Plain
  case class NthSelector274(p: Int) extends Plain
  case class NthSelector275(p: Int) extends Plain
  case class NthSelector276(p: Int) extends Plain
  case class NthSelector277(p: Int) extends Plain
  case class NthSelector278(p: Int) extends Plain
  case class NthSelector279(p: Int) extends Plain
  case class NthSelector280(p: Int) extends Plain
  case class NthSelector281(p: Int) extends Plain
  case class NthSelector282(p: Int) extends Plain
  case class NthSelector283(p: Int) extends Plain
  case class NthSelector284(p: Int) extends Plain
  case class NthSelector285(p: Int) extends Plain
  case class NthSelector286(p: Int) extends Plain
  case class NthSelector287(p: Int) extends Plain
  case class NthSelector288(p: Int) extends Plain
  case class NthSelector289(p: Int) extends Plain
  case class NthSelector290(p: Int) extends Plain
  case class NthSelector291(p: Int) extends Plain
  case class NthSelector292(p: Int) extends Plain
  case class NthSelector293(p: Int) extends Plain
  case class NthSelector294(p: Int) extends Plain
  case class NthSelector295(p: Int) extends Plain
  case class NthSelector296(p: Int) extends Plain
  case class NthSelector297(p: Int) extends Plain
  case class NthSelector298(p: Int) extends Plain
  case class NthSelector299(p: Int) extends Plain
  case class NthSelector300(p: Int) extends Plain
  case class NthSelector301(p: Int) extends Plain
  case class NthSelector302(p: Int) extends Plain
  case class NthSelector303(p: Int) extends Plain
  case class NthSelector304(p: Int) extends Plain
  case class NthSelector305(p: Int) extends Plain
  case class NthSelector306(p: Int) extends Plain
  case class NthSelector307(p: Int) extends Plain
  case class NthSelector308(p: Int) extends Plain
  case class NthSelector309(p: Int) extends Plain
  case class NthSelector310(p: Int) extends Plain
  case class NthSelector311(p: Int) extends Plain
  case class NthSelector312(p: Int) extends Plain
  case class NthSelector313(p: Int) extends Plain
  case class NthSelector314(p: Int) extends Plain
  case class NthSelector315(p: Int) extends Plain
  case class NthSelector316(p: Int) extends Plain
  case class NthSelector317(p: Int) extends Plain
  case class NthSelector318(p: Int) extends Plain
  case class NthSelector319(p: Int) extends Plain
  case class NthSelector320(p: Int) extends Plain
  case class NthSelector321(p: Int) extends Plain
  case class NthSelector322(p: Int) extends Plain
  case class NthSelector323(p: Int) extends Plain
  case class NthSelector324(p: Int) extends Plain
  case class NthSelector325(p: Int) extends Plain
  case class NthSelector326(p: Int) extends Plain
  case class NthSelector327(p: Int) extends Plain
  case class NthSelector328(p: Int) extends Plain
  case class NthSelector329(p: Int) extends Plain
  case class NthSelector330(p: Int) extends Plain
  case class NthSelector331(p: Int) extends Plain
  case class NthSelector332(p: Int) extends Plain
  case class NthSelector333(p: Int) extends Plain
  case class NthSelector334(p: Int) extends Plain
  case class NthSelector335(p: Int) extends Plain
  case class NthSelector336(p: Int) extends Plain
  case class NthSelector337(p: Int) extends Plain
  case class NthSelector338(p: Int) extends Plain
  case class NthSelector339(p: Int) extends Plain
  case class NthSelector340(p: Int) extends Plain
  case class NthSelector341(p: Int) extends Plain
  case class NthSelector342(p: Int) extends Plain
  case class NthSelector343(p: Int) extends Plain
  case class NthSelector344(p: Int) extends Plain
  case class NthSelector345(p: Int) extends Plain
  case class NthSelector346(p: Int) extends Plain
  case class NthSelector347(p: Int) extends Plain
  case class NthSelector348(p: Int) extends Plain
  case class NthSelector349(p: Int) extends Plain
  case class NthSelector350(p: Int) extends Plain
  case class NthSelector351(p: Int) extends Plain
  case class NthSelector352(p: Int) extends Plain
  case class NthSelector353(p: Int) extends Plain
  case class NthSelector354(p: Int) extends Plain
  case class NthSelector355(p: Int) extends Plain
  case class NthSelector356(p: Int) extends Plain
  case class NthSelector357(p: Int) extends Plain
  case class NthSelector358(p: Int) extends Plain
  case class NthSelector359(p: Int) extends Plain
  case class NthSelector360(p: Int) extends Plain
  case class NthSelector361(p: Int) extends Plain
  case class NthSelector362(p: Int) extends Plain
  case class NthSelector363(p: Int) extends Plain
  case class NthSelector364(p: Int) extends Plain
  case class NthSelector365(p: Int) extends Plain
  case class NthSelector366(p: Int) extends Plain
  case class NthSelector367(p: Int) extends Plain
  case class NthSelector368(p: Int) extends Plain
  case class NthSelector369(p: Int) extends Plain
  case class NthSelector370(p: Int) extends Plain
  case class NthSelector371(p: Int) extends Plain
  case class NthSelector372(p: Int) extends Plain
  case class NthSelector373(p: Int) extends Plain
  case class NthSelector374(p: Int) extends Plain
  case class NthSelector375(p: Int) extends Plain
  case class NthSelector376(p: Int) extends Plain
  case class NthSelector377(p: Int) extends Plain
  case class NthSelector378(p: Int) extends Plain
  case class NthSelector379(p: Int) extends Plain
  case class NthSelector380(p: Int) extends Plain
  case class NthSelector381(p: Int) extends Plain
  case class NthSelector382(p: Int) extends Plain
  case class NthSelector383(p: Int) extends Plain
  case class NthSelector384(p: Int) extends Plain
  case class NthSelector385(p: Int) extends Plain
  case class NthSelector386(p: Int) extends Plain
  case class NthSelector387(p: Int) extends Plain
  case class NthSelector388(p: Int) extends Plain
  case class NthSelector389(p: Int) extends Plain
  case class NthSelector390(p: Int) extends Plain
  case class NthSelector391(p: Int) extends Plain
  case class NthSelector392(p: Int) extends Plain
  case class NthSelector393(p: Int) extends Plain
  case class NthSelector394(p: Int) extends Plain
  case class NthSelector395(p: Int) extends Plain
  case class NthSelector396(p: Int) extends Plain
  case class NthSelector397(p: Int) extends Plain
  case class NthSelector398(p: Int) extends Plain
  case class NthSelector399(p: Int) extends Plain
  case class NthSelector400(p: Int) extends Plain
  case class NthSelector401(p: Int) extends Plain
  case class NthSelector402(p: Int) extends Plain
  case class NthSelector403(p: Int) extends Plain
  case class NthSelector404(p: Int) extends Plain
  case class NthSelector405(p: Int) extends Plain
  case class NthSelector406(p: Int) extends Plain
  case class NthSelector407(p: Int) extends Plain
  case class NthSelector408(p: Int) extends Plain
  case class NthSelector409(p: Int) extends Plain
  case class NthSelector410(p: Int) extends Plain
  case class NthSelector411(p: Int) extends Plain
  case class NthSelector412(p: Int) extends Plain
  case class NthSelector413(p: Int) extends Plain
  case class NthSelector414(p: Int) extends Plain
  case class NthSelector415(p: Int) extends Plain
  case class NthSelector416(p: Int) extends Plain
  case class NthSelector417(p: Int) extends Plain
  case class NthSelector418(p: Int) extends Plain
  case class NthSelector419(p: Int) extends Plain
  case class NthSelector420(p: Int) extends Plain
  case class NthSelector421(p: Int) extends Plain
  case class NthSelector422(p: Int) extends Plain
  case class NthSelector423(p: Int) extends Plain
  case class NthSelector424(p: Int) extends Plain
  case class NthSelector425(p: Int) extends Plain
  case class NthSelector426(p: Int) extends Plain
  case class NthSelector427(p: Int) extends Plain
  case class NthSelector428(p: Int) extends Plain
  case class NthSelector429(p: Int) extends Plain
  case class NthSelector430(p: Int) extends Plain
  case class NthSelector431(p: Int) extends Plain
  case class NthSelector432(p: Int) extends Plain
  case class NthSelector433(p: Int) extends Plain
  case class NthSelector434(p: Int) extends Plain
  case class NthSelector435(p: Int) extends Plain
  case class NthSelector436(p: Int) extends Plain
  case class NthSelector437(p: Int) extends Plain
  case class NthSelector438(p: Int) extends Plain
  case class NthSelector439(p: Int) extends Plain
  case class NthSelector440(p: Int) extends Plain
  case class NthSelector441(p: Int) extends Plain
  case class NthSelector442(p: Int) extends Plain
  case class NthSelector443(p: Int) extends Plain
  case class NthSelector444(p: Int) extends Plain
  case class NthSelector445(p: Int) extends Plain
  case class NthSelector446(p: Int) extends Plain
  case class NthSelector447(p: Int) extends Plain
  case class NthSelector448(p: Int) extends Plain
  case class NthSelector449(p: Int) extends Plain
  case class NthSelector450(p: Int) extends Plain
  case class NthSelector451(p: Int) extends Plain
  case class NthSelector452(p: Int) extends Plain
  case class NthSelector453(p: Int) extends Plain
  case class NthSelector454(p: Int) extends Plain
  case class NthSelector455(p: Int) extends Plain
  case class NthSelector456(p: Int) extends Plain
  case class NthSelector457(p: Int) extends Plain
  case class NthSelector458(p: Int) extends Plain
  case class NthSelector459(p: Int) extends Plain
  case class NthSelector460(p: Int) extends Plain
  case class NthSelector461(p: Int) extends Plain
  case class NthSelector462(p: Int) extends Plain
  case class NthSelector463(p: Int) extends Plain
  case class NthSelector464(p: Int) extends Plain
  case class NthSelector465(p: Int) extends Plain
  case class NthSelector466(p: Int) extends Plain
  case class NthSelector467(p: Int) extends Plain
  case class NthSelector468(p: Int) extends Plain
  case class NthSelector469(p: Int) extends Plain
  case class NthSelector470(p: Int) extends Plain
  case class NthSelector471(p: Int) extends Plain
  case class NthSelector472(p: Int) extends Plain
  case class NthSelector473(p: Int) extends Plain
  case class NthSelector474(p: Int) extends Plain
  case class NthSelector475(p: Int) extends Plain
  case class NthSelector476(p: Int) extends Plain
  case class NthSelector477(p: Int) extends Plain
  case class NthSelector478(p: Int) extends Plain
  case class NthSelector479(p: Int) extends Plain
  case class NthSelector480(p: Int) extends Plain
  case class NthSelector481(p: Int) extends Plain
  case class NthSelector482(p: Int) extends Plain
  case class NthSelector483(p: Int) extends Plain
  case class NthSelector484(p: Int) extends Plain
  case class NthSelector485(p: Int) extends Plain
  case class NthSelector486(p: Int) extends Plain
  case class NthSelector487(p: Int) extends Plain
  case class NthSelector488(p: Int) extends Plain
  case class NthSelector489(p: Int) extends Plain
  case class NthSelector490(p: Int) extends Plain
  case class NthSelector491(p: Int) extends Plain
  case class NthSelector492(p: Int) extends Plain
  case class NthSelector493(p: Int) extends Plain
  case class NthSelector494(p: Int) extends Plain
  case class NthSelector495(p: Int) extends Plain
  case class NthSelector496(p: Int) extends Plain
  case class NthSelector497(p: Int) extends Plain
  case class NthSelector498(p: Int) extends Plain
  case class NthSelector499(p: Int) extends Plain
  case class NthSelector500(p: Int) extends Plain
  case class NthSelector501(p: Int) extends Plain
  case class NthSelector502(p: Int) extends Plain
  case class NthSelector503(p: Int) extends Plain
  case class NthSelector504(p: Int) extends Plain
  case class NthSelector505(p: Int) extends Plain
  case class NthSelector506(p: Int) extends Plain
  case class NthSelector507(p: Int) extends Plain
  case class NthSelector508(p: Int) extends Plain
  case class NthSelector509(p: Int) extends Plain
  case class NthSelector510(p: Int) extends Plain
  case class NthSelector511(p: Int) extends Plain
  case class NthSelector512(p: Int) extends Plain

  @State(Scope.Benchmark)
  class Sorted {
    var s = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)).::(NthSelector33(33)).::(NthSelector34(34)).::(NthSelector35(35)).::(NthSelector36(36)).::(NthSelector37(37)).::(NthSelector38(38)).::(NthSelector39(39)).::(NthSelector40(40)).::(NthSelector41(41)).::(NthSelector42(42)).::(NthSelector43(43)).::(NthSelector44(44)).::(NthSelector45(45)).::(NthSelector46(46)).::(NthSelector47(47)).::(NthSelector48(48)).::(NthSelector49(49)).::(NthSelector50(50)).::(NthSelector51(51)).::(NthSelector52(52)).::(NthSelector53(53)).::(NthSelector54(54)).::(NthSelector55(55)).::(NthSelector56(56)).::(NthSelector57(57)).::(NthSelector58(58)).::(NthSelector59(59)).::(NthSelector60(60)).::(NthSelector61(61)).::(NthSelector62(62)).::(NthSelector63(63)).::(NthSelector64(64))) ++
      (List.empty[Plain].::(NthSelector65(65)).::(NthSelector66(66)).::(NthSelector67(67)).::(NthSelector68(68)).::(NthSelector69(69)).::(NthSelector70(70)).::(NthSelector71(71)).::(NthSelector72(72)).::(NthSelector73(73)).::(NthSelector74(74)).::(NthSelector75(75)).::(NthSelector76(76)).::(NthSelector77(77)).::(NthSelector78(78)).::(NthSelector79(79)).::(NthSelector80(80)).::(NthSelector81(81)).::(NthSelector82(82)).::(NthSelector83(83)).::(NthSelector84(84)).::(NthSelector85(85)).::(NthSelector86(86)).::(NthSelector87(87)).::(NthSelector88(88)).::(NthSelector89(89)).::(NthSelector90(90)).::(NthSelector91(91)).::(NthSelector92(92)).::(NthSelector93(93)).::(NthSelector94(94)).::(NthSelector95(95)).::(NthSelector96(96)).::(NthSelector97(97)).::(NthSelector98(98)).::(NthSelector99(99)).::(NthSelector100(100)).::(NthSelector101(101)).::(NthSelector102(102)).::(NthSelector103(103)).::(NthSelector104(104)).::(NthSelector105(105)).::(NthSelector106(106)).::(NthSelector107(107)).::(NthSelector108(108)).::(NthSelector109(109)).::(NthSelector110(110)).::(NthSelector111(111)).::(NthSelector112(112)).::(NthSelector113(113)).::(NthSelector114(114)).::(NthSelector115(115)).::(NthSelector116(116)).::(NthSelector117(117)).::(NthSelector118(118)).::(NthSelector119(119)).::(NthSelector120(120)).::(NthSelector121(121)).::(NthSelector122(122)).::(NthSelector123(123)).::(NthSelector124(124)).::(NthSelector125(125)).::(NthSelector126(126)).::(NthSelector127(127)).::(NthSelector128(128))) ++
      (List.empty[Plain].::(NthSelector129(129)).::(NthSelector130(130)).::(NthSelector131(131)).::(NthSelector132(132)).::(NthSelector133(133)).::(NthSelector134(134)).::(NthSelector135(135)).::(NthSelector136(136)).::(NthSelector137(137)).::(NthSelector138(138)).::(NthSelector139(139)).::(NthSelector140(140)).::(NthSelector141(141)).::(NthSelector142(142)).::(NthSelector143(143)).::(NthSelector144(144)).::(NthSelector145(145)).::(NthSelector146(146)).::(NthSelector147(147)).::(NthSelector148(148)).::(NthSelector149(149)).::(NthSelector150(150)).::(NthSelector151(151)).::(NthSelector152(152)).::(NthSelector153(153)).::(NthSelector154(154)).::(NthSelector155(155)).::(NthSelector156(156)).::(NthSelector157(157)).::(NthSelector158(158)).::(NthSelector159(159)).::(NthSelector160(160)).::(NthSelector161(161)).::(NthSelector162(162)).::(NthSelector163(163)).::(NthSelector164(164)).::(NthSelector165(165)).::(NthSelector166(166)).::(NthSelector167(167)).::(NthSelector168(168)).::(NthSelector169(169)).::(NthSelector170(170)).::(NthSelector171(171)).::(NthSelector172(172)).::(NthSelector173(173)).::(NthSelector174(174)).::(NthSelector175(175)).::(NthSelector176(176)).::(NthSelector177(177)).::(NthSelector178(178)).::(NthSelector179(179)).::(NthSelector180(180)).::(NthSelector181(181)).::(NthSelector182(182)).::(NthSelector183(183)).::(NthSelector184(184)).::(NthSelector185(185)).::(NthSelector186(186)).::(NthSelector187(187)).::(NthSelector188(188)).::(NthSelector189(189)).::(NthSelector190(190)).::(NthSelector191(191)).::(NthSelector192(192))) ++
      (List.empty[Plain].::(NthSelector193(193)).::(NthSelector194(194)).::(NthSelector195(195)).::(NthSelector196(196)).::(NthSelector197(197)).::(NthSelector198(198)).::(NthSelector199(199)).::(NthSelector200(200)).::(NthSelector201(201)).::(NthSelector202(202)).::(NthSelector203(203)).::(NthSelector204(204)).::(NthSelector205(205)).::(NthSelector206(206)).::(NthSelector207(207)).::(NthSelector208(208)).::(NthSelector209(209)).::(NthSelector210(210)).::(NthSelector211(211)).::(NthSelector212(212)).::(NthSelector213(213)).::(NthSelector214(214)).::(NthSelector215(215)).::(NthSelector216(216)).::(NthSelector217(217)).::(NthSelector218(218)).::(NthSelector219(219)).::(NthSelector220(220)).::(NthSelector221(221)).::(NthSelector222(222)).::(NthSelector223(223)).::(NthSelector224(224)).::(NthSelector225(225)).::(NthSelector226(226)).::(NthSelector227(227)).::(NthSelector228(228)).::(NthSelector229(229)).::(NthSelector230(230)).::(NthSelector231(231)).::(NthSelector232(232)).::(NthSelector233(233)).::(NthSelector234(234)).::(NthSelector235(235)).::(NthSelector236(236)).::(NthSelector237(237)).::(NthSelector238(238)).::(NthSelector239(239)).::(NthSelector240(240)).::(NthSelector241(241)).::(NthSelector242(242)).::(NthSelector243(243)).::(NthSelector244(244)).::(NthSelector245(245)).::(NthSelector246(246)).::(NthSelector247(247)).::(NthSelector248(248)).::(NthSelector249(249)).::(NthSelector250(250)).::(NthSelector251(251)).::(NthSelector252(252)).::(NthSelector253(253)).::(NthSelector254(254)).::(NthSelector255(255)).::(NthSelector256(256))) ++
      (List.empty[Plain].::(NthSelector257(257)).::(NthSelector258(258)).::(NthSelector259(259)).::(NthSelector260(260)).::(NthSelector261(261)).::(NthSelector262(262)).::(NthSelector263(263)).::(NthSelector264(264)).::(NthSelector265(265)).::(NthSelector266(266)).::(NthSelector267(267)).::(NthSelector268(268)).::(NthSelector269(269)).::(NthSelector270(270)).::(NthSelector271(271)).::(NthSelector272(272)).::(NthSelector273(273)).::(NthSelector274(274)).::(NthSelector275(275)).::(NthSelector276(276)).::(NthSelector277(277)).::(NthSelector278(278)).::(NthSelector279(279)).::(NthSelector280(280)).::(NthSelector281(281)).::(NthSelector282(282)).::(NthSelector283(283)).::(NthSelector284(284)).::(NthSelector285(285)).::(NthSelector286(286)).::(NthSelector287(287)).::(NthSelector288(288)).::(NthSelector289(289)).::(NthSelector290(290)).::(NthSelector291(291)).::(NthSelector292(292)).::(NthSelector293(293)).::(NthSelector294(294)).::(NthSelector295(295)).::(NthSelector296(296)).::(NthSelector297(297)).::(NthSelector298(298)).::(NthSelector299(299)).::(NthSelector300(300)).::(NthSelector301(301)).::(NthSelector302(302)).::(NthSelector303(303)).::(NthSelector304(304)).::(NthSelector305(305)).::(NthSelector306(306)).::(NthSelector307(307)).::(NthSelector308(308)).::(NthSelector309(309)).::(NthSelector310(310)).::(NthSelector311(311)).::(NthSelector312(312)).::(NthSelector313(313)).::(NthSelector314(314)).::(NthSelector315(315)).::(NthSelector316(316)).::(NthSelector317(317)).::(NthSelector318(318)).::(NthSelector319(319)).::(NthSelector320(320))) ++
      (List.empty[Plain].::(NthSelector321(321)).::(NthSelector322(322)).::(NthSelector323(323)).::(NthSelector324(324)).::(NthSelector325(325)).::(NthSelector326(326)).::(NthSelector327(327)).::(NthSelector328(328)).::(NthSelector329(329)).::(NthSelector330(330)).::(NthSelector331(331)).::(NthSelector332(332)).::(NthSelector333(333)).::(NthSelector334(334)).::(NthSelector335(335)).::(NthSelector336(336)).::(NthSelector337(337)).::(NthSelector338(338)).::(NthSelector339(339)).::(NthSelector340(340)).::(NthSelector341(341)).::(NthSelector342(342)).::(NthSelector343(343)).::(NthSelector344(344)).::(NthSelector345(345)).::(NthSelector346(346)).::(NthSelector347(347)).::(NthSelector348(348)).::(NthSelector349(349)).::(NthSelector350(350)).::(NthSelector351(351)).::(NthSelector352(352)).::(NthSelector353(353)).::(NthSelector354(354)).::(NthSelector355(355)).::(NthSelector356(356)).::(NthSelector357(357)).::(NthSelector358(358)).::(NthSelector359(359)).::(NthSelector360(360)).::(NthSelector361(361)).::(NthSelector362(362)).::(NthSelector363(363)).::(NthSelector364(364)).::(NthSelector365(365)).::(NthSelector366(366)).::(NthSelector367(367)).::(NthSelector368(368)).::(NthSelector369(369)).::(NthSelector370(370)).::(NthSelector371(371)).::(NthSelector372(372)).::(NthSelector373(373)).::(NthSelector374(374)).::(NthSelector375(375)).::(NthSelector376(376)).::(NthSelector377(377)).::(NthSelector378(378)).::(NthSelector379(379)).::(NthSelector380(380)).::(NthSelector381(381)).::(NthSelector382(382)).::(NthSelector383(383)).::(NthSelector384(384))) ++
      (List.empty[Plain].::(NthSelector385(385)).::(NthSelector386(386)).::(NthSelector387(387)).::(NthSelector388(388)).::(NthSelector389(389)).::(NthSelector390(390)).::(NthSelector391(391)).::(NthSelector392(392)).::(NthSelector393(393)).::(NthSelector394(394)).::(NthSelector395(395)).::(NthSelector396(396)).::(NthSelector397(397)).::(NthSelector398(398)).::(NthSelector399(399)).::(NthSelector400(400)).::(NthSelector401(401)).::(NthSelector402(402)).::(NthSelector403(403)).::(NthSelector404(404)).::(NthSelector405(405)).::(NthSelector406(406)).::(NthSelector407(407)).::(NthSelector408(408)).::(NthSelector409(409)).::(NthSelector410(410)).::(NthSelector411(411)).::(NthSelector412(412)).::(NthSelector413(413)).::(NthSelector414(414)).::(NthSelector415(415)).::(NthSelector416(416)).::(NthSelector417(417)).::(NthSelector418(418)).::(NthSelector419(419)).::(NthSelector420(420)).::(NthSelector421(421)).::(NthSelector422(422)).::(NthSelector423(423)).::(NthSelector424(424)).::(NthSelector425(425)).::(NthSelector426(426)).::(NthSelector427(427)).::(NthSelector428(428)).::(NthSelector429(429)).::(NthSelector430(430)).::(NthSelector431(431)).::(NthSelector432(432)).::(NthSelector433(433)).::(NthSelector434(434)).::(NthSelector435(435)).::(NthSelector436(436)).::(NthSelector437(437)).::(NthSelector438(438)).::(NthSelector439(439)).::(NthSelector440(440)).::(NthSelector441(441)).::(NthSelector442(442)).::(NthSelector443(443)).::(NthSelector444(444)).::(NthSelector445(445)).::(NthSelector446(446)).::(NthSelector447(447)).::(NthSelector448(448))) ++
      (List.empty[Plain].::(NthSelector449(449)).::(NthSelector450(450)).::(NthSelector451(451)).::(NthSelector452(452)).::(NthSelector453(453)).::(NthSelector454(454)).::(NthSelector455(455)).::(NthSelector456(456)).::(NthSelector457(457)).::(NthSelector458(458)).::(NthSelector459(459)).::(NthSelector460(460)).::(NthSelector461(461)).::(NthSelector462(462)).::(NthSelector463(463)).::(NthSelector464(464)).::(NthSelector465(465)).::(NthSelector466(466)).::(NthSelector467(467)).::(NthSelector468(468)).::(NthSelector469(469)).::(NthSelector470(470)).::(NthSelector471(471)).::(NthSelector472(472)).::(NthSelector473(473)).::(NthSelector474(474)).::(NthSelector475(475)).::(NthSelector476(476)).::(NthSelector477(477)).::(NthSelector478(478)).::(NthSelector479(479)).::(NthSelector480(480)).::(NthSelector481(481)).::(NthSelector482(482)).::(NthSelector483(483)).::(NthSelector484(484)).::(NthSelector485(485)).::(NthSelector486(486)).::(NthSelector487(487)).::(NthSelector488(488)).::(NthSelector489(489)).::(NthSelector490(490)).::(NthSelector491(491)).::(NthSelector492(492)).::(NthSelector493(493)).::(NthSelector494(494)).::(NthSelector495(495)).::(NthSelector496(496)).::(NthSelector497(497)).::(NthSelector498(498)).::(NthSelector499(499)).::(NthSelector500(500)).::(NthSelector501(501)).::(NthSelector502(502)).::(NthSelector503(503)).::(NthSelector504(504)).::(NthSelector505(505)).::(NthSelector506(506)).::(NthSelector507(507)).::(NthSelector508(508)).::(NthSelector509(509)).::(NthSelector510(510)).::(NthSelector511(511)).::(NthSelector512(512)))
  }

  @State(Scope.Benchmark)
  class Shuffled {
    var sorted = List.empty[Plain] ++
      (List.empty[Plain].::(NthSelector1(1)).::(NthSelector2(2)).::(NthSelector3(3)).::(NthSelector4(4)).::(NthSelector5(5)).::(NthSelector6(6)).::(NthSelector7(7)).::(NthSelector8(8)).::(NthSelector9(9)).::(NthSelector10(10)).::(NthSelector11(11)).::(NthSelector12(12)).::(NthSelector13(13)).::(NthSelector14(14)).::(NthSelector15(15)).::(NthSelector16(16)).::(NthSelector17(17)).::(NthSelector18(18)).::(NthSelector19(19)).::(NthSelector20(20)).::(NthSelector21(21)).::(NthSelector22(22)).::(NthSelector23(23)).::(NthSelector24(24)).::(NthSelector25(25)).::(NthSelector26(26)).::(NthSelector27(27)).::(NthSelector28(28)).::(NthSelector29(29)).::(NthSelector30(30)).::(NthSelector31(31)).::(NthSelector32(32)).::(NthSelector33(33)).::(NthSelector34(34)).::(NthSelector35(35)).::(NthSelector36(36)).::(NthSelector37(37)).::(NthSelector38(38)).::(NthSelector39(39)).::(NthSelector40(40)).::(NthSelector41(41)).::(NthSelector42(42)).::(NthSelector43(43)).::(NthSelector44(44)).::(NthSelector45(45)).::(NthSelector46(46)).::(NthSelector47(47)).::(NthSelector48(48)).::(NthSelector49(49)).::(NthSelector50(50)).::(NthSelector51(51)).::(NthSelector52(52)).::(NthSelector53(53)).::(NthSelector54(54)).::(NthSelector55(55)).::(NthSelector56(56)).::(NthSelector57(57)).::(NthSelector58(58)).::(NthSelector59(59)).::(NthSelector60(60)).::(NthSelector61(61)).::(NthSelector62(62)).::(NthSelector63(63)).::(NthSelector64(64))) ++
      (List.empty[Plain].::(NthSelector65(65)).::(NthSelector66(66)).::(NthSelector67(67)).::(NthSelector68(68)).::(NthSelector69(69)).::(NthSelector70(70)).::(NthSelector71(71)).::(NthSelector72(72)).::(NthSelector73(73)).::(NthSelector74(74)).::(NthSelector75(75)).::(NthSelector76(76)).::(NthSelector77(77)).::(NthSelector78(78)).::(NthSelector79(79)).::(NthSelector80(80)).::(NthSelector81(81)).::(NthSelector82(82)).::(NthSelector83(83)).::(NthSelector84(84)).::(NthSelector85(85)).::(NthSelector86(86)).::(NthSelector87(87)).::(NthSelector88(88)).::(NthSelector89(89)).::(NthSelector90(90)).::(NthSelector91(91)).::(NthSelector92(92)).::(NthSelector93(93)).::(NthSelector94(94)).::(NthSelector95(95)).::(NthSelector96(96)).::(NthSelector97(97)).::(NthSelector98(98)).::(NthSelector99(99)).::(NthSelector100(100)).::(NthSelector101(101)).::(NthSelector102(102)).::(NthSelector103(103)).::(NthSelector104(104)).::(NthSelector105(105)).::(NthSelector106(106)).::(NthSelector107(107)).::(NthSelector108(108)).::(NthSelector109(109)).::(NthSelector110(110)).::(NthSelector111(111)).::(NthSelector112(112)).::(NthSelector113(113)).::(NthSelector114(114)).::(NthSelector115(115)).::(NthSelector116(116)).::(NthSelector117(117)).::(NthSelector118(118)).::(NthSelector119(119)).::(NthSelector120(120)).::(NthSelector121(121)).::(NthSelector122(122)).::(NthSelector123(123)).::(NthSelector124(124)).::(NthSelector125(125)).::(NthSelector126(126)).::(NthSelector127(127)).::(NthSelector128(128))) ++
      (List.empty[Plain].::(NthSelector129(129)).::(NthSelector130(130)).::(NthSelector131(131)).::(NthSelector132(132)).::(NthSelector133(133)).::(NthSelector134(134)).::(NthSelector135(135)).::(NthSelector136(136)).::(NthSelector137(137)).::(NthSelector138(138)).::(NthSelector139(139)).::(NthSelector140(140)).::(NthSelector141(141)).::(NthSelector142(142)).::(NthSelector143(143)).::(NthSelector144(144)).::(NthSelector145(145)).::(NthSelector146(146)).::(NthSelector147(147)).::(NthSelector148(148)).::(NthSelector149(149)).::(NthSelector150(150)).::(NthSelector151(151)).::(NthSelector152(152)).::(NthSelector153(153)).::(NthSelector154(154)).::(NthSelector155(155)).::(NthSelector156(156)).::(NthSelector157(157)).::(NthSelector158(158)).::(NthSelector159(159)).::(NthSelector160(160)).::(NthSelector161(161)).::(NthSelector162(162)).::(NthSelector163(163)).::(NthSelector164(164)).::(NthSelector165(165)).::(NthSelector166(166)).::(NthSelector167(167)).::(NthSelector168(168)).::(NthSelector169(169)).::(NthSelector170(170)).::(NthSelector171(171)).::(NthSelector172(172)).::(NthSelector173(173)).::(NthSelector174(174)).::(NthSelector175(175)).::(NthSelector176(176)).::(NthSelector177(177)).::(NthSelector178(178)).::(NthSelector179(179)).::(NthSelector180(180)).::(NthSelector181(181)).::(NthSelector182(182)).::(NthSelector183(183)).::(NthSelector184(184)).::(NthSelector185(185)).::(NthSelector186(186)).::(NthSelector187(187)).::(NthSelector188(188)).::(NthSelector189(189)).::(NthSelector190(190)).::(NthSelector191(191)).::(NthSelector192(192))) ++
      (List.empty[Plain].::(NthSelector193(193)).::(NthSelector194(194)).::(NthSelector195(195)).::(NthSelector196(196)).::(NthSelector197(197)).::(NthSelector198(198)).::(NthSelector199(199)).::(NthSelector200(200)).::(NthSelector201(201)).::(NthSelector202(202)).::(NthSelector203(203)).::(NthSelector204(204)).::(NthSelector205(205)).::(NthSelector206(206)).::(NthSelector207(207)).::(NthSelector208(208)).::(NthSelector209(209)).::(NthSelector210(210)).::(NthSelector211(211)).::(NthSelector212(212)).::(NthSelector213(213)).::(NthSelector214(214)).::(NthSelector215(215)).::(NthSelector216(216)).::(NthSelector217(217)).::(NthSelector218(218)).::(NthSelector219(219)).::(NthSelector220(220)).::(NthSelector221(221)).::(NthSelector222(222)).::(NthSelector223(223)).::(NthSelector224(224)).::(NthSelector225(225)).::(NthSelector226(226)).::(NthSelector227(227)).::(NthSelector228(228)).::(NthSelector229(229)).::(NthSelector230(230)).::(NthSelector231(231)).::(NthSelector232(232)).::(NthSelector233(233)).::(NthSelector234(234)).::(NthSelector235(235)).::(NthSelector236(236)).::(NthSelector237(237)).::(NthSelector238(238)).::(NthSelector239(239)).::(NthSelector240(240)).::(NthSelector241(241)).::(NthSelector242(242)).::(NthSelector243(243)).::(NthSelector244(244)).::(NthSelector245(245)).::(NthSelector246(246)).::(NthSelector247(247)).::(NthSelector248(248)).::(NthSelector249(249)).::(NthSelector250(250)).::(NthSelector251(251)).::(NthSelector252(252)).::(NthSelector253(253)).::(NthSelector254(254)).::(NthSelector255(255)).::(NthSelector256(256))) ++
      (List.empty[Plain].::(NthSelector257(257)).::(NthSelector258(258)).::(NthSelector259(259)).::(NthSelector260(260)).::(NthSelector261(261)).::(NthSelector262(262)).::(NthSelector263(263)).::(NthSelector264(264)).::(NthSelector265(265)).::(NthSelector266(266)).::(NthSelector267(267)).::(NthSelector268(268)).::(NthSelector269(269)).::(NthSelector270(270)).::(NthSelector271(271)).::(NthSelector272(272)).::(NthSelector273(273)).::(NthSelector274(274)).::(NthSelector275(275)).::(NthSelector276(276)).::(NthSelector277(277)).::(NthSelector278(278)).::(NthSelector279(279)).::(NthSelector280(280)).::(NthSelector281(281)).::(NthSelector282(282)).::(NthSelector283(283)).::(NthSelector284(284)).::(NthSelector285(285)).::(NthSelector286(286)).::(NthSelector287(287)).::(NthSelector288(288)).::(NthSelector289(289)).::(NthSelector290(290)).::(NthSelector291(291)).::(NthSelector292(292)).::(NthSelector293(293)).::(NthSelector294(294)).::(NthSelector295(295)).::(NthSelector296(296)).::(NthSelector297(297)).::(NthSelector298(298)).::(NthSelector299(299)).::(NthSelector300(300)).::(NthSelector301(301)).::(NthSelector302(302)).::(NthSelector303(303)).::(NthSelector304(304)).::(NthSelector305(305)).::(NthSelector306(306)).::(NthSelector307(307)).::(NthSelector308(308)).::(NthSelector309(309)).::(NthSelector310(310)).::(NthSelector311(311)).::(NthSelector312(312)).::(NthSelector313(313)).::(NthSelector314(314)).::(NthSelector315(315)).::(NthSelector316(316)).::(NthSelector317(317)).::(NthSelector318(318)).::(NthSelector319(319)).::(NthSelector320(320))) ++
      (List.empty[Plain].::(NthSelector321(321)).::(NthSelector322(322)).::(NthSelector323(323)).::(NthSelector324(324)).::(NthSelector325(325)).::(NthSelector326(326)).::(NthSelector327(327)).::(NthSelector328(328)).::(NthSelector329(329)).::(NthSelector330(330)).::(NthSelector331(331)).::(NthSelector332(332)).::(NthSelector333(333)).::(NthSelector334(334)).::(NthSelector335(335)).::(NthSelector336(336)).::(NthSelector337(337)).::(NthSelector338(338)).::(NthSelector339(339)).::(NthSelector340(340)).::(NthSelector341(341)).::(NthSelector342(342)).::(NthSelector343(343)).::(NthSelector344(344)).::(NthSelector345(345)).::(NthSelector346(346)).::(NthSelector347(347)).::(NthSelector348(348)).::(NthSelector349(349)).::(NthSelector350(350)).::(NthSelector351(351)).::(NthSelector352(352)).::(NthSelector353(353)).::(NthSelector354(354)).::(NthSelector355(355)).::(NthSelector356(356)).::(NthSelector357(357)).::(NthSelector358(358)).::(NthSelector359(359)).::(NthSelector360(360)).::(NthSelector361(361)).::(NthSelector362(362)).::(NthSelector363(363)).::(NthSelector364(364)).::(NthSelector365(365)).::(NthSelector366(366)).::(NthSelector367(367)).::(NthSelector368(368)).::(NthSelector369(369)).::(NthSelector370(370)).::(NthSelector371(371)).::(NthSelector372(372)).::(NthSelector373(373)).::(NthSelector374(374)).::(NthSelector375(375)).::(NthSelector376(376)).::(NthSelector377(377)).::(NthSelector378(378)).::(NthSelector379(379)).::(NthSelector380(380)).::(NthSelector381(381)).::(NthSelector382(382)).::(NthSelector383(383)).::(NthSelector384(384))) ++
      (List.empty[Plain].::(NthSelector385(385)).::(NthSelector386(386)).::(NthSelector387(387)).::(NthSelector388(388)).::(NthSelector389(389)).::(NthSelector390(390)).::(NthSelector391(391)).::(NthSelector392(392)).::(NthSelector393(393)).::(NthSelector394(394)).::(NthSelector395(395)).::(NthSelector396(396)).::(NthSelector397(397)).::(NthSelector398(398)).::(NthSelector399(399)).::(NthSelector400(400)).::(NthSelector401(401)).::(NthSelector402(402)).::(NthSelector403(403)).::(NthSelector404(404)).::(NthSelector405(405)).::(NthSelector406(406)).::(NthSelector407(407)).::(NthSelector408(408)).::(NthSelector409(409)).::(NthSelector410(410)).::(NthSelector411(411)).::(NthSelector412(412)).::(NthSelector413(413)).::(NthSelector414(414)).::(NthSelector415(415)).::(NthSelector416(416)).::(NthSelector417(417)).::(NthSelector418(418)).::(NthSelector419(419)).::(NthSelector420(420)).::(NthSelector421(421)).::(NthSelector422(422)).::(NthSelector423(423)).::(NthSelector424(424)).::(NthSelector425(425)).::(NthSelector426(426)).::(NthSelector427(427)).::(NthSelector428(428)).::(NthSelector429(429)).::(NthSelector430(430)).::(NthSelector431(431)).::(NthSelector432(432)).::(NthSelector433(433)).::(NthSelector434(434)).::(NthSelector435(435)).::(NthSelector436(436)).::(NthSelector437(437)).::(NthSelector438(438)).::(NthSelector439(439)).::(NthSelector440(440)).::(NthSelector441(441)).::(NthSelector442(442)).::(NthSelector443(443)).::(NthSelector444(444)).::(NthSelector445(445)).::(NthSelector446(446)).::(NthSelector447(447)).::(NthSelector448(448))) ++
      (List.empty[Plain].::(NthSelector449(449)).::(NthSelector450(450)).::(NthSelector451(451)).::(NthSelector452(452)).::(NthSelector453(453)).::(NthSelector454(454)).::(NthSelector455(455)).::(NthSelector456(456)).::(NthSelector457(457)).::(NthSelector458(458)).::(NthSelector459(459)).::(NthSelector460(460)).::(NthSelector461(461)).::(NthSelector462(462)).::(NthSelector463(463)).::(NthSelector464(464)).::(NthSelector465(465)).::(NthSelector466(466)).::(NthSelector467(467)).::(NthSelector468(468)).::(NthSelector469(469)).::(NthSelector470(470)).::(NthSelector471(471)).::(NthSelector472(472)).::(NthSelector473(473)).::(NthSelector474(474)).::(NthSelector475(475)).::(NthSelector476(476)).::(NthSelector477(477)).::(NthSelector478(478)).::(NthSelector479(479)).::(NthSelector480(480)).::(NthSelector481(481)).::(NthSelector482(482)).::(NthSelector483(483)).::(NthSelector484(484)).::(NthSelector485(485)).::(NthSelector486(486)).::(NthSelector487(487)).::(NthSelector488(488)).::(NthSelector489(489)).::(NthSelector490(490)).::(NthSelector491(491)).::(NthSelector492(492)).::(NthSelector493(493)).::(NthSelector494(494)).::(NthSelector495(495)).::(NthSelector496(496)).::(NthSelector497(497)).::(NthSelector498(498)).::(NthSelector499(499)).::(NthSelector500(500)).::(NthSelector501(501)).::(NthSelector502(502)).::(NthSelector503(503)).::(NthSelector504(504)).::(NthSelector505(505)).::(NthSelector506(506)).::(NthSelector507(507)).::(NthSelector508(508)).::(NthSelector509(509)).::(NthSelector510(510)).::(NthSelector511(511)).::(NthSelector512(512)))
    var s = new scala.util.Random(512).shuffle(sorted)
  }

}

class PlainBenchmark512 {
  import PlainData512._
  import scala.annotation._
  import org.openjdk.jmh.infra.Blackhole

  @Benchmark
  @OperationsPerInvocation(512)
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
        case NthSelector257(p) => bh.consume(p)
        case NthSelector258(p) => bh.consume(p)
        case NthSelector259(p) => bh.consume(p)
        case NthSelector260(p) => bh.consume(p)
        case NthSelector261(p) => bh.consume(p)
        case NthSelector262(p) => bh.consume(p)
        case NthSelector263(p) => bh.consume(p)
        case NthSelector264(p) => bh.consume(p)
        case NthSelector265(p) => bh.consume(p)
        case NthSelector266(p) => bh.consume(p)
        case NthSelector267(p) => bh.consume(p)
        case NthSelector268(p) => bh.consume(p)
        case NthSelector269(p) => bh.consume(p)
        case NthSelector270(p) => bh.consume(p)
        case NthSelector271(p) => bh.consume(p)
        case NthSelector272(p) => bh.consume(p)
        case NthSelector273(p) => bh.consume(p)
        case NthSelector274(p) => bh.consume(p)
        case NthSelector275(p) => bh.consume(p)
        case NthSelector276(p) => bh.consume(p)
        case NthSelector277(p) => bh.consume(p)
        case NthSelector278(p) => bh.consume(p)
        case NthSelector279(p) => bh.consume(p)
        case NthSelector280(p) => bh.consume(p)
        case NthSelector281(p) => bh.consume(p)
        case NthSelector282(p) => bh.consume(p)
        case NthSelector283(p) => bh.consume(p)
        case NthSelector284(p) => bh.consume(p)
        case NthSelector285(p) => bh.consume(p)
        case NthSelector286(p) => bh.consume(p)
        case NthSelector287(p) => bh.consume(p)
        case NthSelector288(p) => bh.consume(p)
        case NthSelector289(p) => bh.consume(p)
        case NthSelector290(p) => bh.consume(p)
        case NthSelector291(p) => bh.consume(p)
        case NthSelector292(p) => bh.consume(p)
        case NthSelector293(p) => bh.consume(p)
        case NthSelector294(p) => bh.consume(p)
        case NthSelector295(p) => bh.consume(p)
        case NthSelector296(p) => bh.consume(p)
        case NthSelector297(p) => bh.consume(p)
        case NthSelector298(p) => bh.consume(p)
        case NthSelector299(p) => bh.consume(p)
        case NthSelector300(p) => bh.consume(p)
        case NthSelector301(p) => bh.consume(p)
        case NthSelector302(p) => bh.consume(p)
        case NthSelector303(p) => bh.consume(p)
        case NthSelector304(p) => bh.consume(p)
        case NthSelector305(p) => bh.consume(p)
        case NthSelector306(p) => bh.consume(p)
        case NthSelector307(p) => bh.consume(p)
        case NthSelector308(p) => bh.consume(p)
        case NthSelector309(p) => bh.consume(p)
        case NthSelector310(p) => bh.consume(p)
        case NthSelector311(p) => bh.consume(p)
        case NthSelector312(p) => bh.consume(p)
        case NthSelector313(p) => bh.consume(p)
        case NthSelector314(p) => bh.consume(p)
        case NthSelector315(p) => bh.consume(p)
        case NthSelector316(p) => bh.consume(p)
        case NthSelector317(p) => bh.consume(p)
        case NthSelector318(p) => bh.consume(p)
        case NthSelector319(p) => bh.consume(p)
        case NthSelector320(p) => bh.consume(p)
        case NthSelector321(p) => bh.consume(p)
        case NthSelector322(p) => bh.consume(p)
        case NthSelector323(p) => bh.consume(p)
        case NthSelector324(p) => bh.consume(p)
        case NthSelector325(p) => bh.consume(p)
        case NthSelector326(p) => bh.consume(p)
        case NthSelector327(p) => bh.consume(p)
        case NthSelector328(p) => bh.consume(p)
        case NthSelector329(p) => bh.consume(p)
        case NthSelector330(p) => bh.consume(p)
        case NthSelector331(p) => bh.consume(p)
        case NthSelector332(p) => bh.consume(p)
        case NthSelector333(p) => bh.consume(p)
        case NthSelector334(p) => bh.consume(p)
        case NthSelector335(p) => bh.consume(p)
        case NthSelector336(p) => bh.consume(p)
        case NthSelector337(p) => bh.consume(p)
        case NthSelector338(p) => bh.consume(p)
        case NthSelector339(p) => bh.consume(p)
        case NthSelector340(p) => bh.consume(p)
        case NthSelector341(p) => bh.consume(p)
        case NthSelector342(p) => bh.consume(p)
        case NthSelector343(p) => bh.consume(p)
        case NthSelector344(p) => bh.consume(p)
        case NthSelector345(p) => bh.consume(p)
        case NthSelector346(p) => bh.consume(p)
        case NthSelector347(p) => bh.consume(p)
        case NthSelector348(p) => bh.consume(p)
        case NthSelector349(p) => bh.consume(p)
        case NthSelector350(p) => bh.consume(p)
        case NthSelector351(p) => bh.consume(p)
        case NthSelector352(p) => bh.consume(p)
        case NthSelector353(p) => bh.consume(p)
        case NthSelector354(p) => bh.consume(p)
        case NthSelector355(p) => bh.consume(p)
        case NthSelector356(p) => bh.consume(p)
        case NthSelector357(p) => bh.consume(p)
        case NthSelector358(p) => bh.consume(p)
        case NthSelector359(p) => bh.consume(p)
        case NthSelector360(p) => bh.consume(p)
        case NthSelector361(p) => bh.consume(p)
        case NthSelector362(p) => bh.consume(p)
        case NthSelector363(p) => bh.consume(p)
        case NthSelector364(p) => bh.consume(p)
        case NthSelector365(p) => bh.consume(p)
        case NthSelector366(p) => bh.consume(p)
        case NthSelector367(p) => bh.consume(p)
        case NthSelector368(p) => bh.consume(p)
        case NthSelector369(p) => bh.consume(p)
        case NthSelector370(p) => bh.consume(p)
        case NthSelector371(p) => bh.consume(p)
        case NthSelector372(p) => bh.consume(p)
        case NthSelector373(p) => bh.consume(p)
        case NthSelector374(p) => bh.consume(p)
        case NthSelector375(p) => bh.consume(p)
        case NthSelector376(p) => bh.consume(p)
        case NthSelector377(p) => bh.consume(p)
        case NthSelector378(p) => bh.consume(p)
        case NthSelector379(p) => bh.consume(p)
        case NthSelector380(p) => bh.consume(p)
        case NthSelector381(p) => bh.consume(p)
        case NthSelector382(p) => bh.consume(p)
        case NthSelector383(p) => bh.consume(p)
        case NthSelector384(p) => bh.consume(p)
        case NthSelector385(p) => bh.consume(p)
        case NthSelector386(p) => bh.consume(p)
        case NthSelector387(p) => bh.consume(p)
        case NthSelector388(p) => bh.consume(p)
        case NthSelector389(p) => bh.consume(p)
        case NthSelector390(p) => bh.consume(p)
        case NthSelector391(p) => bh.consume(p)
        case NthSelector392(p) => bh.consume(p)
        case NthSelector393(p) => bh.consume(p)
        case NthSelector394(p) => bh.consume(p)
        case NthSelector395(p) => bh.consume(p)
        case NthSelector396(p) => bh.consume(p)
        case NthSelector397(p) => bh.consume(p)
        case NthSelector398(p) => bh.consume(p)
        case NthSelector399(p) => bh.consume(p)
        case NthSelector400(p) => bh.consume(p)
        case NthSelector401(p) => bh.consume(p)
        case NthSelector402(p) => bh.consume(p)
        case NthSelector403(p) => bh.consume(p)
        case NthSelector404(p) => bh.consume(p)
        case NthSelector405(p) => bh.consume(p)
        case NthSelector406(p) => bh.consume(p)
        case NthSelector407(p) => bh.consume(p)
        case NthSelector408(p) => bh.consume(p)
        case NthSelector409(p) => bh.consume(p)
        case NthSelector410(p) => bh.consume(p)
        case NthSelector411(p) => bh.consume(p)
        case NthSelector412(p) => bh.consume(p)
        case NthSelector413(p) => bh.consume(p)
        case NthSelector414(p) => bh.consume(p)
        case NthSelector415(p) => bh.consume(p)
        case NthSelector416(p) => bh.consume(p)
        case NthSelector417(p) => bh.consume(p)
        case NthSelector418(p) => bh.consume(p)
        case NthSelector419(p) => bh.consume(p)
        case NthSelector420(p) => bh.consume(p)
        case NthSelector421(p) => bh.consume(p)
        case NthSelector422(p) => bh.consume(p)
        case NthSelector423(p) => bh.consume(p)
        case NthSelector424(p) => bh.consume(p)
        case NthSelector425(p) => bh.consume(p)
        case NthSelector426(p) => bh.consume(p)
        case NthSelector427(p) => bh.consume(p)
        case NthSelector428(p) => bh.consume(p)
        case NthSelector429(p) => bh.consume(p)
        case NthSelector430(p) => bh.consume(p)
        case NthSelector431(p) => bh.consume(p)
        case NthSelector432(p) => bh.consume(p)
        case NthSelector433(p) => bh.consume(p)
        case NthSelector434(p) => bh.consume(p)
        case NthSelector435(p) => bh.consume(p)
        case NthSelector436(p) => bh.consume(p)
        case NthSelector437(p) => bh.consume(p)
        case NthSelector438(p) => bh.consume(p)
        case NthSelector439(p) => bh.consume(p)
        case NthSelector440(p) => bh.consume(p)
        case NthSelector441(p) => bh.consume(p)
        case NthSelector442(p) => bh.consume(p)
        case NthSelector443(p) => bh.consume(p)
        case NthSelector444(p) => bh.consume(p)
        case NthSelector445(p) => bh.consume(p)
        case NthSelector446(p) => bh.consume(p)
        case NthSelector447(p) => bh.consume(p)
        case NthSelector448(p) => bh.consume(p)
        case NthSelector449(p) => bh.consume(p)
        case NthSelector450(p) => bh.consume(p)
        case NthSelector451(p) => bh.consume(p)
        case NthSelector452(p) => bh.consume(p)
        case NthSelector453(p) => bh.consume(p)
        case NthSelector454(p) => bh.consume(p)
        case NthSelector455(p) => bh.consume(p)
        case NthSelector456(p) => bh.consume(p)
        case NthSelector457(p) => bh.consume(p)
        case NthSelector458(p) => bh.consume(p)
        case NthSelector459(p) => bh.consume(p)
        case NthSelector460(p) => bh.consume(p)
        case NthSelector461(p) => bh.consume(p)
        case NthSelector462(p) => bh.consume(p)
        case NthSelector463(p) => bh.consume(p)
        case NthSelector464(p) => bh.consume(p)
        case NthSelector465(p) => bh.consume(p)
        case NthSelector466(p) => bh.consume(p)
        case NthSelector467(p) => bh.consume(p)
        case NthSelector468(p) => bh.consume(p)
        case NthSelector469(p) => bh.consume(p)
        case NthSelector470(p) => bh.consume(p)
        case NthSelector471(p) => bh.consume(p)
        case NthSelector472(p) => bh.consume(p)
        case NthSelector473(p) => bh.consume(p)
        case NthSelector474(p) => bh.consume(p)
        case NthSelector475(p) => bh.consume(p)
        case NthSelector476(p) => bh.consume(p)
        case NthSelector477(p) => bh.consume(p)
        case NthSelector478(p) => bh.consume(p)
        case NthSelector479(p) => bh.consume(p)
        case NthSelector480(p) => bh.consume(p)
        case NthSelector481(p) => bh.consume(p)
        case NthSelector482(p) => bh.consume(p)
        case NthSelector483(p) => bh.consume(p)
        case NthSelector484(p) => bh.consume(p)
        case NthSelector485(p) => bh.consume(p)
        case NthSelector486(p) => bh.consume(p)
        case NthSelector487(p) => bh.consume(p)
        case NthSelector488(p) => bh.consume(p)
        case NthSelector489(p) => bh.consume(p)
        case NthSelector490(p) => bh.consume(p)
        case NthSelector491(p) => bh.consume(p)
        case NthSelector492(p) => bh.consume(p)
        case NthSelector493(p) => bh.consume(p)
        case NthSelector494(p) => bh.consume(p)
        case NthSelector495(p) => bh.consume(p)
        case NthSelector496(p) => bh.consume(p)
        case NthSelector497(p) => bh.consume(p)
        case NthSelector498(p) => bh.consume(p)
        case NthSelector499(p) => bh.consume(p)
        case NthSelector500(p) => bh.consume(p)
        case NthSelector501(p) => bh.consume(p)
        case NthSelector502(p) => bh.consume(p)
        case NthSelector503(p) => bh.consume(p)
        case NthSelector504(p) => bh.consume(p)
        case NthSelector505(p) => bh.consume(p)
        case NthSelector506(p) => bh.consume(p)
        case NthSelector507(p) => bh.consume(p)
        case NthSelector508(p) => bh.consume(p)
        case NthSelector509(p) => bh.consume(p)
        case NthSelector510(p) => bh.consume(p)
        case NthSelector511(p) => bh.consume(p)
        case NthSelector512(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

  @Benchmark
  @OperationsPerInvocation(512)
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
        case NthSelector257(p) => bh.consume(p)
        case NthSelector258(p) => bh.consume(p)
        case NthSelector259(p) => bh.consume(p)
        case NthSelector260(p) => bh.consume(p)
        case NthSelector261(p) => bh.consume(p)
        case NthSelector262(p) => bh.consume(p)
        case NthSelector263(p) => bh.consume(p)
        case NthSelector264(p) => bh.consume(p)
        case NthSelector265(p) => bh.consume(p)
        case NthSelector266(p) => bh.consume(p)
        case NthSelector267(p) => bh.consume(p)
        case NthSelector268(p) => bh.consume(p)
        case NthSelector269(p) => bh.consume(p)
        case NthSelector270(p) => bh.consume(p)
        case NthSelector271(p) => bh.consume(p)
        case NthSelector272(p) => bh.consume(p)
        case NthSelector273(p) => bh.consume(p)
        case NthSelector274(p) => bh.consume(p)
        case NthSelector275(p) => bh.consume(p)
        case NthSelector276(p) => bh.consume(p)
        case NthSelector277(p) => bh.consume(p)
        case NthSelector278(p) => bh.consume(p)
        case NthSelector279(p) => bh.consume(p)
        case NthSelector280(p) => bh.consume(p)
        case NthSelector281(p) => bh.consume(p)
        case NthSelector282(p) => bh.consume(p)
        case NthSelector283(p) => bh.consume(p)
        case NthSelector284(p) => bh.consume(p)
        case NthSelector285(p) => bh.consume(p)
        case NthSelector286(p) => bh.consume(p)
        case NthSelector287(p) => bh.consume(p)
        case NthSelector288(p) => bh.consume(p)
        case NthSelector289(p) => bh.consume(p)
        case NthSelector290(p) => bh.consume(p)
        case NthSelector291(p) => bh.consume(p)
        case NthSelector292(p) => bh.consume(p)
        case NthSelector293(p) => bh.consume(p)
        case NthSelector294(p) => bh.consume(p)
        case NthSelector295(p) => bh.consume(p)
        case NthSelector296(p) => bh.consume(p)
        case NthSelector297(p) => bh.consume(p)
        case NthSelector298(p) => bh.consume(p)
        case NthSelector299(p) => bh.consume(p)
        case NthSelector300(p) => bh.consume(p)
        case NthSelector301(p) => bh.consume(p)
        case NthSelector302(p) => bh.consume(p)
        case NthSelector303(p) => bh.consume(p)
        case NthSelector304(p) => bh.consume(p)
        case NthSelector305(p) => bh.consume(p)
        case NthSelector306(p) => bh.consume(p)
        case NthSelector307(p) => bh.consume(p)
        case NthSelector308(p) => bh.consume(p)
        case NthSelector309(p) => bh.consume(p)
        case NthSelector310(p) => bh.consume(p)
        case NthSelector311(p) => bh.consume(p)
        case NthSelector312(p) => bh.consume(p)
        case NthSelector313(p) => bh.consume(p)
        case NthSelector314(p) => bh.consume(p)
        case NthSelector315(p) => bh.consume(p)
        case NthSelector316(p) => bh.consume(p)
        case NthSelector317(p) => bh.consume(p)
        case NthSelector318(p) => bh.consume(p)
        case NthSelector319(p) => bh.consume(p)
        case NthSelector320(p) => bh.consume(p)
        case NthSelector321(p) => bh.consume(p)
        case NthSelector322(p) => bh.consume(p)
        case NthSelector323(p) => bh.consume(p)
        case NthSelector324(p) => bh.consume(p)
        case NthSelector325(p) => bh.consume(p)
        case NthSelector326(p) => bh.consume(p)
        case NthSelector327(p) => bh.consume(p)
        case NthSelector328(p) => bh.consume(p)
        case NthSelector329(p) => bh.consume(p)
        case NthSelector330(p) => bh.consume(p)
        case NthSelector331(p) => bh.consume(p)
        case NthSelector332(p) => bh.consume(p)
        case NthSelector333(p) => bh.consume(p)
        case NthSelector334(p) => bh.consume(p)
        case NthSelector335(p) => bh.consume(p)
        case NthSelector336(p) => bh.consume(p)
        case NthSelector337(p) => bh.consume(p)
        case NthSelector338(p) => bh.consume(p)
        case NthSelector339(p) => bh.consume(p)
        case NthSelector340(p) => bh.consume(p)
        case NthSelector341(p) => bh.consume(p)
        case NthSelector342(p) => bh.consume(p)
        case NthSelector343(p) => bh.consume(p)
        case NthSelector344(p) => bh.consume(p)
        case NthSelector345(p) => bh.consume(p)
        case NthSelector346(p) => bh.consume(p)
        case NthSelector347(p) => bh.consume(p)
        case NthSelector348(p) => bh.consume(p)
        case NthSelector349(p) => bh.consume(p)
        case NthSelector350(p) => bh.consume(p)
        case NthSelector351(p) => bh.consume(p)
        case NthSelector352(p) => bh.consume(p)
        case NthSelector353(p) => bh.consume(p)
        case NthSelector354(p) => bh.consume(p)
        case NthSelector355(p) => bh.consume(p)
        case NthSelector356(p) => bh.consume(p)
        case NthSelector357(p) => bh.consume(p)
        case NthSelector358(p) => bh.consume(p)
        case NthSelector359(p) => bh.consume(p)
        case NthSelector360(p) => bh.consume(p)
        case NthSelector361(p) => bh.consume(p)
        case NthSelector362(p) => bh.consume(p)
        case NthSelector363(p) => bh.consume(p)
        case NthSelector364(p) => bh.consume(p)
        case NthSelector365(p) => bh.consume(p)
        case NthSelector366(p) => bh.consume(p)
        case NthSelector367(p) => bh.consume(p)
        case NthSelector368(p) => bh.consume(p)
        case NthSelector369(p) => bh.consume(p)
        case NthSelector370(p) => bh.consume(p)
        case NthSelector371(p) => bh.consume(p)
        case NthSelector372(p) => bh.consume(p)
        case NthSelector373(p) => bh.consume(p)
        case NthSelector374(p) => bh.consume(p)
        case NthSelector375(p) => bh.consume(p)
        case NthSelector376(p) => bh.consume(p)
        case NthSelector377(p) => bh.consume(p)
        case NthSelector378(p) => bh.consume(p)
        case NthSelector379(p) => bh.consume(p)
        case NthSelector380(p) => bh.consume(p)
        case NthSelector381(p) => bh.consume(p)
        case NthSelector382(p) => bh.consume(p)
        case NthSelector383(p) => bh.consume(p)
        case NthSelector384(p) => bh.consume(p)
        case NthSelector385(p) => bh.consume(p)
        case NthSelector386(p) => bh.consume(p)
        case NthSelector387(p) => bh.consume(p)
        case NthSelector388(p) => bh.consume(p)
        case NthSelector389(p) => bh.consume(p)
        case NthSelector390(p) => bh.consume(p)
        case NthSelector391(p) => bh.consume(p)
        case NthSelector392(p) => bh.consume(p)
        case NthSelector393(p) => bh.consume(p)
        case NthSelector394(p) => bh.consume(p)
        case NthSelector395(p) => bh.consume(p)
        case NthSelector396(p) => bh.consume(p)
        case NthSelector397(p) => bh.consume(p)
        case NthSelector398(p) => bh.consume(p)
        case NthSelector399(p) => bh.consume(p)
        case NthSelector400(p) => bh.consume(p)
        case NthSelector401(p) => bh.consume(p)
        case NthSelector402(p) => bh.consume(p)
        case NthSelector403(p) => bh.consume(p)
        case NthSelector404(p) => bh.consume(p)
        case NthSelector405(p) => bh.consume(p)
        case NthSelector406(p) => bh.consume(p)
        case NthSelector407(p) => bh.consume(p)
        case NthSelector408(p) => bh.consume(p)
        case NthSelector409(p) => bh.consume(p)
        case NthSelector410(p) => bh.consume(p)
        case NthSelector411(p) => bh.consume(p)
        case NthSelector412(p) => bh.consume(p)
        case NthSelector413(p) => bh.consume(p)
        case NthSelector414(p) => bh.consume(p)
        case NthSelector415(p) => bh.consume(p)
        case NthSelector416(p) => bh.consume(p)
        case NthSelector417(p) => bh.consume(p)
        case NthSelector418(p) => bh.consume(p)
        case NthSelector419(p) => bh.consume(p)
        case NthSelector420(p) => bh.consume(p)
        case NthSelector421(p) => bh.consume(p)
        case NthSelector422(p) => bh.consume(p)
        case NthSelector423(p) => bh.consume(p)
        case NthSelector424(p) => bh.consume(p)
        case NthSelector425(p) => bh.consume(p)
        case NthSelector426(p) => bh.consume(p)
        case NthSelector427(p) => bh.consume(p)
        case NthSelector428(p) => bh.consume(p)
        case NthSelector429(p) => bh.consume(p)
        case NthSelector430(p) => bh.consume(p)
        case NthSelector431(p) => bh.consume(p)
        case NthSelector432(p) => bh.consume(p)
        case NthSelector433(p) => bh.consume(p)
        case NthSelector434(p) => bh.consume(p)
        case NthSelector435(p) => bh.consume(p)
        case NthSelector436(p) => bh.consume(p)
        case NthSelector437(p) => bh.consume(p)
        case NthSelector438(p) => bh.consume(p)
        case NthSelector439(p) => bh.consume(p)
        case NthSelector440(p) => bh.consume(p)
        case NthSelector441(p) => bh.consume(p)
        case NthSelector442(p) => bh.consume(p)
        case NthSelector443(p) => bh.consume(p)
        case NthSelector444(p) => bh.consume(p)
        case NthSelector445(p) => bh.consume(p)
        case NthSelector446(p) => bh.consume(p)
        case NthSelector447(p) => bh.consume(p)
        case NthSelector448(p) => bh.consume(p)
        case NthSelector449(p) => bh.consume(p)
        case NthSelector450(p) => bh.consume(p)
        case NthSelector451(p) => bh.consume(p)
        case NthSelector452(p) => bh.consume(p)
        case NthSelector453(p) => bh.consume(p)
        case NthSelector454(p) => bh.consume(p)
        case NthSelector455(p) => bh.consume(p)
        case NthSelector456(p) => bh.consume(p)
        case NthSelector457(p) => bh.consume(p)
        case NthSelector458(p) => bh.consume(p)
        case NthSelector459(p) => bh.consume(p)
        case NthSelector460(p) => bh.consume(p)
        case NthSelector461(p) => bh.consume(p)
        case NthSelector462(p) => bh.consume(p)
        case NthSelector463(p) => bh.consume(p)
        case NthSelector464(p) => bh.consume(p)
        case NthSelector465(p) => bh.consume(p)
        case NthSelector466(p) => bh.consume(p)
        case NthSelector467(p) => bh.consume(p)
        case NthSelector468(p) => bh.consume(p)
        case NthSelector469(p) => bh.consume(p)
        case NthSelector470(p) => bh.consume(p)
        case NthSelector471(p) => bh.consume(p)
        case NthSelector472(p) => bh.consume(p)
        case NthSelector473(p) => bh.consume(p)
        case NthSelector474(p) => bh.consume(p)
        case NthSelector475(p) => bh.consume(p)
        case NthSelector476(p) => bh.consume(p)
        case NthSelector477(p) => bh.consume(p)
        case NthSelector478(p) => bh.consume(p)
        case NthSelector479(p) => bh.consume(p)
        case NthSelector480(p) => bh.consume(p)
        case NthSelector481(p) => bh.consume(p)
        case NthSelector482(p) => bh.consume(p)
        case NthSelector483(p) => bh.consume(p)
        case NthSelector484(p) => bh.consume(p)
        case NthSelector485(p) => bh.consume(p)
        case NthSelector486(p) => bh.consume(p)
        case NthSelector487(p) => bh.consume(p)
        case NthSelector488(p) => bh.consume(p)
        case NthSelector489(p) => bh.consume(p)
        case NthSelector490(p) => bh.consume(p)
        case NthSelector491(p) => bh.consume(p)
        case NthSelector492(p) => bh.consume(p)
        case NthSelector493(p) => bh.consume(p)
        case NthSelector494(p) => bh.consume(p)
        case NthSelector495(p) => bh.consume(p)
        case NthSelector496(p) => bh.consume(p)
        case NthSelector497(p) => bh.consume(p)
        case NthSelector498(p) => bh.consume(p)
        case NthSelector499(p) => bh.consume(p)
        case NthSelector500(p) => bh.consume(p)
        case NthSelector501(p) => bh.consume(p)
        case NthSelector502(p) => bh.consume(p)
        case NthSelector503(p) => bh.consume(p)
        case NthSelector504(p) => bh.consume(p)
        case NthSelector505(p) => bh.consume(p)
        case NthSelector506(p) => bh.consume(p)
        case NthSelector507(p) => bh.consume(p)
        case NthSelector508(p) => bh.consume(p)
        case NthSelector509(p) => bh.consume(p)
        case NthSelector510(p) => bh.consume(p)
        case NthSelector511(p) => bh.consume(p)
        case NthSelector512(p) => bh.consume(p)
      }
    }

    state.s.foreach(selectSelf)

  }

}