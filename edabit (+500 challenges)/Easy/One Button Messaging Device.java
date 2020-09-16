/*********************************************************************************************************************
 One Button Messaging Device

Imagine a messaging device with only one button. For the letter A, you press the button one time, for E, you press it five times, for G, it's pressed seven times, etc, etc.

Write a function that takes a string (the message) and returns the total number of times the button is pressed.

Examples
howManyTimes("abde") ➞ 12

howManyTimes("azy") ➞ 52

howManyTimes("qudusayo") ➞ 123

Notes
Ignore spaces.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int howManyTimes(String msg) {
		return msg.chars().map(c -> c - 96).sum();
  }
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int howManyTimes(String msg) {
		if(msg.length()==0)return 0;
		return ((int)msg.charAt(0))-96 + howManyTimes(msg.substring(1));
  }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int howManyTimes(String msg) {
        int times = 0;
        char[] arr = msg.toLowerCase().toCharArray();
        for (int i=0; i<arr.length; i++)
            times += arr[i]- 96;
        return times;		
	}
}




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int howManyTimes(String msg) {
		if(msg == null || msg.equals("")) 
			return 0;
		if(msg.charAt(0) == ' ') 
			return howManyTimes(msg.substring(1));
		return (msg.charAt(0) - 'a' + 1) + howManyTimes(msg.substring(1));
  }
}