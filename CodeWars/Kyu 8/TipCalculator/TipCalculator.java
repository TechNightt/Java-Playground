package com.code_wars.kyu8.tip_calculator.solution1;

/**
 * 
 * = Kata's Name =<br>
 * Tip Calculator<br><br>
 * = Description = <br><br>
 * Complete the function, which calculates how much you need to tip based on the total amount of the bill and the service.<br><br>
 * You need to consider the following ratings:<br><br>
 * Terrible: tip 0%<br>
 * Poor: tip 5%<br>
 * Good: tip 10%<br>
 * Great: tip 15%<br>
 * Excellent: tip 20%<br><br>
 * The rating is case insensitive (so "great" = "GREAT"). If an unrecognised rating is received, then you need to return:<br><br>
 * "Rating not recognised" in Javascript, Python and Ruby...<br>
 * ...or null in Java<br>
 * ...or -1 in C#<br><br>
 * Because you're a nice person, you always round up the tip, regardless of the service.
 * 
**/

import java.util.HashSet;

public class TipCalculator {
	
	private static HashSet<String> RS = null;
  
	// *****************************************
	// * This method is used to calculate tip. *
	// *****************************************
	@SuppressWarnings("deprecation")
	public static Integer calculateTip(double amount, String rating) {
	    if(RS == null)
	      initializeSet();
	    if (!RS.contains(rating.toLowerCase()))
	      return null;
	    switch (rating.toLowerCase()) {
	      case "excellent":
	        return new Integer((int) (Math.ceil(amount * 0.20)));
	      case "great":
	        return new Integer((int) (Math.ceil(amount * 0.15)));
	      case "good":
	        return new Integer((int) (Math.ceil(amount * 0.10)));
	      case "poor":
	        return new Integer((int) (Math.ceil(amount * 0.05)));
	      default:
	        return new Integer((int) (Math.ceil(amount * 0.00)));
	    }
	}
	
	private static void initializeSet() {
	    RS = new HashSet<String>();
	    RS.add("excellent");
	    RS.add("great");
	    RS.add("good");
	    RS.add("poor");
	    RS.add("terrible");
	}
}