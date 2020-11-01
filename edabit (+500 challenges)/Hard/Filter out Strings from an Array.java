/*********************************************************************************************************************
 Filter out Strings from an Array

Create a function that takes an array of non-negative integers and strings and return a new array without the strings.

Examples
filterArray([1, 2, "a", "b"]) ➞ [1, 2]

filterArray([1, "a", "b", 0, 15]) ➞ [1, 0, 15]

filterArray([1, 2, "aasf", "1", "123", 123]) ➞ [1, 2, 123]

Notes
Zero is a non-negative integer.
The given array only has integers and strings.
Numbers in the array should not repeat.
The original order must be maintained.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;

public class Program {
    public static String[] filterArray(String[] str) {
      return Arrays.stream(str)
        .distinct()
        .filter(i->i.matches("-?\\d+"))
        .toArray(String[]::new);
    }
}







//#############################################################
//#                        MY SOLUTION 2   


import java.util.ArrayList;

public class Program {
    public static String[] filterArray(String[] str) {
      ArrayList<String> arr2 = new ArrayList<String>();
      int count = 0;
      for(int i = 0; i < str.length; i++){
        String tmp = str[i];
        try{
          Integer.parseInt(tmp);
          if(!arr2.contains(tmp)){
           	arr2.add(tmp);
            count++;
          }
        }
        catch(NumberFormatException e){
          
        }
      }
      String[] arr = new String[count];
      int j = 0;
      for(int i = 0; i < str.length; i++){
        String tmp = str[i];
        try{
          Integer.parseInt(tmp);
        }
        catch(NumberFormatException e){
        }
      }
      int size = arr2.size();
      for(int i = 0; i < size; i ++){
        arr[i] = arr2.get(i);
      }
      return arr;
      
    }
}







//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;

public class Program {
  public static String[] filterArray(String[] strs) {
    List<String> nonLetters = new ArrayList<>();
		for (String str : strs) {
      if (onlyNumbers(str) && !nonLetters.contains(str))
        nonLetters.add(str);
    }
    return nonLetters.toArray(new String[0]);
  }
  
  public static boolean onlyNumbers(String str) {
    return str.chars().allMatch(c -> c >= '0' && c <= '9');
  }
}





//#############################################################
//#                        MY SOLUTION 4



public class Program {
    public static String[] filterArray(String[] str) {
    String numbers = "";
      int index;
      for(int i = 0; i < str.length; i++)
      {
        if(str[i] == "")
          continue;
        try
        {
          index = Integer.parseInt(str[i]);
        }
        catch(NumberFormatException e)
        {
          continue;
        }
        numbers += i + " ";

      }
      numbers = numbers.trim();
      if(numbers == "")
        return new String[0];
      String [] indexes = numbers.split(" ");
      String [] filteredArr = new String [indexes.length];
      boolean add = true;
      for(int i = 0; i < indexes.length; i++)
      {
          String s = str[Integer.parseInt(indexes[i])];
          for(int j = 0; j < i; j++)
          {
              if(filteredArr[j] == null ? s == null : filteredArr[j].equals(s))
              {
                  add = false;
                  break;
              }    
          }
          if(add)
          {
              filteredArr[i] = s;
          }
          add = true;
        
      }
      int counter = 0;
      int index3 = 0;
      while(index3 < filteredArr.length)
      {
        if(filteredArr[index3] != null)
        {
            counter++;
        }
        index3++;
      }
      String [] filteredArr2 = new String [counter];
      int index2 = 0;
      counter = 0;
      while(index2 < filteredArr.length)
      {
        if(filteredArr[index2] != null)
        {
            filteredArr2[counter] = filteredArr[index2];
            counter++;
        }
        index2++;
      }
                  
      return filteredArr2;
    }
}







//#############################################################
//#                        MY SOLUTION 5



import java.util.Arrays;

public class Program {
    public static String[] filterArray(String[] str) {
        return Arrays.stream(str).filter(s -> s.matches("^[0-9]+$")).distinct().toArray(String[]::new);
    }
}