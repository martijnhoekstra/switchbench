Some preliminary conclusions

* For the last item in the chain, the name-hashed algorithm becomes faster than the if-elseif chain between 8 and 16 items

** fqn lookup is memoized
** hashCode is also memoized

* between 128 and 256 the if-elseif chain becomes too large to JIT (as noticed by Retronym), and goes off a performance cliff

* For a single item, the name-hashed algorithm doesn't care whether it's the first or last item (as expected)



** Does that depend on the length of the fqn (probably not, considering memoization of hashCode on String)?
** Where exactly?

* A switch over the hash of the fqn is faster than a switch over a virtual trait val

** slow because the virtual call is slow?
** inline cache probably won't optimize well in practice (once it goes megamorphic it stays megamorphic)?
** suggested possible optimization for the trait val by Ichoran: abstract class Super(val dispatch: Int) {}; class Sub1(val p: Int) extends Super(1) {}


