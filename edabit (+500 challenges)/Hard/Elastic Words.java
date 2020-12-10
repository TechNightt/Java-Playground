/*********************************************************************************************************************
 Elastic Words

In this challenge, you must think about words as elastics. What happens when do you tend an elastic applying a constant traction force at both ends? Every part (or letter, in this case) of the elastic will expand, with the minimum expansion at the ends, and the maximum expansion in the center.

If the word has an odd length, the effective central character of the word will be the pivot that splits the word into two halves.

"ABC" -> Left = "A" | Center = "B" | Right = "C"
If the word has an even length, you will consider two parts of equal length, with the last character of the left half and the first character of the right half being the center.

"ABCD" -> Left = "AB" | Right = "CD"
You will represent the expansion of a letter repeating it as many times as its numeric position (so counting the indexes from/to 1, and not from 0 as usual) in its half, with a crescent order in the left half and a decrescent order in the right half.

Word = "ANNA" 

Left = "AN"
Right = "NA"

Left = "A" * 1 + "N" * 2 = "ANN"
Right = "N" * 2 + "A" * 1 = "NNA"

Word = Left + Right = "ANNNNA"
If the word has an odd length, the pivot (the central character) will be the peak (as to say, the highest value) that delimits the two halves of the word.

Word = "KAYAK"

Left = "K" * 1 + "A" * 2 = "KAA"
Pivot = "Y" * 3 = "YYY"
Right = "A" * 2 + "K" * 1 = "AAK"

Word = Left + Pivot + Right = "KAAYYYAAK"
Given a word, implement a function that returns the elasticized version of the word as a string.

Examples
elasticize("ANNA") ➞ "ANNNNA"

elasticize("KAYAK") ➞ "KAAYYYAAK"

elasticize("X") ➞ "X"


Notes
For words with less than three characters, the function must return the same word (no traction appliable).
Remember, into the left part characters are counted from 1 to the end, and, in reverse order until 1 is reached, into the right.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



import java.util.LinkedList;
public class Challenge {
	public static String elasticize(String word) {
        if (word.length() < 3) {
            return word;
        }
        int len = word.length();
        char[] arr = word.toCharArray();
        LinkedList<Character> list1 = new LinkedList<>();
        LinkedList<Character> list2 = new LinkedList<>();
        for (int i = 0; i < len/2; i++) {
            int j  = i;
            while(j + 1 > 0) {
                list1.addLast(arr[i]);
                list2.addFirst(arr[arr.length - 1 - i]);
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c: list1) {
            sb.append(c);
        }
        for (Character c: list2) {
            sb.append(c);
        }
        StringBuilder sb1 = new StringBuilder();
        if (len % 2 == 1) {
            int mid = len / 2 + 1;
            while (mid > 0) {
                sb1.append(arr[len / 2]);
                mid--;
            }
        }
        sb.insert(sb.length()/2, sb1.toString());
        return sb.toString();
    }
}




//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String elasticize(String word) {
		        if(word.length() == 1) {
            return word;
        }


        String right = "";
        String left = "";
        int length = (word.length() % 2 == 0) ? word.length() / 2 : (word.length() / 2) + 1;

        for(int i = 0; i < length; i++) {
            if(word.length() % 2 != 0 && (length - 1) - i == 0) {
                for(int j = 0; j <= i; j++) {
                    right += String.valueOf(word.charAt(i));
                }
            } else {
                for(int j = 0; j <= i; j++) {
                    right += String.valueOf(word.charAt(i));
                    left = String.valueOf(word.charAt((word.length() - 1) - i)) + left;
                }
            }
        }

        return right + left;
	}
}




//#############################################################
//#                        MY SOLUTION 3   



import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Challenge {
	public static String elasticize(String word) {
		int p = (word.length() - 1)/2;
		return IntStream.range(0, word.length())
			.mapToObj(i -> (i <= p) ? repeat("" + word.charAt(i), i + 1)
				: repeat("" + word.charAt(i), word.length() - i))
			.collect(Collectors.joining());
	}
	
	//or use repeat() method of String class with java 11
	private static String repeat(String str, int length) {
		return String.join("", Collections.nCopies(length, str));
	}
}




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static String elasticize(String word) {
  int length = word.length();
  if (length == 2) {
    return word;
  }
  StringBuilder sb = new StringBuilder();

  for (int i = 0; i < length / 2; i++) {
    append_repeatingChars(sb, word.charAt(i), i + 1);
  }

  for (int i = (length / 2); i < length; i++) {
    append_repeatingChars(sb, word.charAt(i), length - i);
  }

  return sb.toString();
}

private static void append_repeatingChars(StringBuilder sb, char ch, int repetitions) {
  while (repetitions > 0) {
    sb.append(ch);
    repetitions--;
  }
}
}