/*********************************************************************************************************************
 Parseltongue
Hermione has come up with a precise formula for determining whether or not a phrase was ssspoken by a parssseltongue (a reference from the Harry Potter universe; the language of ssserpents and those who can converse with them).

Each word in a sssentence must contain either:

Exactly two instances of the letter "s" (i.e. must be together ss), or...
Zero instances of the letter "s" by itself.
Examples
isParselTongue("Sshe ssselects to eat that apple. ") ➞ true

isParselTongue("She ssselects to eat that apple. ") ➞ false
// "She" only contains one "s".
// "ssselects" has three instances of "s" together (is not exactly two).

isParselTongue("Beatrice samples lemonade") ➞ false
// While "samples" has 2 instances of "s", they are not together.

isParselTongue("You ssseldom sssspeak sso boldly, ssso messmerizingly.") ➞ true
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;
public class Challenge {
  public static boolean isParselTongue(String sentence) {
		return Arrays.stream(sentence.toLowerCase().split(" "))
			.allMatch(s -> !s.contains("s") || s.matches(".*s{2,}.*"));
  }
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static boolean isParselTongue(String sentence) {
          String[] arr = sentence.split(" ");
          for (int i = 0; i < arr.length; i++)
              if ((arr[i].contains("s") || arr[i].contains("S"))
                      && !arr[i].contains("Ss") && !arr[i].contains("ss")) return false;
          return true;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   


import java.util.*;
import java.io.*;

public class Challenge {
  public static boolean has0Or2s(String s)
  {
    s = s+" ";
    int count = 0;
    int numS = 0;
    for(int i = 0; i < s.length()-1; i++)
    {
      if(s.substring(i,i+2).equalsIgnoreCase("ss"))
      {
        count = 1;
        break;
      }
      if(s.substring(i,i+1).equalsIgnoreCase("s"))
      {
        numS += 1;
      }
    }
    return (count == 1 && numS == 0) || (count == 0 && numS == 0);
  }

  public static boolean isParselTongue(String sentence)
  {
    List<String> lst = Arrays.asList(sentence.split(" "));

    for(int i = 0; i < lst.size(); i++)
    {
      if((has0Or2s(lst.get(i)) == false)) return false;
    }
    return true;
  }
}




//#############################################################
//#                        MY SOLUTION 4



import java.util.ArrayList;
import java.util.StringTokenizer;
public class Challenge {
  public static boolean isParselTongue(String sentence) {
		ArrayList<String> arr = new ArrayList<String>();
		StringTokenizer token = new StringTokenizer(sentence);
		int amount = 0;
		while (token.hasMoreTokens()) {
			arr.add(token.nextToken());
			amount++;
		}
		boolean [] trr = new boolean[amount];
		for (int i = 0; i < arr.size(); ++i) {
			String each = arr.get(i);
			each = each.toLowerCase();
			boolean t = false;
			for (int j = 0; j < each.length() - 1; j++) {
				if (!each.contains("s") ||(each.charAt(j) == 's' && each.charAt(j+1) =='s')) {
						t = true;
					trr[i] = true;
				}
			}
		}
		for (int i = 0; i < trr.length; i++) {
			if (trr[i] != true) return false;
		}
		return true;
		
  }
}