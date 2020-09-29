/*********************************************************************************************************************
 Split a String Based on Vowels and Consonants
Write a function that takes a string, breaks it up and returns it with vowels first, consonants second. For any character that's not a vowel (like special characters or spaces), treat them like consonants.

Examples
split("abcde") ➞ "aebcd"

split("Hello!") ➞ "eoHll!"

split("What's the time?") ➞ "aeieWht's th tm?"

Notes
Vowels are a, e, i, o, u.
Define a separate isVowel() function for easier to read code (recommendation).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String split(String str) {
		String str1 = str.replaceAll("(?i)[^aeiou]", "");
		String str2 = str.replaceAll("(?i)[aeiou]", "");
		return str1 + str2;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static String split(String str) {
				String vowels = "";
        String consonants = "";

        vowels = vowels.concat(str.replaceAll("a|A|e|E|i|I|o|O|u|U",""));
        consonants = consonants.concat(str.replaceAll("[^a|A|e|E|i|I|o|O|u|U]",""));
        return  consonants.concat(vowels);
	}
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static boolean isVowel(String s) {
		String c = s.toLowerCase();
		if (c.equals("a")
			 || c.equals("e")
			 || c.equals("i")
			 || c.equals("o")
			 || c.equals("u")) {
			return true;
		}
		return false;
	}
	
	public static String split(String str) {
		String vowels = "";
		String consonants = "";
		
		for (int i = 0; i < str.length(); i++) {
			String letter = str.substring(i,i+1);
			if (isVowel(letter)) {
				vowels+=letter;
			} else {
				consonants+=letter;
			}
		}
		
		return vowels+consonants;
	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	public static String split(String str) {
		String newString = "";
		// split string into array
		char[] chars = str.toCharArray(); 
		// check if each char is a vowel, if so add to newString
		for (char c : chars) {
			if (isVowel(c)) {
				newString += c;
			} 
		}
		for (char c: chars) {
			if (!isVowel(c)){
				newString += c;
			}
		}
		// convert array back to string and return new string
		return newString;
	}
	
	public static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else  {
			return false;
		}	
	}
}





//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
	public static String split(String str) {
		String[] strings = str.split("");
		StringBuilder vowels =  new StringBuilder();
		StringBuilder consonants =  new StringBuilder();
		for(String i : strings) {
			switch(i){
				case "a":
				case "e":
				case "i":
				case "u":
				case "o":
					vowels.append(i);
					break;
				default : 
					consonants.append(i);
					break;
			}
		}
		return vowels.toString() + consonants.toString();
	}
}





//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
    public static String split(String str) {
      StringBuilder vowel = new StringBuilder();
      StringBuilder consonants = new StringBuilder();
  ​
      for (int i = 0; i < str.length(); i++) {
  ​
        char c = str.charAt(i);
  ​
        if (isVowel(c)) {
          vowel.append(c);
        }
        else {
          consonants.append(c);
        }
  ​
      }
  ​
      vowel.append(consonants);
      return vowel.toString();
    }
    private static boolean isVowel(char c) {
      switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          return true;
        default:
          return false;
      }
    }
  }