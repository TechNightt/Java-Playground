

/*********************************************************************************************************************
 Word Endings
Create a function that adds a string ending to each member in an array.

Examples
addEnding(["clever", "meek", "hurried", "nice"], "ly")
➞ ["cleverly", "meekly", "hurriedly", "nicely"]

addEnding(["new", "pander", "scoop"], "er")
➞ ["newer", "panderer", "scooper"]

addEnding(["bend", "sharpen", "mean"], "ing")
➞ ["bending", "sharpening", "meaning"]
Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



// SOLUTION 1 

public class Challenge {
	public static String[] addEnding(String[] arr, String ending) {
		for (int i=0; i<arr.length; i++){
			arr[i] += ending; 
		}
		return arr;
	}
}


// SOLUTION 2

public class Challenge {
	public static String[] addEnding(String[] arr, String ending) {
		String[] ar=new String[arr.length];
		for(int i=0;i<arr.length;i++){
			ar[i]=arr[i]+ending;
		}
		return ar;
	}
}



// SOLUTION 3

public class Challenge {
	public static String[] addEnding(String[] arr, String ending) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] += ending;
		}
		return arr;
	}
}


// SOLUTION 4


import java.util.Arrays;

public class Challenge {
	public static String[] addEnding(String[] arr, String ending) {
		return Arrays.stream(arr).map(word -> word + ending).toArray(size -> new String[size]);
	}
}