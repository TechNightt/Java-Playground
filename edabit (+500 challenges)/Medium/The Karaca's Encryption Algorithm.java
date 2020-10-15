/*********************************************************************************************************************
 The Karaca's Encryption Algorithm

Make a function that encrypts a given input with these steps:

Input: "apple"

Step 1: Reverse the input: "elppa"

Step 2: Replace all vowels using the following chart:

a => 0
e => 1
i => 2
o => 2
u => 3

// "1lpp0"
Step 3: Add "aca" to the end of the word: "1lpp0aca"

Output: "1lpp0aca"

Examples
encrypt("banana") ➞ "0n0n0baca"

encrypt("karaca") ➞ "0c0r0kaca"

encrypt("burak") ➞ "k0r3baca"

encrypt("alpaca") ➞ "0c0pl0aca"

Notes
All inputs are strings, no uppercases and all output must be strings.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String encrypt(String word) {
		String[] vowels = "aeou".split("");
		for (int i = 0; i < vowels.length; i++) {
			word = word.replaceAll("[" + vowels[i] + "]", "" + i);
		}
		return new StringBuilder(word).reverse().append("aca").toString();
	}
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String encrypt(String word) {
		    word.toLowerCase();
        StringBuilder reverseInput = new StringBuilder();
        reverseInput.append(word);
        reverseInput = reverseInput.reverse();
        word = new String(reverseInput);

        char[] inputWord = word.toCharArray();
        for(int i = 0; i < inputWord.length; i++) {
           switch (inputWord[i]) {
                case 'a':
                    inputWord[i] = '0';
                    break;
                case 'e':
                    inputWord[i] = '1';
                    break;
                case 'o':
                    inputWord[i] = '2';
                    break;
                case 'u':
                    inputWord[i] = '3';
                    break;
            }
        }
        return new String((inputWord)) + "aca";
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String encrypt(String word) {
		String replacements = "aeou";
		
		// 1. reverse
		word = new StringBuilder(word).reverse().toString();
		
		// 2. replace
		for(int i = 0; i < replacements.length(); i++)
			word = word.replace(replacements.charAt(i), (char)(i + '0'));
	
		// 3. append + return
		return word + "aca";
	}
	
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String encrypt(String word) {
		char[] input = word.toCharArray();
		int inputLength = input.length;
		char[] output = new char[inputLength + 3];
		for(int i = 0; i < inputLength; i++) {
			switch(input[i]) {
				case 'a' : output[inputLength-i-1] = '0'; break;
				case 'e' : output[inputLength-i-1] = '1'; break;
				case 'o' : output[inputLength-i-1] = '2'; break;
				case 'u' : output[inputLength-i-1] = '3'; break;
				default: output[inputLength-i-1] = input[i];
			}
		}
		
		output[inputLength] = 'a';
		output[inputLength + 1] = 'c';
		output[inputLength + 2] = 'a';
		
		return new String(output);
	}
}






//#############################################################
//#                        MY SOLUTION 5
//#############################################################


import java.util.*;

public class Challenge {

	   	public static String encrypt(String word) {

        StringBuilder str = new StringBuilder(word);
        str.reverse();

        Map<Character, String> myMap = new HashMap<>();
        myMap.put('a', "0");
        myMap.put('e', "1");
        myMap.put('o', "2");
        myMap.put('u', "3");

        for (int i = 0; i < str.length(); i++) {
            if ("aeou".indexOf(str.charAt(i)) >= 0) {
                str.replace(i, i + 1, myMap.get(str.charAt(i)));
            }
        }

        str.append("aca");

        return str.toString();
	}
	
}