

/*********************************************************************************************************************
 Return the First and Last Elements in an Array
Create a function that takes an array of strings and return the first and last elements as a new array.

Examples
firstLast(["one", "two"]) ➞ ["one", "two"]

firstLast(["edabit", "13", "true"]) ➞ ["edabit", "true"]

firstLast(["zero"]) ➞ ["zero"]
Notes
Test input will always contain a minimum of two elements within the array.
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################

public class Challenge {
	public static String[] firstLast(String[] arr) {
		return new String[]{arr[0], arr[arr.length -1]};
	}
}

//#############################################################


public class Challenge {
	public static String[] firstLast(String[] arr) {
		String[] s = new String[2];
		s[0] = arr[0];
		s[1] = arr[arr.length-1];
		
		return s;
	}
	
}

//#############################################################

public class Challenge {
	public static String[] firstLast(String[] arr) {
		if (arr.length == 1) {
			String[] arr2 = new String[1];
			arr2[0] = arr[0];
			return arr2;
		} 
		else {
			String[] arr2 = new String[2];
			arr2[0] = arr[0];
			arr2[1] = arr[arr.length-1];
			return arr2;
		}
	}
}


//#############################################################


public class Challenge {
	public static String[] firstLast(String[] arr) {
		if(arr.length == 1) {
			return arr;
		} else {
			String[] a = new String[2];
			String b = arr[0];
			String c = arr[arr.length - 1];
			a[0] = b;
			a[1] = c;
			return a;
		}
	}
}

//#############################################################

