

/*********************************************************************************************************************
 Sum of Cubes
Create a function that takes in an array of numbers and returns the sum of its cubes.

Examples
sumOfCubes([1, 5, 9]) ➞ 855
// Since 1^3 + 5^3 + 9^3 = 1 + 125 + 729 = 855

sumOfCubes([3, 4, 5]) ➞ 216

sumOfCubes([2]) ➞ 8

sumOfCubes([]) ➞ 0
Notes
If given an empty array, return 0.

**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################



public class Challenge {
	public static int sumOfCubes(int[] nums) {
		int sum = 0;
        for (int num : nums) sum += Math.pow(num, 3);
        return sum;
	}
}

//#############################################################


public class Challenge {
	public static int sumOfCubes(int[] nums) {
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += Math.pow(nums[i], 3);
		}
		return (int) sum;
	}
}

//#############################################################


public class Challenge {
	public static int sumOfCubes(int[] nums) {
		int res = 0;
		for (int i = 0 ; i < nums.length ; i++) {
			res += nums[i] * nums[i] * nums[i];
		}
		return res;
	}
}

//#############################################################


public class Challenge {
    public static int sumOfCubes(int[] nums) {
        int erg = 0;
        if (nums == null || nums.length == 0)
            return 0;
        for (int num : nums)
            erg += java.lang.Math.pow(num,3);
        return erg;

    }
}

//#############################################################
