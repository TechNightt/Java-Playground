
/*********************************************************************************************************************
 
Convert Number to String of Dashes

Create a function that takes a number (from 1 - 60) and returns a corresponding string of hyphens.

Examples
Go(1) ➞ "-"
Go(5) ➞ "-----"
Go(3) ➞ "---"

Notes
You will be provided integers ranging from 1 to 60.
Don't forget to return your result as a string.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String Go(int num) {
		String out = "";
		for(int i=0; i<num; i++) out+="-";
		return out;
	}
}

//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String Go(int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++){
			sb.append("-");
		}
		return sb.toString();
	}
}


//#############################################################
//#                        MY SOLUTION 3   


import java.lang.*;

public class Challenge {
	public static String Go(int num) {
		
		StringBuilder string = new StringBuilder("");
		
		while(num != 0)
		{
			string.append("-");
			num--;
		}
		
		return string.toString();
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String Go(int num) {
		char[] arr = new char[num];
		for (int i = 0; i < num; i++){
			arr[i] = '-';
		}
		String dashes = new String(arr);
		return dashes;
	}
}


