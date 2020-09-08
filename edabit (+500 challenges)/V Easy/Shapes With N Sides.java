/*********************************************************************************************************************
 
Shapes With N Sides
Create a function that takes a whole number as input and returns the shape with that number's amount of sides. Here are the expected outputs to get from these inputs.

Inputs	Outputs
1	"circle"
2	"semi-circle"
3	"triangle"
4	"square"
5	"pentagon"
6	"hexagon"
7	"heptagon"
8	"octagon"
9	"nonagon"
10	"decagon"
Examples
nSidedShape(3) ➞ "triangle"

nSidedShape(1) ➞ "circle"

nSidedShape(9) ➞ "nonagon"

Notes
There won't be any tests with a number below 1 or greater than 10.
Return the output in lowercase.
The challenge is intended to be completed without conditionals (it would take too long)!

**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String nSidedShape(int n) {
		String[] a = {"", "circle", "semi-circle", "triangle", "square", "pentagon", "hexagon", "heptagon", "octagon", "nonagon", "decagon"};
		return a[n];
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String nSidedShape(int n) {
		String [] res = {"","circle","semi-circle","triangle","square","pentagon","hexagon","heptagon","octagon","nonagon","decagon"};
		
		if(n <=0 || n>10) {
			return "none";
		}
		
		for(int i = 0;i<res.length;i++) {
			if(i == n) {
				return res[n];
			}
		}
		return "none";
	}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.*;
import java.util.stream.*;
import java.util.HashMap;

public class Challenge {
	public static String nSidedShape(int n) {
		HashMap<Integer,String> shapes = new HashMap<Integer,String>();
		shapes.put(1, "circle");
		shapes.put(2, "semi-circle");
		shapes.put(3,"triangle");
		shapes.put(4,"square");
		shapes.put(5, "pentagon");
		shapes.put(6, "hexagon");
		shapes.put(7, "heptagon");
		shapes.put(8, "octagon");
		shapes.put(9, "nonagon");
		shapes.put(10, "decagon");
		return shapes.get(n);
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String nSidedShape(int n) {
		switch(n) {
			case 1:
				return "circle";
			case 2:
				return	"semi-circle";
			case 3:
				return "triangle";
			case 4:
				return "square";
			case 5:
				return	"pentagon";
			case 6:
				return "hexagon";
			case 7:
				return "heptagon";
			case 8:
				return "octagon";
			case 9:
				return "nonagon";
		}
		return "decagon";
	}
}




//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static String nSidedShape(int n) {
		if (n == 1) return "circle";
		else if (n == 2) return "semi-circle";
		else if (n == 3) return "triangle";
		else if (n == 4) return "square";
		else if (n == 5) return "pentagon";
		else if (n == 6) return "hexagon";
		else if (n == 7) return "heptagon";
		else if (n == 8) return "octagon";
		else if (n == 9) return "nonagon";
		else return "decagon";
	}
}




//#############################################################
//#                        MY SOLUTION 6



public class Challenge {
	public static String nSidedShape(int n) {
		String shape="";
		switch(n){
			case 1:
				shape= "circle";
					break;
			case 2:
				shape=  "semi-circle";
					break;
			case 3:
				shape=  "triangle";
					break;
			case 4:
				shape=  "square";
					break;		
				case 5:
				shape=  "pentagon";
					break;			
			case 6:
				shape=  "hexagon";
					break;				
			case 7:
				shape=  "heptagon";
					break;				
			case 8:
				shape=  "octagon";
					break;	
			case 9:
				shape=  "nonagon";
					break;					
			case 10:
				shape=  "decagon";
					break;								
		}
		return shape;
	}
}