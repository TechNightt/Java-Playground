/*********************************************************************************************************************
 Find the Largest Numbers in a Group of Arrays

Create a function that takes an array of arrays with numbers. Return a new (single) array with the largest numbers of each.

Examples
findLargestNums([[4, 2, 7, 1], [20, 70, 40, 90], [1, 2, 0]]) ➞ [7, 90, 2]

findLargestNums([[-34, -54, -74], [-32, -2, -65], [-54, 7, -43]]) ➞ [-34, -2, 7]

findLargestNums([[0.4321, 0.7634, 0.652], [1.324, 9.32, 2.5423, 6.4314], [9, 3, 6, 3]]) ➞ [0.7634, 9.32, 9]

Notes
Watch out for negative integers (numbers).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.Arrays;
public class Challenge {
	public static double[] findLargestNums(double[][] arr) {
		return Arrays.stream(arr)
			.mapToDouble(sa -> Arrays.stream(sa)
					.max()
					.orElse(0))
			.toArray();
	}
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static double[] findLargestNums(double[][] arr) {
		double[] newArr = new double[arr.length];
		for (int i = 0; i < arr.length; i++){
			double max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j] + " este numarul si max = " + max);
				if (max < arr[i][j]) {
					System.out.println(arr[i][j] + " este numarul si max = " + max);
					max = arr[i][j];
				}
			}
			System.out.println("numarul max = " + max);
			newArr[i]=max;
		}
		return newArr;
	}
}









//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.ArrayList;
import java.util.List;
public class Challenge {
	public static double[] findLargestNums(double[][] arr) {
		double ssmallest = 0.0d;
		double slargest = 0.0d;
		List<Double> result = new ArrayList<Double>();
		for(int i = 0; i<arr.length; i++){
			for(int j=0; j< arr[i].length; j++){
				if (j==0){
					ssmallest = arr[i][j];
					slargest =  arr[i][j];
				}else{
					if (arr[i][j] < ssmallest){
						ssmallest = arr[i][j];
					}
					if (arr[i][j] > slargest){
						slargest = arr[i][j];
					}		
				}
			}
			result.add((double)slargest);
		}
		double[] darr = result.stream().mapToDouble(Double::doubleValue).toArray();
		return darr;
	}
}


