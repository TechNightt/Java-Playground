

/*********************************************************************************************************************
 
Convert Hours into Seconds
Write a function that converts hours into seconds.

Examples
howManySeconds(2) ➞ 7200

howManySeconds(10) ➞ 36000

howManySeconds(24) ➞ 86400
Notes
60 seconds in a minute, 60 minutes in an hour
Don't forget to return your answer.


**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
	public static int nextEdge(int side1, int side2) {
			int maxrange = (side1+side2)-1;
		return maxrange;
  }






	public static void main(String args[]){
		int s1 = 34;
		int s2 = 89;
		int m = nextEdge(s1,s2);
		System.out.println("maxrange of a triangle is"+m);
	}
}







public class Challenge {
	public static int howManySeconds(int hours) {
		int a = 60;
		int b = 60;
		int c = a * b;
		return hours * c;
  }
}