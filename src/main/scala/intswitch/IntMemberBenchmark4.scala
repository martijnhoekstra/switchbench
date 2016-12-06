
	package intswitchbench

    import org.openjdk.jmh.annotations.Benchmark
    import org.openjdk.jmh.annotations.Scope
    import org.openjdk.jmh.annotations.State
    import org.openjdk.jmh.annotations.OperationsPerInvocation

    object IntMemberData4 {
    	import IntMemberData._


  
      @State(Scope.Benchmark)
      class Sorted {
        var s = sortedlist.take(4)
      }

      @State(Scope.Benchmark)
      class Shuffled {
        var s = new scala.util.Random(4).shuffle(sortedlist.take(4))
      }

      @State(Scope.Benchmark)
      class SingleStart {
        var s = sortedlist.take(1)
      }

      @State(Scope.Benchmark)
      class SingleEnd {
        var s = sortedlist.reverse.take(1)
      }

    
    
    }

    class IntMemberBenchmark4 {
      import IntMemberData4._
      import IntMemberData._
      import scala.annotation._
      import org.openjdk.jmh.infra.Blackhole
	
	  

@Benchmark
@OperationsPerInvocation(4)
def Sorted(bh: Blackhole, state: Sorted) = {

	def selectSelf(caze: WithIntMember) = {
		val sel = caze.selector
		(sel: @switch) match {
			
case 1 => bh.consume(caze.asInstanceOf[NthSelectorSwitch1].p)
case 2 => bh.consume(caze.asInstanceOf[NthSelectorSwitch2].p)
case 3 => bh.consume(caze.asInstanceOf[NthSelectorSwitch3].p)
case 4 => bh.consume(caze.asInstanceOf[NthSelectorSwitch4].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(4)
def Unsorted(bh: Blackhole, state: Shuffled) = {

	def selectSelf(caze: WithIntMember): Unit = {
		val sel = caze.selector
		(sel: @switch) match {
			
case 1 => bh.consume(caze.asInstanceOf[NthSelectorSwitch1].p)
case 2 => bh.consume(caze.asInstanceOf[NthSelectorSwitch2].p)
case 3 => bh.consume(caze.asInstanceOf[NthSelectorSwitch3].p)
case 4 => bh.consume(caze.asInstanceOf[NthSelectorSwitch4].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	}