/*********************************************************************************************************************
 Reverse Letters, Keep Numbers in Place

Create a function that reverses letters in a string but keeps digits in their current order.

Examples
reverse("ab89c") ➞ "cb89a"

reverse("jkl5mn923o") ➞ "onm5lk923j"

reverse("123a45") ➞ "123a45"
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


import java.util.Deque;
import java.util.LinkedList;

public class Challenge {
	public static String reverse(String str) {
		Deque<Character> lettersOnly = new LinkedList<Character>();
		char[] characters = str.toCharArray();
		
		for(char ch : characters) {
			if(!Character.isDigit(ch)) {
				lettersOnly.add(ch);
			}
		}
		
		for(int i = 0; i < characters.length; i++) {
			if(!Character.isDigit(characters[i])) {
				characters[i] = lettersOnly.removeLast();
			}
		}
		
		return String.valueOf(characters);
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	
	
	public static String reverse(String str) {
    String newStr = "";
    String rstr = "";
    int counter = 0;
    String reverseStr = "";
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) < '0' || str.charAt(i) > '9') newStr += str.charAt(i);
    }
    
    //p("str = " + str);
    
    for (int i = newStr.length() - 1; i >= 0; i--) {
      rstr += newStr.charAt(i);
    }
    
    
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) < '0' || str.charAt(i) > '9') {
        reverseStr += rstr.charAt(counter);
        counter++;
      } else reverseStr += str.charAt(i);
    }
    
    return reverseStr;
  }
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.stream.Collectors;
public class Challenge {
	// Reverse Letters, Keep Numbers in Place.
    public static String reverse(String str) {
			StringBuilder reversedLettersBuilder = new StringBuilder(
					str.chars()
					.filter(Character::isAlphabetic)
					.mapToObj(codePoint -> Character.toString((char) codePoint))
					.collect(Collectors.joining(""))
			).reverse();
        
			for (int index = 0; index < str.length(); index++) {
				if (Character.isDigit(str.charAt(index))) {
					reversedLettersBuilder.insert(index, str.charAt(index));
				}
			}
			
      return reversedLettersBuilder.toString();
  }
}

