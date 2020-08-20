package com.sparta;

import java.util.Arrays;

public class PalindromeSentence {

    public static String getLongestPalindrome(String sentence) throws Exception {
        if (sentence.length() == 0) {
            throw new Exception("ERROR: Sentence is completely empty.");
        }
        
        String[] wordArray = splitSentenceIntoWords(sentence);
        String[] palindromes = getPalindromes(wordArray);

        if (palindromes.length == 0) {
            return "N/A";
            // throw new Exception("ERROR: No palindromes found in this sentence.");
        }
        String longestPalindrome = getLongestPalindrome(palindromes);

        return longestPalindrome;
    }

    private static String[] splitSentenceIntoWords(String sentence) {
        return sentence.split(" ");
    }

    private static String[] getPalindromes(String[] wordArray) throws Exception {
        String[] palindromes = new String[0];

        for (String word:wordArray) {
            if (PalindromeChecker.isWordAPalindrome(word)) {
                palindromes = Arrays.copyOf(palindromes, palindromes.length + 1);
                palindromes[palindromes.length - 1] = word;
            }
        }

        return palindromes;
    }

    private static String getLongestPalindrome(String[] palindromes) {
        int longestPalindromeLength = 0;
        String longestPalindrome = "";

        for (String palindrome:palindromes) {
            longestPalindromeLength = Math.max(longestPalindromeLength, palindrome.length());
        }

        for (String palindrome:palindromes) {
            if (palindrome.length() == longestPalindromeLength) {
                if (longestPalindrome.equals("")) {
                    longestPalindrome = palindrome;
                } else {
                    longestPalindrome += ", " + palindrome;
                }
            }
        }

        return longestPalindrome;
    }
}
