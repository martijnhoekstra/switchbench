
	package intswitchbench

    import org.openjdk.jmh.annotations.Benchmark
    import org.openjdk.jmh.annotations.Scope
    import org.openjdk.jmh.annotations.State
    import org.openjdk.jmh.annotations.OperationsPerInvocation

    class NameHashBenchmark2 {
      import PlainData2._
      import PlainData._

      import scala.annotation._
      import org.openjdk.jmh.infra.Blackhole
	
	  

@Benchmark
@OperationsPerInvocation(2)
def Sorted(bh: Blackhole, state: Sorted) = {

	def selectSelf(caze: Plain) = {
		val name = caze.getClass().getName()
		val namehash = name.hashCode
		(namehash: @switch) match {
			
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(2)
def Unsorted(bh: Blackhole, state: Shuffled) = {

	def selectSelf(caze: Plain): Unit = {
		val name = caze.getClass().getName()
		val namehash = name.hashCode
		(namehash: @switch) match {
			
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(1)
def SingleStart(bh: Blackhole, state: SingleStart) = {

	def selectSelf(caze: Plain): Unit = {
		val name = caze.getClass().getName()
		val namehash = name.hashCode
		(namehash: @switch) match {
			
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(1)
def SingleEnd(bh: Blackhole, state: SingleEnd) = {

	def selectSelf(caze: Plain): Unit = {
		val name = caze.getClass().getName()
		val namehash = name.hashCode
		(namehash: @switch) match {
			
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	}