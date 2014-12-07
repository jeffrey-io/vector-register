package io.jeffrey.vector.compiler.functions;

import java.io.PrintStream;
import java.util.HashSet;

import io.jeffrey.vector.compiler.VectorSourcePrintStream;

public class Extractors extends VectorSourcePrintStream {
    public Extractors(PrintStream out, int N, HashSet<String> definedFunctions) {
        super(out, N, definedFunctions);
    }

    @Override
    protected void writeSource() {
        for (int k = 0; k < N; k++) {
            if (start("extract", s(k))) {
                println();
                tab();
                println("/** extract the " + k + "-vector into the given output array starting at the given offset */");
                println("public void extract_", s(k), "(final double[] output, final int offset) {");
                tab();
                println("output[offset + 0] = ", atX(k), ";");
                println("output[offset + 1] = ", atY(k), ";");
                untab();
                println("}");
                untab();
            }
        }
    }

    @Override
    protected void writeTest() {
        for (int k = 0; k < N; k++) {
            if (startTest("extract_" + k)) {
                createNewVector("x", N);
                println("double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};");
                println("x.set_", s(k), "(-1,-2);");
                println("x.extract_",s(k),"(data, 0);");
                println("x.extract_",s(k),"(data, 5);");
                println("x.extract_",s(k),"(data, 8);");
                println("assertEquals(-1,data[0]);");
                println("assertEquals(-2,data[1]);");
                println("assertEquals(2,data[2]);");
                println("assertEquals(3,data[3]);");
                println("assertEquals(4,data[4]);");
                println("assertEquals(-1,data[5]);");
                println("assertEquals(-2,data[6]);");
                println("assertEquals(7,data[7]);");
                println("assertEquals(-1,data[8]);");
                println("assertEquals(-2,data[9]);");
                endTest();
            }
        }
    }
}
