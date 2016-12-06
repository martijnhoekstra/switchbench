
	package intswitchbench

    import org.openjdk.jmh.annotations.Benchmark
    import org.openjdk.jmh.annotations.Scope
    import org.openjdk.jmh.annotations.State
    import org.openjdk.jmh.annotations.OperationsPerInvocation

    class NameHashBenchmark33 {
      import PlainData33._
      import PlainData._

      import scala.annotation._
      import org.openjdk.jmh.infra.Blackhole
	
	  

@Benchmark
@OperationsPerInvocation(33)
def Sorted(bh: Blackhole, state: Sorted) = {

	def selectSelf(caze: Plain) = {
		val name = caze.getClass().getName()
		val namehash = name.hashCode
		(namehash: @switch) match {
			
case 1083914443 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain5].p)
case -758390647 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain32].p)
case -758390703 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain18].p)
case -758390675 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain25].p)
case -758390679 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain21].p)
case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
case -758390671 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain29].p)
case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
case -758390646 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain33].p)
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case -758390674 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain26].p)
case -758390680 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain20].p)
case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
case -758390678 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain22].p)
case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
case -758390648 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain31].p)
case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
case -758390677 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain23].p)
case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
case -758390673 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain27].p)
case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
case -758390649 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain30].p)
case -758390702 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain19].p)
case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
case -758390676 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain24].p)
case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
case -758390704 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain17].p)
case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
case -758390672 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain28].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(33)
def Unsorted(bh: Blackhole, state: Shuffled) = {

	def selectSelf(caze: Plain): Unit = {
		val name = caze.getClass().getName()
		val namehash = name.hashCode
		(namehash: @switch) match {
			
case 1083914443 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain5].p)
case -758390647 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain32].p)
case -758390703 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain18].p)
case -758390675 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain25].p)
case -758390679 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain21].p)
case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
case -758390671 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain29].p)
case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
case -758390646 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain33].p)
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case -758390674 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain26].p)
case -758390680 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain20].p)
case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
case -758390678 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain22].p)
case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
case -758390648 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain31].p)
case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
case -758390677 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain23].p)
case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
case -758390673 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain27].p)
case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
case -758390649 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain30].p)
case -758390702 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain19].p)
case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
case -758390676 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain24].p)
case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
case -758390704 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain17].p)
case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
case -758390672 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain28].p)
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
			
case 1083914443 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain5].p)
case -758390647 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain32].p)
case -758390703 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain18].p)
case -758390675 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain25].p)
case -758390679 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain21].p)
case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
case -758390671 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain29].p)
case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
case -758390646 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain33].p)
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case -758390674 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain26].p)
case -758390680 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain20].p)
case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
case -758390678 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain22].p)
case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
case -758390648 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain31].p)
case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
case -758390677 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain23].p)
case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
case -758390673 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain27].p)
case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
case -758390649 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain30].p)
case -758390702 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain19].p)
case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
case -758390676 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain24].p)
case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
case -758390704 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain17].p)
case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
case -758390672 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain28].p)
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
			
case 1083914443 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain5].p)
case -758390647 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain32].p)
case -758390703 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain18].p)
case -758390675 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain25].p)
case -758390679 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain21].p)
case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
case -758390671 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain29].p)
case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
case -758390646 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain33].p)
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case -758390674 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain26].p)
case -758390680 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain20].p)
case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
case -758390678 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain22].p)
case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
case -758390648 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain31].p)
case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
case -758390677 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain23].p)
case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
case -758390673 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain27].p)
case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
case -758390649 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain30].p)
case -758390702 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain19].p)
case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
case -758390676 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain24].p)
case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
case -758390704 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain17].p)
case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
case -758390672 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain28].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	}