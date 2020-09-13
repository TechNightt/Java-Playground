/*********************************************************************************************************************
 Scoring System
Andy, Ben and Charlotte are playing a board game. The three of them decided to come up with a new scoring system. A player's first initial ("A", "B" or "C") denotes that player scoring a single point. Given a string of capital letters, return an array of the players' scores.

For instance, if ABBACCCCAC is written when the game is over, then Andy scored 3 points, Ben scored 2 points, and Charlotte scored 5 points, since there are 3 instances of letter A, 2 instances of letter B, and 5 instances of letter C. So the array [3, 2, 5] should be returned.

Examples
calculateScores("A") ➞ [1, 0, 0]

calculateScores("ABC") ➞ [1, 1, 1]

calculateScores("ABCBACC") ➞ [2, 2, 3]

Notes
If given an empty string as an input, return [0, 0, 0].
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int[] calculateScores(String s) {
		return new int[]{s.replaceAll("[^A]", "").length(),
										s.replaceAll("[^B]", "").length(),
										s.replaceAll("[^C]", "").length()};
	}
}



//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static int[] calculateScores(String str) {
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				a++;
			}
			if (str.charAt(i) == 'B') {
				b++;
			}
			if (str.charAt(i) == 'C') {
				c++;
			}
		}
		return new int[]{a, b, c};
	}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.*;
public class Challenge {
	public static int[] calculateScores(String str) {
		int[] ans = new int[3];
		for (char c : str.toCharArray()) ans[c - 'A']++;
		return ans;
	}
}


//#############################################################
//#                        MY SOLUTION 4


import java.util.ArrayList;
import java.util.Collections;
public class Challenge {
    public static int[] calculateScores(String str) {
				ArrayList<Character> list = new ArrayList<>();
        
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        
        int[] results = new int[3];
        
        results[0] = Collections.frequency(list, 'A');
        results[1] = Collections.frequency(list, 'B');
        results[2] = Collections.frequency(list, 'C');
        
        return results;  			
		}
}


//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static int[] calculateScores(String str) {
		if (str == null || str.equals("")) return new int[3];
		int a = str.replaceAll("[BC]", "").length();
		int b = str.replaceAll("[AC]", "").length();
		int c = str.replaceAll("[AB]", "").length();
		return new int[] {a, b, c};
	}
}


//#############################################################
//#                        MY SOLUTION 6



public class Challenge {
	public static int[] calculateScores(String str) {
		int scores[]={0,0,0};
		for(int i=0; i<str.length(); ++i){
			if(str.charAt(i)=='A')++scores[0];
			else if(str.charAt(i)=='B')++scores[1];
			else if(str.charAt(i)=='C')++scores[2];
		}
		return scores;
	}
}


//#############################################################
//#                        MY SOLUTION 7




public class Challenge {
	public static int[] calculateScores(String str) {
		int x = 0;
		int y = 0;
		int z = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if('A' == str.charAt(i))
			{
				x++;
			}
			if('B' == str.charAt(i))
			{
				y++;
			}
			if('C' == str.charAt(i))
			{
				z++;
			}
		}
		int [] scores = {x, y, z};
		return scores;
	}
}