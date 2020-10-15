/*********************************************************************************************************************
 
Censor Words Longer Than Four Characters
Create a function that takes a string and censors words over four characters with *.

Examples
censor("The code is fourty") ➞ "The code is ******"

censor("Two plus three is five") ➞ "Two plus ***** is five"

censor("aaaa aaaaa 1234 12345") ➞ "aaaa ***** 1234 *****"

Notes
Don't censor words with exactly four characters.
If all words have four characters or less, return the original string.
The amount of * is the same as the length of the word.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static String censor(String str) {
		String finalString = "";
		String [] split = str.split(" ");
		for(String tmp: split){
			if(tmp.length() <= 4)
				finalString = finalString + " " + tmp;
			else{
				String stars = "";
				for(int i = 0; i < tmp.length(); i++)
					stars+="*";
				finalString = finalString + " " + stars;
			}
		}
		
		return finalString.trim();
		
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static String censor(String str) {
        String words[] = str.split("\\s+");
        String ret = "";

        for(int i=0; i < words.length; i++) {
            String w = words[i];
            if(w.length() > 4) {
                w = w.replaceAll("[a-zA-Z0-9]", "*");
            }
            ret += w + " ";
        }
        ret = ret.trim();
        return ret;
    }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String censor(String str) {

        String stars = "";
        int firstLength = str.split(" ")[0].length();
        String[] stringArr = str.split(" ");

        if(stringArr.length == 1 && firstLength > 4) {
            for (int i = 0; i < firstLength; i++) {
                stars += "*";
            }
            return stars;
        }
        else if(stringArr.length == 1) {

            return stringArr[0];
        }
        else if(firstLength > 4) {

            for (int i = 0; i < firstLength; i++) {
                stars += "*";
            }
            return stars + " " + censor(removeFirst(str));
        }else{
            return stringArr[0] + " " +censor(removeFirst(str));
        }
    }

    public static String removeFirst(String s){

        char[] c = s.toCharArray();

        for(char x: c){

            if(x != ' '){
                s = s.substring(1);
            }else{
                s = s.substring(1);
                break;
            }
        }
        return s;
    }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String censor(String str) {
		String[] words = str.split("\\s+");

		if (fourOrLess(words)) { return str; }
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 4) {
				int n = words[i].length();
				StringBuilder temp = new StringBuilder();
				while (n-- > 0) {
					temp.append("*");
				}
				words[i] = temp.toString();
			}
		}
		
		StringBuilder answer = new StringBuilder();
		for (String word : words) {
			answer.append(word + " ");
		}
		
		return answer.toString().trim();	
	}
	
	private static boolean fourOrLess(String[] words) {
		for (String word : words) {
			if (word.length() > 4) {
				return false;
			}
		}
		return true;
	}
}