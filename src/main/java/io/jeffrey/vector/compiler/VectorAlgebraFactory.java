package io.jeffrey.vector.compiler;

import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;

public class VectorAlgebraFactory {

    public static void make(File root, int N) throws Exception {
        HashSet<String> definedFunctions = new HashSet<String>();
        for (int r = 2; r <= N; r++) {
            PrintStream source = new PrintStream(new File(root, "src/main/java/io/jeffrey/vector/VectorRegister" + VectorSourcePrintStream.hexify(r) + ".java"));
            try {
                new VectorRegisterFiles(source, r, definedFunctions).writeSource();
                source.flush();
            } finally {
                source.close();
            }
            PrintStream test = new PrintStream(new File(root, "src/test/java/io/jeffrey/vector/GeneratedVectorRegister" + VectorSourcePrintStream.hexify(r) + "Test.java"));
            try {
                new VectorRegisterFiles(test, r, definedFunctions).writeTest();
                test.flush();
            } finally {
                test.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        File self = new File("./src/main/java/io/jeffrey/vector/compiler/VectorAlgebraFactory.java");
        if (!self.exists()) {
            throw new Exception("This is a hacked tool that requires you to run local to the src dir");
        }
        make(new File("."), 15);
    }
}
