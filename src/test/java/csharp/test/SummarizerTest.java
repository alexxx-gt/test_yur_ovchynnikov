package csharp.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SummarizerTest {

    @Test
    public void shouldSumTwoNumbers() {
        final int a = 123;
        final int b = 23456;
        final int expected = a + b;

        int result = Summarizer.sum(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void shouldSumOverheadAsJavaDo() {
        final int a = Integer.MAX_VALUE - 1;
        final int b = 2;
        final int expected = a + b;

        int result = Summarizer.sum(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void shouldSumTwoNumbersFast() {
        final int a = 123;
        final int b = 23456;
        final int expected = a + b;

        int result = Summarizer.sumFast(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void shouldSumOverheadAsJavaDoFast() {
        final int a = 123;
        final int b = 23456;
        final int expected = a + b;

        int result = Summarizer.sumFast(a, b);

        assertEquals(expected, result);
    }
}