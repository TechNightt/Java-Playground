/*********************************************************************************************************************
 String Flips

Create a function that takes a string as the first argument, and a (string) specification as a second argument. If the specification is "word", return a string with each word reversed while maintaining their original order. If the specification is "sentence", reverse the order of the words in the string, while keeping the words intact.

Examples
str = "There's never enough time to do all the nothing you want"


flip("Hello", "word") ➞ "olleH"

flip("Hello", "sentence") ➞ "Hello"

flip(str, "word") ➞ "s'erehT reven hguone emit ot od lla eht gnihton uoy tnaw"

flip(str, "sentence") ➞ "want you nothing the all do to time enough never There's"
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Challenge {
	public static String flip(String str, String spec) {
		String[] strs = str.split(" ");
		String s1 = IntStream.iterate(strs.length-1, i -> i - 1)
			.limit(strs.length)
			.mapToObj(i -> strs[i])
			.collect(Collectors.joining(" "));
		return (spec.equals("sentence") ? s1 : new StringBuilder(s1).reverse().toString());
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Challenge {
	public static String flip(String str, String spec) {
    List<String> list = Arrays.asList(str.split(" "));
    Collections.reverse(list);
    String reversed = String.join(" ", list);

    return (spec.equals("word")) ? new StringBuilder(reversed).reverse()
																														.toString() 
																: reversed;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String flip(String str, String spec) {
		StringBuilder ans = new StringBuilder();
		String[] words = str.split("\\s+");
		
		switch(spec) {
		// "word", each word reversed while maintaining their original order
			case "word":
				for (String word : words) {
					ans.append(new StringBuilder(word).reverse().toString() + " ");
				}
				break;
		// "sentence", reverse the order of the words in the string, 
		// while keeping the words intact
			case "sentence":
				for (int i = words.length - 1; i >= 0; i--) {
					ans.append(words[i] + " ");
				}
				break;
		}
		return ans.toString().trim();
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String flip(String str, String spec) {
		    String[] strArr = str.split(" ");
        String result = "";
        if (spec == "word") {
            for (String word : strArr) {
                StringBuilder input = new StringBuilder();
                input.append(word);
                result = result + input.reverse().toString() + " ";
            }
        } else if (spec == "sentence") {
            for (int i = strArr.length - 1; i >= 0; i--) {
                result = result + strArr[i] + " ";
            }
        } else {
            return "Unknown spec!";
        }
        return result.substring(0,result.length() - 1);
	}
}