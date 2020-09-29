/*********************************************************************************************************************
 Count the Number of Duplicate Characters

Create a function that returns the amount of duplicate characters in a string. It will be case sensitive and spaces are included. If there are no duplicates, return 0.

Examples
duplicates("Hello World!") ➞ 3
// "o" = 2, "l" = 3.
// "o" is duplicated 1 extra time and "l" is duplicated 2 extra times.
// Hence 1 + 2 = 3

duplicates("foobar") ➞ 1

duplicates("helicopter") ➞ 1

duplicates("birthday") ➞ 0
// If there are no duplicates, return 0

Notes
Make sure to only start counting the second time a character appears.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################







//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int duplicates(String str) {
		int count = 0;
		for(int index = 0; index < str.length(); index++){
			for(int next_index = index + 1; next_index < str.length(); next_index++)
				if(str.charAt(index) == str.charAt(next_index)){
					count++;
					break;
				}
		}
		return count;
  }
}




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.stream.Collectors;
import java.util.function.Function;
public class Challenge {
	public static int duplicates(String str) {
		return str.chars()
			.mapToObj(cp -> (char)cp)
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() > 1)
			.map(e -> e.getValue() - 1)
			.mapToInt(Long::intValue)
			.sum();
  }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;
public class Challenge {
	public static int duplicates(String str) {
		int duplicateCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                int counter = map.get(ch);
                map.put(ch, ++counter);
            } else map.put(ch, 1);
        }
        for (char ch : map.keySet()) if (map.get(ch) > 1) duplicateCount += map.get(ch) - 1;
        return duplicateCount;
  }
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################



import java.util.HashMap;
public class Challenge {
	public static int duplicates(String str) {
		HashMap<Character,Integer> letters=new HashMap<Character,Integer>();
		
		for (int n=0; n<str.length(); n++) {
			char act=str.charAt(n);
			if ( letters.get(act)==null ) {
				letters.put(act,1);
			} else {
				letters.replace(act, letters.get(act)+1);
			}
		}
		
		int count=0;
		
		for (HashMap.Entry<Character,Integer> act : letters.entrySet()) {
		    count+=act.getValue()-1;
		}

		return count;
  }
}