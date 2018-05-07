package csharp.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void shouldReverseString() {
        final String input = "Java test";
        final String expected = "tset avaJ";

        String result = ReverseString.reverseString(input);

        assertEquals(expected, result);;
    }

    @Test
    public void shouldReverseEmptyString() {
        final String input = "";
        final String expected = "";

        String result = ReverseString.reverseString(input);

        assertEquals(expected, result);;
    }

    @Test(expected = NullPointerException.class)
    public void shouldFailOnNull() {
        final String input = null;

        ReverseString.reverseString(input);
    }
}