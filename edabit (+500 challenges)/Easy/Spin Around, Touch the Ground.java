/*********************************************************************************************************************
 Spin Around, Touch the Ground

Given a list of directions to spin, "left" or "right", return an integer of how many full 360° rotations were made. Note that each word in the array counts as a 90° rotation in that direction.

Worked Example
spinAround(["right", "right", "right", "right", "left", "right"]) ➞ 1
# You spun right 4 times (90 * 4 = 360)
# You spun left once (360 - 90 = 270)
# But you spun right once more to make a full rotation (270 + 90 = 360)
Examples
spinAround(["left", "right", "left", "right"]) ➞ 0

spinAround(["right", "right", "right", "right", "right", "right", "right", "right"]) ➞ 2

spinAround(["left", "left", "left", "left"]) ➞ 1

Notes
Return a positive number.
All tests will only include the words "right" and "left".
*********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class NumberOfSpins {
	public static int spinAround(String[] turns) {
		int angle = 0;
		for (String turn : turns){
			if (turn.equals("left")) angle -= 90;
			if (turn.equals("right")) angle += 90;
		}
		return Math.abs(angle)/360;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.stream.Stream;

public class NumberOfSpins {
	public static int spinAround(String[] turns) {
		return Math.round(Math.abs(Stream.of(turns)
			.mapToInt(s -> s.equals("right") ? 1 : -1).sum()/4));
	}
}
