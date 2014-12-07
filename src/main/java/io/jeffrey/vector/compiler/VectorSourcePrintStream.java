package io.jeffrey.vector.compiler;

import java.io.PrintStream;
import java.util.HashSet;

public abstract class VectorSourcePrintStream {
    protected static final String TAB = "    ";
    private final PrintStream     output;
    protected final int           N;
    private int                   tabbing;
    private final HashSet<String> definedFunctions;

    protected static final String hexify(int X) {
        return Integer.toHexString(X).toUpperCase();
    }

    public VectorSourcePrintStream(PrintStream out, int N, HashSet<String> definedFunctions) {
        this.output = out;
        this.N = N;
        this.tabbing = 0;
        this.definedFunctions = definedFunctions;
    }

    protected boolean start(String... functionNameParts) {
        StringBuilder fn = new StringBuilder();
        for (String p : functionNameParts)
            fn.append(p);
        String functionName = fn.toString();
        if (definedFunctions.contains(functionName))
            return false;
        definedFunctions.add(functionName);
        return true;
    }

    protected void tab() {
        this.tabbing++;
    }

    protected void untab() {
        this.tabbing--;
    }

    protected void println(String... values) {
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

    protected String s(int x) {
        return Integer.toString(x);
    }

    protected String atX(int k) {
        return "x_" + k;
    }

    protected String atY(int k) {
        return "y_" + k;
    }

    protected abstract void writeSource();

    protected abstract void writeTest();

    protected boolean startTest(String name) {
        if (start(name)) {
            tab();
            println();
            println("@Test");
            println("public void test", name.toUpperCase(), "() throws Exception {");
            tab();
            return true;
        }
        return false;
    }

    protected void createNewVector(String name, int k) {
        println("final VectorRegister", hexify(k), " ", name, " = new VectorRegister", hexify(k), "();");
    }

    protected void endTest() {
        untab();
        println("}");
        untab();
    }

}
