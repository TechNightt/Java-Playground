/*********************************************************************************************************************
 Unique Character Mapping

Write a function that returns a character mapping from a word.

Examples
characterMapping("abcd") ➞ [0, 1, 2, 3]

characterMapping("abb") ➞ [0, 1, 1]

characterMapping("babbcb") ➞ [0, 1, 0, 0, 2, 0]

characterMapping("hmmmmm") ➞ [0, 1, 1, 1, 1, 1]


Notes
Start your counter at 0, and increment by 1 each time you encounter a new character.
Identical characters should share the same number.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



import java.util.Map;
import java.util.HashMap;
public class Challenge {
	public static int[] characterMapping(String str) {
		if(str.equals("")) return new int[]{};
		char[] cs = str.toLowerCase().toCharArray();
		int[] diff = new int[cs.length];
		int count = 1;
		int index = 0;
		Map<Character, Integer> f = new HashMap<Character, Integer>();
		f.put(cs[0], 0);
		for(char c : cs) {
			if(f.keySet().contains(c))
				diff[index++] = f.get(c);
			else {
				f.put(c, count++);
				diff[index++] = f.get(c);
			}
		}
		return diff;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;
public class Challenge {
	public static int[] characterMapping(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
    int value = 0;
    for (int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.get(str.charAt(i)) == null ? value++ : map.get(str.charAt(i)));
    }

    int[] mappingNum = new int[str.length()];
    for (int i = 0; i < str.length(); i++) {
      mappingNum[i] = map.get(str.charAt(i));
    }
    return mappingNum;
	}
}


//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;
public class Challenge {
public static int[] characterMapping(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int                         idx = 0;
		
		for(int i = 0; i < str.length(); i++){
			char temp  = str.charAt(i);
			if(!map.containsKey(temp))
			{
				map.put(temp, idx);
				idx++;
			}		
		}
		
		int[] arr = new int[str.length()];
		for(int i = 0; i < str.length(); i++){
			char temp  = str.charAt(i);
			arr[i] = map.get(temp);
		}

		
		return arr;
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static int[] characterMapping(String str) {
       int[] mappedArr = new int[str.length()];
       String chars = new String();
       for (int i = 0; i < str.length(); i++){
           if (chars.indexOf(str.charAt(i)) == -1){
               chars += str.charAt(i);
           }
           mappedArr[i] = chars.indexOf(str.charAt(i));
       }
       return mappedArr;
   }
}