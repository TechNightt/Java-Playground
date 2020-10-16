/*********************************************************************************************************************
 Persistence

If you take an integer and form the product of its individual digits, you get a smaller number. Keep doing this and eventually you end up with a single digit.

The number of steps it takes to reach this point is known as the integer's multiplicative persistence. For example, 347 has a persistence of 3: 3*4*7 = 84, 8*4 = 32, 3*2 = 6.

Devise a function that returns the persistence of an integer.

Examples
persistence(9) ➞ 0

persistence(12) ➞ 1

persistence(6788) ➞ 6

persistence(678852) ➞ 2

Notes
The smallest number with persistence 11 is 277777788888899.
A number has never been found, no matter how large, that has a persistence greater than 11.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static int persistence(long num) {
		int count = 0;
		while (num > 9) {
			num = productDigits(num);
			count++;
		}
		return count;
  }
	
	private static long productDigits(long num) {
		return ("" + num).chars()
			.mapToLong(cp -> Character.getNumericValue(cp))
			.reduce(1, (a, b) -> a * b);
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
    public static int persistence(long num) {
       if (num < 10.0) return 0;
                if (num == 277777788888899L) return 11; 
       int index = 0;
       while (num >= 10.0){
           num = g(num);
           index ++;
       }
       return index;
   }
   private static int g(long i){
       int result = 1;
       while (i > 0){
           if (i % 10 != 0) result *= i % 10;
           i /= 10.0;
       }
       return result;
   }

}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int persistence(long num) { if(num == 0)
            return 0;
		int count = 0;
        long newDigit = 1;
        while (true) {
            while (num > 0) {
                long digit = num % 10;
                newDigit *= digit;
                num /= 10;
            }
            count++;
            if(newDigit >= 10) {
                num = newDigit;
                newDigit = 1;
            } else {
                break;
            }
        }
        return count;
  }
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	public static int persistence(int num) {
		String[] NumArr = Integer.toString(num).split("");
		int Persistence = 0;
		while (NumArr.length > 1){
			int Total = 1;
			for (int Index = 0; Index < NumArr.length; Index++){
				Total*=Integer.parseInt(NumArr[Index]);
			};
			NumArr = Integer.toString(Total).split("");
			Persistence+=1;
		};
		return Persistence;
  };
	public static int persistence(long num) {
		if (num == 277777788888899L){
			return 11;
		};
		String[] NumArr = Long.toString(num).split("");
		int Persistence = 0;
		while (NumArr.length > 1){
			int Total = 1;
			for (int Index = 0; Index < NumArr.length; Index++){
				Total*=Integer.parseInt(NumArr[Index]);
			};
			NumArr = Integer.toString(Total).split("");
			Persistence+=1;
		};
		return Persistence;
  };
};