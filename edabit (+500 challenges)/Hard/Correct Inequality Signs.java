/*********************************************************************************************************************
 Correct Inequality Signs

Create a function that returns true if a given inequality expression is correct and false otherwise.

Examples
correctSigns("3 < 7 < 11") ➞ true

correctSigns("13 > 44 > 33 > 1") ➞ false

correctSigns("1 < 2 < 6 < 9 > 3") ➞ true
**********************************************************************************************************************/







//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean correctSigns(String str) {
          String[] strs = str.split("\\s");
          for (int i = 0; i < strs.length - 2; i = i + 2) {
              if (!validInequality(strs, i)) {
                  return false;
              }
          }
          return true;
    }
      
      private static boolean validInequality(String[] strs, int i) {
          return strs[i + 1].equals("<") 
              ? Integer.parseInt(strs[i]) < Integer.parseInt(strs[i + 2])
              : Integer.parseInt(strs[i]) > Integer.parseInt(strs[i + 2]);
      } 
  }






//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
  public static boolean correctSigns(String str) {
		String temp[] = str.split("[<>]");
		int count = 0;
		boolean result = true;
		for(int index = 0; index < str.length(); index++){
			if (str.charAt(index) == '<'){
				count++;
				result = result && (Integer.parseInt(temp[count-1].trim()) < Integer.parseInt(temp[count].trim()));
			}
			else if(str.charAt(index) == '>'){
				count++;
				result = result && (Integer.parseInt(temp[count-1].trim()) > Integer.parseInt(temp[count].trim()));
			}
		}
		return result;
  }
}







//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
    public static boolean correctSigns(String str) {
          boolean isValid = true;
          String noSpaces = str.replaceAll(" ", "");
          String signs = noSpaces.replaceAll("\\d+", "");
          char[] signChars = signs.toCharArray();
          String[] numbersString = noSpaces.split("(>|<)");
          int[] numbers = new int[numbersString.length];
          for(int i = 0; i < numbersString.length; i++) {
              numbers[i] = Integer.parseInt(numbersString[i]);
          }
          
          for(int j = 0; j < signChars.length; j++) {
              //only looking for > or <, return false for any ==
              if(numbers[j] == numbers[j + 1]){
                  System.out.println(numbers[j] + " = " + numbers[j + 1]);
                  isValid = false;
                  break;
              }
              if(signChars[j] == '>') {
                  if(numbers[j] < numbers[j + 1]) {
                      System.out.println(numbers[j] + " > " + numbers[j + 1]);
                      isValid = false;
                      break;
                  }
              }
              //if not >, then it must be <
              else {
                  if(numbers[j] > numbers[j + 1]) {
                      System.out.println(numbers[j] + " < " + numbers[j + 1]);
                      isValid = false;
                      break;
                  }
              } 
          }
          return isValid;
    }
  }






//#############################################################
//#                        MY SOLUTION 4



import java.util.*;

public class Challenge 
{
  public static boolean correctSigns(String s) 
	{
		String[] A = s.split(" ");
		List<Boolean> results = new ArrayList<>();
		for(int i = 0; i < A.length-2;i++)
		{
			if((!A[i].equals("<") && !A[i].equals(">")) || (!A[i+2].equals("<") && !A[i+2].equals(">")))
			{
				if(A[i+1].equals("<"))
				{
					results.add(Integer.parseInt(A[i]) < Integer.parseInt(A[i+2]));
				}
				else
				{
					results.add(Integer.parseInt(A[i]) > Integer.parseInt(A[i+2]));
				}
			}
		}
		return !results.contains(false);
	}
}