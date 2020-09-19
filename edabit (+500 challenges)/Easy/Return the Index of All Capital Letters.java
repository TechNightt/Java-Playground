/*********************************************************************************************************************
 Return the Index of All Capital Letters

Create a method that takes a single string as argument and returns an ordered array containing the indices of all capital letters in the string.

Examples
indexOfCaps("eDaBiT") ➞ [1, 3, 5]

indexOfCaps("eQuINoX") ➞ [1, 3, 4, 6]

indexOfCaps("determine") ➞ []

indexOfCaps("STRIKE") ➞ [0, 1, 2, 3, 4, 5]

indexOfCaps("sUn") ➞ [1]

Notes
Return an empty array if no uppercase letters are found in the string.
Special characters ($#@%) and numbers will be included in some test cases.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;
public class Program {
	public static int[] indexOfCaps(String s) {
		return IntStream.range(0, s.length())
			.filter(i -> Character.isUpperCase(s.charAt(i)))
			.toArray();
	}
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.ArrayList;

public class Program {
    public static int[] indexOfCaps(String s) {
      String[] letters = s.split("");
      ArrayList<Integer> indexes = new ArrayList<>();
      
      for(int i=0; i<letters.length; i++) {
        String letter = letters[i];
        if( ! letter.equals( letter.toLowerCase() ) )
          indexes.add( i );
      }
      
      int[] solution = new int[indexes.size()];
      for(int i=0; i<indexes.size(); i++)
        solution[i] = indexes.get(i);
      
      return solution;
    }
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static int[] indexOfCaps(String s) {
      List<Integer> ls = new ArrayList<>(s.length());
      for (int i = 0; i < s.length(); i++) {
          char c = s.charAt(i);
          if (Character.isUpperCase(c)) {
              ls.add(i);
          }
      }
      return ls.stream().mapToInt(i -> i.intValue()).toArray();
    }
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.stream.IntStream;

public class Program {
    public static int[] indexOfCaps(String s) {
        String[] sa = s.split("(?<=.)");
        return IntStream.range(0, sa.length).filter(i -> sa[i].charAt(0) >= 65 && sa[i].charAt(0) <= 91).toArray();
    }
}