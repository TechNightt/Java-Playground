

/*********************************************************************************************************************
 
Find the Index
Create a function that takes an array and a string as arguments and return the index of the string.

Examples
findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh") ➞ 2
findIndex(new String[]{"Red", "blue", "Blue", "Green"}, "blue") ➞ 1
findIndex(new String[]{"a", "g", "y", "d"}, "d") ➞ 3
findIndex(new String[]{"Pineapple", "Orange", "Grape", "Apple"}, "Pineapple") ➞ 0

Notes
Don't forget to return the result.
If you are stuck, find help in the Resources tab.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   

class FindIndex {
	public static int findIndex(String[] arr,String str){
		for(int i=0;i<arr.length;i++){
			if(str.equals(arr[i]))
				return i;
		}
		return -1;
	}
}

//#############################################################
//#                        MY SOLUTION 2   


class FindIndex {
	public static int findIndex(String[] arr,String str) {
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] == str) return i;
		}
		return -1;
	}
}

//#############################################################
//#                        MY SOLUTION 3   

class FindIndex{
	public static int findIndex(String[] arr,String str) {
		int index = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i].equals(str))
				index = i;
		}
		return index;
	}
}
