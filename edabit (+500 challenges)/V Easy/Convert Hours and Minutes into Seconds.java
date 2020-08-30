

/*********************************************************************************************************************
 Convert Hours and Minutes into Seconds
Write a function that takes two integers (hours, minutes), converts them to seconds, and adds them.

Examples
convert(1, 3) ➞ 3780

convert(2, 0) ➞ 7200

convert(0, 0) ➞ 0
Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
	public static int convert(int hours, int minutes) {
	  return (hours * 60 + minutes) * 60;
  }
}




public class Challenge {
	public static int convert(int hours, int minutes) {
		 int seconds = (hours * 3600) + (minutes * 60);
		 return seconds;
  }
}





public class Challenge {
	public static int convert(int hours, int minutes) {
		int secondsH = hours * 3600;
		int secondsM = minutes * 60;
		int seconds = secondsH + secondsM;
		return seconds;
  }
}