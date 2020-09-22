/*********************************************************************************************************************
 Is the Number Symmetrical?
Create a function that takes a number as an argument and returns true or false depending on whether the number is symmetrical or not. A number is symmetrical when it is the same as its reverse.

Examples
isSymmetrical(7227) ➞ true

isSymmetrical(12567) ➞ false

isSymmetrical(44444444) ➞ true

isSymmetrical(9939) ➞ false

isSymmetrical(1112111) ➞ true
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static boolean isSymmetrical(int num) {
		String x = "";
		String y = Integer.toString(num);
		for (int i = y.length()-1; i>=0 ; i--){
			x = x + y.charAt(i);
		}
		return x.equals(y);
	}
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static boolean isSymmetrical(int num) {
		char[] str_num = Integer.toString(num).toCharArray();
		int count = 0;
		for(int i = 0; i < str_num.length; i++){
			if(str_num[i] == str_num[str_num.length - 1 - i]) count += 1;
		}
		if(count == str_num.length) return true;
		else return false;
	}
    
    


//#############################################################
//#                        MY SOLUTION 3   




public class Challenge {
	public static boolean isSymmetrical(int num) {
		  String numberString = String.valueOf(num);
        String firstHalf = numberString.substring(0, numberString.length() / 2);
        String secondHalf;

        if (numberString.length() % 2 == 0) {
            secondHalf = new StringBuilder(numberString
                    .substring(numberString.length() / 2))
                    .reverse().toString();
        } else {
            secondHalf = new StringBuilder(numberString
                    .substring((numberString.length() + 1) / 2))
                    .reverse().toString();
        }


        return firstHalf.equals(secondHalf);
	}
}





//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static boolean isSymmetrical(int num) {
		
		int temp = num;
		int reversed = 0;
		
		while(num != 0){
			int digit = num %10;
			reversed = reversed * 10 + digit;
			num /= 10;
			
		}
		
		return temp == reversed ? true : false;
		
		
	}
}