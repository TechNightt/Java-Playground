/*********************************************************************************************************************
 Fix the Spacing

Additional spaces have been added to a sentence. Return the correct sentence by removing them. All words should be separated by one space, and there should be no spaces at the beginning or end of the sentence.

Examples
correctSpacing("The film   starts       at      midnight. ")
➞ "The film starts at midnight."

correctSpacing("The     waves were crashing  on the     shore.   ")
➞ "The waves were crashing on the shore."

correctSpacing(" Always look on    the bright   side of  life.")
➞ "Always look on the bright side of life."
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static String correctSpacing(String sentence) {
		while(sentence.charAt(0)==' '){
			sentence = sentence.replaceFirst(" ","");
				
		}
		while(sentence.contains("  ")){
		sentence = sentence.replaceAll("  "," ");
		}
		while(sentence.charAt(sentence.length()-1) == ' '){
			sentence = sentence.substring(0,sentence.lastIndexOf(" "));
		}
		return sentence;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String correctSpacing(String sentence) {
		return sentence.replaceAll("[ ]+", " ").trim();
	}
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.Arrays;

public class Challenge {
	public static String correctSpacing(String sentence) {
		String[] words = sentence.split(" ");
		String result = "";
	
		for(int x=0; x<words.length; x++){
			words[x] = words[x].trim();
			if(!words[x].equals("") && x <= words.length - 2){
				result += words[x] + " ";
			}else if(!words[x].equals("") && x == words.length - 1){
				result += words[x];
			}
		}

		return result;
	}
}

