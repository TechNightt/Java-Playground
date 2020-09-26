/*********************************************************************************************************************
 Instant JAZZ

Create a function which concantenates the number 7 to the end of every chord in an array. Ignore all chords which already end with 7.

Examples
jazzify(["G", "F", "C"]) ➞ ["G7", "F7", "C7"]

jazzify(["Dm", "G", "E", "A"]) ➞ ["Dm7", "G7", "E7", "A7"]

jazzify(["F7", "E7", "A7", "Ab7", "Gm7", "C7"]) ➞ ["F7", "E7", "A7", "Ab7", "Gm7", "C7"]

jazzify([]) ➞ []

Notes
Return an empty array if the given array is empty.
You can expect all the tests to have valid chords.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class ChallengeTests {
	public static String[]  jazzify(String[] arr) {
		return arr.length==0 ? new String[]{} : java.util.Arrays.stream(arr).map(s -> s.endsWith("7")==true ? s : s+"7").toArray(String[]::new);
	}
}







//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ChallengeTests {

	public static String[]  jazzify(String[] arr) {
		
		if (arr == null || arr.length == 0) {
			return arr;
		}
		
		String[] array = Arrays.stream(arr).map(item -> item.endsWith("7") ? item: item.concat("7")).toArray(size -> new String[size]);
		
		System.out.println(Arrays.toString(array));
		
		return array;
		
	}
}






//#############################################################
//#                        MY SOLUTION 3   


import java.util.Arrays;
public class ChallengeTests {
	public static String[]  jazzify(String[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        return Arrays.stream(arr).map(s -> ChallengeTests.checkfor7(s)).toArray(String[]::new);
    }

    public static String checkfor7(String s) {
        if (s.lastIndexOf("7") != s.length() -1) {
            return s.concat("7");
        } else {
            return s;
        }
    }
}





//#############################################################
//#                        MY SOLUTION 4


import java.util.*;

public class ChallengeTests {
	public static String[]  jazzify(String[] arr) {
		return Arrays.stream(arr)
                .map(s -> !s.endsWith("7") ? s.concat("7") : s)
                .toArray(String[]::new);
	}
}