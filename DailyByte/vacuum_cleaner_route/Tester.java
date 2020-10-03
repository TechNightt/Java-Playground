package com.daily_byte.date_27_06_2020_vacuum_cleaner_route;
import static com.daily_byte.date_27_06_2020_vacuum_cleaner_route.Solution.*;

class Tester {

	public static void main(String[] args) {
		String moves = "LR";
		System.out.println(checkMoves(moves));
		moves = "URURD";
		System.out.println(checkMoves(moves));
		moves = "RUULLDRD";
		System.out.println(checkMoves(moves));
	}
	
}