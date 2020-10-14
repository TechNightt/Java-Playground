/*********************************************************************************************************************
 One Plus One

Create a function that outputs the result of a math expression in words.

Examples
wordedMath("One plus one") ➞ "Two"

wordedMath("zero Plus one") ➞ "One"

wordedMath("one minus one") ➞ "Zero"

Notes
Expect only the operations plus and minus.
Expect to only get numbers and answers from 0 to 2.
The first letter of the answer must be capitalised.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Map;
import java.util.HashMap;

public class Challenge {
	   public static String wordedMath(String expr) {
    String[] input = expr.split(" ");
    Map<String, Integer> str_toInt = new HashMap<String, Integer>();
    str_toInt.put("zero", 0);
    str_toInt.put("one", 1);
    str_toInt.put("two", 2);

    Map<Integer, String> int_toStr = new HashMap<Integer, String>();
    int_toStr.put(0, "Zero");
    int_toStr.put(1, "One");
    int_toStr.put(2, "Two");
    int_toStr.put(3, "Three");
    int_toStr.put(4, "Four");

    if (input[1].toLowerCase().equals("minus")) {
      int op = str_toInt.get(input[0].toLowerCase()) - str_toInt.get(input[2].toLowerCase());
      return int_toStr.get(op);
    }

    int op = str_toInt.get(input[0].toLowerCase()) + str_toInt.get(input[2].toLowerCase());
    return int_toStr.get(op);
  }
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static String wordedMath(String expr) {
		String[] s = expr.split(" ");
		int a,b;
		if(s[0].equalsIgnoreCase("one"))  a = 1;
		else a = 0;
		if(s[2].equalsIgnoreCase("one")) b = 1;
		else b = 0;
		if(s[1].equalsIgnoreCase("plus")) return a+b == 1 ? "One" : "Two";
		else return a-b == 1 ? "One" : "Zero";
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String wordedMath(String e) {
		e=e.replaceAll("One","1").replaceAll("one","1").replaceAll("Zero","0").replaceAll("zero","0")
			.replaceAll("Two","2").replaceAll("two","2");
		String[] a = e.split(" ");
		int c = 0;
		if(a[1].contains("lus"))c = Integer.parseInt(a[0])+Integer.parseInt(a[2]);
		if(a[1].contains("inus"))c = Integer.parseInt(a[0])-Integer.parseInt(a[2]);
		return c == 2?"Two":(c==1?"One":"Zero");
	}
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################



import java.util.*;
public class Challenge {
	public static String wordedMath(String expr) {
		String s[]=expr.split(" ");
		String x[]={"Zero","One","Two"};
		  HashMap<String, Integer> c = new HashMap<String, Integer>();
		c.put("One",1);
		c.put("one",1);
		c.put("Two",2);
		c.put("two",2);
		c.put("Zero",0);
		c.put("zero",0);
		switch(s[1]) {
  case "plus":
    return x[c.get(s[0])+c.get(s[2])];
    
  case "Plus":
    return x[c.get(s[0])+c.get(s[2])];
    
	case "minus":
    return x[c.get(s[0])-c.get(s[2])];
		
  case "Minus":
    return x[c.get(s[0])-c.get(s[2])];
	
}
		return " ";
	}
}