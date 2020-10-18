/*********************************************************************************************************************
 Counting Adverbs

Create a function that counts the number of adverbs in a sentence. An adverb is a word that ends with ly.

Examples
countAdverbs("She ran hurriedly towards the stadium.") ➞ 1

countAdverbs("She ate the lasagna heartily and noisily.") ➞ 2

countAdverbs("He hates potatoes.") ➞ 0

countAdverbs("He was happily, crazily, foolishly over the moon.") ➞ 3

Notes
Do NOT count words where the ly is in the beginning or the middle (e.g. Lysol, Illya).
For the purpose of this exercise, ignore the nuances of the English language (some adjectives also end in ly).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.Arrays;
public class Challenge {
	public static int countAdverbs(String sentence) {
		String str = sentence.replaceAll("\\p{Punct}", "");
		return (int)Arrays.stream(str.split(" "))
			.filter(s -> s.endsWith("ly"))
			.count();
  }
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static int countAdverbs(String sentence) {
		int count =0;
		String[] s = sentence.split(" ");
		for(int i=0; i<s.length; i++){
			if(s[i].endsWith("ly") || s[i].endsWith("ly.")|| s[i].endsWith("ly,")){
				count++;
			}
		}
		return count;
  }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int countAdverbs(String sentence) {
        int count = 0;
        String[] words = sentence.split("[ |,|.]");
        for (String word : words) {
            if (word.endsWith("ly")) {
                count++;
            }
        }
        return count;
  	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	public static int countAdverbs(String sentence) {
		int adCount = 0;
        for (String a : sentence.replaceAll("[^a-zA-Z0-9\\s]", "").split(" ")) {
            if (a.endsWith("ly")) adCount++;
        }
        return adCount;
  }
}