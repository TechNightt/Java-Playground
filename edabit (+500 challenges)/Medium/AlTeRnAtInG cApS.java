/*********************************************************************************************************************
 AlTeRnAtInG cApS

Create a method that alternates the case of the letters in a string (known as Spongecase).

Examples
alternatingCaps("Hello") ➞ "HeLlO"

alternatingCaps("How are you?") ➞ "HoW aRe YoU?"

alternatingCaps("OMG this website is awesome!") ➞ "OmG tHiS wEbSiTe Is AwEsOmE!"

Notes
The first letter should always be UPPERCASE.
Ignore spaces.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program {
	public static String alternatingCaps(String s) {
		boolean upper = true;
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			char ch = c;
			if (ch != ' ') {
				ch = (upper) ? Character.toUpperCase(c) : Character.toLowerCase(c);
				upper = !upper;
			}
			sb.append(ch);
		}
		return sb.toString();
	}
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program {
	public static String alternatingCaps(String s) {
		if (s == null || s.equals("")) return s;
		StringBuilder sb = new StringBuilder(Character.toUpperCase(s.charAt(0)) + "");
		boolean lower = true;
		for (int i = 1; i < s.length(); i++) {
			if ( !Character.isLetter(s.charAt(i)) ) {
				sb.append(s.charAt(i));
			} else {
				if (lower) {
						sb.append(Character.toLowerCase(s.charAt(i)));
						lower = false;
					} else {
						sb.append(Character.toUpperCase(s.charAt(i)));
						lower = true;
				}
			}
		}
		return sb.toString();
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Program {
	public static String alternatingCaps(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				ch = (counter % 2 == 1) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
				counter++;
			} 
			sb.append(ch);
		}
		return sb.toString();
	}
}








//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Program {
	public static String alternatingCaps(String s) {
		String res = "";
		boolean caps = true;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != ' ' && caps) {
				res += Character.toUpperCase(s.charAt(i));
				caps = false;
			}else if(s.charAt(i) != ' ' && !caps) {
				res += Character.toLowerCase(s.charAt(i));
				caps = true;
			}else res += s.charAt(i);
		}
		return res;
	}
}