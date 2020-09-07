// Source : https://leetcode.com/problems/available-captures-for-rook/
// Author : Julian Ghoncharenko
// Date   : 08-08-2020

/*********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
 * On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares, white bishops, and black pawns.  These are given as characters 'R', '.', 'B', and 'p' respectively. Uppercase characters represent white pieces, and lowercase characters represent black pieces.                                                                              *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 * The rook moves as in the rules of Chess: it chooses one of four cardinal directions (north, east, west, and south), then moves in that direction until it chooses to stop, reaches the edge of the board, or captures an opposite colored pawn by moving to the same square it occupies.  Also, rooks cannot move into the same square as other friendly bishops. *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 * Return the number of pawns the rook can capture in one move.                                                                                                                                                                                                                                                                                                      *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 * Example 1:                                                                                                                                                                                                                                                                                                                                                        *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 * Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]                                                                          *
 * Output: 3                                                                                                                                                                                                                                                                                                                                                         *
 * Explanation:                                                                                                                                                                                                                                                                                                                                                      *
 * In this example the rook is able to capture all the pawns.                                                                                                                                                                                                                                                                                                        *
 * Example 2:                                                                                                                                                                                                                                                                                                                                                        *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 * Input: [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]                                                                          *
 * Output: 0                                                                                                                                                                                                                                                                                                                                                         *
 * Explanation:                                                                                                                                                                                                                                                                                                                                                      *
 * Bishops are blocking the rook to capture any pawn.                                                                                                                                                                                                                                                                                                                *
 * Example 3:                                                                                                                                                                                                                                                                                                                                                        *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 * Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]                                                                          *
 * Output: 3                                                                                                                                                                                                                                                                                                                                                         *
 * Explanation:                                                                                                                                                                                                                                                                                                                                                      *
 * The rook can capture the pawns at positions b5, d6 and f5.                                                                                                                                                                                                                                                                                                        *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 * Note:                                                                                                                                                                                                                                                                                                                                                             *
 *                                                                                                                                                                                                                                                                                                                                                                   *
 * board.length == board[i].length == 8                                                                                                                                                                                                                                                                                                                              *
 * board[i][j] is either 'R', '.', 'B', or 'p'                                                                                                                                                                                                                                                                                                                       *
 * There is exactly one cell with board[i][j] == 'R'                                                                                                                                                                                                                                                                                                                 *
 ********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/
package com.leet_code.easy.q999_available_captures_for_rook.solution1;

/*********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                                                                                                                                                                                                                                                                       *
 * Thoughts on implementation:                                                                                                                                                                                                                                                                                                                                       *
 * Firstly I find the rook inside the matrix.                                                                                                                                                                                                                                                                                                                        *
 * Then I go through rook's rows and columns and check for pawns and bishops.                                                                                                                                                                                                                                                                                        *
 * This solution is faster than 100.00%                                                                                                                                                                                                                                                                                                                              *
 * Time complexity is O(n)                                                                                                                                                                                                                                                                                                                                         *
 * ******************************************************************************************************************************************************************************************************************************************************************************************************************************************************************/
class Solution {
	
    public static int numRookCaptures(char[][] board) {
        int count = 0;
        int[] rookInd = findRook(board);
        int i = rookInd[0], j = rookInd[0], k = rookInd[1], l = rookInd[1], len = board.length;
        
        char cur;
        while(i < len || j >= 0 || k < len || l >= 0) {
        	
        	if(i < len) {
        		cur = board[i][rookInd[1]];
        		if(cur == 'B') {
        			i = len;
        		} else if(cur == 'p') {
        			++count;
        			i = len;
        		}
        		++i;
        	}
        	
        	if(j >= 0) {
        		cur = board[j][rookInd[1]];
        		if(cur == 'B') {
        			j = 0;
        		} else if(cur == 'p') {
        			++count;
        			j = 0;
        		}
        		--j;
        	}
        	
        	if(k < len) {
        		cur = board[rookInd[0]][k];
        		if(cur == 'B') {
        			k = len;
        		} else if(cur == 'p') {
        			++count;
        			k = len;
        		}
        		++k;
        	}
        	
        	if(l >= 0) {
        		cur = board[rookInd[0]][l];
        		if(cur == 'B') {
        			l = 0;
        		} else if(cur == 'p') {
        			++count;
        			l = 0;
        		}
        		--l;
        	}
        	
        }
        
        
        return count;
    }
    
    private static int[] findRook(char[][] board) {
        for(int i = 0; i < board.length; ++i) 
            for(int j = 0; j < board[i].length; ++j) 
                if(board[i][j] == 'R')
                    return new int[]{ i, j };  
            
        return null;
    }
    
    public static void main(String[] args) {
    	char[][] board = {{'.','.','.','.','.','.','.','.'},
    			 		  {'.','.','.','p','.','.','.','.'},
    			 		  {'.','.','.','R','.','.','.','p'},
    			 		  {'.','.','.','.','.','.','.','.'},
    			 		  {'.','.','.','.','.','.','.','.'},
    			 		  {'.','.','.','p','.','.','.','.'},
    			 		  {'.','.','.','.','.','.','.','.'},
    			 		  {'.','.','.','.','.','.','.','.'}};
    	System.out.println(numRookCaptures(board));
    	board = new char[][] {{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
    	System.out.println(numRookCaptures(board));
    	board = new char[][] {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
    	System.out.println(numRookCaptures(board));
	}
    
}
