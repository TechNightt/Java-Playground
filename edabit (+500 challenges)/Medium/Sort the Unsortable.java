/*********************************************************************************************************************
 
Sort the Unsortable

For this challenge, you will be given an array as the following:

[[3], 4, [2], [5], 1, 6]
By definition, the array has elements that's either an integer or an array containing an integer. We can clearly see that this array can reasonably be sorted according to "the content of the elements" as:

[1, [2],  [3], 4, [5], 6]
Create a function that, given an array similar to the above, sorts the array according to the "content of the elements".

Examples
sortIt([4, 1, 3]) ➞ [1, 3, 4]

sortIt([[4], [1], [3]]) ➞ [[1], [3], [4]]

sortIt([4, [1], 3]) ➞ [[1], 3, 4]

sortIt([[4], 1, [3]]) ➞ [1, [3], [4]]

sortIt([[3], 4, [2], [5], 1, 6]) ➞ [1, [2], [3], 4, [5], 6]

sortIt([13, [2000], 1979, 12, [12], 17]) ➞ [12, [12], 13, 17, 1979, [2000]]

Notes
Elements of the array will be either integers or arrays with a single integer.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Comparator;
import java.util.stream.Stream;

public class JaggedArray {
	public static Object[] sortIt(Object[] arr) {
    Comparator<Object> compareObjects = (a, b) -> {
			int x = a.getClass().isArray() ? ((int[])a)[0] : (int)a;
			int y = b.getClass().isArray() ? ((int[])b)[0] : (int)b;
			return x - y; 
		};
    return Stream.of(arr).sorted(compareObjects).toArray();
  }
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.Arrays;

public class JaggedArray {
	public static Object[] sortIt(Object[] arr) {
		Arrays.sort(arr, (a, b) -> compare(a,b));
		return arr;
	}
	
	public static int compare(Object o1, Object o2){
		int o1val, o2val;
		if(o1.getClass().isArray())
			o1val = ((int[])o1)[0];
		else
			o1val = (int)o1;
		
		if(o2.getClass().isArray())
			o2val = ((int[])o2)[0];
		else
			o2val = (int)o2;
		
		return o1val < o2val ? -1 : 1;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.Arrays;

public class JaggedArray {
    public static Object[] sortIt(Object[] arr) {
        Arrays.sort(arr, (o1, o2) -> {
            int value_1 = extractValueFromObject(o1);
            int value_2 = extractValueFromObject(o2);

            return Integer.compare(value_1, value_2);
        });
        return arr;
    }
    /**
     * This excerise was definitely not EASY!!
     * @param omi
     * @return extracted value
     */
    private static int extractValueFromObject (Object omi){
        if (omi instanceof int[]){
            return ((int[])omi)[0];
        }
        else if (omi instanceof Integer){
            return (int)omi;
        }
        throw new IllegalArgumentException("neither a int nor a object");
    }
}

