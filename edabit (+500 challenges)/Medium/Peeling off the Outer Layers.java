/*********************************************************************************************************************
 Peeling off the Outer Layers

Given an array of object arrays, return a new array of object arrays containing every element, except for the outer elements.

Examples
peelLayer([
  ['a', 'b', 'c', 'd'],
  ['e', 'f', 'g', 'h'],
  ['i', 'j', 'k', 'l'],
  ['m', 'n', 'o', 'p']
]) ➞ [
  ['f', 'g'],
  ['j', 'k']
]

peelLayer([
  [1, 2, 3, 4, 5],
  [6, 7, 8, 9, 10],
  [11, 12, 13, 14, 15],
  [16, 17, 18, 19, 20],
  [21, 22, 23, 24, 25],
  [26, 27, 28, 29, 30],
  [31, 32, 33, 34, 35]
]) ➞ [
  [7, 8, 9],
  [12, 13, 14],
  [17, 18, 19],
  [22, 23, 24],
  [27, 28, 29]
]

peelLayer([
  [true, false, true],
  [false, false, true],
  [true, true, true]
]) ➞ [[false]]

peel_layer_off([
  ["hello", "world"],
  ["hello", "world"]
]) ➞ []

Notes
The 2D grid is always a rectangular/square shape.
Always return some form of nested array, unless there are no elements. In that case, return an empty array.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;

public class Program {
	public static Object[][] peelLayer(Object[][] arr) {
		return Arrays.stream(arr)
			.map(x -> Arrays.stream(x).limit(x.length - 1).skip(1).toArray())
			.limit(arr.length - 1).skip(1).toArray(Object[][]::new);
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program {
	public static Object[][] peelLayer(Object[][] arr) {
		        Object[][] newArr = new Object[arr.length - 2][arr[0].length - 2];
        for (int x = 1; x < arr.length - 1; x++) {
            for (int y = 1; y < arr[x].length - 1; y++) {
                newArr[x - 1][y - 1] = arr[x][y];
            }
        }
        return newArr;
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.ArrayList;
import java.util.List;

public class Program {
	public static Object[][] peelLayer(Object[][] arr) {

		List<Object> list = new ArrayList<Object>();
		int countI = 0;
		int countJ = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i != 0 && i != arr.length - 1 && j != 0 && j != arr[i].length - 1) {
					list.add(arr[i][j]);
				}

			}
			countI = arr.length - 2;
			countJ = arr[i].length - 2;
		}

		Object[][] result = new Object[countI][countJ];
		int a = 0;
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = list.get(a);
				a++;
			}
		}
		return result;
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.Arrays;

public class Program {
	  public static Object[][] peelLayer(Object[][] arr) {
    if (arr.length < 3 || arr[0].length < 3) {
      return new Object[][] {};
    }
    Object[][] result = new Object[arr.length - 2][arr[0].length - 2];
    for (int i = 1; i < arr.length - 1; i++) {
      result[i - 1] = Arrays.copyOfRange(arr[i], 1, arr[i].length - 1);
    }
    return result;
  }

}




//#############################################################
//#                        MY SOLUTION 5
//#############################################################



import java.util.*;
public class Program {
	public static Object[][] peelLayer(Object[][] arr) {
	        ArrayList<Object> objarr = new ArrayList<>();
	        int amountofeacharr = arr[0].length-2;
	        int amountofarrs = arr.length-2;
	        Object[][] returnarr2 = new Object[amountofarrs][amountofeacharr]; 
	        System.out.println(arr.length);
	        for(int i = 1; i < arr.length-1; i++){
	            for(int j = 1; j < arr[i].length-1; j++){
	                objarr.add(arr[i][j]);
	            }
	        }
	        int index = 0;
	        int indexofeachnum = 0;
	        for(Object eachobject: objarr){
	            if(indexofeachnum == amountofeacharr) {
	            	indexofeachnum = 0;
	            	index++;
	            	returnarr2[index][indexofeachnum] = eachobject;
	            	indexofeachnum++;
	            }
	            else {
	            	returnarr2[index][indexofeachnum] = eachobject;
	            	indexofeachnum++;
	            }
	        }
	        return returnarr2;
	    }
}