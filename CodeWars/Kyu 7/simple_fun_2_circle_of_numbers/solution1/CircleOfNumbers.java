package com.code_wars.kyu7.simple_fun_2_circle_of_numbers.solution1;

/**
 * = Kata's Name 
 * Simple Fun #2: Circle of Numbers
 * = Description 
<br>
 * Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).<br><br>
 * Given n and firstNumber/first_number, find the number which is written in the radially opposite position to firstNumber.<br><br>
 * Example<br><br>
 * For n = 10 and firstNumber = 2, the output should be<br><br>
 * CircleOfNumbers.circleOfNumbers(n, firstNumber) == 7<br><br>
 * Input/Output<br><br>
 * [input] integer n<br><br>
 * A positive even integer.<br><br>
 * Constraints: 4 ≤ n ≤ 1000.<br><br>
 * [input] integer firstNumber/first_number<br><br>
 * Constraints: 0 ≤ firstNumber ≤ n - 1<br><br>
 * [output] an integer
 * 
**/


public class CircleOfNumbers {

	// ***********************************************************************************************************
	// * This method is used to return number which is written in the radially opposite position to firstNumber. *
	// ***********************************************************************************************************	
    public static int circleOfNumbers(int n, int firstNumber) {
        return (n / 2 + firstNumber) % n;
    }
}