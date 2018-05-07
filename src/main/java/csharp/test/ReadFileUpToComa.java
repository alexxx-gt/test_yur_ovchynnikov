package csharp.test;

import java.io.*;

public class ReadFileUpToComa {
    private static int COMA_SYMBOL_CODE = 44;

    public static String readFile(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (InputStream in = new FileInputStream(fileName);
             Reader reader = new InputStreamReader(in);
             Reader buffer = new BufferedReader(reader)) {
            int r;
            while ((r = buffer.read()) != -1) {
                if (r == COMA_SYMBOL_CODE) {
                    break;
                }
                sb.append((char) r);
            }
            return sb.toString();
        }
    }

}
