/*********************************************************************************************************************
 Reverse the Odd Length Words
Given a string, reverse all the words which have odd length. The even length words are not changed.

Examples
reverseOdd("Bananas") ➞ "sananaB"

reverseOdd("One two three four") ➞ "enO owt eerht four"

reverseOdd("Make sure uoy only esrever sdrow of ddo length")
➞ "Make sure you only reverse words of odd length"

Notes
There is exactly one space between each word and no punctuation is used.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;
import java.util.stream.Collectors;
public class Challenge {
	public static String reverseOdd(String str) {
		return Arrays.stream(str.split(" "))
			.map(s -> (s.length() % 2 != 0) ? new StringBuilder(s).reverse().toString() : s)
			.collect(Collectors.joining(" "));
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String reverseOdd(String str) {

		String[] arrayOfWords = str.split(" ");

		String ender = "";

		for (int z = 0; z < arrayOfWords.length; z++) {
			String i = arrayOfWords[z];
			String temp = "";

			if (i.length() % 2 != 0) {
				for (int x = i.length() - 1; x >= 0; x--)
					temp = temp.concat(Character.toString(i.charAt(x)));
				i = temp;
			}

			if (z + 1 >= arrayOfWords.length)
				ender = ender.concat(i);
			else
				ender = ender.concat(i + " ");

		}

		return ender;

	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String reverseOdd(String str) {
		String[] array = str.split(" ");
                String rValue = "";
                
                for(int i = 0 ; i<array.length ; i++){
                    if(!(array[i].length() % 2 == 0)){ //odd
                        for(int a = array[i].length() ; a>0 ; a--){ //adding letters to new String 
                            rValue += array[i].charAt(a-1);
                        }
                        if(!(i == array.length-1)){
                            rValue += " ";
                        }
                       
                    }
                     
                    else{//if it's even
                        if(!(i == array.length-1)){
                          rValue += array[i] + " ";
                        }
                        else{
                            rValue += array[i];
                        }
                    }
                }
                return rValue;
	}
}
