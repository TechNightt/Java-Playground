/*********************************************************************************************************************
 Video Length in Seconds

You are given the length of a video in minutes. The format is mm:ss (e.g.: "02:54"). Create a function that takes the video length and return it in seconds.

Examples
minutesToSeconds("01:00") ➞ 60

minutesToSeconds("13:56") ➞ 836

minutesToSeconds("10:60") ➞ -1

Notes
The video length is given as a string.
If the number of seconds is 60 or over, return -1 (see example #3).
You may get a number of minutes over 99 (e.g. "121:49" is perfectly valid).
**********************************************************************************************************************/







//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;

public class VideoLength {
	public static int minutesToSeconds(String t) {
		int[] r = Arrays.stream(t.split(":")).mapToInt(s -> Integer.parseInt(s)).toArray();
		return r[1] >= 60 ? -1 : r[0] * 60 + r[1];
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class VideoLength {
	public static int minutesToSeconds(String tm) {
		String[] a = tm.split(":");
		int x = Integer.valueOf(a[0]);
		int y = Integer.valueOf(a[1]);
		
		if(y>= 60)return -1;
		return x*60 + y;
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.function.BiFunction;
public class VideoLength {
	public static int minutesToSeconds(String tm) {
		String[] arr = tm.split(":");
		
    int minutes = Integer.parseInt(arr[0]);
		int seconds = Integer.parseInt(arr[1]);
		
    if (seconds >= 60) return -1;
    BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> (x * 60 + y);
    return biFunction.apply(minutes, seconds);
	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class VideoLength {
	public static int minutesToSeconds(String tm) {
		String[] times = tm.split(":");
		if (Integer.parseInt(times[1]) >= 60){
			return -1;
		}
		else{
			return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]); 
		}
	}
}