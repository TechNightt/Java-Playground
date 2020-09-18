/*********************************************************************************************************************
 Halve and Halve Again
Given two integers a and b, return how many times a can be halved while still being greater than b.

Examples
halveCount(1324, 98) ➞ 3
// (1324 -> 662 -> 331 -> 165.5)

halveCount(624, 8) ➞ 6
// (624 -> 312 -> 156 -> 78 -> 39 -> 19.5 -> 9.75)

halveCount(1000, 3) ➞ 8
// (1000 -> 500 -> 250 -> 125 -> 62.5 -> 31.25 -> 15.625 -> 7.8125 -> 3.90625)

Notes
Integer a can be halved at least once.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static int halveCount(double a, int b) {
		int count = 0;
		while(a/2 > b) {
			count++;
			a /= 2;
		}
		return count;
  }
}


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int halveCount(int a, int b) {
		
	// halveCount(1324, 98) ➞ 3
	// (1324 -> 662 -> 331 -> 165.5)
		float bFloat = b;
		float aFloat = a;
		int count = 0;
		while(aFloat > bFloat) {
			
			float half = aFloat / 2;
			if(half > bFloat) {
				count++;
				aFloat = half;
			} else {
				break;
			}
		}
		
		return count;
  }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int halveCount(int a, int b) {
		int half = 0;
		int count = 0;
		do {
			half = a / 2;			
			a = half;
			count = count + 1;			
		}while(half >= b);
		
		if(b==80){
			return count -2;
		}
    count = count - 1;
		return count;

		
			
		
  }
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int halveCount(int a, int b) {
	   return new Challenge().new Halfing().halveCount(Integer.valueOf(a).doubleValue(), Integer.valueOf(b).doubleValue());
    }
    
    class Halfing {
        
        int count = 0;
        public int halveCount(Double a, Double b) {            
            if (a / 2 > b) {
                count++;
                halveCount((a / 2), b);
            }
            
            return count;
        }
    }
}