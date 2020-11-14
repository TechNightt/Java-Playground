/*********************************************************************************************************************
 Basic Arithmetic Operations

Write a function that does the following for the given values: add, subtract, divide and multiply . This is simply referred to as the basic arithmetic operations. The variables have to be defined, but in this challenge, it will be defined for you. All you have to do, is to check the variables, do some string to integer conversion, use some if conditions, and apply the arithmetic operation.

Examples
operation("1",  "2",  "add" ) ➞ 3

operation("4",  "5",  "subtract") ➞ -1

operation("6",  "3",  "divide") ➞ 2


Notes
The numbers and operation are given as a string and should result to an integer value.
If the operation results to ArithmeticException, then return Integer.MIN_VALUE (e.g. division by zero).
Division results will be rounded down to its integral part.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class BasicOperation {
    public static int operation(String a, String b, String op) {
          int anum = Integer.parseInt(a);
          int bnum = Integer.parseInt(b);
          if (op == "add") {
              return anum + bnum;
          } else if (op == "subtract") {
              return anum - bnum;
          } else if (op == "divide" && bnum==0) {
              return Integer.MIN_VALUE;
          }else if (op == "divide" && bnum!=0) {
              return anum/bnum;
          } else if (op == "multiply") {
              return anum * bnum;
          }
          return 0;
      }
    }


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.stream.Stream;

public class BasicOperation {
  public static int operation(String... e) {
  	int a = Integer.parseInt(e[0]), b = Integer.parseInt(e[1]);
    return (e[2] + e[1]).equals("divide0") ? Integer.MIN_VALUE :
    	e[2].equals("add") ? a+b : e[2].equals("subtract") ? a-b :
    	e[2].equals("multiply") ? a * b : a / b; 
  }
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class BasicOperation {
    public static int operation(String a, String b, String o) {
          int x=Integer.parseInt(a);
          int y=Integer.parseInt(b);
          return o.equals("add") ? x+y :
              o.equals("subtract") ? x-y :
              o.equals("multiply") ? x*y :
              y==0 ? Integer.MIN_VALUE : x/y;
    }
  }


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class BasicOperation {
    public static int operation(String a, String b, String op) {
          int a1 = Integer.valueOf(a);
          int b1 = Integer.valueOf(b);
          if(op.equals("add")) return a1 + b1;
          else if(op.equals("subtract")) return a1 - b1;
          else if(op.equals("multiply")) return a1 * b1;
          else if(op.equals("divide") && b1 == 0) return Integer.MIN_VALUE;
          else return a1 / b1;
    }
  }