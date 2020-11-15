/*********************************************************************************************************************
 Number of Stickers

Given a Rubik's Cube with a side length of n, return the number of individual stickers that are needed to cover the whole cube.

Pictures of Rubik's Cubes

The Rubik's cube of side length 1 has 6 stickers.
The Rubik's cube of side length 2 has 24 stickers.
The Rubik's cube of side length 3 has 54 stickers.
Examples
howManyStickers(1) ➞ 6

howManyStickers(2) ➞ 24

howManyStickers(3) ➞ 54


Notes
Keep in mind there are 6 faces to keep track of.
Expect only positive whole numbers.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Rubiks {
	public static int howManyStickers(int n) {
		int hi = (int) Math.pow(n, 2);
		return hi*6;
	}
}

