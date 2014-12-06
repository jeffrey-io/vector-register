package io.jeffrey.vector.compiler;

import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;

public class VectorAlgebraFactory {
    private static final String TAB = "    ";
    private final PrintStream   output;
    private final int           N;
    private int                 tabbing;

    private static final String hexify(int X) {
        return Integer.toHexString(X).toUpperCase();
    }

    private final HashSet<String> definedFunctions;

    private VectorAlgebraFactory(PrintStream out, int N, HashSet<String> definedFunctions) {
        this.output = out;
        this.N = N;
        this.tabbing = 0;
        this.definedFunctions = definedFunctions;
    }

    private boolean start(String... functionNameParts) {
        StringBuilder fn = new StringBuilder();
        for (String p : functionNameParts)
            fn.append(p);
        String functionName = fn.toString();
        if (definedFunctions.contains(functionName))
            return false;
        definedFunctions.add(functionName);
        return true;
    }

    private void tab() {
        this.tabbing++;
    }

    private void untab() {
        this.tabbing--;
    }

    private void println(String... values) {
        if (values.length == 0) {
            output.println();
            return;
        }
        for (int k = 0; k < tabbing; k++)
            output.print(TAB);
        for (String value : values) {
            output.print(value);
        }
        output.println();
    }

    private String s(int x) {
        return Integer.toString(x);
    }

    private String atX(int k) {
        return "x_" + k;
    }

    private String atY(int k) {
        return "y_" + k;
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

    /**
     * write out functions to zero out specific zeros
     */
    private void writeZeros() {
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

    private void writeExtractors() {
        for (int k = 0; k < N; k++) {
            if (start("extract", s(k))) {
                println();
                tab();
                println("/** extract the " + k + "-vector into the given output array starting at the given offset */");
                println("public void extract_", s(k), "(final double[] output, int offset) {");
                tab();
                println("output[offset + 0] = ", atX(k), ";");
                println("output[offset + 1] = ", atY(k), ";");
                untab();
                println("}");
                untab();
            }
        }
    }

    private void writeInjectors() {
        for (int k = 0; k < N; k++) {
            if (start("inject", s(k))) {
                println();
                tab();
                println("/** inject the given input starting at the given offset into the " + k + "-vector */");
                println("public void inject_", s(k), "(final double[] input, int offset) {");
                tab();
                println(atX(k), " = input[offset + 0];");
                println(atY(k), " = input[offset + 1];");
                untab();
                println("}");
                untab();
            }
        }
    }

    private void writeSetters() {
        for (int k = 0; k < N; k++) {
            if (start("set", s(k))) {
                println();
                tab();
                println("/** set the " + k + "-vector to the given (x,y) */");
                println("public void set_", s(k), "(double x, double y) {");
                tab();
                println(atX(k), " = x;");
                println(atY(k), " = y;");
                untab();
                println("}");
                untab();
            }
        }
    }

    private void writeBinaryOp(String name, String op, String how, String docName) {
        for (int k = 0; k < N; k++) {
            for (int j = 0; j < N; j++) {
                if (k == j)
                    continue;
                if (start(name, "_", s(j), "_", how, "_" + s(k))) {
                    println();
                    tab();
                    println("/** " + docName + " the " + k + " and " + j + " together and store the result to the " + k + " vector */");
                    println("public void ", name, "_", s(j), "_", how, "_" + s(k), "() {");
                    tab();
                    println(atX(k), " ", op, "= ", atX(j), ";");
                    println(atY(k), " ", op, "= ", atY(j), ";");
                    untab();
                    println("}");
                    untab();
                }
            }
        }
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
                    println("double t = ", atX(k), " * ", atX(j), " - ", atY(k), " * ", atY(j), ";");
                    println(atY(k), " = ", atX(k), " * ", atY(j), " + ", atY(k), " * ", atX(j), ";");
                    println(atX(k), " = t;");
                    untab();
                    println("}");
                    untab();
                }
            }
        }
    }

    private void writeCopies() {
        for (int k = 0; k < N; k++) {
            for (int j = 0; j < N; j++) {
                if (k == j)
                    continue;
                if (start("copy_from_", s(j), "_to_", s(k))) {
                    println();
                    tab();
                    println("/** copy the " + j + " vector into the " + k + " vector */");
                    println("public void copy_from_", s(j), "_to_", s(k), "() {");
                    tab();
                    println(atX(k), " = ", atX(j), ";");
                    println(atY(k), " = ", atY(j), ";");
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
                        println("double t = ", atX(k), " * ", atX(v), " + ", atX(j), " * ", atY(v), ";");
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
                    println("double t = ", atX(k), ";");
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

    private void writeScalarOp(String name, String op, String docName) {
        for (int k = 0; k < N; k++) {
            if (start(name, "_", s(k))) {
                println();
                tab();
                println("/** " + docName + " vector " + k + " by the given scalar */");
                println("public void ", name, "_", s(k), "_by(double s) {");
                tab();
                println(atX(k), " ", op, "= s;");
                println(atY(k), " ", op, "= s;");
                untab();
                println("}");
                untab();
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

    private void writeIsZero() {
        for (int k = 0; k < N; k++) {
            if (start("is_", s(k), "_zero")) {
                println();
                tab();
                println("/** is the " + k + "-vector the origin */");
                println("public boolean is_", s(k), "_zero() {");
                tab();
                println("double d = 0.0;");
                println("d += ", atX(k), " * ", atX(k), ";");
                println("d += ", atY(k), " * ", atY(k), ";");
                println("if (Math.abs(d) < ZERO_LIMIT)");
                tab();
                println("return true;");
                untab();
                println("return false;");
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

    private void writeAngleOf() {
        for (int k = 0; k < N; k++) {
            if (start("angle_", s(k))) {
                println();
                tab();
                println("/** return the angle (via atan2) of the ", s(k), " vector */");
                println("public double angle_", s(k), "() {");
                tab();
                println("return Math.atan2(", atY(k), ", ", atX(k), ");");
                untab();
                println("}");
                untab();
            }
        }
    }

    private void writeSetByAngle() {
        for (int k = 0; k < N; k++) {
            if (start("setByAngle", "_", s(k))) {
                println();
                tab();
                println("/** set the ", s(k), " vector to the complex number corresponding to the given angle */");
                println("public void set_", s(k), "_by_angle(double theta) {");
                tab();
                println(atX(k), " = Math.cos(theta);");
                println(atY(k), " = Math.sin(theta);");
                untab();
                println("}");
                untab();
            }
        }
    }

    private void write() {
        writeFieldsAndConstructor();
        writeSetters();
        writeBinaryOp("add", "+", "to", "add");
        writeZeros();
        writeCopies();
        writeExtractors();
        writeInjectors();
        writeBinaryOp("sub", "-", "from", "subtract");
        writeScalarOp("mult", "*", "multiply");
        writeScalarOp("div", "*", "divide");
        writeConj();
        writeComplexMultiply();
        writeLengths();
        writeNormalizers();
        writeMatrixMath();
        writeMatrixInverse();
        writeIsZero();
        writeAngleOf();
        writeSetByAngle();
    }

    public static void main(String[] args) throws Exception {
        File self = new File("./src/main/java/io/jeffrey/vector/compiler/VectorAlgebraFactory.java");
        if (!self.exists()) {
            throw new Exception("This is a hacked tool that requires you to run local to the src dir");
        }
        HashSet<String> definedFunctions = new HashSet<String>();
        for (int r = 2; r <= 15; r++) {
            File target = new File("./src/main/java/io/jeffrey/vector/VectorRegister" + hexify(r) + ".java");
            PrintStream output = new PrintStream(target);
            try {
                output.println("package io.jeffrey.vector;");
                output.println("");
                output.println("public class VectorRegister" + hexify(r) + (r > 2 ? (" extends VectorRegister" + hexify(r - 1)) : "") + " {");
                if (r == 2) {
                    output.println(TAB + "protected static final double ZERO_LIMIT = " + Math.pow(0.5, 64) + ";");
                }
                new VectorAlgebraFactory(output, r, definedFunctions).write();
                output.println("}");
                output.flush();
            } finally {
                output.close();
            }
        }
    }
}
