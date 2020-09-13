/*********************************************************************************************************************
 Vowel Replacer
Create a function that replaces all the vowels in a string with a specified character.

Examples
replaceVowels("the aardvark", '#') ➞ "th# ##rdv#rk"

replaceVowels("minnie mouse", '?') ➞ "m?nn?? m??s?"

replaceVowels("shakespeare", '*') ➞ "sh*k*sp**r*"

Notes
All characters will be in lower case.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String replaceVowels(String str, char ch) {
		return str.replaceAll( "[aeiou]", String.valueOf(ch));
	}
}


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String replaceVowels(String str, char ch) {
		String s="";
		for(int i=0;i<str.length();i++){
			char x = str.charAt(i);
			if(isVowel(x)) x = ch;
			s = s+x;
		}
		return s;
	}
	private static boolean isVowel(char c){
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
		else return false;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String replaceVowels(String str, char ch) {
		String newStr = "";
		String vowels = "aeiou";
		for(int i = 0; i < str.length(); i++){
			char currChar = str.charAt(i);
			if(vowels.indexOf(currChar) != -1){
				newStr += ch;
			} else {
				newStr += currChar;
			}
		}
		return newStr;
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String replaceVowels(String str, char ch) {
		    str = str.replace('a', ch);
        str = str.replace('e', ch);
        str = str.replace('i', ch);
        str = str.replace('o', ch);
        str = str.replace('u', ch);
        System.out.println(str);
        return str;
	}
}



//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
	public static String replaceVowels(String str, char ch) {
		String n="";
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if((c[i]=='a')||(c[i]=='e')||(c[i]=='i')||(c[i]=='o')||(c[i]=='u'))
				c[i]=ch;
			n+=c[i]	;
		}
		return n.toString();
	}
}



//#############################################################
//#                        MY SOLUTION 6



public class Challenge {
    public static String replaceVowels(String str, char ch) {
        char[] vowels = new char[]{'a','e','i','o','u'};
        for (char c : vowels){
            str = str.replaceAll(Character.toString(c), Character.toString(ch));
        }

        return str;

    }
}



//#############################################################
//#                        MY SOLUTION 7



public class Challenge {
	public static String replaceVowels(String str, char ch) {
		String fin = "";
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) fin += ch;
			else fin += str.charAt(i);
		}
		return fin;
	}
	
	public static boolean isVowel(char c) {
		return (
			c == 'a' || 
			c == 'e' ||
			c == 'i' || 
			c == 'o' ||
			c == 'u'
		);
	}
}