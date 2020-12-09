/*********************************************************************************************************************
 An Absolute

Given a sentence, create a function that replaces every occurence of the article "a" with the verb phrase "an absolute". It should return the same string without any change if it doesn't have any article "a" present.

Examples
absolute("Truly, a heart that beats for no one but for Tesh.") ➞ "Truly, an absolute heart that beats for no one but for Tesh."

absolute("A world of hers where mine evolves.") ➞ "An absolute world of hers where mine evolves."

absolute("A spread of love, not hate.") ➞ "An absolute spread of love, not hate."

absolute("Tesha is a woman of true substance and a beauty.") ➞ "Tesha is an absolute woman of true substance and an absolute beauty."

absolute("A thing of beauty is a joy forever.") ➞ "An absolute thing of beauty is an absolute joy forever."

absolute("An apple for a day keeps a doctor away.") ➞ "An apple for an absolute day keeps an absolute doctor away."


Notes
Watch out for uppercase letters as shown in examples #2, #3 & #5.
The article "a" may appear several times.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Absoluteness {
    public static String absolute(String s) {
      return s.replaceAll("(?i)\\b(a)\\b", "$1n absolute");
    }
  }




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Absoluteness {
    public static String absolute(String s) {
            return s.replaceAll("a ", "an absolute ").replaceAll("A ", "An absolute ");
    }
  }




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Absoluteness {
    public static String absolute(String g) {
          String[] s = g.split(" "); String temp = "";
      for(int i = 0; i < s.length; ++i){
        if(s[i].equals("A"))temp+="An absolute ";
        else if(s[i].equals("a"))temp+="an absolute ";
        else temp+=s[i]+" ";
      } return temp.trim();
    }
  }


