/*********************************************************************************************************************
 The Reverser!

The "Reverser" takes a string as input and returns that string in reverse order, with the opposite case.

Examples
reverse("Hello World") ➞ "DLROw OLLEh"

reverse("ReVeRsE") ➞ "eSrEvEr"

reverse("Java compiler") ➞ "RELIPMOC AVAj"

Notes
There will be no punctuation in any of the test cases.

**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static String reverse(String text) {
         String newString = "", newString2 = "";
         char[] c = text.toCharArray();
         for (int i = 0; i < c.length; i++) {
             newString += c[c.length - 1 - i];
         }
         c = newString.toCharArray();
         for (int j = 0; j < c.length; j++) {
             if (Character.isUpperCase(c[j])) {
                 newString2 += Character.toLowerCase(c[j]);
             } else {
                 newString2 += Character.toUpperCase(c[j]);
             }
         }
         return newString2;
     }
 }




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static String reverse(String text) {
      String rev = "";
          
          for (int i = text.length() - 1; i >= 0; i--) {
              String letter = text.substring(i, i+1);
              if (letter.toUpperCase().equals(letter)) rev += letter.toLowerCase();
              else rev += letter.toUpperCase();
          }
          
          return rev;
    }
  }









//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static String reverse(String text) {
      String in = new StringBuilder(text).reverse().toString();
          String out = "";
          for(char c: in.toCharArray()) {
              out += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
          }
          return out;
    }
  }







//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static String reverse(String text) {
      return text.chars()
              .map(
                  i -> Character.isUpperCase(i) ?
                      Character.toLowerCase(i) : Character.toUpperCase(i)
              )
              .collect(
                  StringBuilder::new,
                  StringBuilder::appendCodePoint,
                  StringBuilder::append
              ).reverse().toString();
    }







//#############################################################
//#                        MY SOLUTION 5



    public class Challenge {
        public static String reverse(String text) {
              // Convert text to charArray and save array size
              char[] originalTextArray = text.toCharArray();
              int arraySize = text.length();
              
              // Create empty charArray for storing reversed text
              char[] reversedTextArray = new char[arraySize];
              
              // Iterate through reversed text array
              for (int i = 0; i < arraySize; i++) {
                  // Assign values in reversed order from original text array
                  char c = originalTextArray[arraySize - 1 - i];
                  char upperC = new String(c + "").toUpperCase().toCharArray()[0];
                  reversedTextArray[i] = (c == upperC) ?
                      new String(c + "").toLowerCase().toCharArray()[0] : upperC;
              }
              String reversedText = new String(reversedTextArray);
              return reversedText;
        }
      }




      

//#############################################################
//#                        MY SOLUTION 6



      public class Challenge {
        public static String reverse(String text) {
              return text.chars()
                  .map(c -> Character.isLetter(c) ? c ^ ' ' : c)
                  .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                  .reverse()
                  .toString();
          }
      }