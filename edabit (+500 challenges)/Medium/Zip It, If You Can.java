/*********************************************************************************************************************
 Zip It, If You Can?

Given an array of women and an array of men, either:

Return null if the two arrays are of different sizes.
If the sizes match, return an array of pairs, with the first woman paired with the first man, second woman paired with the second man, etc.
Examples
zipIt([["Tesha", "Tesh", "Shang"], ["Deep", "Xavier", "Dex"]])
 ➞ [["Tesha", "Deep"],["Tesh", "Xavier"],["Shang", "Dex"]]

zipIt(["Elise", "Mary"], ["John", "Rick"])
 ➞ [["Elise", "John"], ["Mary", "Rick"]]

zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh"]) ➞ null

zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh", "Tim"])
 ➞ [["Ana", "Bob"], ["Amy", "Josh"],["Lisa", "Tim"]]
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;
public class PairAndZip {
  public static String[][] zipIt(String[] w, String[] m) {
  	return w.length != m.length ? null : IntStream.range(0, w.length)
		 .mapToObj(i -> new String[]{w[i], m[i]}).toArray(String[][]::new); 
  }
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class PairAndZip {
	public static String[][] zipIt(String[] women, String[] men) {
		String[][] pair = new String[women.length][2];

		if(women.length == men.length) {
				for(int i = 0; i < women.length; i++) {
						for(int j = 0; j < 2; j++) {
								pair[i][0] = women[i];
								pair[i][1] = men[i];
						}
				}
			return pair;
		}
		return null;
	}
}



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class PairAndZip {
	public static String[][] zipIt(String[] a, String[] b) {
		if (a.length!=b.length) return null;
		String[][] o=new String[a.length][2];
		for (int i=0; i<a.length; i++)
			o[i]=new String[]{a[i], b[i]};
		return o;
	}
}

