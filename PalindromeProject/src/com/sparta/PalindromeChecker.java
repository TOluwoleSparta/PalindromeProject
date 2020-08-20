package com.sparta;

public class PalindromeChecker {

    public static boolean isWordAPalindrome(String word) throws Exception {
        if (word.length() < 1) {
            throw new Exception("ERROR: Empty input.");
        }
        int lastCharIndex = word.length() - 1;

        word = word.toUpperCase();

        for (int i = 0; i < (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(lastCharIndex - i)) {
                return false;
            }
        }

        return true;
    }
}
