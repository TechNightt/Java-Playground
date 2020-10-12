/*********************************************************************************************************************
 Reverse the Order of Words with Five Letters or More

Write a method that takes a string of one or more words as an argument and returns the same string, but with all five or more letter words reversed. Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples
reverse("Reverse") ➞ "esreveR"

reverse("This is a typical sentence.") ➞ "This is a lacipyt .ecnetnes"

reverse("The dog is big.") ➞ "The dog is big."

Notes
You can expect a valid string to be provided for each test case.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################




public class Program {
    public static String reverse(String s) {
			StringBuilder sb = new StringBuilder();
			int i = 0;
      String[] words = s.split(" ");
			for(String word : words) {
				if (word.length() >= 5) {
					sb.append(new StringBuilder(word).reverse().toString());
				}
				else {
					sb.append(word);
				}
				if (words.length > 1 && i < words.length - 1) {
					sb.append(" ");
				}
				i++;
			}
			
			return sb.toString();
    }
}








//#############################################################
//#                        MY SOLUTION 2   
//#############################################################




public class Program {
    public static String reverse(String str) {
      return java.util.Arrays.stream(str.split(" "))
														 .map(s->s.length()<=4 ? s : new StringBuilder(s).reverse().toString())
														 .collect(java.util.stream.Collectors.joining(" "));
    }
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Program {
    public static String reverse(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.length() >= 5 ? new StringBuilder(word).reverse() : word).append(" ");
        }
        return result.substring(0, result.length() - 1);
    }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Program {
    public static String reverse(String s) {
     String[] words = s.split(" ");
     String result = "";
     for(int i = 0;i<words.length;i++){
         if(words[i].length() >= 5) {
             result = result + reverseWord(words[i])+" ";
         }else{
             result = result + words[i]+" ";
         }
     }

     return result.trim();
  }

  public static String reverseWord(String s){
      char[] c = s.toCharArray();
      int i =0,j = c.length-1;
      char temp;
      while(i<j){
          temp = c[j];
          c[j] = c[i];
          c[i] = temp;
          i++;
          j--;
      }
      return String.valueOf(c);
  }

}