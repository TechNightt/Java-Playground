package com.code_wars.kyu8.pythagorean_triple.solution1;

/**
 * Given an array of 3 integers a, b and c, determine if they form a pythagorean triple.<br><br>
 * A pythagorean triple is formed when:
 * c2 = a2 + b2
 * where c is the largest value of a, b, c.
 * For example: a = 3, b = 4, c = 5 forms a pythagorean triple, because 52 = 32 + 42<br><br>
 * Return Values
 * 1 if a, b and c form a pythagorean triple
 * 0 if a, b and c do not form a pythagorean triple
 * For Python: return True or False
 **/

public class PythagoreanTriple {  
	
	// **************************************************************
	// * This method checks if array contains a pythagorean triple. *
	// **************************************************************	
	
	public int pythagoreanTriple(int[] triple) {
		return triple[2] * triple[2] == triple[1] * triple[1] + triple[0] * triple[0] ? 1 : 0;
	} 	
  
}
