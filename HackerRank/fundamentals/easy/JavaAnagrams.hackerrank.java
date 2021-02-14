// Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

// Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

// Input Format
// The first line contains a string denoting a.
// The second line contains a string denoting b.

// Output Format
// Print "Anagrams" if q and b are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

// Sample Input 0
// anagram
// margana

// Sample Output 0
// Anagrams

// Sample Input 1
// anagramm
// marganaa

// Sample Output 1
// Not Anagrams

// Sample Input 2
// Hello
// hello

// Sample Output 2
// Anagrams

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        // Complete the function
        a = a.toLowerCase(); b = b.toLowerCase();


        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {

            String letter = a.substring(i,i + 1);
            int aletterCount = 0;
            int bletterCount = 0;
            
            // count letter in a
            for (int j = 0; j < a.length(); j++) {
                if (a.substring(j,j + 1).equals(letter)) aletterCount += 1;
            }

            // count letter in b
            for (int k = 0; k < a.length(); k++) {
                if (b.substring(k,k + 1).equals(letter)) bletterCount += 1;
            }

            if (aletterCount != bletterCount) return false;
        }
        
        return true;

    }