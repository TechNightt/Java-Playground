/*********************************************************************************************************************
 Remove the Last Vowel
Write a function that removes the last vowel in each word in a sentence.

Examples
removeLastVowel("Those who dare to fail miserably can achieve greatly.")
➞ "Thos wh dar t fal miserbly cn achiev gretly."

removeLastVowel("Love is a serious mental disease.")
➞ "Lov s  serios mentl diseas"

removeLastVowel("Get busy living or get busy dying.")
➞ "Gt bsy livng r gt bsy dyng"


Notes
Vowels are: a, e, i, o, u (both upper and lowercase).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static String removeLastVowel(String str) {
		return str.replaceAll("\\b(\\w*)(?i)[aeiou](?=\\w*\\b)", "$1");
	}
}





//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String removeLastVowel(String str) {
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length;i++) {
			String s = "";
			boolean id = 	false;
			for (int j = arr[i].length()-1; j >= 0; j--) {
				char ch = arr[i].charAt(j);
				if (!id && isVowel(ch)) id = true;
			  else s = ch + s;
			}
			arr[i] = s;
		}
		String s1 = arr[0];
		for (int i = 1; i < arr.length; i++) s1 += " "+arr[i];
		return s1;
	}
	public static boolean isVowel(char ch) {
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
			  ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') return true;
		return false;
	}
}






//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String removeLastVowel(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                char symbol = word.charAt(j);

                boolean isVowel = symbol == 'a' || symbol == 'e' ||
                                  symbol == 'i' || symbol == 'o' ||
                                  symbol == 'u' || symbol == 'A' ||
                                  symbol == 'E' || symbol == 'I' ||
                                  symbol == 'O' || symbol == 'U';

                if (isVowel) {
                    result.append(word, 0, j);

                    if (j != word.length() - 1) {
                        result.append(word, j + 1, word.length());
                    }

                    if (word.charAt(word.length() - 1) != '.') {
                        result.append(" ");
                    }

                    break;
                }
            }

        }
        return result.toString();
    }
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static String removeLastVowel(String str) {
		String result = "";
		String[] words = str.split(" ");
		for (String word: words) {
			result += getWordWithoutLastVowel(word) + " ";
		}
		return result.substring(0, result.length() - 1);
	}
	public static String getWordWithoutLastVowel(String word) {
		int lastVowelIndex = -1;
		for(int i = 0; i < word.length(); i++) {
			char c = Character.toLowerCase(word.charAt(i));
			if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i') {
				lastVowelIndex = i;
			}
		}
		if(lastVowelIndex >= 0) {
			return word.substring(0, lastVowelIndex++) + word.substring(lastVowelIndex);
		}
		return word;
	}
}



//#############################################################
//#                        MY SOLUTION 5



import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge {
	public static String removeLastVowel(String str) {
    return Stream.of(str.split(" "))
        .map(s -> {
              Pattern p = Pattern.compile("(?i)[aeiou]"); 
              Matcher m = p.matcher(s);
							int pos = -1;
              while (m.find()) {
								pos = m.start();
							}
              return pos > -1 ? s.substring(0, pos) + s.substring(pos + 1) : s;
            })
        .collect(Collectors.joining(" "));
	}
}








//#############################################################
//#                        MY SOLUTION 6



public class Challenge {
	public static String removeLastVowel(String str) {
		String [] words = str.split(" ");
		String fw = "";
		
		for(int i = 0; i < words.length; i++){
			String word = words[i];
			for(int j = word.length() - 1; j >= 0; j--) {
				String letter = word.substring(j, j+1);
				if(letter.equalsIgnoreCase("A") ||
					 letter.equalsIgnoreCase("E") ||
					 letter.equalsIgnoreCase("I") ||
					 letter.equalsIgnoreCase("O") ||
					 letter.equalsIgnoreCase("U")) {
					fw += " " + word.substring(0, j) + word.substring(j+1, word.length());
					break;
				}
			}
		}
		return fw.trim();
	
	}
		
}