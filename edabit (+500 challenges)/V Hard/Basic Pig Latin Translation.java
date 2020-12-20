

/*********************************************************************************************************************
 





**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static String pigLatin(String str) 
	{
	  char ch = str.charAt(str.length()-1);
		str = str.replaceAll("[^A-Za-z ]+","");
		String[] s = str.split(" ");
		String temp = "";
		for (int i = 0; i < s.length; i++)
		{
			if (s[i].charAt(0) == 'a' || s[i].charAt(0) == 'e' || s[i].charAt(0) == 'i'
					|| s[i].charAt(0) == 'o' || s[i].charAt(0) == 'u' || s[i].charAt(0) == 'A'
					|| s[i].charAt(0) == 'E' || s[i].charAt(0) == 'I' || s[i].charAt(0) == 'O'
					|| s[i].charAt(0) == 'U')
			{
				s[i] = s[i]+"way";
				temp += s[i]+" ";
			}
			else
			{
				char a = s[i].charAt(0);
				char b = s[i].charAt(1);
				boolean Ucase = Character.isUpperCase(a);
				if (Ucase) b = Character.toUpperCase(b);  
				s[i] = b+s[i].substring(2,s[i].length())+Character.toLowerCase(a);
				temp += s[i]+"ay"+" ";
			}
		}
		return temp.trim()+ch;
	}
}





//#############################################################
//#                        MY SOLUTION 2   



import java.util.*;
public class Challenge {
	public static String pigLatin(String str) {
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('a');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('u');
        set.add('O');
        set.add('U');
        String constant = "way";
        String constant2 = "ay";
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (set.contains(s[i].charAt(0))) {
                pigLatinizeVowels(constant, s, i);
            } else {
                pigLatinizeConsonants(constant2, s, i);
            }
        }
        return String.join(" ", s);
    }

    private static void pigLatinizeVowels(String constant, String[] s, int i) {
        if (s[i].length() == 1 || i != s.length - 1) {
            s[i] = s[i].concat(constant);
        } else {
            String extras = i == s.length - 1 ? s[i].charAt(s[i].length() - 1) + "" : "";
            s[i] = s[i].substring(0, s[i].length() - 1).concat(constant).concat(extras);
        }
    }

    private static void pigLatinizeConsonants(String constant2, String[] s, int i) {
        if (s[i].length() > 1) {
            String extras = i == s.length - 1 ? s[i].charAt(s[i].length() - 1) + "" : "";
            s[i] = s[i].substring(1, !extras.equals("") ? s[i].length() - 1 : s[i].length()).concat
                    (s[i].charAt(0) + "").concat(constant2).concat(extras).toLowerCase();
            if (i == 0) {
                s[i] = (s[i].charAt(0) + "").toUpperCase() + s[i].substring(1);
            }
        } else {
            s[i] = s[i].concat(constant2);
        }
    }
}




//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String pigLatin(String sentance) {
		char last = sentance.charAt(sentance.length() - 1);
	  	sentance = sentance.substring(0, sentance.length() - 1);
		String[] words = sentance.split(" ");
		String translated = "";
		char ch;
		
		for(int i = 0; i < words.length; i++) {
			ch = Character.toUpperCase(words[i].charAt(0));
			words[i] = words[i].toLowerCase();
			if(ch == 'A' || ch == 'E' || ch == 'U' || ch == 'I' || ch == 'O')
				translated += words[i] + "way ";
			else
				translated += words[i].substring(1) + words[i].charAt(0) + "ay ";
		}
		translated = Character.toUpperCase(translated.charAt(0)) + translated.substring(1, translated.length() - 1) + last;
		return translated;
	}
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static boolean isVowel(char c){
		c = Character.toUpperCase(c);
		if ((c == 'A') ||
			  (c == 'E') ||
			  (c == 'I') ||
			  (c == 'O') ||
			  (c == 'U')) return true;
		else return false;
	}
	public static String translate(String word){
		if (!word.replaceAll("[A-Za-z]", "").equals("")) return translate(word.replaceAll("[^A-Za-z]", "")) + word.replaceAll("[A-Za-z]", "");
		String res;
		if (!isVowel(word.charAt(0))) res = word.substring(1) + word.charAt(0) + "ay";
		else res = word + "way";
		res = res.toLowerCase();
		if (Character.isUpperCase(word.charAt(0))) res = res.substring(0, 1).toUpperCase() + res.substring(1);
		return res;
	}
	public static String pigLatin(String str) {
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++){
			words[i] = translate(words[i]);
		}
		StringBuilder sb = new StringBuilder();
		for (String word: words){
			sb.append(" " + word);
		}
		return sb.toString().substring(1);
	}
}


