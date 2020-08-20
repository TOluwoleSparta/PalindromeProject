package com.sparta.client;

import com.sparta.PalindromeChecker;
import com.sparta.PalindromeSentence;

public class Client {
    private String[] names = {"Hannah", "Anna", "David", "Alexa", "Elle", "Alli", "Pip"};

    private String[] sentences = {  "A kayak was caught on my radar",
                                    "I always noticed how at noon the sun is so yellow but during the evening it's a lot redder",
                                    "This sentence contains no palindromes",
                                    //"",
                                    "I busted my rotator cuff the other day",
                                    //"   "
                                    };

    public void runProgams() throws Exception {
        boolean isPalindrome;
        String longestPalindrome;

        for (String name:names) {
            isPalindrome = PalindromeChecker.isWordAPalindrome(name);

            System.out.println(name + "\n" + isPalindrome + "\n");
        }


        for (String sentence:sentences) {
            longestPalindrome = PalindromeSentence.getLongestPalindrome(sentence);

            System.out.println(sentence + "\n" + longestPalindrome + "\n");
        }
    }
}
