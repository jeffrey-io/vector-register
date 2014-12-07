package io.jeffrey.vector.compiler;

import io.jeffrey.vector.compiler.functions.AngleFunctions;
import io.jeffrey.vector.compiler.functions.Copiers;
import io.jeffrey.vector.compiler.functions.Extractors;
import io.jeffrey.vector.compiler.functions.Setters;
import io.jeffrey.vector.compiler.functions.VectorAlgebraFunctions;
import io.jeffrey.vector.compiler.functions.ZeroFunctions;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;

public class VectorAlgebraFactory extends VectorSourcePrintStream {

    private final ArrayList<VectorSourcePrintStream> components;

    private VectorAlgebraFactory(PrintStream out, int N, HashSet<String> definedFunctions) {
        super(out, N, definedFunctions);
        this.components = new ArrayList<VectorSourcePrintStream>();
        components.add(new Setters(out, N, definedFunctions));
        components.add(new ZeroFunctions(out, N, definedFunctions));
        components.add(new Copiers(out, N, definedFunctions));
        components.add(new Extractors(out, N, definedFunctions));
        components.add(new AngleFunctions(out, N, definedFunctions));
        components.add(new VectorAlgebraFunctions(out, N, definedFunctions));
    }

    /**
     * write out the new fields, and write out a constructor to zero out the new fields
     */
    private void writeFieldsAndConstructor() {
        tab();
        for (int k = N == 2 ? 0 : N - 1; k < N; k++) {
            if (N == 2) {
                println("public double                 " + atX(k) + ";");
                println("public double                 " + atY(k) + ";");
            } else {
                println("public double " + atX(k) + ";");
                println("public double " + atY(k) + ";");

            }
        }
        println();
        println("public VectorRegister", hexify(N), "() {");
        tab();
        for (int k = N == 2 ? 0 : N - 1; k < N; k++) {
            println(atX(k) + " = 0.0;");
            println(atY(k) + " = 0.0;");
        }
        untab();
        println("}");
        untab();
    }

    private void writeComplexMultiply() {
        for (int k = 0; k < N; k++) {
            for (int j = 0; j < N; j++) {
                if (k == j)
                    continue;
                if (start("complex_mult_", "_", s(j), "_", s(k))) {
                    println();
                    tab();
                    println("/** multiply via complex numbers the " + k + " and " + j + " together and store the result to the " + k + " vector */");
                    println("public void complex_mult", s(j), "_", s(k), "() {");
                    tab();
                    println("final double t = ", atX(k), " * ", atX(j), " - ", atY(k), " * ", atY(j), ";");
                    println(atY(k), " = ", atX(k), " * ", atY(j), " + ", atY(k), " * ", atX(j), ";");
                    println(atX(k), " = t;");
                    untab();
                    println("}");
                    untab();
                }
            }
        }
    }

    private void writeMatrixMath() {
        for (int k = 0; k < N; k++) {
            for (int j = 0; j < N; j++) {
                for (int v = 0; v < N; v++) {
                    if (k == j || j == v || v == k)
                        continue;
                    if (start("transform_" + v + "_by_" + k + "_" + j)) {
                        println();
                        tab();
                        println("/** transform the " + v + " vector by the matrixed formed by the " + k + " and " + j + " vectors as columns */");
                        println("public void transform_" + v + "_by_" + k + "_" + j + "() {");
                        tab();
                        println("final double t = ", atX(k), " * ", atX(v), " + ", atX(j), " * ", atY(v), ";");
                        println(atY(v), " = ", atY(k), " * ", atX(v), " + ", atY(j), " * ", atY(v), ";");
                        println(atX(v), " = t;");
                        untab();
                        println("}");
                        untab();
                    }
                }
            }
        }
    }

    private void writeMatrixInverse() {
        for (int k = 0; k < N; k++) {
            for (int j = 0; j < N; j++) {
                if (k == j)
                    continue;
                if (start("invert_" + k + "_" + j)) {
                    println();
                    tab();
                    println("/** invert the 2x2 matrix formed by vector " + k + " and vector " + j + " where the vectors are columns */");
                    println("public boolean invert_" + k + "_" + j + "() {");
                    tab();
                    println("final double t = ", atX(k), ";");
                    println("double invdet = ", atX(k), " * ", atY(j), " - ", atY(k), " * ", atX(j), ";");
                    println("if (Math.abs(invdet) < ZERO_LIMIT)");
                    tab();
                    println("return false;");
                    untab();
                    println("invdet = 1.0 / invdet;");
                    println(atX(j), " *= -1 * invdet;");
                    println(atY(k), " *= -1 * invdet;");
                    println(atX(k), " *= ", atY(j), " * invdet;");
                    println(atY(j), " *= t * invdet;");
                    println("return true;");
                    untab();
                    println("}");
                    untab();
                }
            }
        }
    }

    private void writeConj() {
        for (int k = 0; k < N; k++) {
            if (start("conjugate_", "_", s(k))) {
                println();
                tab();
                println("/** treat vector " + k + " as a complex number and conjugate it */");
                println("public void conjugate_", s(k), "() {");
                tab();
                println(atY(k), " *= -1;");
                untab();
                println("}");
                untab();
            }
        }
    }

    private void writeLengths() {
        for (int k = 0; k < N; k++) {
            if (start("length_", "_", s(k))) {
                println();
                tab();
                println("/** compute and return the length of vector " + k + " */");
                println("public double length_", s(k), "() {");
                tab();
                println("double d = 0.0;");
                println("d += ", atX(k), " * ", atX(k), ";");
                println("d += ", atY(k), " * ", atY(k), ";");
                println("return Math.sqrt(d);");
                untab();
                println("}");
                untab();
            }
        }
    }

    private void writeNormalizers() {
        for (int k = 0; k < N; k++) {
            if (start("normalize_", "_", s(k))) {

                println();
                tab();
                println("/** normalize the " + k + "-vector if it is not the origin */");
                println("public boolean normalize_", s(k), "() {");
                tab();
                println("double d = 0.0;");
                println("d += ", atX(k), " * ", atX(k), ";");
                println("d += ", atY(k), " * ", atY(k), ";");
                println("if (Math.abs(d) < ZERO_LIMIT)");
                tab();
                println("return false;");
                untab();
                println("d = Math.sqrt(d);");
                println("d = 1.0 / d;");
                println(atX(k), " *= d;");
                println(atY(k), " *= d;");
                println("return true;");
                untab();
                println("}");
                untab();
            }
        }
    }

    private void writeSetMatrix() {
        for (int k = 0; k < N; k++) {
            for (int j = 0; j < N; j++) {
                if (k == j)
                    continue;
                if (start("writeMatrix", "_", s(k), "_", s(j))) {
                    println();
                    tab();
                    println("/** set the matrixed form by the ", s(k), " vector and ", s(j), " vector (by column) */");
                    println("public void set_matrix_", s(k), "_", s(j), "(double x0, double y0, double x1, double y1) {");
                    tab();
                    println(atX(k), " = x0;");
                    println(atY(k), " = y0;");
                    println(atX(j), " = x1;");
                    println(atY(j), " = y1;");
                    untab();
                    println("}");
                    untab();
                }
            }
        }
    }

    @Override
    protected void writeSource() {

        writeFieldsAndConstructor();

        for (VectorSourcePrintStream vsps : components) {
            vsps.writeSource();
        }

        writeConj();
        writeComplexMultiply();

        writeLengths();
        writeNormalizers();

        writeSetMatrix();
        writeMatrixMath();
        writeMatrixInverse();
        writeMatrixTranspose();
    }

    @Override
    protected void writeTest() {
        for (VectorSourcePrintStream vsps : components) {
            vsps.writeTest();
        }
    }

    private void writeMatrixTranspose() {
        for (int k = 0; k < N; k++) {
            for (int j = 0; j < N; j++) {
                if (k == j)
                    continue;
                if (start("transpose_" + k + "_" + j)) {
                    println();
                    tab();
                    println("/** transpose the matrix formed by vector " + k + " and vector " + j + " where the vectors are columns */");
                    println("public void transpose_" + k + "_" + j + "() {");
                    tab();
                    println("final double t = ", atY(k), ";");
                    println(atY(k), " = ", atX(j), ";");
                    println(atX(j), " = t;");
                    untab();
                    println("}");
                    untab();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        File self = new File("./src/main/java/io/jeffrey/vector/compiler/VectorAlgebraFactory.java");
        if (!self.exists()) {
            throw new Exception("This is a hacked tool that requires you to run local to the src dir");
        }
        HashSet<String> definedFunctions = new HashSet<String>();
        for (int r = 2; r <= 15; r++) {
            PrintStream source = new PrintStream(new File("./src/main/java/io/jeffrey/vector/VectorRegister" + hexify(r) + ".java"));
            try {
                source.println("package io.jeffrey.vector;");
                source.println("");
                source.println("public class VectorRegister" + hexify(r) + (r > 2 ? (" extends VectorRegister" + hexify(r - 1)) : "") + " {");
                if (r == 2) {
                    source.println(TAB + "protected static final double ZERO_LIMIT = " + Math.pow(0.5, 64) + ";");
                }
                new VectorAlgebraFactory(source, r, definedFunctions).writeSource();
                source.println("}");
                source.flush();
            } finally {
                source.close();
            }
            PrintStream test = new PrintStream(new File("./src/test/java/io/jeffrey/vector/GeneratedVectorRegister" + hexify(r) + "Test.java"));
            try {
                test.println("package io.jeffrey.vector;");
                test.println();
                test.println("import org.junit.Assert;");
                test.println("import org.junit.Test;");
                test.println();
                test.println("public class GeneratedVectorRegister" + hexify(r) + "Test extends CommonVectorTestingBase {");
                new VectorAlgebraFactory(test, r, definedFunctions).writeTest();
                test.println("}");
                test.flush();
            } finally {
                test.close();
            }
        }
    }
}
