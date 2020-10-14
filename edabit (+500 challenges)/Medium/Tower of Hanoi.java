/*********************************************************************************************************************
 
Tower of Hanoi
There are three towers. The objective of the game is to move all the disks over to tower #3, but you can't place a larger disk onto a smaller disk. To play the game or learn more about the Tower of Hanoi, check the Resources tab.

Tower of Hanoi

Create a function that takes a number discs as an argument and returns the minimum amount of steps needed to complete the game.

Examples
towerHanoi(3) ➞ 7

towerHanoi(5) ➞ 31

towerHanoi(0) ➞ 0

Notes
The amount of discs is always a positive integer.
1 disc can be changed per move.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static int towerHanoi(int discs) {
		int n = 7;
		if(discs <= 2){
			return discs;
		}
		for(int i =3 ; i < discs; i++){
			n = n*2 + 1;
		}
		return n;
  }
}

