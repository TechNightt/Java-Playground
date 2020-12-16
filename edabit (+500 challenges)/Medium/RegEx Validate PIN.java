/*********************************************************************************************************************
 RegEx: Validate PIN

Create a function that will test if a string is a valid PIN or not via a regular expression.

A valid PIN has:

Exactly 4 or 6 characters.
Only numeric characters (0-9).
No whitespace.
Examples
validate("121317") ➞ true

validate("1234") ➞ true

validate("45135") ➞ false

validate("89abc1") ➞ false

validate("900876") ➞ true

validate(" 4983") ➞ false

Notes
Empty strings should return false when tested.
If you need help, look into the Resources tab.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class PersonalIdNumber {
    public static boolean validate(String p) {
          if(p.length() < 4 || p.length() > 6 || p.length() == 5){
              return false;
          }else{
          String n = "0123456789"; int c = 0;
          for(int i = 0; i < p.length(); ++i){
              for(int x = 0; x < n.length(); ++x){
                  if(p.charAt(i) == n.charAt(x)){
                      c++; break;
                  } 
              }
          }return c == p.length();
          }
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class PersonalIdNumber {
    public static boolean validate(String pin) {
      return pin.matches("^(\\d{4}|\\d{6})$");
    }
  }

