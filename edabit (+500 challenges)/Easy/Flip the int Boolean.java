/*********************************************************************************************************************
 Flip the int Boolean
Make a function that returns an int boolean opposite of an int boolean given (flip the int boolean).

Examples
flipIntBool(1) ➞ 0

flipIntBool(0) ➞ 1
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program{
    public static int flipIntBool(int intBool){
          return  intBool == 1 ? 0 : 1; 
    }
  }


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Program{
    public static int flipIntBool(int intBool) {
        if (intBool == 1)
        {
            intBool = 0;
        }
        else
        {
            intBool = 1;
        }
        return intBool;
    }
}

