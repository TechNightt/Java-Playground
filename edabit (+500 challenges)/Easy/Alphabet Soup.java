/*********************************************************************************************************************
 
Alphabet Soup
Create a method that takes a string and returns a string with its letters in alphabetical order.

Examples
AlphabetSoup("hello") ➞ "ehllo"

AlphabetSoup("edabit") ➞ "abdeit"

AlphabetSoup("hacker") ➞ "acehkr"

AlphabetSoup("geek") ➞ "eegk"

AlphabetSoup("javascript") ➞ "aacijprstv"

Notes
You can assume numbers and punctuation symbols won't be included in test cases. You'll only have to deal with single word, alphabetic characters.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

import java.util.Arrays;
public class Program {
    public static String AlphabetSoup(String s) {
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      return new String(chars);
    }
}


//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static String AlphabetSoup(String s) {
      char [] arr = s.toCharArray();
      for(int i = 1; i < arr.length; i++)
      {
        int j = i;
        while(j > 0)
        {
          if(arr[j] < arr[j-1])
          {
            char temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
          }
          j--;
        }
      }
      
      return String.valueOf(arr);
    }
}


//#############################################################
//#                        MY SOLUTION 3   

import java.util.*;
public class Program {
    public static String AlphabetSoup(String s) {
      ArrayList<Character> chars = new ArrayList<Character>();
      for (int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        chars.add(c);
      }
      Collections.sort(chars);
      String output = "";
      for (int i = 0; i < chars.size(); i++){
        output = output + chars.get(i);
      }
      return output;
    }
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static String AlphabetSoup(String s) {
			
			StringBuilder sb = new StringBuilder();
      List<Character> chars = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.toList());
			Collections.sort(chars);
			chars.forEach(c -> sb.append(c));
			
			return sb.toString();
			
    }
}



//#############################################################
//#                        MY SOLUTION 5

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Program {
    public static String AlphabetSoup(String s) {
        List<Character> l = new ArrayList<Character>();
        for (Character c : s.toCharArray()) {
        	l.add(c);
        }
        Collections.sort(l);
        return l.toString().replaceAll("\\[|\\]|, ", "");
    }
}