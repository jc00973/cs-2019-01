package jpeg.src.test.java.com.github.jc00973.cs.aula8.domain;

import jpeg.src.main.java.com.github.jc00973.cs.aula8.domain.VerificadorJpegUtils;

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
        assertEquals("ok",
                VerificadorJpegUtils.ehJpeg(getFilename("minion.jpeg")));

    }
}