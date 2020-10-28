/*********************************************************************************************************************
 Mangle the String

Create a function that takes a string and replaces every letter with the letter following it in the alphabet ("c" becomes "d", "z" becomes "a", "b" becomes "c", etc). Then capitalize every vowel (a, e, i, o, u) and return the new modified string.

Examples
mangle("Fun times!") ➞ "GvO Ujnft!"

mangle("The quick brown fox.") ➞ "UIf rvjdl cspxO gpy."

mangle("Omega") ➞ "Pnfhb"

Notes
If a letter is already uppercase, return it as uppercase (regardless of being a vowel).
"y" is not considered a vowel.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static String mangle(String str) {
		String out="";
		String s="";
		for (char c:str.toCharArray()) {
			if ((c>='a'&&c<'z') || (c>='A'&&c<'Z')) 
				s=""+(char)(c+1);
			else if (c=='z')
				s="a";
			else if (c=='Z')
				s="A";
			else
				s=""+c;
			if (s.matches("[aeiou]"))
				s=s.toUpperCase();
			out+=s;
		}
		return out;
	}
}





//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String mangle(String str) {
		String res = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.toString(c).matches(("[^a-zA-Z0-9\\s+]"))) {
				res = res + c;
			}
			else if(Character.toString(c).equals(" ")) {
				res = res + " ";
			}
			else if (c=='z') {
				res = res + "a";
			}
			else if (c=='Z') {
				res = res + "A";
			}
			else {
				res = res + (char)(c + 1);
			}
		}
		res = res.replace('a','A');
		res = res.replace('e','E');
		res = res.replace('i','I');
		res = res.replace('o','O');
		res = res.replace('u','U');
		return res;
	}
}





//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	/*
	Create a function that takes a string and replaces every letter with
	the letter following it in the alphabet
	("c" becomes "d", "z" becomes "a", "b" becomes "c", etc).
	Then capitalize every vowel (a, e, i, o, u)
	and return the new modified string.
	*/
	public static String mangle(String str) {
		if (str.equals("")) return str;
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (Character.isAlphabetic(chars[i])) {
				chars[i] = (char) (chars[i] + 1);
				if (chars[i] - 1 == 'z') chars[i] = 'a';
				else if (chars[i] - 1 == 'Z') chars[i] = 'A';
				switch (chars[i]) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						chars[i] = Character.toUpperCase(chars[i]);
						break;
				}
			}
		}
		String ret = new String(chars);
		return ret;
	}
}






//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static String mangle(String str) {
		String a = "abcdefghijklmnopqrstuvwxyz";
      char[] alphabet = a.toCharArray();
      char[] word = str.toCharArray();
      
      for (int i = 0; i < str.length(); i++)
      {
         for (int g = 0; g < alphabet.length; g++)
         {
            if (word[i] == alphabet[g])
            {
               if (g == alphabet.length - 1)
               {   
                  word[i] = Character.toUpperCase(alphabet[0]);
                  break;
               }
               
               //a b c d e f g h i j k  l  m  n  o  p  q  r  s  t  u  vwxyz
               //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
               
               else
               {  
                  if (g + 1 == 0 || g + 1 == 4 || g + 1 == 8 || g + 1 == 14 || g + 1 == 20)
                  {
                     word[i] = Character.toUpperCase(alphabet[g + 1]);
                     break;
                  }
                  
                  else
                  {
                     word[i] = alphabet[g + 1];
                     break;
                  }
               }
            }
            else if (word[i] == Character.toUpperCase(alphabet[g]))
            {
               if (g == alphabet.length - 1)
               {
                  word[i] = Character.toUpperCase(alphabet[0]);
                  break;
               }
               
               else
               {
                  word[i] = Character.toUpperCase(alphabet[g + 1]);
                  break;
               }
            }
         }
      }
      return new String(word);

	}
}





//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static String mangle(String str) {
		char ch[] = str.toCharArray();
		for(int i = 0; i< ch.length; i++){
			if(ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122){
				ch[i] = ch[i] == 'Z' || ch[i] == 'z' ? 'A' : ++ch[i];
				if(isVowel(ch[i])) ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		return new String(ch);
	}
	private static boolean isVowel(char ch){
		char v = Character.toUpperCase(ch);
		if(v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U')
			return true;
		else return false;
	}
}