package com.code_wars.kyu8.grasshopper__messi_goals_function.solution1;

/**
 * Complete the function to return his total number of goals in all three leagues.<br><br>
 * Note: the input will always be valid.<br><br>
 * For example:<br><br>
 * 5, 10, 2  -->  17

**/




 //#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




public class Goals {
	
	// **********************************************
	// * This method returns total number of goals. *
    // **********************************************
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
    
}