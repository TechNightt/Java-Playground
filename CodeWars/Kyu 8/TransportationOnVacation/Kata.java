package com.code_wars.kyu8.transportation_on_vacation.solution1;

/**
 
 * = Kata's Name =<br>
 * Transportation on vacation<br><br>
 * = Description = <br><br>
 * After a hard quarter in the office you decide to get some rest on a vacation. So you will book a flight for you and your girlfriend and try to leave all the mess behind you.<br><br>
 * You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.<br><br>
 * Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.<br><br>
 * Write a code that gives out the total amount for different days(d).
 *
**/
public class Kata {
	
	// **************************************************************************************
	// * This method is used to return checks amount of money needed to pay for car rental. *
	// **************************************************************************************
 	public static int rentalCarCost(int d) {
 		return d >= 7 ? d * 40 - 50 : d >= 3 ? d * 40 - 20 : d * 40;
 	}
  
}
