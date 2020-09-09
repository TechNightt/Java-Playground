/*********************************************************************************************************************
 
Get Word Count

Create a method that takes a string and returns the word count. The string will be a sentence.

Examples
countWords("Just an example here move along") ➞ 6

countWords("This is a test") ➞ 4

countWords("What an easy task, right") ➞ 5


Notes
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Program {
    public static int countWords(String s) {
      return s.split(" ").length;
    }
}



//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static int countWords(String s) {
      String[] words = s.split(" ");
      return words.length;
    }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static int countWords(String s) {
      int count = 0;
      for (int i = 0; i < s.length(); i++)
      {
        if (s.charAt(i) == ' ')
          count++;
      }
      return count + 1;
    }
}



//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static int countWords(String s) {
      int spaces = 1;
      for (char c : s.toCharArray()){
        if (c == ' ') spaces++;
      }
      return spaces;
    }
}