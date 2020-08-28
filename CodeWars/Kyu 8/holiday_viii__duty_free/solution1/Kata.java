package com.code_wars.kyu8.holiday_viii__duty_free.solution1;

/**
 * 
 * The purpose of this kata is to work out just how many bottles of duty free whiskey you would have to buy such that the saving over the normal high street price would effectively cover the cost of your holiday.<br><br>
 * You will be given the high street price (normPrice), the duty free discount (discount) and the cost of the holiday.<br><br>
 * For example, if a bottle cost £10 normally and the discount in duty free was 10%, you would save £1 per bottle. If your holiday cost £500, the answer you should return would be 500.<br><br>
 * All inputs will be integers. Please return an integer. Round down.
 **/

 
public class Kata {

	// *********************************************************************************************
	// * This method is used to count how many bottles of duty free whiskey you would have to buy. *
	// *********************************************************************************************		
	public static int dutyFree(int normPrice, int discount, int hol) {
		return (int)(hol / (normPrice / 100.0 * discount));
	}

}