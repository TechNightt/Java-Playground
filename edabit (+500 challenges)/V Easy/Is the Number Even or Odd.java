

/*********************************************************************************************************************
 
Is the Number Even or Odd?
Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.

Examples
isEvenOrOdd(3) ➞ "odd"

isEvenOrOdd(146) ➞ "even"

isEvenOrOdd(19) ➞ "odd"
Notes
Dont forget to return the result.
Input will always be a valid integer.
Expect negative integers (whole numbers).
Tests are case sensitive (return "even" or "odd" in lowercase).

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Program {
    public static String isEvenOrOdd(int num) {
     return (num % 2 == 0) ? "even" : "odd";
    }
}




public class Program {
    public static String isEvenOrOdd(int num) {
  
			if (num % 2 == 0){
				return "even";
			}
			
			return "odd";
		}	
}





import java.util.Scanner;
public class Program {
    public static String isEvenOrOdd(int num) {
     if(num%2==0){
       return "even";
     }
      else{
        return "odd";
      }
    }
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = scan.nextInt();
    isEvenOrOdd(n);
  }
}