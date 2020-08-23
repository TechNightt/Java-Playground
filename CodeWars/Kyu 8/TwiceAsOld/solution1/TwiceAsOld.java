

/**
 * = Description = <br><br>
 * Your function takes two arguments:<br><br>
 * current father's age (years)<br>
 * current age of his son (years)<br><br>
 * Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).
**/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class TwiceAsOld{

	// ********************************************************************************************************************************************
	// * This method is used to return how many years ago the father was twice as old as his son (or in how many years he will be twice as old). *
	// ********************************************************************************************************************************************	
	public static int TwiceAsOld(int dadYears, int sonYears) {
	    if((double)dadYears / sonYears == 2)
	      return 0;
	    int years = 1;
	    while(years <= 100) {
	      if(((double)(dadYears + years) / (sonYears + years) == 2) ||
	         ((sonYears - years) > 0 && (double)(dadYears - years) / (sonYears - years) == 2)) 
	        return years;
	      ++years;
	    }
	    return years;
	}

}