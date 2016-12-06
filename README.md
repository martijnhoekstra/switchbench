Some preliminary conclusions

* Something happens with the if-elseif chain between 128 and 256 cases that radically hampers performance. Even if the case is the first in the chain, the algorithm changes from fastest to slowest
** Where? Search
** Why? No idea

* For a single item, the name-hashed algorithm doesn't care whether it's the first or last item (as expected)
* For the last item in the chain, the name-hashed algorithm becomes faster than the if-elseif chain between 8 and 16 items
** Does that depend on the length of the fqn?
** Where exactly?

* A switch over the hash of the fqn is faster than a switch over a virtual trait val
** fqn lookup is memoized
** hashCode is also memoized
** slow because the virtual call is slow?
   inline cache probably won't optimize well in practice (one it goes megamorphic it stays megamorphic)?
   suggested possible optimization for the trait val by Ichoran:
   abstract class Super(val dispatch: Int) {}; class Sub1(val p: Int) extends Super(1) {}


