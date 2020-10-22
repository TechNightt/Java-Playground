/*********************************************************************************************************************
 Amateur Hour

Write a function that takes time t1 and time t2 and returns the number of hours passed between the two times.

Examples
hoursPassed("3:00 AM", "9:00 AM") ➞ "6 hours"

hoursPassed("2:00 PM", "4:00 PM") ➞ "2 hours"

hoursPassed("1:00 AM", "3:00 PM") ➞ "14 hours"

Notes
Time t1 will always be the starting time and t2, the ending time.
Return the string "no time passed" if t1 is equal to t2.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.Stream;

public class Times {
	public static String hoursPassed(String... s) {
		int[] t = Stream.of(s).map(e -> e.split(":00 ")).flatMap(Stream::of).map(k -> k.matches("\\d+") ? 
			k.equals("12") ? 0 : Integer.parseInt(k) : k.equals("PM") ? 12 : 0).mapToInt(Integer::new).toArray();
		return t[0]==t[2] && t[1]==t[3] ? "no time passed" : t[2]+t[3]-t[0]-t[1]+" hours";
	}
}




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Times {
	public static String hoursPassed(String a, String b) {
		int x=Integer.parseInt(a.split(":")[0]);
		int y=Integer.parseInt(b.split(":")[0]);
		int q=a.split(" ")[1].equals("AM") ? 12 : 24;
		int w=b.split(" ")[1].equals("AM") ? 12 : 24;
		int o=y+w-(x+q);
		if (q<w && x>y) o+=12;
		return o==0 ? "no time passed" : o + " hours";
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Times {
	public static String hoursPassed(String a, String b) {
		int x=Integer.parseInt(a.split(":")[0]);
		int y=Integer.parseInt(b.split(":")[0]);
		int q=a.split(" ")[1].equals("AM") ? 12 : 24;
		int w=b.split(" ")[1].equals("AM") ? 12 : 24;
		int o=y+w-(x+q);
		if (q<w && x>y) o+=12;
		return o==0 ? "no time passed" : o + " hours";
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Times {
	public static String hoursPassed(String t1, String t2) {
		int t1Int = Integer.parseInt(t1.replaceAll(":.*", "")) + (t1.contains("AM") ? 0 : 12) - (t1.contains("12") ? 12 : 0);
		int t2Int = Integer.parseInt(t2.replaceAll(":.*", "")) + (t2.contains("AM") ? 0 : 12) - (t2.contains("12") ? 12 : 0);
		int hoursPassed = t2Int - t1Int + (t2Int >= t1Int ? 0 : 24);
		return hoursPassed > 0 ? hoursPassed + " hours" : "no time passed";
	}
}




