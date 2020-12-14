/*********************************************************************************************************************
 WordRank Scoring System

Create a function that takes a string of words and returns the highest scoring word. Each letter of a word scores points according to it's position in the alphabet: a = 1, b = 2, c = 3, etc.

Examples
word_rank("The quick brown fox.") ➞ "brown"

word_rank("Nancy is very pretty.") ➞ "pretty"

word_rank("Check back tomorrow, man!") ➞ "tomorrow"

word_rank("Wednesday is hump day.") ➞ "Wednesday"

Notes
If two words score the same, return the word that appears first in the original string.
The returned string should only contain alphabetic characters (a-z).
Preserve case in the returned string (see 4th example above).
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static String word_rank(String str) {
		String[] words = str.replaceAll("(?i)[^a-z\\s]", "").split(" ");
		int maxIndex = 0;
		int maxScore = 0;
		for (int i = 0; i < words.length; i++) {
			int score = getScore(words[i]);
			if (score > maxScore) {
				maxScore = score;
				maxIndex = i;
			}
		}
		return words[maxIndex];
	}
	
	private static int getScore(String word) {
		return word.toLowerCase().chars()
			.map(cp -> (char)cp - 'a' + 1)
			.sum();
	}
}



//#############################################################
//#                        MY SOLUTION 2   



import java.util.*;
public class Challenge {
	public static String word_rank(String str) {
		
	
	ArrayList<Integer> al1 = new ArrayList<>();
	ArrayList<String> al2 = new ArrayList<>();
	char [] charr = str.toCharArray();
	String s1 = "";
	int count = 0;
	for(int i = 0 ; i < charr.length ; i++) {
		if(charr[i]=='.' || charr[i]==';' || charr[i]==',' || charr[i]=='!' || charr[i]=='?') {
		}
		else {
			s1 = s1 + charr[i];
		}
	}
	
	System.out.println(s1);
	
	String [] sarr = s1.split(" ");
	
	for(String a : sarr) {
		System.out.print(a);
		al2.add(a);
	}
	
	
	for(int i = 0 ; i < sarr.length ; i++) { 
	for(int k = 0 ; k < sarr[i].length() ; k++) {	
	count = count + ( (int) Character.toLowerCase(sarr[i].charAt(k)) - 96);
	}
	al1.add(count);
	count = 0;
	}
	
	int max = al1.get(0);
	
	for(int i = 0 ; i < al1.size() ; i++) {
		if(max < al1.get(i)) {
			max = al1.get(i);
		}
	}
	
	System.out.println(al1);
	System.out.println("max is " + max);
	
	return 	al2.get((al1.indexOf(max)))	;
	
	

	}
}



//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;
public class Challenge {
	public static String word_rank(String str) {
		
	
	ArrayList<Integer> al1 = new ArrayList<>();
	ArrayList<String> al2 = new ArrayList<>();
	char [] charr = str.toCharArray();
	String s1 = "";
	int count = 0;
	for(int i = 0 ; i < charr.length ; i++) {
		if(charr[i]=='.' || charr[i]==';' || charr[i]==',' || charr[i]=='!' || charr[i]=='?') {
		}
		else {
			s1 = s1 + charr[i];
		}
	}
	
	System.out.println(s1);
	
	String [] sarr = s1.split(" ");
	
	for(String a : sarr) {
		System.out.print(a);
		al2.add(a);
	}
	
	
	for(int i = 0 ; i < sarr.length ; i++) { 
	for(int k = 0 ; k < sarr[i].length() ; k++) {	
	count = count + ( (int) Character.toLowerCase(sarr[i].charAt(k)) - 96);
	}
	al1.add(count);
	count = 0;
	}
	
	int max = al1.get(0);
	
	for(int i = 0 ; i < al1.size() ; i++) {
		if(max < al1.get(i)) {
			max = al1.get(i);
		}
	}
	
	System.out.println(al1);
	System.out.println("max is " + max);
	
	return 	al2.get((al1.indexOf(max)))	;
	
	

	}
}




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static String word_rank(String str) {
        String[] strArr = str.replaceAll("[\\p{P}]", "")
													   .split(" ");
        int indexMaxScore = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < strArr.length; i++) {
            int sum = strArr[i].toLowerCase().chars().sum() - (96 * strArr[i].length());

            if (indexMaxScore < sum) {
                indexMaxScore = sum;
                index = i;
            }
        }

        return strArr[index];		
	}
}