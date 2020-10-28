/*********************************************************************************************************************
 Almost Palindrome

A string is an almost-palindrome if, by changing only one character, you can make it a palindrome. Create a function that returns true if a string is an almost-palindrome and false otherwise.

Examples
almostPalindrome("abcdcbg") ➞ true
// Transformed to "abcdcba" by changing "g" to "a".

almostPalindrome("abccia") ➞ true
// Transformed to "abccba" by changing "i" to "b".

almostPalindrome("abcdaaa") ➞ false
// Can't be transformed to a palindrome in exactly 1 turn.

almostPalindrome("1234312") ➞ false

Notes
Return false if the string is already a palindrome.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean almostPalindrome(String str) {
          int count = 0;
          for (int i = 0, j = str.length() - 1; i < j && count < 2; i++, j--) {
              if (str.charAt(i) != str.charAt(j)) {
                  count++;
              }
          }
          return count != 0 && count < 2;
    }
  }





//#############################################################
//#                        MY SOLUTION 2   


import java.util.HashSet;
public class Challenge {
  public static boolean almostPalindrome(String str) {
		HashSet set = new HashSet();
		for (char c : str.toCharArray()) {
				set.add(c);
		}
		int half = str.length()/2;
		int diff = Math.abs(set.size()-half);
		if (str.length()%2 != 0 && diff == 1) return false;
		return true;		
  }
}





//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
    public static boolean almostPalindrome(String str) {
          StringBuilder sb=new StringBuilder(str);
          int i,j,c=0;
          if(sb.length()%2==1)
          {
              sb.deleteCharAt(sb.length()/2);
          }
          System.out.println(sb);
          i=0;
          j=sb.length()-1;
          while(j-i>=1)
          {
              if(sb.charAt(i)!=(int)sb.charAt(j))
              {
                  c++;
              }
              i++;j--;
          }
          return(c==1?true:false);
    }
  }




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static boolean almostPalindrome(String str) {
          char[] chars = str.toCharArray();
          int amount = 0;
          for (int i = 0; i < chars.length / 2; i++) {
              if (chars[i] != chars[chars.length - i - 1]) amount++;
          }
          return amount == 1 ? true : false;
    }
  }