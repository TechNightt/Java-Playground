package com.code_wars.kyu8.grasshopper__grade_book.solution1;

/**
 * Grade book
 * Complete the function so that it finds the mean of the three scores passed to it and returns the letter value associated with that grade.<br><br>
 * Numerical Score	Letter Grade<br>
 * 90 <= score <= 100	'A'<br>
 * 80 <= score < 90	'B'<br>
 * 70 <= score < 80	'C'<br>
 * 60 <= score < 70	'D'<br>
 * 0 <= score < 60	'F'<br><br>
 * Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.
**/



 //#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





public class GrassHopper {
	
	// *********************************************************************************************
	// * This method returns the grate that is counted by numbers that are received by the method. *
    // ********************************************************************************************* 
    public static char getGrade(int s1, int s2, int s3) {
      int avg = (s1 + s2 + s3) / 3;
      if(90 <= avg && avg <= 100)  return 'A';
      if(80 <= avg && avg < 90)  return 'B';
      if(70 <= avg && avg < 80)  return 'C';
      if(60 <= avg && avg < 70)  return 'D';
      return 'F';
    }
    
}