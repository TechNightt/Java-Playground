/*********************************************************************************************************************
 Find the Missing Letter
Create a function that takes an array of increasing letters and return the missing letter.

Examples
missingLetter(["a", "b", "c", "e", "f", "g"]) ➞ "d"

missingLetter(["O", "Q", "R", "S"]) ➞ "P"

missingLetter(["t", "u", "v", "w", "x", "z"]) ➞ "y"

missingLetter(["m", "o"]) ➞ "n"

Notes
Tests will always have exactly one letter missing.
The length of the test array will always be at least two.
Tests will be in one particular case (upper or lower but never both).
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Challenge {
	public static String missingLetter(String[] arr) {
		return IntStream.range(0, arr.length - 1)
			.filter(i -> arr[i].charAt(0) + 2 == arr[i+1].charAt(0))
			.mapToObj(i -> "" + (char)(arr[i].charAt(0) + 1))
			.collect(Collectors.joining());
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String missingLetter(String[] arr) {
		String[] temp = new String[26];
    int index = 0; 
		int index2 = 0;
    int startIndex = 0;  
    int endIndex = 0; 
		String missingLetter = "";
    String[] newStr = new String[arr.length+1];
    for(char i = 'a'; i <= 'z'; i++){
      temp[index] = Character.toString(i);
      index++;
    }
    for(int i = 0; i < temp.length; i++){
      if(arr[0].equalsIgnoreCase(temp[i]))
          startIndex = i;
      else if(arr[arr.length-1].equalsIgnoreCase(temp[i]))
          endIndex = i;
    }
    for(int i = startIndex; i <= endIndex; i++){
      newStr[index2] = temp[i];
			index2++;
		}
    for(int i = 0; i < arr.length; i++){
    	if(!newStr[i].equalsIgnoreCase(arr[i])){
      	missingLetter = newStr[i];
				break;
			 }
     }
    return (arr[0].equals(arr[0].toUpperCase())) ? missingLetter.toUpperCase(): missingLetter.toLowerCase();
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String missingLetter(String[] arr) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int indexOfFirstLetter = alphabet.indexOf(arr[0]);
            for (int i=0; i<arr.length; i++) {
                if (!(arr[i].equals("" + alphabet.charAt(indexOfFirstLetter)))) {
                    return "" + alphabet.charAt(indexOfFirstLetter);
                }
                indexOfFirstLetter++;
            }
            return "";	
		
	}
}

