
/*********************************************************************************************************************
 
Additive Inverse
A number added with its additive inverse equals zero. Create a function that returns an array of additive inverses.

Examples
additiveInverse([5, -7, 8, 3]) ➞ [-5, 7, -8, -3]

additiveInverse([1, 1, 1, 1, 1]) ➞ [-1, -1, -1, -1, -1]

additiveInverse([-5, -25, 35]) ➞ [5, 25, -35]
Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
	public static int[] additiveInverse(int[] arr) {
		for (int i=0; i<arr.length; i++){
			arr[i] *= -1;
		}
		return arr;
	}
}




public class Challenge {
	public static int[] additiveInverse(int[] arr) {
		int[] newAr = new int[arr.length];
		for (int i = 0; i<arr.length; i++){
			int x = 0 - arr[i];
			newAr[i] = x;
		}
		return newAr;
    }
    



    public class Challenge {
        public static int[] additiveInverse(int[] arr) {
            int[] additive = new int[arr.length];
            for (int i = 0; i < arr.length; i++){
                if(arr[i] <= 0){
                    int neg = Math.abs(arr[i]);
                    additive[i] = neg;
                }
                else if(arr[i] > 0){
                    additive[i] = arr[i] - (arr[i] * 2);
                }
            }
            return additive;
        }
    }