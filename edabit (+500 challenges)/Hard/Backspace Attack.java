/*********************************************************************************************************************
 Backspace Attack
Suppose a hash # represents the BACKSPACE key being pressed. Write a function that transforms a string containing # into a string without any #.

Examples
erase("he##l#hel#llo") ➞ "hello"

erase("major# spar##ks") ➞ "majo spks"

erase("si###t boy") ➞ "t boy"

erase("####") ➞ ""


Notes
In addition to characters, backspaces can also remove whitespaces.
If the number of hashes exceeds the previous characters, remove those previous characters entirely (see example #3).
If there only exist backspaces, return an empty string (see example #4).
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String erase(String str) {
		while (str.contains("#")) {
			int index = str.indexOf("#");
			if (index-1 >= 0 && 
					(Character.isAlphabetic(str.charAt(index-1)) ||
					Character.isSpaceChar(str.charAt(index-1))) ) {
						String erase = Character.toString(str.charAt(index-1));
						str = str.replaceFirst(erase+"#","");
				} else {
						str = str.replaceFirst("#","");
				}
		}
		return str;		
	}
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String erase(String str) {
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (c == '#') {
				if (sb.length() != 0) {
					sb.deleteCharAt(sb.length()-1);
				}
			}
			else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String erase(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '#' && builder.length() != 0) {
				builder.deleteCharAt(builder.length() - 1);
			}
			else {
				builder.append(c);
			}
		}
		return builder.toString().replace("#","");
	}
}





//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static String erase(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != '#') { s += c; }
			else { s = (s.length() > 0) ? s.substring(0, s.length() - 1) : s; }
		}
		return s;
	}
}







//#############################################################
//#                        MY SOLUTION 5




import java.util.*;
public class Challenge 
{
    public static String erase(String str) 
    {
        int i,count=0;
        ArrayList<Character> al=new ArrayList<Character>();
        for(i=0;i<str.length();i++)
        {
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || str.charAt(i)==' ')
            {
                al.add(str.charAt(i));
                count++;
            }
            else if(str.charAt(i)=='#' && al.size()!=0)
            {
                al.remove(count-1);
                count--;
            }
        }
        String temp="";
        for(i=0;i<al.size();i++)
            temp+=String.valueOf(al.get(i));
        return temp;
    }
}