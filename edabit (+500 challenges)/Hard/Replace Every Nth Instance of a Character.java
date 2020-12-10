/*********************************************************************************************************************
 Replace Every Nth Instance of a Character

Create a function that takes a string and replaces every nth instance of old_char with new_char. Your function will have four parameters:

txt — The original input text to be processed.
nth — The nth instance to be replaced.
old_char — The character being replaced.
new_char — The character replacing old_char.
In other words, if txt is "abababa", nth is 3, old_char is "a" and new_char is "Z", you would replace the 3rd insrtance of "a" with "Z", returning "ababZba".

Examples
replace_nth("A glittering gem is not enough.", 0, "o", "-")
➞ "A glittering gem is not enough."

replace_nth("Vader said: No, I am your father!", 2, "a", "o")
➞ "Vader soid: No, I am your fother!"

replace_nth("Writing a list of random sentences is harder than I initially thought it would be.", 2, "i", "3")
➞ "Writ3ng a list of random sentences 3s harder than I in3tially thought 3t would be."


Notes
If nth is 0, negative or larger than instances of old_char, return the original string.
Tests are case sensitive.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String replace_nth(String txt, int nth, String old_char, String new_char) {
        if(nth<=0)return txt;
        StringBuilder result = new StringBuilder();
        int nthCount = 0;
        
        for (int i = 0; i < txt.length(); i++) {
            boolean charMatch = txt.charAt(i) == old_char.charAt(0);
            
            if(charMatch){ nthCount++; }
            
            if(charMatch && nthCount%nth==0){
                result.append(new_char);
            }else{
                result.append(txt.charAt(i));
            }
        }
        return result.toString();
    }
}



//#############################################################
//#                        MY SOLUTION 2   




import java.util.ArrayList;

public class Challenge {
	public static ArrayList<Integer> getIndexesOfInstances(String txt, int nth, String ch){
		ArrayList<Integer> array = new ArrayList<>();
		char c = ch.charAt(0);
		int count = 0;
		for (int i = 0; i < txt.length(); i++){
			if (txt.charAt(i) == c) {
				count++;
				if (count % nth == 0) array.add(i);
			}
		}
		return array;
	}
	public static String replace_nth(String txt, int nth, String old_char, String new_char) {
		if (nth <= 0) return txt;
		ArrayList<Integer> array = getIndexesOfInstances(txt, nth, old_char);
		StringBuilder sb = new StringBuilder();
		sb.append(txt);
		for (int i: array){
			sb.replace(i, i + 1, new_char);
		}
		return sb.toString();
	}
}





//#############################################################
//#                        MY SOLUTION 3   



import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Challenge {
	public static String replace_nth(String txt, int n, String oldChar, String newChar) {
		if (txt == null || n < 1 || n > txt.replaceAll("[^" + oldChar + "]", "").length()) {
			return txt;
		}
		String[] strs = txt.split("(?<=" + oldChar + ")");
		return IntStream.range(0, strs.length)
			.mapToObj(i -> (i + 1) % n == 0 ? strs[i].replace(oldChar, newChar) : strs[i])
			.collect(Collectors.joining());
	}
}





//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String replace_nth(String txt, int nth, String old_char, String new_char) {
		if (nth <= 0) return txt;
    else return txt.replaceAll("((?:[^"+old_char+"]*"+old_char+"){"+(nth-1)+"}[^"+old_char+"]*)"+old_char, "$1"+new_char);
	}
}