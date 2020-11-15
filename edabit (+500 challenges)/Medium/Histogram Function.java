/*********************************************************************************************************************
 Histogram Function

Write a function that creates histograms. Every bar needs to be on a new line and its length corresponds to the numbers in the array passed as an argument. The second argument represents the symbol to be used to represent the bar.

Examples
histogram([1, 3, 4], "#") ➞ "#\n###\n####"

#
###
####

histogram([6, 2, 15, 3], "=") ➞ "======\n==\n===============\n==="

======
==
===============
===

histogram([1, 10], "+") ➞ "+\n++++++++++"

+
++++++++++


Notes
For better understanding try printing out the result.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;

public class Graph {
	public static String histogram(int[] r, String c) {
		return IntStream.of(r).mapToObj(n -> new String(new char[n])
			.replace("\0", c) + (n == r[r.length-1] ? "" : "\n")).reduce(String::concat).get();
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Graph {
	public static String histogram(int[] r, String c) {
		String o="";
		for (int i=0; i<r.length; i++) {
			o+=i!=0 ? "\n" : "";
			while (r[i]-->0) o+=c;
		}
		return o;
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Graph {
	public static String histogram(int[] arr, String chr) {
		String result = "";
		for (int n : arr){
			result += String.format("%0" + n + "d", 0).replace("0", chr) + "\n";
		}
		return result.trim();
	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Graph {
	public static String histogram(int[] arr, String chr) {
		String result = "";
		
		for (int i = 0; i < arr.length; i++){
			for (int x = 0; x < arr[i]; x++){
				result += chr;
			}
			
			if (i != arr.length - 1){
				result += "\n";
			}
		}
		
		return result;
	}
}