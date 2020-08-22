

/*********************************************************************************************************************
 
Return the Last Element in an Array
Create a method that accepts an array and returns the last item in the array.

Examples
getLastItem([1, 2, 3]) ➞ 3

getLastItem([0]) ➞ 0

getLastItem([-1, -3]) ➞ -3
Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




public class Program {
    public static int getLastItem(int[] nums) {
      return nums[nums.length-1];
    }
}