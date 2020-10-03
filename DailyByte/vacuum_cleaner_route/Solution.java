// Problem : Vacuum Cleaner Route

/*****************************************************************************************************************************************************************************************************************************************************************************************
 * This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively. *
 *                                                                                                                                                                                                                                                                                       *
 * Ex: Given the following strings...                                                                                                                                                                                                                                                    *
 *                                                                                                                                                                                                                                                                                       *
 * "LR", return true                                                                                                                                                                                                                                                                     *
 * "URURD", return false                                                                                                                                                                                                                                                                 *
 * "RUULLDRD", return true                                                                                                                                                                                                                                                               *
 ****************************************************************************************************************************************************************************************************************************************************************************************/
package com.daily_byte.date_27_06_2020_vacuum_cleaner_route;

class Solution {

	static boolean checkMoves(String moves) {
		int x = 0, y = 0;
		
		for (int i = 0; i < moves.length(); ++i)
			if (moves.charAt(i) == 'R')
				++x;
			else if (moves.charAt(i) == 'U')
				++y;
			else if (moves.charAt(i) == 'L')
				--x;
			else if (moves.charAt(i) == 'D')
				--y;

		return x == 0 && y == 0;
	}

}