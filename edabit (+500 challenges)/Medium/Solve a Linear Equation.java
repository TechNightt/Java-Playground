/*********************************************************************************************************************
 Solve a Linear Equation

Create a function that returns the value of x (the "unknown" in the equation). Each equation will be formatted like this:

x + 6 = 12
Examples
solveEquation("x + 43 = 50") ➞ 7

solveEquation("x - 9 = 10") ➞ 19

solveEquation("x + 300 = 100") ➞ -200

Notes
"x" will always be in the same place (you will not find an equation like 6 + x = 12).
Every equation will include either subtraction (-) or addition (+).
"x" may be negative.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################







//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static int solveEquation(String equation) {
          equation = equation.replaceAll("[x ]", "");
          char symbol = equation.charAt(0); equation = equation.substring(1);
          String[] numbers = equation.split("=");
          int n1 = Integer.parseInt(numbers[0]);
          int n2 = Integer.parseInt(numbers[1]);
          if (symbol == '+') return n2 - n1;
          else return n2 + n1;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static int solveEquation(String equation) {
          String[] sum = equation.replaceAll("[x\\s]", "").split("=");
          sum[0] = (sum[0].startsWith("+-")) ? sum[0].substring(1) : sum[0];
  
          return Integer.parseInt(sum[1]) - Integer.parseInt(sum[0]);
    }
  }





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;
public class Challenge {
  public static int solveEquation(String equation) {
		// solveEquation("x + 43 = 50") ➞ 7
    // solveEquation("x - 9 = 10") ➞ 19
		
        List<String> list = new ArrayList<>(Arrays.asList(equation.split(" ")));
        list.remove(0);
        int a= Integer.parseInt(list.get(1));
        int b=Integer.parseInt(list.get(3));
        if (list.get(0).equals("-")){
            return  a +b;
        }
            return b - a;
        }
  }






//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
    public static int solveEquation(String e) {
          if(e.split(" ")[1].equals("+")) {
              return Integer.valueOf(e.split(" ")[4]) - Integer.valueOf(e.split(" ")[2]);
          } else {
                  return Integer.valueOf(e.split(" ")[4]) + Integer.valueOf(e.split(" ")[2]);
          }
    }
  }