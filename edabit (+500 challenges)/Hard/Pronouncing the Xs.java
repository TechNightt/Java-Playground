/*********************************************************************************************************************
 Pronouncing the Xs

Create a function which replaces all the x's in the string in the following ways:

Replace all x's with "cks" UNLESS:

The word begins with "x", therefore replace it with "z".
The word is just the letter "x", therefore replace it with "ecks".
Examples
xPronounce("Inside the box was a xylophone") ➞ "Inside the bocks was a zylophone"

xPronounce("The x ray is excellent") ➞ "The ecks ray is eckscellent"

xPronounce("OMG x box unboxing video x D") ➞ "OMG ecks bocks unbocksing video ecks D"

Notes
All x's are lowercase.
I know that not all words with x's follow this rule, but there are too many edge cases to count!
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;
import java.util.stream.Collectors;

public class Challenge {
	public static String xPronounce(String sentence) {
    return Arrays.stream(sentence.split(" "))
                 .map(s -> (s.equals("x")) ? s.replaceAll("x", "ecks")
                            : (s.startsWith("x") && s.length() > 1) ? s.replace("x", "z") 
														 : s.replaceAll("x", "cks"))
                 .collect(Collectors.joining(" "))
                 .toString();		
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String xPronounce(String sentence) {
		String[] s = sentence.split(" ");
		String t = "";
		char c = ' '; 
		boolean can = true;
		for(int i = 0; i < s.length; i++){
			for(int j = 0; j < s[i].length(); j++){
				c = s[i].charAt(j);
				if(c == 'x' && s[i].length() == 1){
					t += "ecks";}
				else if(s[i].charAt(0) == 'x' && can ){ can = false;
					t += 'z';}
				else if(c == 'x'){
					t += "cks";}
				else{
					t += c;}
			}
			t += " ";
			can = true;
		}
		return t.trim();
	}
}




