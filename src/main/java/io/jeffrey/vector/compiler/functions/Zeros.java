package io.jeffrey.vector.compiler.functions;

import java.io.PrintStream;
import java.util.HashSet;

import io.jeffrey.vector.compiler.VectorSourcePrintStream;

public class Zeros extends VectorSourcePrintStream {

    public Zeros(PrintStream out, int N, HashSet<String> definedFunctions) {
        super(out, N, definedFunctions);
    }

    @Override
    protected void writeSource() {
        for (int k = 0; k < N; k++) {
            if (start("zero_out_", s(k))) {
                println();
                tab();
                println("/** set the " + k + "-vector to the (0,0) */");
                println("public void zero_out_", s(k), "() {");
                tab();
                println(atX(k) + " = 0.0;");
                println(atY(k) + " = 0.0;");
                untab();
                println("}");
                untab();
            }
        }
    }

    @Override
    protected void writeTest() {
        for (int k = 0; k < N; k++) {
            if (startTest("zero_" + k)) {
                createNewVector("x", N);
                for (int j = 0; j <= k; j++) {
                    println("x.set_", s(j), "(3,5);");
                    println("assertEquals(3, x.x_", s(j), ");");
                    println("assertEquals(5, x.y_", s(j), ");");
                }
                println("x.zero_out_", s(k), "();");
                for (int j = 0; j < k; j++) {
                    println("assertEquals(3, x.x_", s(j), ");");
                    println("assertEquals(5, x.y_", s(j), ");");
                    println("Assert.assertFalse(x.is_", s(j), "_zero());");
                }
                println("assertEquals(0, x.x_", s(k), ");");
                println("assertEquals(0, x.y_", s(k), ");");
                println("Assert.assertTrue(x.is_", s(k), "_zero());");
                endTest();
            }
        }

    }

}
