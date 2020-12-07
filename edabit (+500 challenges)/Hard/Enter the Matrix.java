/*********************************************************************************************************************
 Enter the Matrix

In this challenge, you have to obtain a sentence from the elements of a given matrix. In the matrix, each word of the sentence follows a columnar order from the top to the bottom, instead of the usual left-to-right order: it's time for transposition!

Given a matrix mtx, implement a function that returns the complete sentence as a string, with the words separated by a space between them.

Examples
transposeMatrix([
  ["I","Tesh"],
  ["so","very"],
  ["love","much!"]
]) ➞ "I so love Tesh very much!"

transposeMatrix([
  ["My","evolves","on"],
  ["world","solely","Tesha's."]
]) ➞ "My world evolves solely on Tesha's."

transposeMatrix([
  ["Enter"],
  ["the"],
  ["Matrix!"]
]) ➞ "Enter the Matrix!"

transposeMatrix([
  ["The","are"],
  ["columns","rows."]
]) ➞ "The columns are rows."

Notes
All given matrices are regular, as to say that each column has the same length.
Punctuation is already given, you just have to add the spaces in the returned string.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.*;
public class Matrix {
	public static String transpose(String[][] m) {
  	return IntStream.range(0, m[0].length).mapToObj(y -> IntStream.range(0, m.length)
			.mapToObj(x -> m[x][y]).collect(Collectors.joining(" "))).collect(Collectors.joining(" "));
  }
}



//#############################################################
//#                        MY SOLUTION 2   


public class Matrix {
    public static String transpose(String[][] s) {
           String temp = ""; String fin = "";
        for(int i = 0; i < s.length; ++i){
          for(int x = 0; x < s[i].length; ++x){
              temp+=s[i][x]+" ";
           }temp+="ZZ";
         } int c = 0; int b = 0;
        String[] sp = temp.split("ZZ");
        for(int i = 0; i < sp.length; ++i){
          String[]sp2 = sp[i].split(" ");
           for(int x = b; x < sp2.length; ++x){
              fin+=sp2[x]+" "; c++; break;
           } if(c == s.length){ i = -1; b++; c = 0; }
        }return fin.trim();
    }
  }

