

/*********************************************************************************************************************
 Snail Goes up the Stairs
A snail goes up the stairs. Every step, he must go up (distance = height of step), then go to the next step (distance = length of step). He wants to reach the top of the tower (tower height = tower).

Write a function that returns the distance the snail must travel to the top of the tower.

Examples
TotalDistance(0.2, 0.4, 100.0) ➞ 300.0
// Total distance is 300.

TotalDistance(0.3, 0.2, 25.0) ➞ 25.0

TotalDistance(0.1, 0.1, 6.0) ➞ 12
Notes
All given values are greater than 0.
Tolerance of returned value is 0.1.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
    public static double TotalDistance(double height, double length, double tower) {
          return (tower / height)*(height + length);
    }
  }




  