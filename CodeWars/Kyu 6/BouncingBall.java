package com.code_wars.kyu6.bouncing_balls.solution1;

/**
 * 
 *  = Kata's Name =<br>
 * Bouncing Balls<br><br>
 *  = Description =<br>
 * A child is playing with a ball on the nth floor of a tall building. The height of this floor, h, is known. <br><br>
 * He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66).<br><br>
 * His mother looks out of a window 1.5 meters from the ground.<br><br>
 * How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing?<br><br>
 * Three conditions must be met for a valid experiment:<br>
 * Float parameter "h" in meters must be greater than 0<br>
 * Float parameter "bounce" must be greater than 0 and less than 1<br>
 * Float parameter "window" must be less than h.<br>
 * If all three conditions above are fulfilled, return a positive integer, otherwise return -1.<br><br>
 * Note:<br>
 * The ball can only be seen if the height of the rebounding ball is strictly greater than the window parameter.<br><br>
 * Example:<br>
 * - h = 3, bounce = 0.66, window = 1.5, result is 3<br><br>
 * - h = 3, bounce = 1, window = 1.5, result is -1 <br><br>
 * (Condition 2) not fulfilled).<br>
 * @
 */
public class BouncingBall {
	
      // ************************************************************
	  // * This method counts number of bounces the ball will make. *
	  // ************************************************************
	  public static int bouncingBall(double h, double bounce, double window) {
		  	// If the information that has been passed to the function is not OK return -1.
		    if(h <= 0 || bounce <= 0 || bounce >= 1 || window >= h)
		      return -1;
		    //*****INITIALIZE VARIABLES*****
		    int c = 1;
		    //*******************************
		    // Multiply the bounce by height for first bounce.
		    h = h * bounce;
		    while(h > window) {
		      if(h > window) {
		    	// Multiply the bounce by height for each iteration.
		        h = h * bounce;
		        // Add 2 to count because the ball bounces off the ground.
		        c+=2;
		      }   
		    }
		    return c;
	  }
	  
}
