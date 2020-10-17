/*********************************************************************************************************************
 Count a Specific Digit

Write a function that counts the number of times a specific digit occurs in a range (inclusive). The function will look like:

digitOccurrences(min, max, digit) ➞ number of times digit occurs
Examples
digitOccurrences(51, 55, 5) ➞ 6
// [51, 52, 53, 54, 55] : 5 occurs 6 times

digitOccurrences(1, 8, 9) ➞ 0

digitOccurrences(-8, -1, 8) ➞ 1

digitOccurrences(71, 77, 2) ➞ 1

Notes
Ranges can be negative.
min <= max
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.stream.IntStream;
public class Challenge {
	public static int digitOccurrences(int min, int max, int digit) {
		return IntStream.rangeClosed(min, max)
			.map(i -> ("" + i).replaceAll("[^" + digit + "]", "").length())
			.sum();
  }
}




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int digitOccurrences(int min, int max, int digit) {
		int count = 0,temp=0;
		for(int i=min;i<=max;i++) {
			int num = Math.abs(i);
			while(num > 0) {
			temp = num% 10;
			if(temp == digit) {
			count = count + 1;
		}
			num= num/10;
		}
	}
		if(min < 0 && max > 0) {
			count = count + 1;
		}
		return count;
  }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int digitOccurrences(int min, int max, int digit) {
		StringBuilder acc = new StringBuilder();
		while (min <= max) {
			acc.append(min);
			min++;
		}
		String temp = acc.toString().replaceAll("[-]", "");
		return temp.length() - temp.replace("" + digit, "").length();
  }
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int digitOccurrences(int min, int max, int digit) {
		int cnt = 0;
		char d = (char) (48 + digit);
		for(int i=min; i<=max; i++){
			String s = String.valueOf(i);
			for(char c: s.toCharArray()){
				if(c == d)
					cnt++;
			}
		}
		return cnt;
  }
}