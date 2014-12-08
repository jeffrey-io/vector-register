package io.jeffrey.vector.compiler;

import java.io.File;

import org.junit.Test;

public class VectorAlgebraFactoryTest {

    @Test
    public void testProduction() throws Exception {
        File root = new File("/tmp/generated-vector-register-" + System.currentTimeMillis());
        File src = new File(root, "src/main/java/io/jeffrey/vector");
        File test = new File(root, "src/test/java/io/jeffrey/vector");
        root.mkdirs();
        src.mkdirs();
        test.mkdirs();
        VectorAlgebraFactory.make(root, 4);
        destroy(root);
    }

    private void destroy(File root) {
        for (File f : root.listFiles()) {
            if (f.isDirectory()) {
                destroy(f);
            } else {
                f.delete();
            }
        }
        root.delete();
    }
}
