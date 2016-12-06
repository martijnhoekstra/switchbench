
	package intswitchbench

    import org.openjdk.jmh.annotations.Benchmark
    import org.openjdk.jmh.annotations.Scope
    import org.openjdk.jmh.annotations.State
    import org.openjdk.jmh.annotations.OperationsPerInvocation

    class NameHashBenchmark64 {
      import PlainData64._
      import PlainData._

      import scala.annotation._
      import org.openjdk.jmh.infra.Blackhole
	
	  

@Benchmark
@OperationsPerInvocation(64)
def Sorted(bh: Blackhole, state: Sorted) = {

	def selectSelf(caze: Plain) = {
		val name = caze.getClass().getName()
		val namehash = name.hashCode
		(namehash: @switch) match {
			
case 1083914443 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain5].p)
case -758390615 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain43].p)
case -758390647 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain32].p)
case -758390703 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain18].p)
case -758390643 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain36].p)
case -758390611 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain47].p)
case -758390579 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain58].p)
case -758390675 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain25].p)
case -758390679 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain21].p)
case -758390555 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain61].p)
case -758390583 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain54].p)
case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
case -758390671 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain29].p)
case -758390587 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain50].p)
case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
case -758390646 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain33].p)
case -758390614 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain44].p)
case -758390578 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain59].p)
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case -758390642 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain37].p)
case -758390674 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain26].p)
case -758390610 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain48].p)
case -758390680 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain20].p)
case -758390582 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain55].p)
case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
case -758390556 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain60].p)
case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
case -758390616 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain42].p)
case -758390584 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain53].p)
case -758390678 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain22].p)
case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
case -758390648 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain31].p)
case -758390552 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain64].p)
case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
case -758390609 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain49].p)
case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
case -758390613 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain45].p)
case -758390641 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain38].p)
case -758390677 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain23].p)
case -758390585 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain52].p)
case -758390553 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain63].p)
case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
case -758390645 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain34].p)
case -758390617 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain41].p)
case -758390581 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain56].p)
case -758390673 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain27].p)
case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
case -758390649 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain30].p)
case -758390640 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain39].p)
case -758390612 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain46].p)
case -758390644 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain35].p)
case -758390702 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain19].p)
case -758390554 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain62].p)
case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
case -758390586 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain51].p)
case -758390676 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain24].p)
case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
case -758390580 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain57].p)
case -758390704 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain17].p)
case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
case -758390618 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain40].p)
case -758390672 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain28].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(64)
def Unsorted(bh: Blackhole, state: Shuffled) = {

	def selectSelf(caze: Plain): Unit = {
		val name = caze.getClass().getName()
		val namehash = name.hashCode
		(namehash: @switch) match {
			
case 1083914443 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain5].p)
case -758390615 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain43].p)
case -758390647 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain32].p)
case -758390703 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain18].p)
case -758390643 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain36].p)
case -758390611 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain47].p)
case -758390579 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain58].p)
case -758390675 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain25].p)
case -758390679 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain21].p)
case -758390555 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain61].p)
case -758390583 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain54].p)
case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
case -758390671 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain29].p)
case -758390587 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain50].p)
case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
case -758390646 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain33].p)
case -758390614 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain44].p)
case -758390578 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain59].p)
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case -758390642 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain37].p)
case -758390674 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain26].p)
case -758390610 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain48].p)
case -758390680 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain20].p)
case -758390582 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain55].p)
case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
case -758390556 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain60].p)
case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
case -758390616 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain42].p)
case -758390584 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain53].p)
case -758390678 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain22].p)
case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
case -758390648 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain31].p)
case -758390552 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain64].p)
case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
case -758390609 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain49].p)
case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
case -758390613 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain45].p)
case -758390641 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain38].p)
case -758390677 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain23].p)
case -758390585 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain52].p)
case -758390553 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain63].p)
case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
case -758390645 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain34].p)
case -758390617 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain41].p)
case -758390581 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain56].p)
case -758390673 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain27].p)
case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
case -758390649 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain30].p)
case -758390640 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain39].p)
case -758390612 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain46].p)
case -758390644 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain35].p)
case -758390702 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain19].p)
case -758390554 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain62].p)
case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
case -758390586 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain51].p)
case -758390676 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain24].p)
case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
case -758390580 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain57].p)
case -758390704 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain17].p)
case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
case -758390618 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain40].p)
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
case -758390615 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain43].p)
case -758390647 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain32].p)
case -758390703 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain18].p)
case -758390643 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain36].p)
case -758390611 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain47].p)
case -758390579 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain58].p)
case -758390675 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain25].p)
case -758390679 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain21].p)
case -758390555 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain61].p)
case -758390583 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain54].p)
case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
case -758390671 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain29].p)
case -758390587 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain50].p)
case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
case -758390646 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain33].p)
case -758390614 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain44].p)
case -758390578 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain59].p)
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case -758390642 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain37].p)
case -758390674 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain26].p)
case -758390610 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain48].p)
case -758390680 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain20].p)
case -758390582 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain55].p)
case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
case -758390556 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain60].p)
case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
case -758390616 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain42].p)
case -758390584 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain53].p)
case -758390678 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain22].p)
case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
case -758390648 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain31].p)
case -758390552 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain64].p)
case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
case -758390609 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain49].p)
case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
case -758390613 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain45].p)
case -758390641 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain38].p)
case -758390677 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain23].p)
case -758390585 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain52].p)
case -758390553 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain63].p)
case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
case -758390645 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain34].p)
case -758390617 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain41].p)
case -758390581 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain56].p)
case -758390673 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain27].p)
case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
case -758390649 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain30].p)
case -758390640 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain39].p)
case -758390612 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain46].p)
case -758390644 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain35].p)
case -758390702 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain19].p)
case -758390554 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain62].p)
case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
case -758390586 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain51].p)
case -758390676 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain24].p)
case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
case -758390580 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain57].p)
case -758390704 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain17].p)
case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
case -758390618 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain40].p)
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
case -758390615 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain43].p)
case -758390647 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain32].p)
case -758390703 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain18].p)
case -758390643 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain36].p)
case -758390611 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain47].p)
case -758390579 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain58].p)
case -758390675 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain25].p)
case -758390679 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain21].p)
case -758390555 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain61].p)
case -758390583 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain54].p)
case -758390707 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain14].p)
case 1083914446 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain8].p)
case -758390671 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain29].p)
case -758390587 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain50].p)
case -758390711 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain10].p)
case -758390646 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain33].p)
case -758390614 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain44].p)
case -758390578 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain59].p)
case 1083914439 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain1].p)
case -758390642 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain37].p)
case -758390674 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain26].p)
case -758390610 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain48].p)
case -758390680 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain20].p)
case -758390582 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain55].p)
case 1083914442 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain4].p)
case -758390556 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain60].p)
case -758390706 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain15].p)
case -758390616 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain42].p)
case -758390584 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain53].p)
case -758390678 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain22].p)
case 1083914445 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain7].p)
case -758390648 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain31].p)
case -758390552 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain64].p)
case -758390710 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain11].p)
case 1083914440 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain2].p)
case -758390609 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain49].p)
case 1083914441 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain3].p)
case -758390613 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain45].p)
case -758390641 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain38].p)
case -758390677 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain23].p)
case -758390585 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain52].p)
case -758390553 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain63].p)
case -758390709 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain12].p)
case -758390645 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain34].p)
case -758390617 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain41].p)
case -758390581 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain56].p)
case -758390673 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain27].p)
case -758390705 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain16].p)
case -758390649 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain30].p)
case -758390640 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain39].p)
case -758390612 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain46].p)
case -758390644 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain35].p)
case -758390702 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain19].p)
case -758390554 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain62].p)
case -758390708 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain13].p)
case -758390586 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain51].p)
case -758390676 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain24].p)
case 1083914447 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain9].p)
case -758390580 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain57].p)
case -758390704 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain17].p)
case 1083914444 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain6].p)
case -758390618 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain40].p)
case -758390672 => bh.consume(caze.asInstanceOf[intswitchbench.NthSelectorPlain28].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	}