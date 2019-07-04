package inteiro.src.test.java.com.github.jc00973.cs.aula8.domain;

import inteiro.src.main.java.com.github.jc00973.cs.aula8.domain.ExibeQuatroBytesUtils;
import inteiro.src.main.java.com.github.jc00973.cs.aula8.application.console.Programa;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProgramaTest {

    private String getFilename(String string) {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(string).getFile());

        String absolutePath = file.getAbsolutePath();

        return absolutePath;
    }

    @Test
    public void testHex() throws IOException {
        assertEquals("45737465",
                ExibeQuatroBytesUtils.imprimirQuatroBytes(getFilename("frase.txt")));

        assertEquals("cafebabe",
                ExibeQuatroBytesUtils.imprimirQuatroBytes(getFilename("AlgoritmosVetor.class")));

        assertThrows(IllegalArgumentException.class,() ->
                ExibeQuatroBytesUtils.imprimirQuatroBytes(getFilename("vazio.txt")));

    }

    @Test
    public void testMain() throws IOException {
        String[] args = {getFilename("frase.txt")};
        Programa.main(args);
    }
}