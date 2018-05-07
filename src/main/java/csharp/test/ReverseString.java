package csharp.test;

public class ReverseString {

    public static String reverseString(String sourceString) {
        // can also be implemented as concatenation
        final StringBuilder result = new StringBuilder();
        for (int j = sourceString.length() - 1; j >= 0; j--) {
            result.append(sourceString.charAt(j));
        }
        return result.toString();
    }

}
