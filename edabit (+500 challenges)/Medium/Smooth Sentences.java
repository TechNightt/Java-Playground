/*********************************************************************************************************************
 
Smooth Sentences

Carlos is a huge fan of something he calls smooth sentences. A smooth sentence is one where the last letter of each word is identical to the first letter the following word.

The following would be a smooth sentence: "Carlos swam masterfully." Since "Carlos" ends with an "s" and swam begins with an "s" and swam ends with an "m" and masterfully begins with an "m".

Create a function that determines whether the input sentence is a smooth sentence, returning a boolean value true if it is, false if it is not.

Examples
isSmooth("Marta appreciated deep perpendicular right trapezoids") ➞ true

isSmooth("Someone is outside the doorway") ➞ false

isSmooth("She eats super righteously") ➞ true
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean isSmooth(String sentence) {
           String[] arr = sentence.split(" ");
          for (int i = 0; i < arr.length - 1; i++) {
              if (arr[i].charAt(arr[i].length() - 1) != arr[i + 1].toLowerCase().charAt(0)) return false;
          }
          return true;
    }
  }






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static boolean isSmooth(String sentence) {
          String[] str=sentence.split(" ");
          int flag=0;
          for(int i=0;i<str.length;i++)
          {
              if((i+1)<str.length)
              {
              int len=str[i].length();		
              if(str[i].charAt(len-1)==str[i+1].charAt(0)
                      || Character.toLowerCase(str[i].charAt(len-1))==str[i+1].charAt(0)
                      ||  Character.toUpperCase(str[i].charAt(len-1))==str[i+1].charAt(0))
              {
                  flag=1;
              }
              else
              {
                  flag=0;
                  break;
              }
              }
          }
          if(flag==1)
              return true;
          else
              return false;
          
    }
  }







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static boolean isSmooth(String sentence) {
          sentence = sentence.toLowerCase();
      String[] words = sentence.split(" ");
      for (int i= 1; i<words.length; i++) {
          if (!(words[i].charAt(0) == words[i-1].charAt(words[i-1].length()-1))) {
              return false;
          }
      }
      return true;
          
    }







//#############################################################
//#                        MY SOLUTION 4
//#############################################################



import java.util.stream.IntStream;
public class Challenge {
  public static boolean isSmooth(String sentence) {
		String[] strs = sentence.toLowerCase().split(" ");
		return IntStream.range(1, strs.length)
			.allMatch(i -> strs[i-1].endsWith("" + strs[i].charAt(0)));
  }
}