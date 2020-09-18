/*********************************************************************************************************************
 Return the Four Letter Strings

Create a function that takes an array of strings and returns the words that are exactly four letters.

Examples
isFourLetters(["Tomato", "Potato", "Pair"]) ➞ ["Pair"]

isFourLetters(["Kangaroo", "Bear", "Fox"]) ➞ ["Bear"]

isFourLetters(["Ryan", "Kieran", "Jason", "Matt"]) ➞ ["Ryan", "Matt"]

Notes
You can expect valid strings for all test cases.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

import java.util.*;
public class Program {
    public static String[] isFourLetters(String[] strs) {
        return Arrays.stream(strs).filter(s -> s.length() == 4).toArray(String[]::new);
    }
}


//#############################################################
//#                        MY SOLUTION 2   



import java.util.*;

public class Program {
    public static String[] isFourLetters(String[] s) {
      ArrayList<String> list = new ArrayList();
      
      for(String i : s){
        if(i.length() == 4){
          list.add(i);
        }
      }
      
      String[] result = list.toArray(new String[list.size()]);
      return result;
    }
}



//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static String[] isFourLetters(String[] s) {
      int count = 0;
      for(int i = 0; i < s.length; i ++){
        String tmp = s[i];
        if(tmp.length()==4){
          count++;
        }
      }
      String[] words = new String[count];
      int j = 0;
      for(int i = 0; i < s.length; i ++){
        String tmp = s[i];
        if(tmp.length()==4){
          words[j] = tmp;
          j++;
        }
      }
      return words;
    }
}


//#############################################################
//#                        MY SOLUTION 4


import java.util.stream.Stream;

public class Program {
    public static String[] isFourLetters(String[] s) {
      return Stream.of(s).filter(str -> str.length() == 4).toArray(String[]::new);
    }
}