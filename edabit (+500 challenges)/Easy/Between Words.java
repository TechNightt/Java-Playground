/*********************************************************************************************************************
 Between Words

Write a function that takes three string arguments (first, last, and word) and returns true if word is found between first and last in the dictionary, otherwise false.

Examples
isBetween("apple", "banana", "azure") ➞ true

isBetween("monk", "monument", "monkey") ➞ true

isBetween("bookend", "boolean", "boost") ➞ false

Notes
All letters will be in lowercase.
All three words will be different.
Remember that the string word is in the middle.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean isBetween(String first, String last, String word) {
           return first.compareTo(word) < 0 && last.compareTo(word) > 0;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean isBetween(String first, String last, String word) {
              int f = word.compareToIgnoreCase(first);
              int l = word.compareToIgnoreCase(last);
              if (f > 0 && l < 0) return true;
              return false;		
    }
  }




//#############################################################
//#                        MY SOLUTION 3   



import java.util.Arrays;

public class Challenge {
  public static boolean isBetween(String first, String last, String word) {
		String[] words = {first, last, word};
	
		Arrays.sort(words);
	
		if (words[1].equals(word)) {
		  	return true;
		} else {
		  	return false;
		}
  }
}





//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static boolean isBetween(String first, String last, String word) {
          String copy = word;
          String temp = "";
  
          if(first.compareTo(word) > 0) {
              temp = first;
              first = word;
              word = temp;
          }
          if(first.compareTo(last) > 0) {
              temp = first;
              first = last;
              last = temp;
          }
          if(word.compareTo(last) > 0) {
              temp = word;
              word = last;
              last = temp;
          }
          if(word.equals(copy)) {
              return true;
          }
          else{
              return false;
          }
  
    }
  }





  
//#############################################################
//#                        MY SOLUTION 5



import java.util.List;
import java.util.ArrayList;
import java.util.Comparator; 

public class Challenge {
  public static boolean isBetween(String first, String last, String word) {
		List<String> listOfStrs = new ArrayList();
		listOfStrs.add(first);
		listOfStrs.add(last);
		listOfStrs.add(word);
		listOfStrs.sort(Comparator.comparing(String::toString));
		System.out.println("listOfStrs is: " + listOfStrs);
		if(listOfStrs.get(1).contentEquals(word)) {
			return true;
		}
		return false;
  }
}