/*********************************************************************************************************************
 Return the Middle Character(s) of a String
Create a function that takes a string and returns the middle character(s). If the word's length is odd, return the middle character. If the word's length is even, return the middle two characters.

Examples
getMiddle("test") ➞ "es"

getMiddle("testing") ➞ "t"

getMiddle("middle") ➞ "dd"

getMiddle("A") ➞ "A"

Notes
All test cases contain a single word (as a string).
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


class Challenge {
    public static String getMiddle(String word) {
      int l = word.length();
          if (l%2==0){
        return word.substring(l/2-1,l/2+1);
      } else {
        return word.substring(l/2,l/2+1);
      }
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


class Challenge {
    public static String getMiddle(String word) {
          return (word.length()%2 == 0) ? word.charAt(word.length()/2-1)+""+word.charAt(word.length()/2) 
                                   : String.valueOf(word.charAt(word.length()/2));
    }
  }



//#############################################################
//#                        MY SOLUTION 3   


class Challenge {
    public static String getMiddle(String word) {
      String middlecharacters = "";
    if (word.length() != 0)
      {
        int strLength = word.length();
        System.out.println("___"+word.length());
        int middlechar = 0;
        long moduleTwo = strLength % 2 ;
        StringBuilder strObj = new StringBuilder();
    
        if(moduleTwo == 0)
          {
            middlechar = word.length()/2;
            strObj.append(word.charAt(middlechar-1));
            strObj.append(word.charAt(middlechar));
            middlecharacters = new String(strObj);
            System.out.println("middle characters of  " + word + "are " + middlecharacters);  
          }
        else
          {
            middlechar = word.length()/2;
           
            strObj.append(word.charAt(middlechar));
            middlecharacters = new String(strObj);
            System.out.println("middle characters of " + word + "is  " + middlecharacters);     
          }
      }
     return middlecharacters;
    }
    public static void main (String args[])
    {
      Challenge obj = new Challenge();
      obj.getMiddle("STRINGY");
      obj.getMiddle("ODDNUMBER");
    }
  }



//#############################################################
//#                        MY SOLUTION 4



class Challenge {
    public static String getMiddle(String word) {
      String middlecharacters = "";
    if (word.length() != 0)
      {
        int strLength = word.length();
        System.out.println("___"+word.length());
        int middlechar = 0;
        long moduleTwo = strLength % 2 ;
        StringBuilder strObj = new StringBuilder();
    
        if(moduleTwo == 0)
          {
            middlechar = word.length()/2;
            strObj.append(word.charAt(middlechar-1));
            strObj.append(word.charAt(middlechar));
            middlecharacters = new String(strObj);
            System.out.println("middle characters of  " + word + "are " + middlecharacters);  
          }
        else
          {
            middlechar = word.length()/2;
           
            strObj.append(word.charAt(middlechar));
            middlecharacters = new String(strObj);
            System.out.println("middle characters of " + word + "is  " + middlecharacters);     
          }
      }
     return middlecharacters;
    }
    public static void main (String args[])
    {
      Challenge obj = new Challenge();
      obj.getMiddle("STRINGY");
      obj.getMiddle("ODDNUMBER");
    }
  }