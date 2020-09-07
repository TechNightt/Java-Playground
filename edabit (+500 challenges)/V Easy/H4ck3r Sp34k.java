
/*********************************************************************************************************************
 
H4ck3r Sp34k
Create a function that takes a string as an argument and returns a coded (h4ck3r 5p34k) version of the string.

Examples
hackerSpeak("javascript is cool") ➞ "j4v45cr1pt 15 c00l"
hackerSpeak("programming is fun") ➞ "pr0gr4mm1ng 15 fun"
hackerSpeak("become a coder") ➞ "b3c0m3 4 c0d3r"

Notes
In order to work properly, the function should replace all "a"s with 4, "e"s with 3, "i"s with 1, "o"s with 0, and "s"s with 5.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static String hackerSpeak(String str) {
	return str.replace('a', '4')
		.replace('e', '3').replace('i', '1')
		.replace('o', '0').replace('s', '5');
	}
}

//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String hackerSpeak(String str) {
		str = str.replaceAll("(?i)a", "4");
		str = str.replaceAll("(?i)e", "3");
		str = str.replaceAll("(?i)i", "1");
		str = str.replaceAll("(?i)o", "0");
		str = str.replaceAll("(?i)s", "5");
		return str;
	}
}

//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String hackerSpeak(String str) {
		
		java.util.HashMap<String, String> replaceMap = new java.util.HashMap<String, String>();
		
		replaceMap.put("a","4");
		replaceMap.put("e","3");
		replaceMap.put("i","1");
		replaceMap.put("o","0");
		replaceMap.put("s","5");
		
		for(String s: replaceMap.keySet()){
			str = str.replaceAll(s,replaceMap.get(s));
		}
		
		return str;
		
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String hackerSpeak(String str) {
    return str.replaceAll("s", "5").replaceAll("o","0").replaceAll("e", "3").replaceAll("i", "1").replaceAll("a", "4");
	}
}



//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
	public static String hackerSpeak(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
				case 'a':
					c = '4';
					break;
				case 'e':
					c = '3';
					break;
				case 'i':
					c = '1';
					break;
				case 'o':
					c = '0';
					break;
				case 's':
					c = '5';
					break;
			}
			sb.append(c);
			}
			return sb.toString();
		}
		
	
}



//#############################################################
//#                        MY SOLUTION 6


public class Challenge {
	public static String hackerSpeak(String str) {
		return str
			.replace('a','4')
			.replace('e','3')
			.replace('i','1')
			.replace('o','0')
			.replace('s','5');
	}
}



//#############################################################
//#                        MY SOLUTION 7


import java.util.HashMap;

public class Challenge {
	public static String hackerSpeak(String str) {
		String regex = "[a,e,i,o,s]";
		HashMap hacker = new HashMap();
		hacker.put('a', 4);
		hacker.put('e', 3);
		hacker.put('i', 1);
		hacker.put('o', 0);
		hacker.put('s', 5);
		
		StringBuilder s = new StringBuilder();
		for(int i=0; i<str.length(); i++){
			if(Character.toString(str.charAt(i)).matches(regex)){
				s.append(hacker.get(str.charAt(i)));
			}else{
				s.append(str.charAt(i));
			}
		}
		return s.toString();
	}
}



//#############################################################
//#                        MY SOLUTION 8


public class Challenge {
	public static String hackerSpeak(String str) {
		String leet = "";
		for (int i = 0 ; i < str.length() ; i ++) {
			switch(str.charAt(i)) {
				case 'a':
					leet += "4";
					break;
				case 'e':
					leet += "3";
					break;
				case 'i':
					leet += "1";
					break;
				case 'o':
					leet += "0";
					break;
				case 's':
					leet += "5";
					break;
				default:
					leet += str.charAt(i);
					break;
			}
		}
		return leet;
	}
}





//#############################################################
//#                        MY SOLUTION 9


public class Challenge {
	public static String hackerSpeak(String str) {
		//String[] a = new String[str.length()];
		String b = "";
		for(int i = 0; i < str.length(); i++){
			if (str.charAt(i) == 'a'){
				b += "4";
			}
			else if (str.charAt(i) == 'e'){
				b += "3";
			}
			else if(str.charAt(i) == 'i'){
				b += "1";
			}
			else if (str.charAt(i) == 'o'){
				b += "0";
			}
			else if(str.charAt(i) == 's'){
				b += "5";
			}
			else {
				b += str.charAt(i);
			}
		}
		return b;
	}
}



//#############################################################
//#                        MY SOLUTION 10


public class Challenge {
	public static String hackerSpeak(String str) {
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i] == 'A' || charArray[i] == 'a') {
				charArray[i] = '4';
			}
			if(charArray[i] == 'E' || charArray[i] == 'e') {
				charArray[i] = '3';
			}
			if(charArray[i] == 'I' || charArray[i] == 'i') {
				charArray[i] = '1';
			}
			if(charArray[i] == 'O' || charArray[i] == 'o') {
				charArray[i] = '0';
			}
			if(charArray[i] == 'S' || charArray[i] == 's') {
				charArray[i] = '5';
			}
		}
		String newStr = String.valueOf(charArray);
		return newStr;
	}
}


//#############################################################
//#                        MY SOLUTION 11



public class Challenge {
	public static String hackerSpeak(String str) {
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c: arr){
			if(c == 'a'){
				sb.append("4");
			}
			else if(c == 'e'){
				sb.append("3");
			}
			else if(c == 'i'){
				sb.append("1");
			}
			else if(c == 'o'){
				sb.append("0");
			}
			else if(c == 's'){
				sb.append("5");
			} 
			else {
				sb.append(""+c);
			}
		}
		return sb.toString();
	}
}