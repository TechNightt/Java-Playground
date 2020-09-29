/*********************************************************************************************************************
 Change Every Letter to the Next Letter

Write a function that changes every letter to the next letter:

"a" becomes "b"
"b" becomes "c"
"d" becomes "e"
and so on ...
Examples
move("hello") ➞ "ifmmp"

move("bye") ➞ "czf"

move("welcome") ➞ "xfmdpnf"

Notes
There will be no z's in the tests.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1                      #
//#############################################################

public class Challenge {
	public static String move(String word) {
		return word.chars()
			.map(cp -> cp + 1)
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			.toString();
	}
}


//#############################################################
//#                        MY SOLUTION 2                      #
//#############################################################



public class Challenge {
	public static String move(String word) {
		String s ="";
		for(char c : word.toCharArray()){
			s +=Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
		}
		return s;
	}
}





//#############################################################
//#                        MY SOLUTION 3                      #
//#############################################################


public class Challenge {
	public static String move(String word) {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] newWord = new char[word.length()];
		for (int i = 0; i < word.length(); i++){
			for (int j = 0; j < alphabet.length ; j++){
				if (word.charAt(i) == alphabet[j]){
					newWord[i] = alphabet[j+1];
				}
			}
		}
		word = new String(newWord);
		return word;
	}
}





//#############################################################
//#                        MY SOLUTION 4                      #
//#############################################################


public class Challenge {
	public static String move(String word) {
        return word.chars()
                .map(i -> i+1)
                .collect(StringBuilder::new,(s,i)->s.append((char)i),StringBuilder::append).toString();
    }
}