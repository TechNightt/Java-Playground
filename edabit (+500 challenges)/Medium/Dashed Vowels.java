/*********************************************************************************************************************
 
Dashed Vowels
Create a function that takes a string and returns dashes on both sides of every vowel (a e i o u).

Examples
dashed("Edabit") ➞ "-E-d-a-b-i-t"

dashed("Carpe Diem") ➞ "C-a-rp-e- D-i--e-m"

dashed("Fight for your right to party!") ➞ "F-i-ght f-o-r y-o--u-r r-i-ght t-o- p-a-rty!"

Notes
A string can contain uppercase and lowercase vowels.
Y is not considered a vowel.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   


public class DashedVowel {
	public static String dashed(String s) {
		return s.replaceAll("(?i)([aeiou])", "-$1-");
	}
}







//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;  
public class DashedVowel {
	public static String dashed(String s) {
		String newString = "";
		HashSet<Character> set=new HashSet();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		
		for (int i = 0; i<s.length(); i++) {
			if (set.contains(Character.toLowerCase(s.charAt(i)))) {
				newString = newString + "-" + s.charAt(i) + "-";
			} else {
				newString = newString + s.charAt(i);
			}
		}
		
		
		return newString;
	}
}












//#############################################################
//#                        MY SOLUTION 3   


public class DashedVowel {
	public static String dashed(String s) {
	        String res ="";
        String vowels = "aeiuoAEIUO";
        for (int i=0; i<s.length();i++){
            if (s.charAt(i)== 'a' || s.charAt(i)== 'e'||s.charAt(i)== 'u' ||s.charAt(i)== 'i'||s.charAt(i)== 'o'
        ||s.charAt(i)== 'A'||s.charAt(i)== 'E'||s.charAt(i)== 'U'|| s.charAt(i)== 'I'||s.charAt(i)== 'O'){
//            for (int j=0;j<vowels.length();j++){
//                if (s.charAt(i)== vowels.charAt(j)){
                    res +="-"+s.charAt(i)+'-';
                }else{
                    res += s.charAt(i);
                }
            }
        return res;	
	}
}





//#############################################################
//#                        MY SOLUTION 4



public class DashedVowel {
	public static String dashed(String s) {
		String str = "";
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c =='i' || c == 'o' || c =='u' || c =='A' || c =='E' || c == 'I' || c =='O' || c =='U'){
				str += ("-" + c + "-");
			} else{
				str += c;
			}
		}
		return str;
	}
}







//#############################################################
//#                        MY SOLUTION 5



public class DashedVowel {
	public static String dashed(String s) {
		    String replace = s.replace("a", "-a-");
        String replace1 = replace.replace("e", "-e-");
        String replace2 = replace1.replace("i", "-i-");
        String replace3 = replace2.replace("o", "-o-");
        String replace4 = replace3.replace("u", "-u-");
        String replace5 = replace4.replace("A", "-A-");
        String replace6 = replace5.replace("E", "-E-");
        String replace7 = replace6.replace("I", "-I-");
        String replace8 = replace7.replace("O", "-O-");
        String replace9 = replace8.replace("U", "-U-");
		return replace9;
	}
}