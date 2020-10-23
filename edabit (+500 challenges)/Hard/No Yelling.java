/*********************************************************************************************************************
 
No Yelling

Create a function that transforms sentences ending with multiple question marks ? or exclamation marks ! into a sentence only ending with one without changing punctuation in the middle of the sentences.

Examples
noYelling("What went wrong?????????") ➞ "What went wrong?"

noYelling("Oh my goodness!!!") ➞ "Oh my goodness!"

noYelling("I just!!! can!!! not!!! believe!!! it!!!") ➞ "I just!!! can!!! not!!! believe!!! it!"
// Only change repeating punctuation at the end of the sentence.

noYelling("Oh my goodness!") ➞ "Oh my goodness!"
// Do not change sentences where there exists only one or zero exclamation marks/question marks.

noYelling("I just cannot believe it.") ➞ "I just cannot believe it."

Notes
Only change ending punctuation - keep the exclamation marks or question marks in the middle of the sentence the same (see third example).
Don't worry about mixed punctuation (no cases that end in something like ?!??!).
Keep sentences that do not have question/exclamation marks the same.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String noYelling(String phrase) {
		return phrase.replaceAll("(?<=\\w+)\\p{Punct}*(\\p{Punct}{1}$)", "$1");
	}
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String noYelling(String phrase) {
		if(phrase.endsWith("!!") || phrase.endsWith("??")){
			phrase = noYelling(phrase.substring(0, phrase.length()-1));
		}
		return phrase;
	}
}



//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String noYelling(String phrase) {
		
		if (!phrase.substring(phrase.length()-1).equals("?") && 
			  !phrase.substring(phrase.length()-1).equals("!")) {
			return phrase;
		}
		else {
			String str = "";
			int count = 0;
			for (int i = phrase.length()-1; i >=0; i--) {
				char c = phrase.charAt(i);
				if (c == '?' || c == '!') {
					count++;
				}
				else {
					break;
				}
			}
			str = phrase.substring(0,phrase.length()-count+1);
			return str;
		}
	}
}




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String noYelling(String phrase) {
		int index = phrase.length() - 1;
		String result = phrase;
		if(phrase.charAt(index)=='!'||phrase.charAt(index)=='?'){
			while (index >= 0) {
				char c = phrase.charAt(index);
				if((c != '!')&& (c!= '?')){
					break;
				}
				index--;
			}
			result = phrase.substring(0,index+2);
		}
		return  result;
	}
}





//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
	public static String noYelling(String phrase) {
		int i = 1;
		char toCheck = phrase.charAt(phrase.length()-1);
		
		if(toCheck != '?' && toCheck != '!'){
			return phrase;
		}
		
		while(toCheck == '?' || toCheck == '!'){
			i++;
			toCheck = phrase.charAt(phrase.length()-i);
		}
		
		return phrase.substring(0, phrase.length()-i+1) + phrase.charAt(phrase.length()-1);
	}
}



//#############################################################
//#                        MY SOLUTION 6



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
	public static String noYelling(String phrase) {
		String patternStr = "[\\?!]+$";
    Pattern pattern = Pattern.compile(patternStr);
    String new_phrase="";
    String new_phrase1="";
		
		Matcher matcher = pattern.matcher(phrase);
    boolean flag=false;
    
    for (int i = 0; i < phrase.length(); i++) {
    	if(phrase.charAt(i)!='?' && phrase.charAt(i)!='!') 
			new_phrase+=Character.toString(phrase.charAt(i));
    }
    int j=phrase.lastIndexOf(new_phrase.charAt(new_phrase.length()-1));
		while (matcher.find()){
    	for (int i = 0; i < phrase.length(); i++) {		
    		//if(phrase.charAt(j+1)=='?' || phrase.charAt(j+1)=='!'){
    			if((phrase.charAt(i)=='?' || phrase.charAt(i)=='!') && (i<=j)) 
    			new_phrase1+=Character.toString(phrase.charAt(i));
    			
    		else if(phrase.charAt(i)!='?' && phrase.charAt(i)!='!') 
    			new_phrase1+=Character.toString(phrase.charAt(i));
    		else if(phrase.charAt(i)!='?')
    			flag=true;
    }
    	if(flag==true)
    	new_phrase1+='!';
    	else
    		new_phrase1+='?';
    	return new_phrase1;
    }
	
		return phrase;

	}
}