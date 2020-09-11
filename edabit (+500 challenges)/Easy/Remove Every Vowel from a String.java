/*********************************************************************************************************************
 
Remove Every Vowel from a String
Create a function that takes a string and returns a new string with all vowels removed.

Examples
removeVowels("I have never seen a thin person drinking Diet Coke.")
➞ " hv nvr sn  thn prsn drnkng Dt Ck."

removeVowels("We're gonna build a wall!")
➞ "W'r gnn bld  wll!"

removeVowels("Happy Thanksgiving to all--even the haters and losers!")
➞ "Hppy Thnksgvng t ll--vn th htrs nd lsrs!"

Notes
"y" is not considered a vowel.
Expect a valid string for all test cases.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Program {
    public static String removeVowels(String s) {
      return s.replaceAll("[aAeEiIoOuU]","");
    }
}


//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static String removeVowels(String s) {
    	String vowels = "aAeEiIuUoO";
      String output = "";
      for (int i = 0; i < s.length(); i++){
      	char c = s.charAt(i);
        if (vowels.indexOf(c) < 0)
          output = output + c;
      }
      return output;
    }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static String removeVowels(String s) {
      String[] vowels = {"a","e","i","o","u"};
      for(int i = 0; i < vowels.length; i++){	
      	s = s.replace(vowels[i], "");
    }
      for(int i = 0; i < vowels.length; i++){	
        s = s.replace(vowels[i].toUpperCase(), "");
    }      

      return s;
    }
}



//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static String removeVowels(String s) {
      s = s.replace("a", "");
      s = s.replace("A", "");
      s = s.replace("e", "");
      s = s.replace("E", "");
      s = s.replace("i", "");
      s = s.replace("I", "");
      s = s.replace("o", "");
      s = s.replace("O", "");
      s = s.replace("u", "");
      s = s.replace("U", "");
      return s;
      
    }
}




//#############################################################
//#                        MY SOLUTION 5



public class Program {
    public static String removeVowels(String s) {
      String troll = "";
        for (int x = 0; x < s.length(); x++) {
          char c = s.charAt(x);
         if (Character.isLetter(c)) {
          if (Character.isUpperCase(c)) {
              if ( c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                 troll = troll + c; 
              }
          } else if (Character.isLowerCase(c)) {
              if ( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                  troll = troll + c;
              }
          }
         } else {
             troll = troll + c;
         }
        }
      return troll;
      }    
  }




  
//#############################################################
//#                        MY SOLUTION 6



  public class Program {
	public static String removeVowels(String s) {
		String finalString = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!= 'a' && s.charAt(i)!= 'A' &&
				s.charAt(i)!= 'i' && s.charAt(i)!= 'I' &&
				s.charAt(i)!= 'u' && s.charAt(i)!= 'U' &&				
				s.charAt(i)!= 'e' && s.charAt(i)!= 'E' &&					
				s.charAt(i)!= 'o' && s.charAt(i)!= 'O')
			{
				finalString+=s.charAt(i);
			}
		}
		return finalString;
	}
}