package com.code_wars.kyu8.even_or_odd.solution1;

/**
 * 
 * = Kata's Name =<br>
 * Even or Odd<br><br>
 * = Description = <br><br>
 * Create a function (or write a script in Shell) that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 * 
**/
public class EvenOrOdd {
	
	// ************************************************************
	// * This method is used to check if a number is even or odd. *
	// ************************************************************
    
  public static String even_or_odd(int number) {
      return number % 2 == 0 ? "Even" : "Odd";
    }
    
}