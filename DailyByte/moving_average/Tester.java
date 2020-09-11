package com.daily_byte.date_21_07_2020_moving_average;

public class Tester {
	public static void main(String[] args) {
		MovingAverage ma = new MovingAverage(3);
		System.out.println(ma.next(3));
		System.out.println(ma.next(5));
		System.out.println(ma.next(7));
		System.out.println(ma.next(6));
	}
}