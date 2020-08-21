package com.code_wars.kyu8.color_ghost.solution1;

/**
 * Ghost objects are instantiated without any arguments.<br><br>
 * Ghost objects are given a random color attribute of white" or "yellow" or "purple" or "red" when instantiated<br><br>
 * Ghost ghost = new Ghost();<br>
 * ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
**/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Ghost {
  
	private String color;
  
  	// *****************************************************************************************************************
	// * This constructor creates Ghost Object depending on the random variable that generates inside the constructor. *
  	// *****************************************************************************************************************
  	public Ghost() {
  		int i = (int)Math.round((Math.random() * 10));
  		switch(i) {
  			case 0: this.color = "red";break;
  			case 1: this.color = "white";break;
  			case 2: this.color = "purple";break;
  			default: this.color = "yellow";
  		}
  	}
  
	public String getColor() {
	   return this.color;
	}
  
}