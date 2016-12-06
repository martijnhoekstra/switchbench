
	package intswitchbench

    import org.openjdk.jmh.annotations.Benchmark
    import org.openjdk.jmh.annotations.Scope
    import org.openjdk.jmh.annotations.State
    import org.openjdk.jmh.annotations.OperationsPerInvocation

    object IntMemberData37 {
    	import IntMemberData._


  
      @State(Scope.Benchmark)
      class Sorted {
        var s = sortedlist.take(37)
      }

      @State(Scope.Benchmark)
      class Shuffled {
        var s = new scala.util.Random(37).shuffle(sortedlist.take(37))
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

    class IntMemberBenchmark37 {
      import IntMemberData37._
      import IntMemberData._
      import scala.annotation._
      import org.openjdk.jmh.infra.Blackhole
	
	  

@Benchmark
@OperationsPerInvocation(37)
def Sorted(bh: Blackhole, state: Sorted) = {

	def selectSelf(caze: WithIntMember) = {
		val sel = caze.selector
		(sel: @switch) match {
			
case 1 => bh.consume(caze.asInstanceOf[NthSelectorSwitch1].p)
case 2 => bh.consume(caze.asInstanceOf[NthSelectorSwitch2].p)
case 3 => bh.consume(caze.asInstanceOf[NthSelectorSwitch3].p)
case 4 => bh.consume(caze.asInstanceOf[NthSelectorSwitch4].p)
case 5 => bh.consume(caze.asInstanceOf[NthSelectorSwitch5].p)
case 6 => bh.consume(caze.asInstanceOf[NthSelectorSwitch6].p)
case 7 => bh.consume(caze.asInstanceOf[NthSelectorSwitch7].p)
case 8 => bh.consume(caze.asInstanceOf[NthSelectorSwitch8].p)
case 9 => bh.consume(caze.asInstanceOf[NthSelectorSwitch9].p)
case 10 => bh.consume(caze.asInstanceOf[NthSelectorSwitch10].p)
case 11 => bh.consume(caze.asInstanceOf[NthSelectorSwitch11].p)
case 12 => bh.consume(caze.asInstanceOf[NthSelectorSwitch12].p)
case 13 => bh.consume(caze.asInstanceOf[NthSelectorSwitch13].p)
case 14 => bh.consume(caze.asInstanceOf[NthSelectorSwitch14].p)
case 15 => bh.consume(caze.asInstanceOf[NthSelectorSwitch15].p)
case 16 => bh.consume(caze.asInstanceOf[NthSelectorSwitch16].p)
case 17 => bh.consume(caze.asInstanceOf[NthSelectorSwitch17].p)
case 18 => bh.consume(caze.asInstanceOf[NthSelectorSwitch18].p)
case 19 => bh.consume(caze.asInstanceOf[NthSelectorSwitch19].p)
case 20 => bh.consume(caze.asInstanceOf[NthSelectorSwitch20].p)
case 21 => bh.consume(caze.asInstanceOf[NthSelectorSwitch21].p)
case 22 => bh.consume(caze.asInstanceOf[NthSelectorSwitch22].p)
case 23 => bh.consume(caze.asInstanceOf[NthSelectorSwitch23].p)
case 24 => bh.consume(caze.asInstanceOf[NthSelectorSwitch24].p)
case 25 => bh.consume(caze.asInstanceOf[NthSelectorSwitch25].p)
case 26 => bh.consume(caze.asInstanceOf[NthSelectorSwitch26].p)
case 27 => bh.consume(caze.asInstanceOf[NthSelectorSwitch27].p)
case 28 => bh.consume(caze.asInstanceOf[NthSelectorSwitch28].p)
case 29 => bh.consume(caze.asInstanceOf[NthSelectorSwitch29].p)
case 30 => bh.consume(caze.asInstanceOf[NthSelectorSwitch30].p)
case 31 => bh.consume(caze.asInstanceOf[NthSelectorSwitch31].p)
case 32 => bh.consume(caze.asInstanceOf[NthSelectorSwitch32].p)
case 33 => bh.consume(caze.asInstanceOf[NthSelectorSwitch33].p)
case 34 => bh.consume(caze.asInstanceOf[NthSelectorSwitch34].p)
case 35 => bh.consume(caze.asInstanceOf[NthSelectorSwitch35].p)
case 36 => bh.consume(caze.asInstanceOf[NthSelectorSwitch36].p)
case 37 => bh.consume(caze.asInstanceOf[NthSelectorSwitch37].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(37)
def Unsorted(bh: Blackhole, state: Shuffled) = {

	def selectSelf(caze: WithIntMember): Unit = {
		val sel = caze.selector
		(sel: @switch) match {
			
case 1 => bh.consume(caze.asInstanceOf[NthSelectorSwitch1].p)
case 2 => bh.consume(caze.asInstanceOf[NthSelectorSwitch2].p)
case 3 => bh.consume(caze.asInstanceOf[NthSelectorSwitch3].p)
case 4 => bh.consume(caze.asInstanceOf[NthSelectorSwitch4].p)
case 5 => bh.consume(caze.asInstanceOf[NthSelectorSwitch5].p)
case 6 => bh.consume(caze.asInstanceOf[NthSelectorSwitch6].p)
case 7 => bh.consume(caze.asInstanceOf[NthSelectorSwitch7].p)
case 8 => bh.consume(caze.asInstanceOf[NthSelectorSwitch8].p)
case 9 => bh.consume(caze.asInstanceOf[NthSelectorSwitch9].p)
case 10 => bh.consume(caze.asInstanceOf[NthSelectorSwitch10].p)
case 11 => bh.consume(caze.asInstanceOf[NthSelectorSwitch11].p)
case 12 => bh.consume(caze.asInstanceOf[NthSelectorSwitch12].p)
case 13 => bh.consume(caze.asInstanceOf[NthSelectorSwitch13].p)
case 14 => bh.consume(caze.asInstanceOf[NthSelectorSwitch14].p)
case 15 => bh.consume(caze.asInstanceOf[NthSelectorSwitch15].p)
case 16 => bh.consume(caze.asInstanceOf[NthSelectorSwitch16].p)
case 17 => bh.consume(caze.asInstanceOf[NthSelectorSwitch17].p)
case 18 => bh.consume(caze.asInstanceOf[NthSelectorSwitch18].p)
case 19 => bh.consume(caze.asInstanceOf[NthSelectorSwitch19].p)
case 20 => bh.consume(caze.asInstanceOf[NthSelectorSwitch20].p)
case 21 => bh.consume(caze.asInstanceOf[NthSelectorSwitch21].p)
case 22 => bh.consume(caze.asInstanceOf[NthSelectorSwitch22].p)
case 23 => bh.consume(caze.asInstanceOf[NthSelectorSwitch23].p)
case 24 => bh.consume(caze.asInstanceOf[NthSelectorSwitch24].p)
case 25 => bh.consume(caze.asInstanceOf[NthSelectorSwitch25].p)
case 26 => bh.consume(caze.asInstanceOf[NthSelectorSwitch26].p)
case 27 => bh.consume(caze.asInstanceOf[NthSelectorSwitch27].p)
case 28 => bh.consume(caze.asInstanceOf[NthSelectorSwitch28].p)
case 29 => bh.consume(caze.asInstanceOf[NthSelectorSwitch29].p)
case 30 => bh.consume(caze.asInstanceOf[NthSelectorSwitch30].p)
case 31 => bh.consume(caze.asInstanceOf[NthSelectorSwitch31].p)
case 32 => bh.consume(caze.asInstanceOf[NthSelectorSwitch32].p)
case 33 => bh.consume(caze.asInstanceOf[NthSelectorSwitch33].p)
case 34 => bh.consume(caze.asInstanceOf[NthSelectorSwitch34].p)
case 35 => bh.consume(caze.asInstanceOf[NthSelectorSwitch35].p)
case 36 => bh.consume(caze.asInstanceOf[NthSelectorSwitch36].p)
case 37 => bh.consume(caze.asInstanceOf[NthSelectorSwitch37].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	}