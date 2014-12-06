vector-register
===============

A library for doing vector math efficiently using Java. This is an unorthodox library that provides vector math.

The orthodox method for doing vector math is to create libraries for Vector and Matrix classes. For instance, you would create some classes like so: 

```java

public class ImmutableVector2D {
   public final double x;
   public final double y;
   /* ... obvioius code to initialize ... */
}

public class Vector2D {
   public double x;
   public double y;
}

public class Vector {
   public final double[] coordinates;
   /* ... obvioius code to initialize ... */
}

```

These implementations satisfy the "the code will be clean" aspect, but

* All of them require an object sitting on the heap
* ImmutableVector2D will require a ton of heap usage, so intense computations will churn the heap breaking locality and causing excessive GC
* Vector, while generic in dimension and provides more features, will utilize a ton of memory and lack good locality; there will also be a CPU hit for accessing the array

Out of all of these, Vector2D is the best if you ignore the heap utilization (may the immutable functional gods forgive me). Unfortunately, Java does not provide structures that can sit on the heap, so we are forced to utilize the heap. The best solution for performance and heap utilization is to inline the code and do the math manually, but this breaks the traditional goal of clean code. Here is where vector-register comes into play. The idea is to accept a one time hit on the heap, and use an expanded and unrolled Vector2D like object.

If one looks at a VectorRegister$N, then $N is the number of vectors provided.
