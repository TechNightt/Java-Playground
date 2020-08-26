package com.code_wars.kyu8.filtering_even_numbers_bug_fixes.solution1;

/**
      Kata's Name 
 * Filtering even numbers (Bug Fixes)<br><br>
 * Fix the bug in Filtering method<br><br>
 * The method is supposed to remove even numbers from the list and return a list that contains odd number.<br><br>
 * However, there is a bug in the method that needs to be resolved.
**/

import java.util.List;

public class Kata13December {
	
	// *************************************************************
	// * This method is used to filter odd number out of the List. *
	// *************************************************************
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i);
                --i;
            }
        }
        return listOfNumbers;
    }
    
}