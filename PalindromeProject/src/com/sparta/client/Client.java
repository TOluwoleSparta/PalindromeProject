package com.sparta.client;

import com.sparta.PalindromeChecker;
import com.sparta.PalindromeSentence;
import com.sparta.printer.Printer;

public class Client {
    private String[] names = {"Hannah", "Anna", "David", "Alexa", "Elle", "Alli", "Pip"};

    private String[] fullNames = {"Lily Lil", "Tomas Samot", "Paco Cap", "Liam Mail", "Ian D Nai"};

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
        // names
        for (String name:names) {
            isPalindrome = PalindromeChecker.isWordAPalindrome(name);

            Printer.printQuotes(name);
            Printer.printNewLine(isPalindrome);
        }
        // full names
        for (String name:fullNames) {
            isPalindrome = PalindromeChecker.isWordAPalindrome(name);

            Printer.printQuotes(name);
            Printer.printNewLine(isPalindrome);
        }
        // sentences
        for (String sentence:sentences) {
            longestPalindrome = PalindromeSentence.getLongestPalindrome(sentence);

            Printer.printQuotes(sentence);
            Printer.printNewLine(longestPalindrome);
        }
    }
}
