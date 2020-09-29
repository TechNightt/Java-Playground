/*********************************************************************************************************************
 Functioninator 8000

Create a function that takes a single word string and does the following:

Concatenates inator to the end if the word ends with a consonant otherwise, concatenate -inator instead.

Adds the word length of the original word to the end, supplied with '000'.

The examples should make this clear.

Examples
inatorInator("Shrink") ➞ "Shrinkinator 6000"

inatorInator("Doom") ➞ "Doominator 4000"

inatorInator("EvilClone") ➞ "EvilClone-inator 9000"
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static String inatorInator(String inv) {
		int l = inv.length();
		if ("aeiouAEIOU".contains(inv.substring(l - 1))) inv += "-";
		return inv + "inator " + l + "000";
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String inatorInator(String inv) {
		String temp = inv.toLowerCase();
		char ch = temp.charAt(inv.length()-1);
		if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return  inv+"-inator "+inv.length()+"000";
		return 	inv+"inator "+inv.length()+"000";
	}
}



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String inatorInator(String inv) {
		String result = inv;
		if(inv.charAt(inv.length()-1) == 'a' || inv.charAt(inv.length()-1) == 'e' ||
			inv.charAt(inv.length()-1) == 'i' || inv.charAt(inv.length()-1) == 'o' ||
			 inv.charAt(inv.length()-1) == 'u' || inv.charAt(inv.length()-1) == 'A' || 
			 inv.charAt(inv.length()-1) == 'E' || inv.charAt(inv.length()-1) == 'I' || 
			 inv.charAt(inv.length()-1) == 'O' || inv.charAt(inv.length()-1) == 'U' ) {
			result += "-inator " + inv.length()*1000;
		}else{
			result += "inator " + inv.length()*1000;
		}
		
		return result;
	}
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
    public static String inatorInator(String inv) {
            boolean lastIsConsonant = true;

            char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            int numb = inv.length();

            for (int i = 0; i < vowels.length; i++) {
                    if (inv.charAt(inv.length() - 1) == vowels[i]) {
                            lastIsConsonant = false;
                            break;
                    }
            }

            if (lastIsConsonant) {
                    inv += "inator " + numb + "000";
            } else {
                    inv += "-inator " + numb + "000";
            }

            return inv;
    }
}




//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
	public static String inatorInator(String inv) {
		return (inv.endsWith("a")||inv.endsWith("e")||inv.endsWith("i")||inv.endsWith("o")||inv.endsWith("u")||inv.endsWith("A")||inv.endsWith("E")) ? inv+"-inator "+inv.length()+"000":
		inv+"inator "+inv.length()+"000";
	}
}