/*********************************************************************************************************************
 Difference Cipher

It's time to send and receive secret messages.

Create two functions that take a string and an array and returns a coded or decoded message.

The first letter of the string, or the first element of the array represents the Character Code of that letter. The next elements are the differences between the characters: e.g. A +3 --> C or z -1 --> y.

Examples
encrypt("Hello") ➞ [72, 29, 7, 0, 3]
// H = 72, the difference between the H and e is 29 (upper- and lowercase).
// The difference between the two l's is obviously 0.

decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!"

encrypt("Sunshine") ➞ [83, 34, -7, 5, -11, 1, 5, -9]


Notes
The input of the encrypt function will always be a string.
The input of the decrypt function will always be an array with numbers.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int[] encrypt(String str) {
		int[] initialArr = new int[str.length()];
        int[] finalArr = new int[initialArr.length];

        for (int i = 0; i < initialArr.length; i++) {
            initialArr[i] = Character.codePointAt(str, i);
        }

        for (int i = 0; i < finalArr.length; i++) {
            finalArr[i] = initialArr[i];

            if (i > 0) {
                finalArr[i] = initialArr[i] - initialArr[i-1];
            }
        }

        return finalArr;
	}

	public static String decrypt(int[] arr) {
		StringBuffer finalMessage = new StringBuffer();
        int[] decryptedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            decryptedArr[i] = arr[i];

            if (i > 0) {
                decryptedArr[i] = arr[i] + decryptedArr[i-1];
            }
        }

        for (int element : decryptedArr) {
            finalMessage.append(Character.toChars(element));
        }

        return finalMessage.toString();
	}
}




//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;
import java.util.stream.IntStream;

public class Challenge {
	public static int[] encrypt(String str) {
		return IntStream.range(0, str.length())
            .map(i -> i == 0 ? str.charAt(i) : str.charAt(i) - str.charAt(i - 1))
            .toArray();
	}

	public static String decrypt(int[] arr) {
		StringBuilder sb = new StringBuilder();
    int current = arr[0];
    for (int i = 0; i < arr.length; i++) {
        current = i == 0 ? current : current + arr[i];
        sb.append((char) current);
    }

    return sb.toString();
	}
}


