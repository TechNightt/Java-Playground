/*********************************************************************************************************************
 Count Letters in a Word Search

Create a function that counts the number of times a particular letter shows up in the word search.

Examples
letterCounter([
  ["D", "E", "Y", "H", "A", "D"],
  ["C", "B", "Z", "Y", "J", "K"],
  ["D", "B", "C", "A", "M", "N"],
  ["F", "G", "G", "R", "S", "R"],
  ["V", "X", "H", "A", "S", "S"]
], "D") ➞ 3

// "D" shows up 3 times: twice in the first row, once in the third row.

letterCounter([
  ["D", "E", "Y", "H", "A", "D"],
  ["C", "B", "Z", "Y", "J", "K"],
  ["D", "B", "C", "A", "M", "N"],
  ["F", "G", "G", "R", "S", "R"],
  ["V", "X", "H", "A", "S", "S"]
], "H") ➞ 2

Notes
You will always be given an array with five sub-arrays.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program {
	public static int letterCounter(char[][] r, char c) {
		int o=0;
		for (int i=0; i<r.length; i++)
			for (int j=0; j<r[i].length; j++)
				o+=r[i][j]==c ? 1 : 0;
		return o;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program{
    public static int letterCounter(char[][] arr, char c) {
        String output = "";
        for(char[] ch : arr) output += String.valueOf(ch);
        return output.replaceAll("[^" + c + "]", "").length();
       }
    }

