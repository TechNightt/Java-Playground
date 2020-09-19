/*********************************************************************************************************************
 Prefixes vs. Suffixes

Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).

isPrefix should return true if it begins with the prefix argument.
isSuffix should return true if it ends with the suffix argument.
Otherwise return false.

Examples
isPrefix("automation", "auto-") ➞ true

isSuffix("arachnophobia", "-phobia") ➞ true

isPrefix("retrospect", "sub-") ➞ false

isSuffix("vocation", "-logy") ➞ false

Notes
The prefix and suffix arguments have dashes - in them.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Program {
	public static boolean isPrefix(String w, String p) {
		return w.startsWith(p.replace("-",""));
	}

	public static boolean isSuffix(String w, String s) {
		return w.endsWith(s.replace("-",""));
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static boolean isPrefix(String word, String prefix) {
			if(word.startsWith(prefix.substring(0, prefix.length() - 1))) {
				return true;
			} else {
				return false;
			}
    }

    public static boolean isSuffix(String word, String suffix) {
			if(word.endsWith(suffix.substring(1, suffix.length()))) {
				return true;
			} else {
				return false;
			}
    }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static boolean isPrefix(String word, String prefix) {
			 prefix = prefix.substring(0, prefix.length() - 1);
        for (int i = 0; i < prefix.length(); i++) {
            if (word.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSuffix(String word, String suffix) {
			suffix = suffix.substring(1);
        int count = 0;
        for (int i = word.length() - suffix.length(); i < word.length(); i++) {
            if (word.charAt(i) != suffix.charAt(count)) {
                return false;
            }
            count++;
        }
        return true;
    }
}


