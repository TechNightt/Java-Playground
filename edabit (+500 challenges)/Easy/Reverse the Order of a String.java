/*********************************************************************************************************************
 Reverse the Order of a String

Create a method that takes a string as its argument and returns the string in reversed order.

Examples
reverse("Hello World") ➞ "dlroW olleH"

reverse("The quick brown fox.") ➞ ".xof nworb kciuq ehT"

reverse("Edabit is really helpful!") ➞ "!lufpleh yllaer si tibadE"

Notes
You can expect a valid string for all test cases.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class ReverseOrder {
    public static String reverse(final String str) {
      String reverse = "";
          for(int i= str.length()-1;i>= 0; i--)
          {
              reverse = reverse + str.charAt(i);
          }
          return reverse;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class ReverseOrder {
    public static String reverse(final String str) {
    
      char[] charArray = new char[str.length()];
      int j = 0;
      int strLength = str.length() - 1;
      
      for(int i = strLength; i >= 0; i=i-1) {
        charArray[j] = str.charAt(i);
        j++;
      }
      String revStr = String.valueOf(charArray);
      return revStr;
    }
  }



//#############################################################
//#                        MY SOLUTION 3   


public class ReverseOrder {
    public static String reverse(final String str) {
      char[] in = str.toCharArray();
        int begin=0;
        int end=in.length-1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
       return new String(in);
    }
  }

