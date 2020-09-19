/*********************************************************************************************************************
 
Capitalize the First Letter of Each Word

Create a method that takes a string as an argument and converts the first character of each word to uppercase. Return the newly formatted string.

Examples
makeTitle("This is a title") ➞ "This Is A Title"

makeTitle("capitalize every word") ➞ "Capitalize Every Word"

makeTitle("I Like Pizza") ➞ "I Like Pizza"

makeTitle("PIZZA PIZZA PIZZA") ➞ "PIZZA PIZZA PIZZA"

Notes
You can expect a valid string for each test case.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Program {
    public static String makeTitle(String s) {
			String[] str = s.split("\\s+");
			String res = "";
			for(String s1 : str) {
				res += s1.toUpperCase().charAt(0) + s1.substring(1)+" ";
			}
			return res.trim();
    }
}



//#############################################################
//#                        MY SOLUTION 2   

import java.lang.*;

public class Program {
    public static String makeTitle(String s) {
     	String[] words = s.split(" ");
      for(int i = 0; i < words.length; i++){
        String newWord = "";
        for (int j = 0; j < words[i].length(); j++){
          if (j == 0){
            char c = Character.toUpperCase(words[i].charAt(j));
            newWord = newWord + c;
            continue;
          }
          newWord = newWord + words[i].charAt(j);
        }
        words[i] = newWord;
      }
      String output = "";
      for(int i= 0; i < words.length; i++){
        output = output + words[i];
        if (i != words.length -1)
        	output = output + " ";
      }
      return output;
    }
}



//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static String makeTitle(String s) {
      StringBuilder sb = new StringBuilder();
      boolean capitalizeNext = true;
      for (int i = 0; i < s.length(); i++)
      {
        char c = s.charAt(i);
        sb.append(capitalizeNext ? Character.toUpperCase(c) : c);
        capitalizeNext = (c == ' ');
      }
      return sb.toString();
    }
}


//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static String makeTitle(String str) {
      return java.util.Arrays.stream(str.split(" "))
														 .map(s->s.substring(0,1).toUpperCase()+s.substring(1))
														 .collect(java.util.stream.Collectors.joining(" "));
    }
}