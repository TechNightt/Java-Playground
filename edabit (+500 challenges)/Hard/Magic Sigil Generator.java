/*********************************************************************************************************************
 Magic Sigil Generator
A magic sigil is a glyph which represents a desire one wishes to manifest in their lives. There are many ways to create a sigil, but the most common is to write out a specific desire (e.g. "I HAVE WONDERFUL FRIENDS WHO LOVE ME"), remove all vowels, remove any duplicate letters (keeping the last occurence), and then design a glyph from what remains.

Using the sentence above as an example, we would remove duplicate letters:

AUFRINDSWHLOVME
And then remove all vowels, leaving us with:

FRNDSWHLVM
Create a function that takes a string and removes its vowels and duplicate letters. The returned string should not contain any spaces and be in uppercase.

Examples
sigilize("i am healthy") ➞ "MLTHY"

sigilize("I FOUND MY SOULMATE") ➞ "FNDYSLMT"

sigilize("I have a job I enjoy and it pays well") ➞ "HVBJNDTPYSWL"

Notes
For duplicate letters the last one is kept.
When performing actual sigil magic, you must make your sigils manually.
Check the Resources tab for more info on sigils if you're interested in the concept.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static String sigilize(String desire) {
		String str = new StringBuilder(desire).reverse().toString();
		return str.toUpperCase().chars()
			.mapToObj(cp -> "" + (char)cp)
			.distinct()
			.filter(s -> s.matches("[^AEIOU\\s]"))
			.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
			.reverse()
			.toString();
	}
}






//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String sigilize(String desire) {
		return desire.replaceAll("(.)(?=.*\\1)", "").toUpperCase().replaceAll("[AEIOU\\s]", "");
	}
}







//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String sigilize(String str) {
		char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j])
                    ch[i] = ' ';
            }
        }
        String s = "";
        for(int i = 0; i<ch.length; i++){
            s+=ch[i];
        }
         s = s.replaceAll("[aeiouAEIOU]", "").replace(" ", "").toUpperCase();
		return s;
	}
}




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String sigilize(String desire) {
		//StringBuffer desire=new StringBuffer(desire);
		desire=desire.toLowerCase();
		String s="";
		for(int i=0;i<desire.length();i++)
		{
			int ct=0;
			char ch=desire.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || Character.isWhitespace(ch))
				continue;
			else
				for(int j=i+1;j<desire.length();j++)
				{	
					if(ch==desire.charAt(j))
						ct=1;
				}
			if(ct!=1)
				s=s+ch;
			}
		return s.toUpperCase();
	}
}






//#############################################################
//#                        MY SOLUTION 5



import java.lang.*;

public class Challenge {
	public static String sigilize(String desire) {
		StringBuffer sb = new StringBuffer(desire);
		//sb to uppercase
		for (int i = 0; i < sb.length(); i++) {
   		char c = sb.charAt(i);
  		 sb.setCharAt(i, Character.toUpperCase(c));
		}
		//replace all duplicate letters with ' '
		for(int i =sb.length()-1; i >= 0;i--){
			for (int j = 0; j < sb.length(); j++){
				if (sb.charAt(i) == sb.charAt(j) && i != j){
					sb.setCharAt(j, ' ');
				}
			}
		}
		// delete ' ' and A,E,I,O,U
		for(int i =sb.length()-1; i >= 0;i--){
			if(sb.charAt(i) == ' ' || sb.charAt(i) == 'A' 
				|| sb.charAt(i) == 'E' || sb.charAt(i) == 'I'  
				|| sb.charAt(i) == 'O' || sb.charAt(i) == 'U'){
				sb.deleteCharAt(i);
			}			
		}
		return sb.toString();
	}
}


