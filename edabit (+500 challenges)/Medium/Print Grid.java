/*********************************************************************************************************************
 
Print Grid

Write a method that accepts two integer parameters rows and cols. The output is a comma-separated grid of numbers displayed in column-major order, meaning the numbers shown increase sequentially down each column and wrap to the top of the next column to the right once the bottom of the current column is reached.

Examples
printGrid(3, 6) ➞ "
  1, 4, 7, 10, 13, 16
  2, 5, 8, 11, 14, 17
  3, 6, 9, 12, 15, 18
"

printGrid(5, 3) ➞ "
  1, 6, 11
  2, 7, 12
  3, 8, 13
  4, 9, 14
  5, 10, 15
"

printGrid(4, 1) ➞ "
  1
  2
  3
  4
"


Notes
Each row ends with "\n" e.g. "1, 6, 11\n" rather then a space "1, 6, 11 " (=wrong)
Last line "\n" should be trimed.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String printGrid(int r, int c) {
		String o="";
		for (int i=1; i<=r; i++)
			for (int j=0; j<c; j++)
				o+= i+r*j + (j==c-1 ? (i==r ? "" : "\n") : ", ");
		return o;
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String printGrid(int rows, int cols) {
		String result = "";
		int sum = 0;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= cols; j++){
				result += (i + sum);
				sum += rows;
				if(j == cols){
					result += "\n";
					sum = 0;
				} else {
					result += ", ";
				}
			}
		}
		
		return result.trim();
	}
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;
public class Challenge {
	public static String printGrid(int rows, int cols) {
			ArrayList<String> strlist = new ArrayList<>();
			int maxnum = rows*cols;
			ArrayList<String[]> strlist2 = new ArrayList<>();
			ArrayList<String> addedcommas = new ArrayList<>();
			ArrayList<String> addednewline = new ArrayList<>();
			for(int i = 1; i <= maxnum+1; i++){
				if(strlist.size() == rows){
					strlist2.add(strlist.toArray(new String[0]));
					strlist.clear();
					strlist.add(String.valueOf(i));
				}
				else{
					strlist.add(String.valueOf(i));
				}
			}
			for(String[] eacharr: strlist2) {
				System.out.println(eacharr.toString());
			}
			strlist.clear();
			String[][] res = strlist2.toArray(new String[0][0]);
			for(int i = 0; i < res[0].length; i++) {
				
				for(int j = 0; j < res.length; j++) {
					
					strlist.add(res[j][i]);
				}
				addedcommas.add(String.join(", ", strlist));
				strlist.clear();
			}
			addednewline.add(String.join("\n", addedcommas));
			String[] realres = addednewline.toArray(new String[0]);
			return realres[0];
		}
}

