/*********************************************************************************************************************
 Substituting the The

Create a function that replaces "the" in the sentence with "an" or "a". Remember that if the next word begins with a vowel, use "an". In the case of a consonant, use "a".

Examples
replaceThe("the dog and the envelope") ➞ "a dog and an envelope"

replaceThe("the boy ran at the wall") ➞ "a boy ran at a wall"

replaceThe("the egg, the spoon and the espionage") ➞ "an egg, a spoon and an espionage"

Notes
Sentences will always be in lowercase.
The last word of the sentence will never be "the".
This won't cover edge cases such as "an hour" or "a unique thing" (since they sound differently to the rule).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String replaceThe(String str) {
		int start = 0;
		String result = "";
		str += " ";
		for(int index = 0; index < str.length(); index++){
			if(str.charAt(index) == ' ')
			{
				if(str.substring(start, index).equalsIgnoreCase("the")){
					if(str.charAt(index+1)=='a'||str.charAt(index+1)=='e'||str.charAt(index+1)=='i'||str.charAt(index+1)=='o'||str.charAt(index+1)=='u')
						result += "an ";
					else
						result += "a ";
				}
				else
					result += str.substring(start,index)+" ";
				start = index+1;
			}
		}
		return result.trim();
	}
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.Arrays;

public class Challenge {
	public static String replaceThe(String str) {
        Character[] vowels = {'a', 'A', 'e', 'E', 'o', 'O', 'u', 'U', 'y', 'Y'};
        String res = "";
        System.out.println(Arrays.asList(str.split("the")));
        for (String s : str.split("the")) {
            if(s.equals("")){continue;}
            else if(!(s.equals("")) && s.equals(str.split("the")[0])){
                res+=s;
                continue;
            }
            if (Arrays.asList(vowels).contains(s.charAt(1))) {
                res += "an" + s;
            } else {
                res += "a" + s;
            }
        }
        return res;

	}
}










//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String replaceThe(String str) {
		char[] chars = str.toCharArray();
		char[] vowels = "euioa".toCharArray();
		boolean isVowel;
		for(int i = 2; i < chars.length; i++){
			if (chars[i] == 'e'){
				if(chars[i-1] == 'h' && chars[i-2] == 't'){
					isVowel = false;
					for(char c : vowels){
						if(chars[i+2] == c) isVowel = true;
					}
					if(isVowel){
						chars[i] = 'n'; 
						chars[i-1] = 'a'; 
						chars[i-2] = '*';
					}
					else{
						chars[i] = 'a'; 
						chars[i-1] = '*'; 
						chars[i-2] = '*';
					}
				}
			}
		}
		String result = "";
		for (char c: chars){
			if(c != '*'){
				result += String.valueOf(c);
			}
		}
		return result;
	}
}









//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge 
{
	public static String replaceThe(String str) 
	{
		String[] a=str.split(" ");
		String temp="";
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i].equals("the"))
			{
			  char t=a[i+1].charAt(0);
				if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u')
					a[i]="an";
				else
					a[i]="a";
			}
		}
		for(i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			  temp+=a[i];
			else
				temp+=a[i]+" ";
		}
		return temp;
	}
}






//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
	public static String replaceThe(String str) {
		String[] s = str.split(" ");
		String newStr = "";

		for (int i=0; i<s.length-1; i++){
			if (s[i].equals("the") && nextLetterIsVowel(s[i+1].charAt(0)+"") ){
				newStr += "an "; 
			}
			else if (s[i].equals("the") && !nextLetterIsVowel(s[i+1].charAt(0)+"")){
				newStr += "a "; 
			}
			else{
				newStr += s[i] + " ";
			}
		}
		
		return newStr + s[s.length-1];
	}
	
	private static boolean nextLetterIsVowel(String s){  
	 if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
			return true;
	 }
	 return false;
	 }
}