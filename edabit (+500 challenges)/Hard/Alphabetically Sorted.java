/*********************************************************************************************************************
 Alphabetically Sorted
A word is alphabetically sorted if all of the letters in it are in consecutive alphabetical order. Some examples of alphabetically sorted words: abhors (a is before b, b is before h, h is before o, etc.), ghost, accent, hoop.

Create a function that takes in a sentence as input and returns true if there is at least one alphabetically sorted word inside that has a minimum length of 3.

Examples
isAlphabeticallySorted("Paula has a French accent.") ➞ true
// "accent" is alphabetically sorted.

isAlphabeticallySorted("The biopsy returned negative results.") ➞ true
// "biopsy" is alphabetically sorted.

isAlphabeticallySorted("She sells sea shells by the sea shore.") ➞ false
// Although "by" is alphabetically sorted, it is only 2 letters long.

Notes
Do not count words with 2 or fewer characters.
Ignore punctuation (periods, commas, etc).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
import java.util.stream.Collectors;
public class Challenge {
  public static boolean isAlphabeticallySorted(String sentence) {
		return Arrays.stream(sentence.split(" "))
			.map(s -> s.replaceAll("(?i)[^a-z]", ""))
			.filter(s -> s.length() > 2)
			.anyMatch(s -> s.equals(
				Arrays.stream(s.split(""))
				.sorted()
				.collect(Collectors.joining())));
  }
}




//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;
import java.io.*;

public class Challenge {
  public static boolean isAlphabeticallySorted(String s)
  {
    s = s.replaceAll("\\p{Punct}","").toLowerCase();
    List<String> lst = Arrays.asList(s.split(" "));

    int count = 0;
    for(String str: lst)
    {
      List<String> ss = Arrays.asList(str.split(""));
      Collections.sort(ss);
      String joined = String.join("",ss);
      if(joined.equals(str) && str.length() > 2)
      {
        count++;
      }
    }
    if(count > 0)return true;
    return false;
  }
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean isAlphabeticallySorted(String sentence) {
           //String[] split = sentence.split(" ");
          //46 for '.')
  
          //32 for ' ')
  
          //65-90
          //Matter A-Z
          String[] words = sentence.split(" ");
  
          //Gos through each string in array
          for(int i = 0; i < words.length; i++) {
              int maxValue = 0;
  
              //Each char in the array
              for (int n = 0; n < words[i].length(); n++) {
                  String word = words[i].toUpperCase();
  
                  if (word.length() < 3)
                      break;
  
                  int value = (int) word.charAt(n);
  
                  if (value >= 65 || value <= 90 || value == 46 || value == 44 || value == 33) {
                      if (value >= maxValue && value != 46 && n != word.length() - 1) {
                          maxValue = value;
                          continue;
  
                      }
  
                      if (n == word.length() - 1) {
  
                          if(value >= 65 || value <= 90){
                              if (maxValue >= value && value != 46 && value != 44 && value != 33){
  
                                  System.out.println("IFFFFF Breaking here-- MaxValue = " + maxValue + "   Value = " + value + " Word: " + word);
                                  break;
                              }
  
                          }
                          System.out.println("Word: " + word + " = True Length: " + word.length());
                          System.out.println("Word.charAt(" + n + "): " + word.charAt(n));
                          return true;
                      }
  
                      System.out.println("Breaking here-- MaxValue = " + maxValue + "   Value = " + value + " Word: " + word);
                      break;
                  } else {
                      System.out.println("Value: " + value);
                      continue;
                  }
              }
          }
  
  
          System.out.println("Hmm"    );
          return false;
    }
  }




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static boolean isAlphabeticallySorted(String sentence) {
          String[] tmp = sentence.split(" ");
          int q=0;
          int res=0;
          int l=0;
          for(int i=0;i<tmp.length;i++) {
              String a = tmp[i];
              q=0;
              l=0;
              for(int j=0;j<a.length();j++) {
                  if(a.charAt(j) <65 || a.charAt(j) >122 || (a.charAt(j) >90 && a.charAt(j) <97))
                      continue;
                  if(a.charAt(j) >=q) {
                      q=a.charAt(j);
                      if(q<=65 && q>=90)
                          q+=32;
                      res=1;
                      l++;
                  }
                  else{
                      res=0;
                      break;
                  }
              }
              if(res==1 && l>2)
                  return true;
          }
          return false;
    }
  }