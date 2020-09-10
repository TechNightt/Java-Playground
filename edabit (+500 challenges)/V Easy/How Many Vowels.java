/*********************************************************************************************************************
 
How Many Vowels?
Create a function that takes a string and returns the number (count) of vowels contained within it.

Examples
countVowels("Celebration") ➞ 5

countVowels("Palm") ➞ 1

countVowels("Prediction") ➞ 4

Notes
a, e, i, o, u are considered vowels (not y).
All test cases are one word and only contain letters.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Vowels {
    public static int getCount(String str) {
      int vowelsCount = 0;
      str.toLowerCase();
      
      for (int i=0; i<str.length();i++)
      {
        switch(str.charAt(i))
        {
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            
          vowelsCount++;
          break;
        }      
      }  
      return vowelsCount;
    }
  }





//#############################################################
//#                        MY SOLUTION 2   


public class Vowels {
    public static int getCount(String str) {
      int vowelsCount = 0;
     
      for (int i = 0; i < str.length(); i++) {
              if ("aeiouAEIOU".contains(String.valueOf(str.charAt(i)))) {
                  vowelsCount++;
              }
          }
      return vowelsCount;
    }
  }






//#############################################################
//#                        MY SOLUTION 3   


public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
       

        for (char ch : str.toCharArray()) {
            if (ch == 'a'
                    || ch == 'e'
                    || ch == 'i'
                    || ch == 'o'
                    || ch == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}






//#############################################################
//#                        MY SOLUTION 4


import java.util.*;

public class Vowels {
  public static int getCount(String str) {
    int vowelsCount = 0;
   
    char[] vowels = {'a','e','i','o','u'};
    for(char letter: str.toCharArray()){
			for(char vowel: vowels){
        if(letter == vowel){
          vowelsCount++;
          break;
        }
      }
    }
    return vowelsCount;
  }
}




//#############################################################
//#                        MY SOLUTION 5



public class Vowels {
    public static int getCount(String str) {
      int vowelsCount = 0;
     
              str = str.toLowerCase();
          
          for(int i = 0; i <= str.length()-1; i++){
              char charStr = str.charAt(i);
  
              if (charStr == 'a'){
                  vowelsCount++;}
              else if (charStr == 'e'){
                  vowelsCount++;}
              else if (charStr == 'i'){
                  vowelsCount++;}
              else if (charStr == 'o'){
                  vowelsCount++;}
              else if (charStr == 'u'){
                  vowelsCount++;}
          }
      
      return vowelsCount;
    }
  }


//#############################################################
//#                        MY SOLUTION 6


  public class Vowels {
    public static int getCount(String str) {
      int vowelsCount = 0;
     
      for(int i = 0; i < str.length(); i++){
        char c = str.charAt(i);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
          vowelsCount++;
        }
      }
      
      return vowelsCount;
    }
  }