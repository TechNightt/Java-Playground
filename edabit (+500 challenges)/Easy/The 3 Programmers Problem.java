/*********************************************************************************************************************
 
The 3 Programmers Problem
You hired three programmers and you (hopefully) pay them. Create a function that takes three numbers (the hourly wages of each programmer) and returns the difference between the highest-paid programmer and the lowest-paid.

Examples
programmers(147, 33, 526) ➞ 493

programmers(33, 72, 74) ➞ 41

programmers(1, 5, 9) ➞ 8

Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

*********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
public class Challenge {
	public static int programmers(int one, int two, int three) {
		 int [] arr =  {one, two, three};
        Arrays.sort(arr);
        return arr[2] - arr[0];
  }
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int programmers(int one, int two, int three) {
		return Math.max(Math.max(one,two),three) - Math.min(Math.min(one,two),three);
  }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int programmers(int one, int two, int three) {
		
		int big,low;
		
		if(one >= two && one>= three){
			big = one;
		}
		else if(two>=one && two >=three){
			big = two;
		}
		else{
			big = three;
		}
		
		if(one <= two && one<= three){
			low = one;
		}
		else if(two<=one && two <=three){
			low = two;
		}
		else{
			low = three;
		}
		
		return big-low;
  }
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int programmers(int one, int two, int three) {
		int max = one;
		int min = one;
		if(two > max){
			max = two;
		}
		if(three > max){
			max = three;
		}
		if(two<min){
			min = two;
		}
		if(three<min){
			min = three;
		}
		return max - min;
  }
}




//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
	public static int programmers(int one, int two, int three) {
		if (three>=two && two>=one) {
			return three-one;
		} else if (three<=two && two<=one) {
			return one-three;
		} else if (three>=one && one>=two) {
			return three-two;
		} else if (three<=one && one<=two) {
			return two-three;
		} else if (one>=three && three>=two) {
			return one-two;
		} else if (one<=three && three<=two) {
			return two-one;
		}
		return 0;
  }
}





//#############################################################
//#                        MY SOLUTION 6


public class Challenge {
	public static int programmers(int one, int two, int three) {
		int tmp;
if (one > two) { tmp = one; one= two; two = tmp; }
if (one > three) { tmp = one; one = three; three = tmp; }
if (two > three) { tmp = two; two= three; three = tmp; }
		return 	three-one;
	 }
}