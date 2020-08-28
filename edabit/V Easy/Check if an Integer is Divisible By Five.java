

/*********************************************************************************************************************
 Check if an Integer is Divisible By Five
Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.

Examples
divisibleByFive(5) ➞ true

divisibleByFive(-55) ➞ true

divisibleByFive(37) ➞ false
Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
	public static boolean divisibleByFive(int num) {
		return num % 5 == 0;
	}
}




public class Challenge {
	public static boolean divisibleByFive(int num) {
		boolean hasBaseFive = false;
		
		if (num % 5 == 0){
			hasBaseFive = true;
		}
		else{
			hasBaseFive = false;
		}
	return hasBaseFive;
	}
}




public class Challenge {
    public static boolean divisibleByFive(int num) {
        if(num%5 == 0) return true;
        else return false;
    } 
        public static void main(String args[]) {
            boolean a = divisibleByFive(56);
            System.out.println(a);
        }
    }