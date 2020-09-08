/*********************************************************************************************************************
 Finding Nemo
You're given a string of words. You need to find the word "Nemo", and return a string like this: "I found Nemo at [the order of the word you find nemo]!".

If you can't find Nemo, return "I can't find Nemo :(".

Examples
findNemo("I am finding Nemo !") ➞ "I found Nemo at 4!"

findNemo("Nemo is me") ➞ "I found Nemo at 1!"

findNemo("I Nemo am") ➞ "I found Nemo at 2!"


Notes
! , ? . are always separated from the last word.
Nemo will always look like Nemo, and not NeMo or other capital variations.
Nemo's, or anything that says Nemo with something behind it, doesn't count as Finding Nemo.
If there are multiple Nemo's in the sentence, only return for the first one.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String findNemo(String sentence) {
		  String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Nemo")) return "I found Nemo at " + (i + 1) + "!";
        }
        return "I can't find Nemo :(";
	}
}




//#############################################################
//#                        MY SOLUTION 2   


import java.util.stream.IntStream;
public class Challenge {
	public static String findNemo(String sentence) {
		String[] words = sentence.split(" ");
		int pos = 1 + IntStream.range(0, words.length)
			.filter(i -> words[i].equals("Nemo"))
			.findFirst()
			.orElse(-1);
		
		return (pos > 0) ? String.format("I found Nemo at %d!", pos)
			: "I can't find Nemo :(";
	}
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String findNemo(String sentence) {
		int index = 0;
		String[] str = sentence.split(" ");
		String findNemo = "";
		
		for(int i = 0; i < str.length; i++){
			if(str[i].equals("Nemo")){
				index += i;
				index = index + 1;
				break;
			}
		}
		
		if(index == 0){
			findNemo = "I can't find Nemo :(";
		} else{
			findNemo = "I found Nemo at " + index + "!";
		}
		
		return findNemo;
	}
}


