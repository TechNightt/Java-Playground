package com.code_wars.kyu8.welcome_to_the_city.solution1;

/**
 *
 * Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to welcome a person. Note that name will be an array consisting of one or more values that should be joined together with one space betweeen each, and the length of the name array in test cases will vary.<br><br>
 * Example:<br><br>
 * sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")<br><br>
 * This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!
 * 
**/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Hello {
	
	// ****************************************************************
	// * This method is used to return 'Hello' with some other words. *
	// ****************************************************************
	public String sayHello(String [] name, String city, String state){
		return "Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";
	}
  
}