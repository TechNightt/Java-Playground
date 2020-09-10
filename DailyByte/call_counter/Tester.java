package com.daily_byte.date_20_07_2020_call_counter;

class Tester {

	public static void main(String[] args) {
		CallCounter c = new CallCounter();
		System.out.println(c.ping(1));
		System.out.println(c.ping(300));
		System.out.println(c.ping(3000));
		System.out.println(c.ping(3002));
		System.out.println(c.ping(7000));
	}
	
}