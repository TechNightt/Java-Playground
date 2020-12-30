/*********************************************************************************************************************
 Recomposing Strings

In this challenge, the goal is recomposing scrambled strings made of two or more words.

Every string has to be reversed not in its totality, but by vowels or consonants clusters in the order they are found; after splitting the string in groups, and reversing every group with more than a letter, you'll obtain the correct sequence:

String = "KiKdaola"

Separation vowels/consonants = K  i  Kd  ao  l  a

Reversing the groups = K  i  dK  oa  l  a

New string = KidKoala
Now, you have to insert a space between the words. A word starts with a capital letter:

String = "KidKoala"

Result = "Kid Koala"
Given a string, implement a function that returns, in turn, a new correct string, following the above instructions.

Examples
recompose("KiKdaola") ➞ "Kid Koala"

recompose("BaosdrOCfanada") ➞ "Boards Of Canada"
// B  ao  sdr  O  Cf  a  n  a  d  a
// B  oa  rds  O  fC  a  n  a  d  a

recompose("hCemicarBlohtesr") ➞ "Chemical Brothers"
// hC  e  m  i  c  a  rBl  o  ht  e  sr
// Ch  e  m  i  c  a  lBr  o  th  e  rs


Notes
Every given string will be valid, containing only letters and at least two words (identified by the capital letters).
Remember to reverse the clusters of letters and not the entire string.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   


import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Challenge {
	public static String recompose(String s)
  {
    List<String> allMatches = new ArrayList<>();
    Pattern p = Pattern.compile("[aeiouAEIOU]{1,}|[^aeiouAEIOU]{1,}");
    Matcher m = p.matcher(s);

    while(m.find())
    {
      StringBuilder sb = new StringBuilder(m.group());
      StringBuilder reverse = sb.reverse();
      allMatches.add(reverse.toString());
    }

    s = String.join("",allMatches);
    String recomposed = "";
    for(int i = 0; i < s.length(); i++)
    {
      if(s.substring(i,i+1).matches("[A-Z]"))
      {
        recomposed += " ";
      }
      recomposed += s.substring(i,i+1);
    }

		return recomposed.trim();
	}
}








//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;
import java.util.stream.Collectors;
public class Challenge {
	public static String recompose(String str) {
    return Arrays.stream(str.split("(?i)((?<=[aeiou])(?=[^aeiou])|(?<=[^aeiou])(?=[aeiou]))"))
			.map(s -> (s.length() > 1) ? new StringBuilder(s).reverse().toString() : s)
      .map(s -> s.replaceAll("([A-Z])", " $1"))
      .collect(Collectors.joining()).trim();
	}
}







//#############################################################
//#                        MY SOLUTION 3   



//package JavaJava.recomposingString;

import java.util.*;

public class Challenge {

  // public static void main(String[] args) {
  //  System.out.println("INPUT  => eAdeaaittRwUo");
  //  System.out.println(recompose("eAdeaaittRwUo"));
  //  }

  public static String recompose(String str) {

    Set<Character> vowels = new HashSet<Character>();

    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');

    vowels.add('A');
    vowels.add('E');
    vowels.add('I');
    vowels.add('O');
    vowels.add('U');

    //  System.out.println(reverseGroups(str, vowels));
    StringBuilder reversed = reverseGroups(str, vowels);
    return insertSpaces(reversed);
  }

  private static StringBuilder reverseGroups(String str, Set<Character> vowels) {

    StringBuilder sb = new StringBuilder(str);

    for (int i = 0; i < sb.length(); i++) {

      int start = i;
      if (vowels.contains(sb.charAt(i))) {
        StringBuilder v = new StringBuilder();
        while (i < sb.length() && vowels.contains(sb.charAt(i))) {
          v.insert(0, sb.charAt(i));
          i++;
        }
        sb.replace(start, i, v.toString());
        i--;
      } else {
        StringBuilder c = new StringBuilder();
        while (i < sb.length() && !vowels.contains(sb.charAt(i))) {
          c.insert(0, sb.charAt(i));
          i++;
        }
        sb.replace(start, i, c.toString());
        i--;
      }
    }

    return sb;
  }

  private static String insertSpaces(StringBuilder reversed) {
    for (int i = 1; i < reversed.length(); i++) {
      int ascii = reversed.codePointAt(i);
      if (ascii > 64 && ascii < 91) {
        // System.out.println("!!!!! " + ascii);
        reversed.insert(i, " ");
        i++;
      }
    }
    return reversed.toString();
  }
}







//#############################################################
//#                        MY SOLUTION 4



import java.lang.StringBuilder;

public class Challenge {
	public static String recompose(String str) {
		
		StringBuilder str_build = new StringBuilder(str);
		
		int length = str.length();
		
		int[] isVowel = new int[length];
		
		for (int i=0; i<length; i++){
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U')
				isVowel[i] = 1;
		}
		
		for (int i= length-2; i>=0; i--){
			if (isVowel[i] != isVowel[i+1])
				str_build.insert(i+1, ' ');
		}
		
		String[] temp = str_build.toString().split(" ");
		StringBuilder result = new StringBuilder();
		
		for (int i=0; i<temp.length; i++){
			if (temp[i].length() >1)
				temp[i] = new StringBuilder(temp[i]).reverse().toString();
			result.append(temp[i]);
		}
		
		for (int i=result.length()-1; i > 0; i--){
			if (Character.isUpperCase(result.charAt(i)))
				result.insert(i, ' ');
		}
		
		return result.toString();
		
	}
}





//#############################################################
//#                        MY SOLUTION 5





public class Challenge {
	public static String recompose(String str) {
		    StringBuilder rec = new StringBuilder();
        String[] groups = str.replaceAll("[aeiouAEIOU*]", " $0 ").replace("  ", "").split(" ");
        for (String group : groups) {
            if (group.length() > 1) {
                StringBuilder reverse = new StringBuilder(group).reverse();
                rec.append(reverse);
            } else rec.append(group);
        }
        for (int i = 0; i < rec.length(); i++)
            if (Character.isUpperCase(rec.charAt(i))) {
                rec.insert(i, " ");
                i++;
            }
        return rec.toString().trim();
	}
}