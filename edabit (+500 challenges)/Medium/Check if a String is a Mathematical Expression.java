/*********************************************************************************************************************
 Check if a String is a Mathematical Expression

Create a function that takes an input (e.g. "5 + 4") and returns true if it's a mathematical expression or false if not.

Examples
mathExpr("4 + 5") ➞ true

mathExpr("4*6") ➞ true

mathExpr("4*no") ➞ false

Notes
Should only work with the following operations: +, -, *, /, %
You don't need to test for floats.
int1 and int2 will only be from 0-9.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean mathExpr(String expr) {
          return expr.matches("\\d+\\s?[\\+\\*/%-]\\s?\\d+");
    }
  }







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static boolean mathExpr(String expr) {
          expr = expr.replaceAll(" ", "");
          char str1 = expr.charAt(0);
          char str2 = expr.charAt(1);
          char str3 = expr.charAt(2);
          if(Character.isDigit(str1) && Character.isDigit(str3)) {
              if(str2=='+'||str2=='-'||str2=='*' ||str2=='/'||str2=='%') {
                  return true;
              }
              else {
                  return false;
              }
          }
          else {
              return false;
          }
    }
  }







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
    public static boolean mathExpr(String expr) {
              boolean firstIsInt;
      boolean lastIsInt;
      boolean middleIsOperator;
      // trim any whitespace
      String trimmed = expr.replaceAll(" ", "");
      // is it longer than 3 characters
      if (trimmed.length() > 3) {
          return false;
      }
      // check if first character is an integer
      firstIsInt = Character.isDigit(trimmed.charAt(0));
      // check if the last character is an integer
      lastIsInt = Character.isDigit(trimmed.charAt(2));
      // check if the middle character is an operator
          char o = trimmed.charAt(1);
          middleIsOperator = o == '+' || o == '-' || o == '*' || o == '/' || o == '%';
      
      return firstIsInt && lastIsInt && middleIsOperator;
    }
  }









//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static boolean mathExpr(String expr) {
          if((expr.contains("%") || expr.contains("*") || expr.contains("+") || expr.contains("-") || expr.contains("/"))
     && (Character.isDigit(expr.charAt(0))  && Character.isDigit((expr.charAt(expr.length()-1))))){
      return true;
          }
   return false;
    }
  }




  
//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
    public static boolean mathExpr(String e) {
         for(int i=0;i<e.length();i++){
                 if(e.charAt(i)>'0'&&e.charAt(i)<'9'||e.charAt(i)==' '||e.charAt(i)=='+'||e.charAt(i)=='-'||e.charAt(i)=='*'||e.charAt(i)=='/'|| e.charAt(i)=='%'){
                     
                 }
                 else 
                     return false;
                 }
         return true;
   }
         
             
     }