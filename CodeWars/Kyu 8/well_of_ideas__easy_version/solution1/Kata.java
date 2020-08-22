package com.code_wars.kyu8.well_of_ideas__easy_version.solution1;

/**
 * For every good kata idea there seem to be quite a few bad ones!<br><br>
 * In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.
 
**/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################






public class Kata {
	
	// ************************************************************************
	// * This method is used to return if the ideas in array are good or bad. *
	// ************************************************************************
	public static String well(String[] x) {
		int goodCounter = 0;
		for(int i = 0; i < x.length; ++i) 
			if(x[i].equals("good"))
				++goodCounter;
		return goodCounter == 0 ? "Fail!" : goodCounter <= 2 ? "Publish!" : "I smell a series!";
	}

}