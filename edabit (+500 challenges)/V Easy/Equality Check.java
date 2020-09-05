

/*********************************************************************************************************************
 
Equality Check
In this challenge, you must verify the equality of two different given parameters: a and b.

Both the value and the type of parameters need to be tested in order to have a matching equality. The possible types of the given parameters are:

Numbers
Strings
Booleans (false or true)
Special values: null
What have you learned so far that will permit you to do two different checks (value and type) with a single statement?

Implement a function that returns true if the parameters are equal, and false if they are different.

Examples
checkEquality(1, true) ➞ false
// A number and a boolean: their type is different.

checkEquality(0, "0") ➞ false
// A number and a string: their type is different.

checkEquality(1,  1) ➞ true
// A number and a number: their type and value are equal.
Notes
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   

public class Program {
	public static boolean checkEquality(Object a, Object b) {
		return a != null && a.equals(b);
	}
}

//#############################################################
//#                        MY SOLUTION 2   


public class Program {
	public static boolean checkEquality(Object a, Object b) {
		if (a == null && b == null)
			return true;
		
		if (a != null && b != null)
			return a.equals(b);
			
		return false;
	}
}


//#############################################################
//#                        MY SOLUTION 3   

public class Program {
	public static boolean checkEquality(Object a, Object b) {
		if(a!=null && b!=null) return a.equals(b);
		else return false;
		
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Program {
	public static boolean checkEquality(Object a, Object b) {
		if(a==null || b==null){
			return false;
		}
		return a.equals(b);
	}
}


//#############################################################
//#                        MY SOLUTION 5


public class Program {
	public static boolean checkEquality(Object a, Object b) {
		boolean result = false;
		if((a == null) || (b == null || !(a.equals(b)))){
			result = false;
		}
		else if(a.equals(b)){
			result = true;
		}
		return result;
	}
}



//#############################################################
//#                        MY SOLUTION 6

public class Program {
	public static boolean checkEquality(Object a, Object b) {
		return a == null ? b == null : a.equals(b);
	}
}


//#############################################################
//#                        MY SOLUTION 7



public class Program {
	public static boolean checkEquality(Object a, Object b) {
		return a != null && a.equals(b) ? true : false;
	}
}