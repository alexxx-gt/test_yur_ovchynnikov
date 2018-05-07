package csharp.test;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class ReadFileUpToComaTest {

    @Test
    public void shouldReadNormalFile() throws Exception {
        String fileName = getAbsPath("test1");
        String expectedResult = "test 12345 qwerty try it\r\nand again";

        String result = ReadFileUpToComa.readFile(fileName);

        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReadAllFileIfNoComa() throws Exception {
        String fileName = getAbsPath("test2");
        String expectedResult = "q w e r t y\r\nq w e r t y\r\n";

        String result = ReadFileUpToComa.readFile(fileName);

        assertEquals(expectedResult, result);
    }

    @Test(expected = IOException.class)
    public void shouldThrowExceptionIfPathNotExists() throws Exception {
        String fileName = "/" + UUID.randomUUID().toString();
        ReadFileUpToComa.readFile(fileName);
    }

    private String getAbsPath(String resourcePath) throws IOException {
        File file = new File(this.getClass().getClassLoader().getResource(resourcePath).getFile());
        return file.getAbsolutePath();
    }
}