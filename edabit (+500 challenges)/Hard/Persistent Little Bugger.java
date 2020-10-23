/*********************************************************************************************************************
 Persistent Little Bugger

Create a function that takes a number and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

Examples
bugger(39) ➞ 3
// Because 3 * 9 = 27, 2 * 7 = 14, 1 * 4 = 4 and 4 has only one digit.

bugger(999) ➞ 4
// Because 9 * 9 * 9 = 729, 7 * 2 * 9 = 126, 1 * 2 * 6 = 12, and finally 1 * 2 = 2.

bugger(4) ➞ 0
// Because 4 is already a one-digit number.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static int bugger(int num) {
		  if (Integer.valueOf(num).toString().matches("^\\d$")) return 0;
        int mult = 1, index=0;

        while (!Integer.valueOf(num).toString().matches("^\\d$")) {
            for (char c : Integer.valueOf(num).toString().toCharArray()) {
                mult *= Integer.valueOf(String.valueOf(c));
            }
            ++index;
            num = mult;
            mult=1;
        }
        return index;
	}
}




//#############################################################
//#                        MY SOLUTION 2   



import java.util.ArrayList;
public class Challenge {
	public static int bugger(int num) {
	if (num >= 0 && num < 10) return 0;
	int nuovo = 0;
	int out = 0;
	String s = Integer.toString(num);
	ArrayList<Integer> cifre = new ArrayList<>();
	for (int i = 0; i < s.length(); i++) 
	{
		cifre.add(Integer.parseInt(s.charAt(i)+""));	
	}
	while (cifre.size() > 1) 
	{
		nuovo = 1;
		out++;
		for (int z: cifre) 
		{
			nuovo *= z;
		}
		s = Integer.toString(nuovo);
		cifre.clear();
		for (int i = 0; i < s.length(); i++) 
		{
			cifre.add(Integer.parseInt(s.charAt(i)+""));	
		}
	}
	return out;	
	}
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.Arrays;

public class Challenge {
	public static int bugger(int num) {
		int index = 0;
            while ((num = Arrays.stream(String.valueOf(num).split("")).mapToInt(Integer::parseInt).reduce(1, (acc, e) -> acc * e)) / 10 != 0) {
                index++;
            }
            return index == 0 ? 0 : index + 1;
	}
}




//#############################################################
//#                        MY SOLUTION 4


import java.util.ArrayList;
public class Challenge {
	public static int bugger(int num) {
	    int c = myBugger(num, 0);
			return c;
	}
	public static int myBugger(int num, int counter) {
        int temp = num;
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	while (temp > 0) {
    		int tail = temp % 10;
			temp = (int) temp / 10;
    		numbers.add(tail);
    	}
    	if (numbers.size() <= 1) {
    	    return counter;
    	} else {
    		int newNum = 1;
    		for (int i = 0; i < numbers.size(); i++) {
    			newNum *= numbers.get(i);
    		}
    		return myBugger(newNum, ++counter);
    	}
    }
}
