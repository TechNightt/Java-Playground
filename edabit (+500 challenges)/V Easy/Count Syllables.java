

/*********************************************************************************************************************
 Count Syllables
Create a function that counts the number of syllables a word has. Each syllable is separated with a dash -.

Examples
numberSyllables("buf-fet") ➞ 2
numberSyllables("beau-ti-ful") ➞ 3
numberSyllables("mon-u-men-tal") ➞ 4
numberSyllables("on-o-mat-o-poe-ia") ➞ 6

Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static int numberSyllables(String word) {
		String[] syl = word.split("-");
		return syl.length;
	}
}



//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static int numberSyllables(String word) {
            char c = '-';
            int count = 1;
            for(int i = 0;i<word.length();i++){
                if(word.charAt(i) == c)
                    count++;
            } return count;
	}
}





//#############################################################
//#                        MY SOLUTION 3   

public class Challenge {
	public static int numberSyllables(String word) {
		int count = 1;
		for(int i = 0; i < word.length();i++){
			if(word.charAt(i) == '-') count++;
		}
		return count;
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int numberSyllables(String word) {
		int dashCounter = 0;
		
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == '-'){
				dashCounter++;
			}
		}
		
		return dashCounter + 1;
	}
}



//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static int numberSyllables(String word) {
		return word.replaceAll("((?!-).)*", "").length() + 1;
	}
}