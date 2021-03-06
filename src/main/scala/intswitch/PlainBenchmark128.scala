
	package intswitchbench

    import org.openjdk.jmh.annotations.Benchmark
    import org.openjdk.jmh.annotations.Scope
    import org.openjdk.jmh.annotations.State
    import org.openjdk.jmh.annotations.OperationsPerInvocation

    object PlainData128 {
   	import PlainData._

      val mylist = sortedlist.take(128)
  
      @State(Scope.Benchmark)
      class Sorted {
        var s = mylist
      }

      @State(Scope.Benchmark)
      class Shuffled {
        var s = new scala.util.Random(128).shuffle(mylist)
      }

      @State(Scope.Benchmark)
      class SingleStart {
        var s = mylist.take(1)
      }

      @State(Scope.Benchmark)
      class SingleEnd {
        var s = mylist.reverse.take(1)
      }
    
    }

    class PlainBenchmark128 {
      import PlainData128._

      import scala.annotation._
      import org.openjdk.jmh.infra.Blackhole
	
	  

@Benchmark
@OperationsPerInvocation(128)
def Sorted(bh: Blackhole, state: Sorted) = {

	def selectSelf(caze: Any) = {
		caze match {
			
case NthSelectorPlain1(p) => bh.consume(p)
case NthSelectorPlain2(p) => bh.consume(p)
case NthSelectorPlain3(p) => bh.consume(p)
case NthSelectorPlain4(p) => bh.consume(p)
case NthSelectorPlain5(p) => bh.consume(p)
case NthSelectorPlain6(p) => bh.consume(p)
case NthSelectorPlain7(p) => bh.consume(p)
case NthSelectorPlain8(p) => bh.consume(p)
case NthSelectorPlain9(p) => bh.consume(p)
case NthSelectorPlain10(p) => bh.consume(p)
case NthSelectorPlain11(p) => bh.consume(p)
case NthSelectorPlain12(p) => bh.consume(p)
case NthSelectorPlain13(p) => bh.consume(p)
case NthSelectorPlain14(p) => bh.consume(p)
case NthSelectorPlain15(p) => bh.consume(p)
case NthSelectorPlain16(p) => bh.consume(p)
case NthSelectorPlain17(p) => bh.consume(p)
case NthSelectorPlain18(p) => bh.consume(p)
case NthSelectorPlain19(p) => bh.consume(p)
case NthSelectorPlain20(p) => bh.consume(p)
case NthSelectorPlain21(p) => bh.consume(p)
case NthSelectorPlain22(p) => bh.consume(p)
case NthSelectorPlain23(p) => bh.consume(p)
case NthSelectorPlain24(p) => bh.consume(p)
case NthSelectorPlain25(p) => bh.consume(p)
case NthSelectorPlain26(p) => bh.consume(p)
case NthSelectorPlain27(p) => bh.consume(p)
case NthSelectorPlain28(p) => bh.consume(p)
case NthSelectorPlain29(p) => bh.consume(p)
case NthSelectorPlain30(p) => bh.consume(p)
case NthSelectorPlain31(p) => bh.consume(p)
case NthSelectorPlain32(p) => bh.consume(p)
case NthSelectorPlain33(p) => bh.consume(p)
case NthSelectorPlain34(p) => bh.consume(p)
case NthSelectorPlain35(p) => bh.consume(p)
case NthSelectorPlain36(p) => bh.consume(p)
case NthSelectorPlain37(p) => bh.consume(p)
case NthSelectorPlain38(p) => bh.consume(p)
case NthSelectorPlain39(p) => bh.consume(p)
case NthSelectorPlain40(p) => bh.consume(p)
case NthSelectorPlain41(p) => bh.consume(p)
case NthSelectorPlain42(p) => bh.consume(p)
case NthSelectorPlain43(p) => bh.consume(p)
case NthSelectorPlain44(p) => bh.consume(p)
case NthSelectorPlain45(p) => bh.consume(p)
case NthSelectorPlain46(p) => bh.consume(p)
case NthSelectorPlain47(p) => bh.consume(p)
case NthSelectorPlain48(p) => bh.consume(p)
case NthSelectorPlain49(p) => bh.consume(p)
case NthSelectorPlain50(p) => bh.consume(p)
case NthSelectorPlain51(p) => bh.consume(p)
case NthSelectorPlain52(p) => bh.consume(p)
case NthSelectorPlain53(p) => bh.consume(p)
case NthSelectorPlain54(p) => bh.consume(p)
case NthSelectorPlain55(p) => bh.consume(p)
case NthSelectorPlain56(p) => bh.consume(p)
case NthSelectorPlain57(p) => bh.consume(p)
case NthSelectorPlain58(p) => bh.consume(p)
case NthSelectorPlain59(p) => bh.consume(p)
case NthSelectorPlain60(p) => bh.consume(p)
case NthSelectorPlain61(p) => bh.consume(p)
case NthSelectorPlain62(p) => bh.consume(p)
case NthSelectorPlain63(p) => bh.consume(p)
case NthSelectorPlain64(p) => bh.consume(p)
case NthSelectorPlain65(p) => bh.consume(p)
case NthSelectorPlain66(p) => bh.consume(p)
case NthSelectorPlain67(p) => bh.consume(p)
case NthSelectorPlain68(p) => bh.consume(p)
case NthSelectorPlain69(p) => bh.consume(p)
case NthSelectorPlain70(p) => bh.consume(p)
case NthSelectorPlain71(p) => bh.consume(p)
case NthSelectorPlain72(p) => bh.consume(p)
case NthSelectorPlain73(p) => bh.consume(p)
case NthSelectorPlain74(p) => bh.consume(p)
case NthSelectorPlain75(p) => bh.consume(p)
case NthSelectorPlain76(p) => bh.consume(p)
case NthSelectorPlain77(p) => bh.consume(p)
case NthSelectorPlain78(p) => bh.consume(p)
case NthSelectorPlain79(p) => bh.consume(p)
case NthSelectorPlain80(p) => bh.consume(p)
case NthSelectorPlain81(p) => bh.consume(p)
case NthSelectorPlain82(p) => bh.consume(p)
case NthSelectorPlain83(p) => bh.consume(p)
case NthSelectorPlain84(p) => bh.consume(p)
case NthSelectorPlain85(p) => bh.consume(p)
case NthSelectorPlain86(p) => bh.consume(p)
case NthSelectorPlain87(p) => bh.consume(p)
case NthSelectorPlain88(p) => bh.consume(p)
case NthSelectorPlain89(p) => bh.consume(p)
case NthSelectorPlain90(p) => bh.consume(p)
case NthSelectorPlain91(p) => bh.consume(p)
case NthSelectorPlain92(p) => bh.consume(p)
case NthSelectorPlain93(p) => bh.consume(p)
case NthSelectorPlain94(p) => bh.consume(p)
case NthSelectorPlain95(p) => bh.consume(p)
case NthSelectorPlain96(p) => bh.consume(p)
case NthSelectorPlain97(p) => bh.consume(p)
case NthSelectorPlain98(p) => bh.consume(p)
case NthSelectorPlain99(p) => bh.consume(p)
case NthSelectorPlain100(p) => bh.consume(p)
case NthSelectorPlain101(p) => bh.consume(p)
case NthSelectorPlain102(p) => bh.consume(p)
case NthSelectorPlain103(p) => bh.consume(p)
case NthSelectorPlain104(p) => bh.consume(p)
case NthSelectorPlain105(p) => bh.consume(p)
case NthSelectorPlain106(p) => bh.consume(p)
case NthSelectorPlain107(p) => bh.consume(p)
case NthSelectorPlain108(p) => bh.consume(p)
case NthSelectorPlain109(p) => bh.consume(p)
case NthSelectorPlain110(p) => bh.consume(p)
case NthSelectorPlain111(p) => bh.consume(p)
case NthSelectorPlain112(p) => bh.consume(p)
case NthSelectorPlain113(p) => bh.consume(p)
case NthSelectorPlain114(p) => bh.consume(p)
case NthSelectorPlain115(p) => bh.consume(p)
case NthSelectorPlain116(p) => bh.consume(p)
case NthSelectorPlain117(p) => bh.consume(p)
case NthSelectorPlain118(p) => bh.consume(p)
case NthSelectorPlain119(p) => bh.consume(p)
case NthSelectorPlain120(p) => bh.consume(p)
case NthSelectorPlain121(p) => bh.consume(p)
case NthSelectorPlain122(p) => bh.consume(p)
case NthSelectorPlain123(p) => bh.consume(p)
case NthSelectorPlain124(p) => bh.consume(p)
case NthSelectorPlain125(p) => bh.consume(p)
case NthSelectorPlain126(p) => bh.consume(p)
case NthSelectorPlain127(p) => bh.consume(p)
case NthSelectorPlain128(p) => bh.consume(p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(128)
def Unsorted(bh: Blackhole, state: Shuffled) = {

	def selectSelf(caze: Any): Unit = {
		caze match {
			
case NthSelectorPlain1(p) => bh.consume(p)
case NthSelectorPlain2(p) => bh.consume(p)
case NthSelectorPlain3(p) => bh.consume(p)
case NthSelectorPlain4(p) => bh.consume(p)
case NthSelectorPlain5(p) => bh.consume(p)
case NthSelectorPlain6(p) => bh.consume(p)
case NthSelectorPlain7(p) => bh.consume(p)
case NthSelectorPlain8(p) => bh.consume(p)
case NthSelectorPlain9(p) => bh.consume(p)
case NthSelectorPlain10(p) => bh.consume(p)
case NthSelectorPlain11(p) => bh.consume(p)
case NthSelectorPlain12(p) => bh.consume(p)
case NthSelectorPlain13(p) => bh.consume(p)
case NthSelectorPlain14(p) => bh.consume(p)
case NthSelectorPlain15(p) => bh.consume(p)
case NthSelectorPlain16(p) => bh.consume(p)
case NthSelectorPlain17(p) => bh.consume(p)
case NthSelectorPlain18(p) => bh.consume(p)
case NthSelectorPlain19(p) => bh.consume(p)
case NthSelectorPlain20(p) => bh.consume(p)
case NthSelectorPlain21(p) => bh.consume(p)
case NthSelectorPlain22(p) => bh.consume(p)
case NthSelectorPlain23(p) => bh.consume(p)
case NthSelectorPlain24(p) => bh.consume(p)
case NthSelectorPlain25(p) => bh.consume(p)
case NthSelectorPlain26(p) => bh.consume(p)
case NthSelectorPlain27(p) => bh.consume(p)
case NthSelectorPlain28(p) => bh.consume(p)
case NthSelectorPlain29(p) => bh.consume(p)
case NthSelectorPlain30(p) => bh.consume(p)
case NthSelectorPlain31(p) => bh.consume(p)
case NthSelectorPlain32(p) => bh.consume(p)
case NthSelectorPlain33(p) => bh.consume(p)
case NthSelectorPlain34(p) => bh.consume(p)
case NthSelectorPlain35(p) => bh.consume(p)
case NthSelectorPlain36(p) => bh.consume(p)
case NthSelectorPlain37(p) => bh.consume(p)
case NthSelectorPlain38(p) => bh.consume(p)
case NthSelectorPlain39(p) => bh.consume(p)
case NthSelectorPlain40(p) => bh.consume(p)
case NthSelectorPlain41(p) => bh.consume(p)
case NthSelectorPlain42(p) => bh.consume(p)
case NthSelectorPlain43(p) => bh.consume(p)
case NthSelectorPlain44(p) => bh.consume(p)
case NthSelectorPlain45(p) => bh.consume(p)
case NthSelectorPlain46(p) => bh.consume(p)
case NthSelectorPlain47(p) => bh.consume(p)
case NthSelectorPlain48(p) => bh.consume(p)
case NthSelectorPlain49(p) => bh.consume(p)
case NthSelectorPlain50(p) => bh.consume(p)
case NthSelectorPlain51(p) => bh.consume(p)
case NthSelectorPlain52(p) => bh.consume(p)
case NthSelectorPlain53(p) => bh.consume(p)
case NthSelectorPlain54(p) => bh.consume(p)
case NthSelectorPlain55(p) => bh.consume(p)
case NthSelectorPlain56(p) => bh.consume(p)
case NthSelectorPlain57(p) => bh.consume(p)
case NthSelectorPlain58(p) => bh.consume(p)
case NthSelectorPlain59(p) => bh.consume(p)
case NthSelectorPlain60(p) => bh.consume(p)
case NthSelectorPlain61(p) => bh.consume(p)
case NthSelectorPlain62(p) => bh.consume(p)
case NthSelectorPlain63(p) => bh.consume(p)
case NthSelectorPlain64(p) => bh.consume(p)
case NthSelectorPlain65(p) => bh.consume(p)
case NthSelectorPlain66(p) => bh.consume(p)
case NthSelectorPlain67(p) => bh.consume(p)
case NthSelectorPlain68(p) => bh.consume(p)
case NthSelectorPlain69(p) => bh.consume(p)
case NthSelectorPlain70(p) => bh.consume(p)
case NthSelectorPlain71(p) => bh.consume(p)
case NthSelectorPlain72(p) => bh.consume(p)
case NthSelectorPlain73(p) => bh.consume(p)
case NthSelectorPlain74(p) => bh.consume(p)
case NthSelectorPlain75(p) => bh.consume(p)
case NthSelectorPlain76(p) => bh.consume(p)
case NthSelectorPlain77(p) => bh.consume(p)
case NthSelectorPlain78(p) => bh.consume(p)
case NthSelectorPlain79(p) => bh.consume(p)
case NthSelectorPlain80(p) => bh.consume(p)
case NthSelectorPlain81(p) => bh.consume(p)
case NthSelectorPlain82(p) => bh.consume(p)
case NthSelectorPlain83(p) => bh.consume(p)
case NthSelectorPlain84(p) => bh.consume(p)
case NthSelectorPlain85(p) => bh.consume(p)
case NthSelectorPlain86(p) => bh.consume(p)
case NthSelectorPlain87(p) => bh.consume(p)
case NthSelectorPlain88(p) => bh.consume(p)
case NthSelectorPlain89(p) => bh.consume(p)
case NthSelectorPlain90(p) => bh.consume(p)
case NthSelectorPlain91(p) => bh.consume(p)
case NthSelectorPlain92(p) => bh.consume(p)
case NthSelectorPlain93(p) => bh.consume(p)
case NthSelectorPlain94(p) => bh.consume(p)
case NthSelectorPlain95(p) => bh.consume(p)
case NthSelectorPlain96(p) => bh.consume(p)
case NthSelectorPlain97(p) => bh.consume(p)
case NthSelectorPlain98(p) => bh.consume(p)
case NthSelectorPlain99(p) => bh.consume(p)
case NthSelectorPlain100(p) => bh.consume(p)
case NthSelectorPlain101(p) => bh.consume(p)
case NthSelectorPlain102(p) => bh.consume(p)
case NthSelectorPlain103(p) => bh.consume(p)
case NthSelectorPlain104(p) => bh.consume(p)
case NthSelectorPlain105(p) => bh.consume(p)
case NthSelectorPlain106(p) => bh.consume(p)
case NthSelectorPlain107(p) => bh.consume(p)
case NthSelectorPlain108(p) => bh.consume(p)
case NthSelectorPlain109(p) => bh.consume(p)
case NthSelectorPlain110(p) => bh.consume(p)
case NthSelectorPlain111(p) => bh.consume(p)
case NthSelectorPlain112(p) => bh.consume(p)
case NthSelectorPlain113(p) => bh.consume(p)
case NthSelectorPlain114(p) => bh.consume(p)
case NthSelectorPlain115(p) => bh.consume(p)
case NthSelectorPlain116(p) => bh.consume(p)
case NthSelectorPlain117(p) => bh.consume(p)
case NthSelectorPlain118(p) => bh.consume(p)
case NthSelectorPlain119(p) => bh.consume(p)
case NthSelectorPlain120(p) => bh.consume(p)
case NthSelectorPlain121(p) => bh.consume(p)
case NthSelectorPlain122(p) => bh.consume(p)
case NthSelectorPlain123(p) => bh.consume(p)
case NthSelectorPlain124(p) => bh.consume(p)
case NthSelectorPlain125(p) => bh.consume(p)
case NthSelectorPlain126(p) => bh.consume(p)
case NthSelectorPlain127(p) => bh.consume(p)
case NthSelectorPlain128(p) => bh.consume(p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(1)
def SingleStart(bh: Blackhole, state: SingleStart) = {

	def selectSelf(caze: Any): Unit = {
		caze match {
			
case NthSelectorPlain1(p) => bh.consume(p)
case NthSelectorPlain2(p) => bh.consume(p)
case NthSelectorPlain3(p) => bh.consume(p)
case NthSelectorPlain4(p) => bh.consume(p)
case NthSelectorPlain5(p) => bh.consume(p)
case NthSelectorPlain6(p) => bh.consume(p)
case NthSelectorPlain7(p) => bh.consume(p)
case NthSelectorPlain8(p) => bh.consume(p)
case NthSelectorPlain9(p) => bh.consume(p)
case NthSelectorPlain10(p) => bh.consume(p)
case NthSelectorPlain11(p) => bh.consume(p)
case NthSelectorPlain12(p) => bh.consume(p)
case NthSelectorPlain13(p) => bh.consume(p)
case NthSelectorPlain14(p) => bh.consume(p)
case NthSelectorPlain15(p) => bh.consume(p)
case NthSelectorPlain16(p) => bh.consume(p)
case NthSelectorPlain17(p) => bh.consume(p)
case NthSelectorPlain18(p) => bh.consume(p)
case NthSelectorPlain19(p) => bh.consume(p)
case NthSelectorPlain20(p) => bh.consume(p)
case NthSelectorPlain21(p) => bh.consume(p)
case NthSelectorPlain22(p) => bh.consume(p)
case NthSelectorPlain23(p) => bh.consume(p)
case NthSelectorPlain24(p) => bh.consume(p)
case NthSelectorPlain25(p) => bh.consume(p)
case NthSelectorPlain26(p) => bh.consume(p)
case NthSelectorPlain27(p) => bh.consume(p)
case NthSelectorPlain28(p) => bh.consume(p)
case NthSelectorPlain29(p) => bh.consume(p)
case NthSelectorPlain30(p) => bh.consume(p)
case NthSelectorPlain31(p) => bh.consume(p)
case NthSelectorPlain32(p) => bh.consume(p)
case NthSelectorPlain33(p) => bh.consume(p)
case NthSelectorPlain34(p) => bh.consume(p)
case NthSelectorPlain35(p) => bh.consume(p)
case NthSelectorPlain36(p) => bh.consume(p)
case NthSelectorPlain37(p) => bh.consume(p)
case NthSelectorPlain38(p) => bh.consume(p)
case NthSelectorPlain39(p) => bh.consume(p)
case NthSelectorPlain40(p) => bh.consume(p)
case NthSelectorPlain41(p) => bh.consume(p)
case NthSelectorPlain42(p) => bh.consume(p)
case NthSelectorPlain43(p) => bh.consume(p)
case NthSelectorPlain44(p) => bh.consume(p)
case NthSelectorPlain45(p) => bh.consume(p)
case NthSelectorPlain46(p) => bh.consume(p)
case NthSelectorPlain47(p) => bh.consume(p)
case NthSelectorPlain48(p) => bh.consume(p)
case NthSelectorPlain49(p) => bh.consume(p)
case NthSelectorPlain50(p) => bh.consume(p)
case NthSelectorPlain51(p) => bh.consume(p)
case NthSelectorPlain52(p) => bh.consume(p)
case NthSelectorPlain53(p) => bh.consume(p)
case NthSelectorPlain54(p) => bh.consume(p)
case NthSelectorPlain55(p) => bh.consume(p)
case NthSelectorPlain56(p) => bh.consume(p)
case NthSelectorPlain57(p) => bh.consume(p)
case NthSelectorPlain58(p) => bh.consume(p)
case NthSelectorPlain59(p) => bh.consume(p)
case NthSelectorPlain60(p) => bh.consume(p)
case NthSelectorPlain61(p) => bh.consume(p)
case NthSelectorPlain62(p) => bh.consume(p)
case NthSelectorPlain63(p) => bh.consume(p)
case NthSelectorPlain64(p) => bh.consume(p)
case NthSelectorPlain65(p) => bh.consume(p)
case NthSelectorPlain66(p) => bh.consume(p)
case NthSelectorPlain67(p) => bh.consume(p)
case NthSelectorPlain68(p) => bh.consume(p)
case NthSelectorPlain69(p) => bh.consume(p)
case NthSelectorPlain70(p) => bh.consume(p)
case NthSelectorPlain71(p) => bh.consume(p)
case NthSelectorPlain72(p) => bh.consume(p)
case NthSelectorPlain73(p) => bh.consume(p)
case NthSelectorPlain74(p) => bh.consume(p)
case NthSelectorPlain75(p) => bh.consume(p)
case NthSelectorPlain76(p) => bh.consume(p)
case NthSelectorPlain77(p) => bh.consume(p)
case NthSelectorPlain78(p) => bh.consume(p)
case NthSelectorPlain79(p) => bh.consume(p)
case NthSelectorPlain80(p) => bh.consume(p)
case NthSelectorPlain81(p) => bh.consume(p)
case NthSelectorPlain82(p) => bh.consume(p)
case NthSelectorPlain83(p) => bh.consume(p)
case NthSelectorPlain84(p) => bh.consume(p)
case NthSelectorPlain85(p) => bh.consume(p)
case NthSelectorPlain86(p) => bh.consume(p)
case NthSelectorPlain87(p) => bh.consume(p)
case NthSelectorPlain88(p) => bh.consume(p)
case NthSelectorPlain89(p) => bh.consume(p)
case NthSelectorPlain90(p) => bh.consume(p)
case NthSelectorPlain91(p) => bh.consume(p)
case NthSelectorPlain92(p) => bh.consume(p)
case NthSelectorPlain93(p) => bh.consume(p)
case NthSelectorPlain94(p) => bh.consume(p)
case NthSelectorPlain95(p) => bh.consume(p)
case NthSelectorPlain96(p) => bh.consume(p)
case NthSelectorPlain97(p) => bh.consume(p)
case NthSelectorPlain98(p) => bh.consume(p)
case NthSelectorPlain99(p) => bh.consume(p)
case NthSelectorPlain100(p) => bh.consume(p)
case NthSelectorPlain101(p) => bh.consume(p)
case NthSelectorPlain102(p) => bh.consume(p)
case NthSelectorPlain103(p) => bh.consume(p)
case NthSelectorPlain104(p) => bh.consume(p)
case NthSelectorPlain105(p) => bh.consume(p)
case NthSelectorPlain106(p) => bh.consume(p)
case NthSelectorPlain107(p) => bh.consume(p)
case NthSelectorPlain108(p) => bh.consume(p)
case NthSelectorPlain109(p) => bh.consume(p)
case NthSelectorPlain110(p) => bh.consume(p)
case NthSelectorPlain111(p) => bh.consume(p)
case NthSelectorPlain112(p) => bh.consume(p)
case NthSelectorPlain113(p) => bh.consume(p)
case NthSelectorPlain114(p) => bh.consume(p)
case NthSelectorPlain115(p) => bh.consume(p)
case NthSelectorPlain116(p) => bh.consume(p)
case NthSelectorPlain117(p) => bh.consume(p)
case NthSelectorPlain118(p) => bh.consume(p)
case NthSelectorPlain119(p) => bh.consume(p)
case NthSelectorPlain120(p) => bh.consume(p)
case NthSelectorPlain121(p) => bh.consume(p)
case NthSelectorPlain122(p) => bh.consume(p)
case NthSelectorPlain123(p) => bh.consume(p)
case NthSelectorPlain124(p) => bh.consume(p)
case NthSelectorPlain125(p) => bh.consume(p)
case NthSelectorPlain126(p) => bh.consume(p)
case NthSelectorPlain127(p) => bh.consume(p)
case NthSelectorPlain128(p) => bh.consume(p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(1)
def SingleEnd(bh: Blackhole, state: SingleEnd) = {

	def selectSelf(caze: Any): Unit = {
		caze match {
			
case NthSelectorPlain1(p) => bh.consume(p)
case NthSelectorPlain2(p) => bh.consume(p)
case NthSelectorPlain3(p) => bh.consume(p)
case NthSelectorPlain4(p) => bh.consume(p)
case NthSelectorPlain5(p) => bh.consume(p)
case NthSelectorPlain6(p) => bh.consume(p)
case NthSelectorPlain7(p) => bh.consume(p)
case NthSelectorPlain8(p) => bh.consume(p)
case NthSelectorPlain9(p) => bh.consume(p)
case NthSelectorPlain10(p) => bh.consume(p)
case NthSelectorPlain11(p) => bh.consume(p)
case NthSelectorPlain12(p) => bh.consume(p)
case NthSelectorPlain13(p) => bh.consume(p)
case NthSelectorPlain14(p) => bh.consume(p)
case NthSelectorPlain15(p) => bh.consume(p)
case NthSelectorPlain16(p) => bh.consume(p)
case NthSelectorPlain17(p) => bh.consume(p)
case NthSelectorPlain18(p) => bh.consume(p)
case NthSelectorPlain19(p) => bh.consume(p)
case NthSelectorPlain20(p) => bh.consume(p)
case NthSelectorPlain21(p) => bh.consume(p)
case NthSelectorPlain22(p) => bh.consume(p)
case NthSelectorPlain23(p) => bh.consume(p)
case NthSelectorPlain24(p) => bh.consume(p)
case NthSelectorPlain25(p) => bh.consume(p)
case NthSelectorPlain26(p) => bh.consume(p)
case NthSelectorPlain27(p) => bh.consume(p)
case NthSelectorPlain28(p) => bh.consume(p)
case NthSelectorPlain29(p) => bh.consume(p)
case NthSelectorPlain30(p) => bh.consume(p)
case NthSelectorPlain31(p) => bh.consume(p)
case NthSelectorPlain32(p) => bh.consume(p)
case NthSelectorPlain33(p) => bh.consume(p)
case NthSelectorPlain34(p) => bh.consume(p)
case NthSelectorPlain35(p) => bh.consume(p)
case NthSelectorPlain36(p) => bh.consume(p)
case NthSelectorPlain37(p) => bh.consume(p)
case NthSelectorPlain38(p) => bh.consume(p)
case NthSelectorPlain39(p) => bh.consume(p)
case NthSelectorPlain40(p) => bh.consume(p)
case NthSelectorPlain41(p) => bh.consume(p)
case NthSelectorPlain42(p) => bh.consume(p)
case NthSelectorPlain43(p) => bh.consume(p)
case NthSelectorPlain44(p) => bh.consume(p)
case NthSelectorPlain45(p) => bh.consume(p)
case NthSelectorPlain46(p) => bh.consume(p)
case NthSelectorPlain47(p) => bh.consume(p)
case NthSelectorPlain48(p) => bh.consume(p)
case NthSelectorPlain49(p) => bh.consume(p)
case NthSelectorPlain50(p) => bh.consume(p)
case NthSelectorPlain51(p) => bh.consume(p)
case NthSelectorPlain52(p) => bh.consume(p)
case NthSelectorPlain53(p) => bh.consume(p)
case NthSelectorPlain54(p) => bh.consume(p)
case NthSelectorPlain55(p) => bh.consume(p)
case NthSelectorPlain56(p) => bh.consume(p)
case NthSelectorPlain57(p) => bh.consume(p)
case NthSelectorPlain58(p) => bh.consume(p)
case NthSelectorPlain59(p) => bh.consume(p)
case NthSelectorPlain60(p) => bh.consume(p)
case NthSelectorPlain61(p) => bh.consume(p)
case NthSelectorPlain62(p) => bh.consume(p)
case NthSelectorPlain63(p) => bh.consume(p)
case NthSelectorPlain64(p) => bh.consume(p)
case NthSelectorPlain65(p) => bh.consume(p)
case NthSelectorPlain66(p) => bh.consume(p)
case NthSelectorPlain67(p) => bh.consume(p)
case NthSelectorPlain68(p) => bh.consume(p)
case NthSelectorPlain69(p) => bh.consume(p)
case NthSelectorPlain70(p) => bh.consume(p)
case NthSelectorPlain71(p) => bh.consume(p)
case NthSelectorPlain72(p) => bh.consume(p)
case NthSelectorPlain73(p) => bh.consume(p)
case NthSelectorPlain74(p) => bh.consume(p)
case NthSelectorPlain75(p) => bh.consume(p)
case NthSelectorPlain76(p) => bh.consume(p)
case NthSelectorPlain77(p) => bh.consume(p)
case NthSelectorPlain78(p) => bh.consume(p)
case NthSelectorPlain79(p) => bh.consume(p)
case NthSelectorPlain80(p) => bh.consume(p)
case NthSelectorPlain81(p) => bh.consume(p)
case NthSelectorPlain82(p) => bh.consume(p)
case NthSelectorPlain83(p) => bh.consume(p)
case NthSelectorPlain84(p) => bh.consume(p)
case NthSelectorPlain85(p) => bh.consume(p)
case NthSelectorPlain86(p) => bh.consume(p)
case NthSelectorPlain87(p) => bh.consume(p)
case NthSelectorPlain88(p) => bh.consume(p)
case NthSelectorPlain89(p) => bh.consume(p)
case NthSelectorPlain90(p) => bh.consume(p)
case NthSelectorPlain91(p) => bh.consume(p)
case NthSelectorPlain92(p) => bh.consume(p)
case NthSelectorPlain93(p) => bh.consume(p)
case NthSelectorPlain94(p) => bh.consume(p)
case NthSelectorPlain95(p) => bh.consume(p)
case NthSelectorPlain96(p) => bh.consume(p)
case NthSelectorPlain97(p) => bh.consume(p)
case NthSelectorPlain98(p) => bh.consume(p)
case NthSelectorPlain99(p) => bh.consume(p)
case NthSelectorPlain100(p) => bh.consume(p)
case NthSelectorPlain101(p) => bh.consume(p)
case NthSelectorPlain102(p) => bh.consume(p)
case NthSelectorPlain103(p) => bh.consume(p)
case NthSelectorPlain104(p) => bh.consume(p)
case NthSelectorPlain105(p) => bh.consume(p)
case NthSelectorPlain106(p) => bh.consume(p)
case NthSelectorPlain107(p) => bh.consume(p)
case NthSelectorPlain108(p) => bh.consume(p)
case NthSelectorPlain109(p) => bh.consume(p)
case NthSelectorPlain110(p) => bh.consume(p)
case NthSelectorPlain111(p) => bh.consume(p)
case NthSelectorPlain112(p) => bh.consume(p)
case NthSelectorPlain113(p) => bh.consume(p)
case NthSelectorPlain114(p) => bh.consume(p)
case NthSelectorPlain115(p) => bh.consume(p)
case NthSelectorPlain116(p) => bh.consume(p)
case NthSelectorPlain117(p) => bh.consume(p)
case NthSelectorPlain118(p) => bh.consume(p)
case NthSelectorPlain119(p) => bh.consume(p)
case NthSelectorPlain120(p) => bh.consume(p)
case NthSelectorPlain121(p) => bh.consume(p)
case NthSelectorPlain122(p) => bh.consume(p)
case NthSelectorPlain123(p) => bh.consume(p)
case NthSelectorPlain124(p) => bh.consume(p)
case NthSelectorPlain125(p) => bh.consume(p)
case NthSelectorPlain126(p) => bh.consume(p)
case NthSelectorPlain127(p) => bh.consume(p)
case NthSelectorPlain128(p) => bh.consume(p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	}