/*********************************************************************************************************************
 Needle in a Hex String

Find the index of a string within a hex encoded string.

You will be given a string which needs to be found in another string which has previously been translated into hex. You will need to return the first index of the needle within the hex encoded string.


Examples
firstIndex("68 65 6c 6c 6f 20 77 6f 72 6c 64", "world") ➞ 6

firstIndex("47 6f 6f 64 62 79 65 20 77 6f 72 6c 64", "world") ➞ 8

firstIndex("42 6f 72 65 64 20 77 6f 72 6c 64", "Bored") ➞ 0
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
import java.util.stream.Collectors;
public class Challenge {
	public static int firstIndex(String hex, String needle) {
		String decoded = Arrays.stream(hex.split(" "))
			.mapToInt(s -> Integer.parseInt(s, 16))
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			.toString();
		return decoded.indexOf(needle);
  }
}





//#############################################################
//#                        MY SOLUTION 2   



import java.util.Arrays;

public class Challenge {
	public static int firstIndex(String hex, String needle) {
		return Arrays.stream(hex.split(" "))
                .map(s -> Integer.valueOf(s, 16))
                .map(i -> String.valueOf( (char) ((int) i ) ))
                .reduce((x, y) -> String.join("", x,y))
                .orElse("")
								.indexOf(needle);
  }
}




//#############################################################
//#                        MY SOLUTION 3   




import java.io.IOException;
import java.math.BigInteger;
public class Challenge {
	public static int firstIndex(String hex, String needle) {
	 String needle1=toHex(needle);
	String []hex2=hex.split(" ");
	for (int i =0;i<hex2.length;i++) {
		if (hex2[i].equals(needle1.substring(0,2))) {
			return i;
		}
	}
		return 0;
  }
	public static String toHex(String arg) {
	    return String.format("%x", new BigInteger(1, arg.getBytes(/*YOUR_CHARSET?*/)));
	}
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int firstIndex(String hex, String needle) {
		String[] hexChars=hex.split(" ");
		String word="";
		int count=0;

		for (String n:hexChars)
			word+=(char)Integer.parseInt(n,16);

		for (int n=0;;n++) {
			if (word.charAt(n)==needle.charAt(count)) count++;
			else count=0;
			if (count==needle.length()) return n-needle.length()+1;
		}
  }
}