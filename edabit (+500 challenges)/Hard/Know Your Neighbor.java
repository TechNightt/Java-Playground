/*********************************************************************************************************************
 Know Your Neighbor

Create a function that takes a string as an argument and returns true if each letter in the string is surrounded by a plus sign. Return false otherwise.

Examples
plusSign("+f+d+c+#+f+") ➞ true

plusSign("+d+=3=+s+") ➞ true

plusSign("f++d+g+8+") ➞ false

plusSign("+s+7+fg+r+8+") ➞ false

Notes

For clarity, each letter must have a plus sign on both sides.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean plusSign(String str) {
          for (int i=0; i<str.length(); i++) {
                  char c1 = str.charAt(i);
                  try {
                          if (Character.isLetter(c1)) {
                                  char c2 = str.charAt(i+1);
                                  char c3 = str.charAt(i-1);
                                  if (c2 != '+' || c3 != '+')
                                          return false;
                          }     
                  } catch (Exception et) {return false;}
          }
          return true;		
    }
  }



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static boolean plusSign(String str) {
          return str.replaceAll("[^a-zA-Z#\\+]","").matches("(\\++([a-zA-Z]|#))+\\++$");
          
        }	
  }



//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
    public static boolean plusSign(String str) {
        if(Character.isLetter(str.charAt(0)) || Character.isLetter(str.charAt(str.length()-1)))
            return false;
        for(int i=1; i<str.length()-1; i++)
            if(Character.isLetter(str.charAt(i)) && (str.charAt(i-1) != '+' || str.charAt(i+1) != '+'))
                return false;
        return true;
    }
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static boolean plusSign(String str) {
          boolean validate = false;
          String charString = str;
          charString = charString.replace("[^a-zA-Z]", "");
          for(int i=0; i<charString.length(); i++){
              try{
                  char current = charString.charAt(i);
                  if(str.charAt(str.indexOf(current)-1) == '+' && str.charAt(str.indexOf(current)+1)== '+'){
                      validate = true;
                  }else{
                      validate = false;
                  }
              }catch(Exception | Error e){
                  //validate = false;
              }
          }
          return validate;
    }
  }



//#############################################################
//#                        MY SOLUTION 5




import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Challenge {
  public static boolean plusSign(String str) {
		int i = 0, patternMatchesCount = 0;
		Matcher matcher = Pattern.compile("(?<=\\+)[a-zA-Z](?=\\+)")
						.matcher(str);
		
		while (matcher.find(i)) {
			patternMatchesCount++;
			i = matcher.start() + 1;
		}
		
		return Long.valueOf(
			str.chars()
				.filter(Character::isLetter)
				.count()
		).intValue() == patternMatchesCount;
	}
}