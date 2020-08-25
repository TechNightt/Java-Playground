package com.code_wars.kyu8.find_the_integral.solution1;

/**
 * Created by Julian Ghoncharenko.<br><br>
 * = Kata's Name =<br>
 * Find the Integral<br><br>
 * = Description = <br><br>
 * Create a function that finds the integral of the expression passed.<br><br>
 * In order to find the integral all you need to do is add one to the exponent (the second argument), and divide the coefficient (the first argument) by that new number.<br><br>
 * For example for 3x^2, the integral would be 1x^3: we added 1 to the exponent, and divided the coefficient by that new number).<br><br>
 * Notes:<br><br>
 * The output should be a string.<br>
 * The coefficient and exponent is always a positive integer.<br>
 * Examples<br>
 *  3, 2  -->  "1x^3"<br>
 * 12, 5  -->  "2x^6"<br>
 * 20, 1  -->  "10x^2"<br>
 * 40, 3  -->  "10x^4"<br>
 * 90, 2  -->  "30x^3"
 * @author Julian Ghoncharenko
**/
public class Kata {
	
	// **********************************************************************
	// * This method is used to find the integral of the expression passed. *
	// **********************************************************************
    public static String integrate(int coefficient, int exponent) {
        return coefficient / (exponent + 1) + "x^" + (exponent + 1);
    }
  
}