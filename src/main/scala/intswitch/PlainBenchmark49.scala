
	package intswitchbench

    import org.openjdk.jmh.annotations.Benchmark
    import org.openjdk.jmh.annotations.Scope
    import org.openjdk.jmh.annotations.State
    import org.openjdk.jmh.annotations.OperationsPerInvocation

    object PlainData49 {
   	import PlainData._

      val mylist = sortedlist.take(49)
  
      @State(Scope.Benchmark)
      class Sorted {
        var s = mylist
      }

      @State(Scope.Benchmark)
      class Shuffled {
        var s = new scala.util.Random(49).shuffle(mylist)
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

    class PlainBenchmark49 {
      import PlainData49._

      import scala.annotation._
      import org.openjdk.jmh.infra.Blackhole
	
	  

@Benchmark
@OperationsPerInvocation(49)
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
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(49)
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
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	}