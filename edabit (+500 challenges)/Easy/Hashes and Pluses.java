/*********************************************************************************************************************
 Hashes and Pluses

Create a function that returns the number of hashes and pluses in a string.

Examples
hashPlusCount("###+") ➞ [3, 1]

hashPlusCount("##+++#") ➞ [3, 3]

hashPlusCount("#+++#+#++#") ➞ [4, 6]

hashPlusCount("") ➞ [0, 0]

Notes
Return [0, 0] for an empty string.
Return in the order of [hashes, pluses].

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int[] hashPlusCount(String s) {
		return new int[] {s.replace("+","").length(),s.replace("#","").length()};
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int[] hashPlusCount(String s) {
		int [] hashAndPlus = {0 , 0};
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '#'){
				hashAndPlus[0] += 1;
			}
			else if(s.charAt(i) == '+'){
				hashAndPlus[1] += 1;
			}	
		}
		return hashAndPlus;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int[] hashPlusCount(String s) {
		int hashCount = 0;
		int plusCount = 0;
		int [] counts = new int[2];
		
		for (int i = 0; i< s.length(); i++)
		{
			if(s.charAt(i) == '#')
			{
				hashCount++;
				counts[0] = hashCount;
			}else if (s.charAt(i) == '+')
			{
				plusCount++;
				counts[1] = plusCount;
			}
		}
		
		return counts;
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int[] hashPlusCount(String s) {
		if(s.length() == 0) {
			int[] a = new int[2];
			a[0] = 0;
			a[1] = 0;
			return a;
		} else {
			int x = 0;
			int b = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '#') {
					++x;
				} else if(s.charAt(i) == '+') {
					++b;
				}
			}
			int[] a = new int[2];
			a[0] = x;
			a[1] = b;
			return a;
		}
	}
}




//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
	public static int[] hashPlusCount(String s) {
		// hashes, pluses
		char[] arr = s.toCharArray();
		int countHash = 0;
		int countPlus =0;
		for(Character el : arr){
			if(el=='#'){
				countHash++;
			}
			else if(el=='+'){
				countPlus++;
			}
		}
		int[] arr1 = new int[2];
		arr1[0]=countHash;
		arr1[1]=countPlus;
		return arr1;
	}
}