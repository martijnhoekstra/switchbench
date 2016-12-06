
	package intswitchbench

    import org.openjdk.jmh.annotations.Benchmark
    import org.openjdk.jmh.annotations.Scope
    import org.openjdk.jmh.annotations.State
    import org.openjdk.jmh.annotations.OperationsPerInvocation

    object IntMemberData128 {
    	import IntMemberData._


  
      @State(Scope.Benchmark)
      class Sorted {
        var s = sortedlist.take(128)
      }

      @State(Scope.Benchmark)
      class Shuffled {
        var s = new scala.util.Random(128).shuffle(sortedlist.take(128))
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

    class IntMemberBenchmark128 {
      import IntMemberData128._
      import IntMemberData._
      import scala.annotation._
      import org.openjdk.jmh.infra.Blackhole
	
	  

@Benchmark
@OperationsPerInvocation(128)
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
case 38 => bh.consume(caze.asInstanceOf[NthSelectorSwitch38].p)
case 39 => bh.consume(caze.asInstanceOf[NthSelectorSwitch39].p)
case 40 => bh.consume(caze.asInstanceOf[NthSelectorSwitch40].p)
case 41 => bh.consume(caze.asInstanceOf[NthSelectorSwitch41].p)
case 42 => bh.consume(caze.asInstanceOf[NthSelectorSwitch42].p)
case 43 => bh.consume(caze.asInstanceOf[NthSelectorSwitch43].p)
case 44 => bh.consume(caze.asInstanceOf[NthSelectorSwitch44].p)
case 45 => bh.consume(caze.asInstanceOf[NthSelectorSwitch45].p)
case 46 => bh.consume(caze.asInstanceOf[NthSelectorSwitch46].p)
case 47 => bh.consume(caze.asInstanceOf[NthSelectorSwitch47].p)
case 48 => bh.consume(caze.asInstanceOf[NthSelectorSwitch48].p)
case 49 => bh.consume(caze.asInstanceOf[NthSelectorSwitch49].p)
case 50 => bh.consume(caze.asInstanceOf[NthSelectorSwitch50].p)
case 51 => bh.consume(caze.asInstanceOf[NthSelectorSwitch51].p)
case 52 => bh.consume(caze.asInstanceOf[NthSelectorSwitch52].p)
case 53 => bh.consume(caze.asInstanceOf[NthSelectorSwitch53].p)
case 54 => bh.consume(caze.asInstanceOf[NthSelectorSwitch54].p)
case 55 => bh.consume(caze.asInstanceOf[NthSelectorSwitch55].p)
case 56 => bh.consume(caze.asInstanceOf[NthSelectorSwitch56].p)
case 57 => bh.consume(caze.asInstanceOf[NthSelectorSwitch57].p)
case 58 => bh.consume(caze.asInstanceOf[NthSelectorSwitch58].p)
case 59 => bh.consume(caze.asInstanceOf[NthSelectorSwitch59].p)
case 60 => bh.consume(caze.asInstanceOf[NthSelectorSwitch60].p)
case 61 => bh.consume(caze.asInstanceOf[NthSelectorSwitch61].p)
case 62 => bh.consume(caze.asInstanceOf[NthSelectorSwitch62].p)
case 63 => bh.consume(caze.asInstanceOf[NthSelectorSwitch63].p)
case 64 => bh.consume(caze.asInstanceOf[NthSelectorSwitch64].p)
case 65 => bh.consume(caze.asInstanceOf[NthSelectorSwitch65].p)
case 66 => bh.consume(caze.asInstanceOf[NthSelectorSwitch66].p)
case 67 => bh.consume(caze.asInstanceOf[NthSelectorSwitch67].p)
case 68 => bh.consume(caze.asInstanceOf[NthSelectorSwitch68].p)
case 69 => bh.consume(caze.asInstanceOf[NthSelectorSwitch69].p)
case 70 => bh.consume(caze.asInstanceOf[NthSelectorSwitch70].p)
case 71 => bh.consume(caze.asInstanceOf[NthSelectorSwitch71].p)
case 72 => bh.consume(caze.asInstanceOf[NthSelectorSwitch72].p)
case 73 => bh.consume(caze.asInstanceOf[NthSelectorSwitch73].p)
case 74 => bh.consume(caze.asInstanceOf[NthSelectorSwitch74].p)
case 75 => bh.consume(caze.asInstanceOf[NthSelectorSwitch75].p)
case 76 => bh.consume(caze.asInstanceOf[NthSelectorSwitch76].p)
case 77 => bh.consume(caze.asInstanceOf[NthSelectorSwitch77].p)
case 78 => bh.consume(caze.asInstanceOf[NthSelectorSwitch78].p)
case 79 => bh.consume(caze.asInstanceOf[NthSelectorSwitch79].p)
case 80 => bh.consume(caze.asInstanceOf[NthSelectorSwitch80].p)
case 81 => bh.consume(caze.asInstanceOf[NthSelectorSwitch81].p)
case 82 => bh.consume(caze.asInstanceOf[NthSelectorSwitch82].p)
case 83 => bh.consume(caze.asInstanceOf[NthSelectorSwitch83].p)
case 84 => bh.consume(caze.asInstanceOf[NthSelectorSwitch84].p)
case 85 => bh.consume(caze.asInstanceOf[NthSelectorSwitch85].p)
case 86 => bh.consume(caze.asInstanceOf[NthSelectorSwitch86].p)
case 87 => bh.consume(caze.asInstanceOf[NthSelectorSwitch87].p)
case 88 => bh.consume(caze.asInstanceOf[NthSelectorSwitch88].p)
case 89 => bh.consume(caze.asInstanceOf[NthSelectorSwitch89].p)
case 90 => bh.consume(caze.asInstanceOf[NthSelectorSwitch90].p)
case 91 => bh.consume(caze.asInstanceOf[NthSelectorSwitch91].p)
case 92 => bh.consume(caze.asInstanceOf[NthSelectorSwitch92].p)
case 93 => bh.consume(caze.asInstanceOf[NthSelectorSwitch93].p)
case 94 => bh.consume(caze.asInstanceOf[NthSelectorSwitch94].p)
case 95 => bh.consume(caze.asInstanceOf[NthSelectorSwitch95].p)
case 96 => bh.consume(caze.asInstanceOf[NthSelectorSwitch96].p)
case 97 => bh.consume(caze.asInstanceOf[NthSelectorSwitch97].p)
case 98 => bh.consume(caze.asInstanceOf[NthSelectorSwitch98].p)
case 99 => bh.consume(caze.asInstanceOf[NthSelectorSwitch99].p)
case 100 => bh.consume(caze.asInstanceOf[NthSelectorSwitch100].p)
case 101 => bh.consume(caze.asInstanceOf[NthSelectorSwitch101].p)
case 102 => bh.consume(caze.asInstanceOf[NthSelectorSwitch102].p)
case 103 => bh.consume(caze.asInstanceOf[NthSelectorSwitch103].p)
case 104 => bh.consume(caze.asInstanceOf[NthSelectorSwitch104].p)
case 105 => bh.consume(caze.asInstanceOf[NthSelectorSwitch105].p)
case 106 => bh.consume(caze.asInstanceOf[NthSelectorSwitch106].p)
case 107 => bh.consume(caze.asInstanceOf[NthSelectorSwitch107].p)
case 108 => bh.consume(caze.asInstanceOf[NthSelectorSwitch108].p)
case 109 => bh.consume(caze.asInstanceOf[NthSelectorSwitch109].p)
case 110 => bh.consume(caze.asInstanceOf[NthSelectorSwitch110].p)
case 111 => bh.consume(caze.asInstanceOf[NthSelectorSwitch111].p)
case 112 => bh.consume(caze.asInstanceOf[NthSelectorSwitch112].p)
case 113 => bh.consume(caze.asInstanceOf[NthSelectorSwitch113].p)
case 114 => bh.consume(caze.asInstanceOf[NthSelectorSwitch114].p)
case 115 => bh.consume(caze.asInstanceOf[NthSelectorSwitch115].p)
case 116 => bh.consume(caze.asInstanceOf[NthSelectorSwitch116].p)
case 117 => bh.consume(caze.asInstanceOf[NthSelectorSwitch117].p)
case 118 => bh.consume(caze.asInstanceOf[NthSelectorSwitch118].p)
case 119 => bh.consume(caze.asInstanceOf[NthSelectorSwitch119].p)
case 120 => bh.consume(caze.asInstanceOf[NthSelectorSwitch120].p)
case 121 => bh.consume(caze.asInstanceOf[NthSelectorSwitch121].p)
case 122 => bh.consume(caze.asInstanceOf[NthSelectorSwitch122].p)
case 123 => bh.consume(caze.asInstanceOf[NthSelectorSwitch123].p)
case 124 => bh.consume(caze.asInstanceOf[NthSelectorSwitch124].p)
case 125 => bh.consume(caze.asInstanceOf[NthSelectorSwitch125].p)
case 126 => bh.consume(caze.asInstanceOf[NthSelectorSwitch126].p)
case 127 => bh.consume(caze.asInstanceOf[NthSelectorSwitch127].p)
case 128 => bh.consume(caze.asInstanceOf[NthSelectorSwitch128].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	  

@Benchmark
@OperationsPerInvocation(128)
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
case 38 => bh.consume(caze.asInstanceOf[NthSelectorSwitch38].p)
case 39 => bh.consume(caze.asInstanceOf[NthSelectorSwitch39].p)
case 40 => bh.consume(caze.asInstanceOf[NthSelectorSwitch40].p)
case 41 => bh.consume(caze.asInstanceOf[NthSelectorSwitch41].p)
case 42 => bh.consume(caze.asInstanceOf[NthSelectorSwitch42].p)
case 43 => bh.consume(caze.asInstanceOf[NthSelectorSwitch43].p)
case 44 => bh.consume(caze.asInstanceOf[NthSelectorSwitch44].p)
case 45 => bh.consume(caze.asInstanceOf[NthSelectorSwitch45].p)
case 46 => bh.consume(caze.asInstanceOf[NthSelectorSwitch46].p)
case 47 => bh.consume(caze.asInstanceOf[NthSelectorSwitch47].p)
case 48 => bh.consume(caze.asInstanceOf[NthSelectorSwitch48].p)
case 49 => bh.consume(caze.asInstanceOf[NthSelectorSwitch49].p)
case 50 => bh.consume(caze.asInstanceOf[NthSelectorSwitch50].p)
case 51 => bh.consume(caze.asInstanceOf[NthSelectorSwitch51].p)
case 52 => bh.consume(caze.asInstanceOf[NthSelectorSwitch52].p)
case 53 => bh.consume(caze.asInstanceOf[NthSelectorSwitch53].p)
case 54 => bh.consume(caze.asInstanceOf[NthSelectorSwitch54].p)
case 55 => bh.consume(caze.asInstanceOf[NthSelectorSwitch55].p)
case 56 => bh.consume(caze.asInstanceOf[NthSelectorSwitch56].p)
case 57 => bh.consume(caze.asInstanceOf[NthSelectorSwitch57].p)
case 58 => bh.consume(caze.asInstanceOf[NthSelectorSwitch58].p)
case 59 => bh.consume(caze.asInstanceOf[NthSelectorSwitch59].p)
case 60 => bh.consume(caze.asInstanceOf[NthSelectorSwitch60].p)
case 61 => bh.consume(caze.asInstanceOf[NthSelectorSwitch61].p)
case 62 => bh.consume(caze.asInstanceOf[NthSelectorSwitch62].p)
case 63 => bh.consume(caze.asInstanceOf[NthSelectorSwitch63].p)
case 64 => bh.consume(caze.asInstanceOf[NthSelectorSwitch64].p)
case 65 => bh.consume(caze.asInstanceOf[NthSelectorSwitch65].p)
case 66 => bh.consume(caze.asInstanceOf[NthSelectorSwitch66].p)
case 67 => bh.consume(caze.asInstanceOf[NthSelectorSwitch67].p)
case 68 => bh.consume(caze.asInstanceOf[NthSelectorSwitch68].p)
case 69 => bh.consume(caze.asInstanceOf[NthSelectorSwitch69].p)
case 70 => bh.consume(caze.asInstanceOf[NthSelectorSwitch70].p)
case 71 => bh.consume(caze.asInstanceOf[NthSelectorSwitch71].p)
case 72 => bh.consume(caze.asInstanceOf[NthSelectorSwitch72].p)
case 73 => bh.consume(caze.asInstanceOf[NthSelectorSwitch73].p)
case 74 => bh.consume(caze.asInstanceOf[NthSelectorSwitch74].p)
case 75 => bh.consume(caze.asInstanceOf[NthSelectorSwitch75].p)
case 76 => bh.consume(caze.asInstanceOf[NthSelectorSwitch76].p)
case 77 => bh.consume(caze.asInstanceOf[NthSelectorSwitch77].p)
case 78 => bh.consume(caze.asInstanceOf[NthSelectorSwitch78].p)
case 79 => bh.consume(caze.asInstanceOf[NthSelectorSwitch79].p)
case 80 => bh.consume(caze.asInstanceOf[NthSelectorSwitch80].p)
case 81 => bh.consume(caze.asInstanceOf[NthSelectorSwitch81].p)
case 82 => bh.consume(caze.asInstanceOf[NthSelectorSwitch82].p)
case 83 => bh.consume(caze.asInstanceOf[NthSelectorSwitch83].p)
case 84 => bh.consume(caze.asInstanceOf[NthSelectorSwitch84].p)
case 85 => bh.consume(caze.asInstanceOf[NthSelectorSwitch85].p)
case 86 => bh.consume(caze.asInstanceOf[NthSelectorSwitch86].p)
case 87 => bh.consume(caze.asInstanceOf[NthSelectorSwitch87].p)
case 88 => bh.consume(caze.asInstanceOf[NthSelectorSwitch88].p)
case 89 => bh.consume(caze.asInstanceOf[NthSelectorSwitch89].p)
case 90 => bh.consume(caze.asInstanceOf[NthSelectorSwitch90].p)
case 91 => bh.consume(caze.asInstanceOf[NthSelectorSwitch91].p)
case 92 => bh.consume(caze.asInstanceOf[NthSelectorSwitch92].p)
case 93 => bh.consume(caze.asInstanceOf[NthSelectorSwitch93].p)
case 94 => bh.consume(caze.asInstanceOf[NthSelectorSwitch94].p)
case 95 => bh.consume(caze.asInstanceOf[NthSelectorSwitch95].p)
case 96 => bh.consume(caze.asInstanceOf[NthSelectorSwitch96].p)
case 97 => bh.consume(caze.asInstanceOf[NthSelectorSwitch97].p)
case 98 => bh.consume(caze.asInstanceOf[NthSelectorSwitch98].p)
case 99 => bh.consume(caze.asInstanceOf[NthSelectorSwitch99].p)
case 100 => bh.consume(caze.asInstanceOf[NthSelectorSwitch100].p)
case 101 => bh.consume(caze.asInstanceOf[NthSelectorSwitch101].p)
case 102 => bh.consume(caze.asInstanceOf[NthSelectorSwitch102].p)
case 103 => bh.consume(caze.asInstanceOf[NthSelectorSwitch103].p)
case 104 => bh.consume(caze.asInstanceOf[NthSelectorSwitch104].p)
case 105 => bh.consume(caze.asInstanceOf[NthSelectorSwitch105].p)
case 106 => bh.consume(caze.asInstanceOf[NthSelectorSwitch106].p)
case 107 => bh.consume(caze.asInstanceOf[NthSelectorSwitch107].p)
case 108 => bh.consume(caze.asInstanceOf[NthSelectorSwitch108].p)
case 109 => bh.consume(caze.asInstanceOf[NthSelectorSwitch109].p)
case 110 => bh.consume(caze.asInstanceOf[NthSelectorSwitch110].p)
case 111 => bh.consume(caze.asInstanceOf[NthSelectorSwitch111].p)
case 112 => bh.consume(caze.asInstanceOf[NthSelectorSwitch112].p)
case 113 => bh.consume(caze.asInstanceOf[NthSelectorSwitch113].p)
case 114 => bh.consume(caze.asInstanceOf[NthSelectorSwitch114].p)
case 115 => bh.consume(caze.asInstanceOf[NthSelectorSwitch115].p)
case 116 => bh.consume(caze.asInstanceOf[NthSelectorSwitch116].p)
case 117 => bh.consume(caze.asInstanceOf[NthSelectorSwitch117].p)
case 118 => bh.consume(caze.asInstanceOf[NthSelectorSwitch118].p)
case 119 => bh.consume(caze.asInstanceOf[NthSelectorSwitch119].p)
case 120 => bh.consume(caze.asInstanceOf[NthSelectorSwitch120].p)
case 121 => bh.consume(caze.asInstanceOf[NthSelectorSwitch121].p)
case 122 => bh.consume(caze.asInstanceOf[NthSelectorSwitch122].p)
case 123 => bh.consume(caze.asInstanceOf[NthSelectorSwitch123].p)
case 124 => bh.consume(caze.asInstanceOf[NthSelectorSwitch124].p)
case 125 => bh.consume(caze.asInstanceOf[NthSelectorSwitch125].p)
case 126 => bh.consume(caze.asInstanceOf[NthSelectorSwitch126].p)
case 127 => bh.consume(caze.asInstanceOf[NthSelectorSwitch127].p)
case 128 => bh.consume(caze.asInstanceOf[NthSelectorSwitch128].p)
			case _ => ???
		}
	}

	state.s.foreach(selectSelf)	

}

	}