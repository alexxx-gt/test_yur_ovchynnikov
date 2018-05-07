package csharp.test;

import java.math.BigDecimal;

public class Summarizer {

    public static int sum(int a, int b) {
        // slow operation
        BigDecimal ab = BigDecimal.valueOf((long) a );
        BigDecimal bb = BigDecimal.valueOf((long) b );
        return ab.add(bb).intValue();
    }

    public static int sumFast(final int a, final int b) {
        int bb = b;
        int aa = a;
        while (bb != 0) {
            int swap = aa & bb;
            aa = aa ^ bb;
            bb = swap << 1;
        }
        return aa;
    }
}
