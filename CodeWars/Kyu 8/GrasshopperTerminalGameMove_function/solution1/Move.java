package com.code_wars.kyu8.grasshopper__terminal_game_move_function.solution1;

/**
  * In this game, the hero moves from left to right. The player rolls the dice and moves the number of spaces indicated by the dice two times.<br><br>
 * Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return the new position.<br><br>
 * Example:<br>
 * move(3, 6) should equal 15
**/



 //#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Move {
	
	// ***************************************************************
	// * This method is used to return the new position of the hero. *
	// ***************************************************************		
    public static int move(int position, int roll) {
        return position + roll * 2;
    }
    
}