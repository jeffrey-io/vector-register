package io.jeffrey.vector.compiler;

import io.jeffrey.vector.compiler.functions.AngleFunctions;
import io.jeffrey.vector.compiler.functions.ComplexAlgebra;
import io.jeffrey.vector.compiler.functions.Copiers;
import io.jeffrey.vector.compiler.functions.Extractors;
import io.jeffrey.vector.compiler.functions.MatrixAlgebra;
import io.jeffrey.vector.compiler.functions.Pythagorean;
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
        components.add(new ComplexAlgebra(out, N, definedFunctions));
        components.add(new Pythagorean(out, N, definedFunctions));
        components.add(new MatrixAlgebra(out, N, definedFunctions));
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

    @Override
    protected void writeSource() {

        writeFieldsAndConstructor();

        for (VectorSourcePrintStream vsps : components) {
            vsps.writeSource();
        }

    }

    @Override
    protected void writeTest() {
        for (VectorSourcePrintStream vsps : components) {
            vsps.writeTest();
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
