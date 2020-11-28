/*********************************************************************************************************************
 Fridge Poetry

Write a function that returns true if it's possible to build a phrase s1 using only the characters from another phrase s2.

Examples
canBuild("got 2 go", "gogogo 2 today") ➞ true

canBuild("sit on top", "its a moo point") ➞ true

canBuild("long high add or", "highway road go long") ➞ false

canBuild("fill tuck mid", "truck falls dim") ➞ false


Notes
All letters will be in lower case.
Numbers and special characters included.
Ignore whitespaces.
Do not count white space as a character.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


import java.util.*;
public class Challenge {
  public static boolean canBuild(String s1, String s2) {
				s2 = s2.replaceAll("\\s", "");
        s1 = s1.replaceAll("\\s", "");

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (!map.containsKey(ch))
                map.put(ch, 1);
            else
                map.put(ch, map.get(ch) + 1);
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!map.containsKey(ch))
                return false;
            for (Map.Entry m : map.entrySet())
                if (m.getKey().equals(ch))
                    map.put(ch, map.get(ch) - 1);
                if (map.containsValue(-1))
                    return false;
        }
        return true;
  }
}



//#############################################################
//#                        MY SOLUTION 2   



import java.util.HashMap;
public class Challenge {
  public static boolean canBuild(String s1, String s2) {
		//canBuild("long high add or", "highway road go long") ➞ false
		char[] s1arr = s1.replaceAll("\\s", "").replaceAll("[^a-zA-Z]", "").toCharArray();
		char[] s2arr = s2.replaceAll("\\s", "").replaceAll("[^a-zA-Z]", "").toCharArray();
		HashMap<Character, Integer> map1 = new HashMap<>();
		for (char c: s1arr) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (char c: s2arr) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		for (Character c: map1.keySet()) {
			if (!map2.containsKey(c)) {
				return false;
			} else if (map1.get(c) > map2.get(c)) {
				return false;
			}
		}
		return true;
  }
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean canBuild(String s1, String s2) {
          StringBuilder sb = new StringBuilder(s2);
          String a = s1.replaceAll(" ", "");
          int check= 0;
          for(int i = 0; i < a.length(); ++i)
              for(int x = 0; x < sb.length(); ++x)
                  if(a.charAt(i) == sb.charAt(x)) {
                      sb.deleteCharAt(x);
                      x = sb.length();
                      check++;
                  }
          return check == a.length();
    }
  }



//#############################################################
//#                        MY SOLUTION 4


import java.util.List;
import java.util.stream.Collectors;

public class Challenge {
    public static boolean canBuild(String s1, String s2) {
        List<Character> characters1 = s1.chars().mapToObj(c -> (char) c).filter(c -> !Character.isSpaceChar(c)).collect(Collectors.toList());
        List<Character> characters2 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        for (Character character : characters1) {
            if (characters2.contains(character)) {
                characters2.remove(character);
            } else {
                return false;
            }
        }
        return true;
    }
}