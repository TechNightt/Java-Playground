/*********************************************************************************************************************
 Check if All Values Are True

Write a function that returns true if all parameters are truthy, and false otherwise.

Examples
allTruthy("t", "te", "tes", "tesh", "tesha") ➞ true

allTruthy(true, true, true) ➞ true

allTruthy(true, false, true) ➞ false

allTruthy(5, 4, 3, 2, 1, 0) ➞ false

Notes

Falsy values include false, 0, "" (empty string), null, POSITIVE_INFINITY, NEGATIVE_INFINITY and NaN, everything else is truthy.
At least one parameter will be given.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class TruthyOrFalsy {
    public static boolean allTruthy(Object... values) {
          for(Object eachobj: values){
              if(eachobj.equals("")){
                  return false;
              }
              else if(eachobj.equals(Double.NaN) || eachobj.equals(Float.NaN)){
                  return false;
              }
              else if(eachobj.equals(Double.POSITIVE_INFINITY) || eachobj.equals(Float.POSITIVE_INFINITY)){
                  return false;
              }
              else if(eachobj.equals(Double.NEGATIVE_INFINITY)){
                      return false;
              }
              else if(eachobj.equals(0)){
                  return false;
              }
              else if(eachobj.equals(false)){
                  return false;
              }
              else if(eachobj.equals(null)){
                  return false;
              }
          }
          return true;
      }
  }


