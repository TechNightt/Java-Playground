/*********************************************************************************************************************
 Check for Anagrams
Create a function that takes two strings and returns either true or false depending on whether they're anagrams or not.

Examples
isAnagram("cristian", "Cristina") ➞ true

isAnagram("Dave Barry", "Ray Adverb") ➞ true

isAnagram("Nope", "Note") ➞ false

Notes
Should be case insensitive.
The two given strings can be of different lengths
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.ArrayList;
public class Program {
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		ArrayList<Character> list = new ArrayList<>(); 
		for (Character c : s1.toLowerCase().toCharArray()) list.add(c);
		for (Character c : s2.toLowerCase().toCharArray()) 
      if (!list.remove(c)) return false;
		return true;
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static boolean isAnagram(String s1, String s2) {
      List<Character> stringOneChars = s1.chars()
				.mapToObj(i->(char)i)
				.map(Character::toLowerCase)
				.sorted()
				.collect(Collectors.toList());
			
			List<Character> stringTwoChars = s2.chars()
				.mapToObj(i->(char)i)
				.map(Character::toLowerCase)
				.sorted()		
				.collect(Collectors.toList());
			
			return stringOneChars.equals(stringTwoChars);
    }
}



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Program {
    public static boolean isAnagram(String s1, String s2) {
			s1 = s1.replaceAll("\\s","").toUpperCase();
			s2 = s2.replaceAll("\\s","").toUpperCase();
			int counte = 0;
			for (Character c: s1.toCharArray()){
				if(s2.contains(Character.toString(c))){
					counte++;		
				}
			}
      return (s1.length()==counte && s1.length()==s2.length()) ? true:false;
    }
}








//#############################################################
//#                        MY SOLUTION 4
//#############################################################



import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Program {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() == s2.length()) {
            Set<String> s1Set = Arrays.stream(s1.toLowerCase().split("(?<=.)")).collect(Collectors.toSet());
            Set<String> s2Set = Arrays.stream(s2.toLowerCase().split("(?<=.)")).collect(Collectors.toSet());
            return s1Set.equals(s2Set);
        }
        return false;
    }
}