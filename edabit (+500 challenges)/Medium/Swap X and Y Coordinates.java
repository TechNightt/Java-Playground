/*********************************************************************************************************************
 Swap X and Y Coordinates

Write a function that swaps the X and Y coordinates in a string.

Examples
swapXY("(1, 2), (3, 4)") ➞ "(2, 1), (4, 3)"

swapXY("(11, 23), (43, 99)") ➞ "(23, 11), (99, 43)"

swapXY("(-5, -3), (7, 4)") ➞ "(-3, -5), (4, 7)"

Notes
Some numbers have multiple digits.
Some numbers will be negative.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String swapXY(String str) {
		StringBuilder sb = new StringBuilder();

		StringBuilder coord1X = new StringBuilder();
		StringBuilder coord1Y = new StringBuilder();
		StringBuilder coord2X = new StringBuilder();
		StringBuilder coord2Y = new StringBuilder();

		for (int i=0;i<str.length();i++) {
				char c = str.charAt(i);

				if (Character.isDigit(c) || c == '-') 
						sb.append(c);
				else {
						if (sb.length() > 0) {
								if (coord1X.length() == 0)
										coord1X = sb;
								else if (coord1Y.length() == 0)
										coord1Y = sb;
								else if (coord2X.length() == 0)
										coord2X = sb;
								else if (coord2Y.length() == 0)
										coord2Y = sb;

								sb = new StringBuilder();
						}
				} 
		}

		sb = new StringBuilder("(")
						.append(coord1Y)
						.append(", ")
						.append(coord1X)
						.append("), (")
						.append(coord2Y)
						.append(", ")
						.append(coord2X)
						.append(")");

		return sb.toString();		
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String swapXY(String str) {
		return str.replaceAll("\\(([\\d\\-]+), ([\\d\\-]+)\\)","($2, $1)");
	}
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static String swapXY(String str) {
        String[] split = str.split(" ");

        for(int i = 0; i < split.length; i++){
            split[i] = split[i].replaceAll("[^0-9//-]", "");
        }

        String[] swapped = new String[4];

        swapped[0] = split[1];
        swapped[1] = split[0];
        swapped[2] = split[3];
        swapped[3] = split[2];

        return "(" + swapped[0] + ", " + swapped[1] + "), (" + swapped[2] + ", " + swapped[3] + ")";
    }
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.*;

public class Challenge {
	public static String swapXY(String str) {
		String x1, x2, y1, y2;
		str = str.replaceAll("\\)","");
		str = str.replaceAll("\\(","");
		str = str.replaceAll(",","");
		
		Scanner inStr = new Scanner(str);
		
		x1 = inStr.next();
		x2 = inStr.next();
		y1 = inStr.next();
		y2 = inStr.next();
		
		return ("(" + x2 + ", " + x1 + "), (" + y2 + ", " + y1 + ")");
	}
}