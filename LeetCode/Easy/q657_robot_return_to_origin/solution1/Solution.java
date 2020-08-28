// Source : https://leetcode.com/problems/robot-return-to-origin/
// Author : Julian Ghoncharenko
// Date   : 22-07-2020

/*****************************************************************************************************************************************************************************************************************************************************************************
 * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.                                                                                               *
 *                                                                                                                                                                                                                                                                           *
 * The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false. *
 *                                                                                                                                                                                                                                                                           *
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.                                 *
 *                                                                                                                                                                                                                                                                           *
 * Example 1:                                                                                                                                                                                                                                                                *
 *                                                                                                                                                                                                                                                                           *
 * Input: "UD"                                                                                                                                                                                                                                                               *
 * Output: true                                                                                                                                                                                                                                                              *
 * Explanation: The robot moves up once, and then down once. All moves have the same magnitude, so it ended up at the origin where it started. Therefore, we return true.                                                                                                    *
 *                                                                                                                                                                                                                                                                           *
 *                                                                                                                                                                                                                                                                           *
 * Example 2:                                                                                                                                                                                                                                                                *
 *                                                                                                                                                                                                                                                                           *
 * Input: "LL"                                                                                                                                                                                                                                                               *
 * Output: false                                                                                                                                                                                                                                                             *
 * Explanation: The robot moves left twice. It ends up two "moves" to the left of the origin. We return false because it is not at the origin at the end of its moves.                                                                                                       *
 ****************************************************************************************************************************************************************************************************************************************************************************/
package com.leet_code.easy.q657_robot_return_to_origin.solution1;

/*****************************************************************************************************************************************************************************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                                                                                                                                                                               *
 * Thoughts on implementation:                                                                                                                                                                                                                                               *
 * I iterate on all letters in moves String and count moves.                                                                                                                                                                                                                 *
 * If both all right and left moves give zero and up and down moves give zero then robot returned to it's initial place.                                                                                                                                                     *
 * This solution is faster than 42.11%                                                                                                                                                                                                                                       *
 * Time complexity is O(n)                                                                                                                                                                                                                                                   *
 * **************************************************************************************************************************************************************************************************************************************************************************/
public class Solution {
    public boolean judgeCircle(String moves) {
        int c1 = 0, c2 = 0;
        for(int i = 0; i < moves.length(); ++i) {
            char cur = moves.charAt(i);
            switch(cur) {
                case 'L': --c1;break;
                case 'R': ++c1;break;
                case 'U': --c2;break;
                case 'D': ++c2;break;
            }
        }
        return c1 == 0 && c2 == 0 ? true : false;
    }
}
