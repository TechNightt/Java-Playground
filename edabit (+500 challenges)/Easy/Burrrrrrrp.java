/*********************************************************************************************************************
 Burrrrrrrp

Create a function that returns the string "Burp" with the amount of "r's" determined by the input parameters of the function.

Examples
longBurp(3) ➞ "Burrrp"

longBurp(5) ➞ "Burrrrrp"

longBurp(9) ➞ "Burrrrrrrrrp"

Notes
Expect num to always be >= 1.
Remember to use a capital "B".
Don't forget to return the result.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program {
    public static String longBurp(int n) {
          String s="";
          while (s.length()<n) s+="r";
          return "Bu" + s + "p";
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program {
    public static String longBurp(int n) {
          String txt = "Bu";
          for (int i = 1; i <= n; i++) { txt += "r"; }
          txt += "p";
          return txt;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Program {
    public static String longBurp(int n) {
          StringBuilder sb=new StringBuilder("Bu");
          for(int i=0;i<n;i++){
              sb.append("r");
          }
          return sb.append("p").toString();
    }
  }


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Program {
    public static String longBurp(int n) {
          String str = "r";
          String repeated = new String(new char[n]).replace("\0", str);
          return "Bu"+repeated+"p";
          
    }
  }