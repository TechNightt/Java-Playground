/*********************************************************************************************************************
 Reorder Digits
Create a function that reorders the digits of each numerical element in an array based on ascending (asc) or descending (desc) order.

Examples
reorderDigits([515, 341, 98, 44, 211], "asc") ➞ [155, 134, 89, 44, 112]

reorderDigits([515, 341, 98, 44, 211], "desc") ➞ [551, 431, 98, 44, 211]

reorderDigits([63251, 78221], "asc") ➞ [12356, 12278]

reorderDigits([63251, 78221], "desc") ➞ [65321, 87221]

reorderDigits([1, 2, 3, 4], "asc")  ➞ [1, 2, 3, 4]

reorderDigits([1, 2, 3, 4], "desc") ➞ [1, 2, 3, 4]

Notes
Single-digit numbers should be ordered the same regardless of direction.
Numbers in the array should be kept the same order.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;
import java.util.Comparator;
public class Challenge {
	public static int[] reorderDigits(int[] arr, String orderBy) {
		return Arrays.stream(arr)
			.map(n -> Integer.parseInt(("" + n).chars()
				.mapToObj(cp -> (char)cp)
				.sorted(orderBy.equals("asc") ? Comparator.naturalOrder()
						: Comparator.reverseOrder())
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString()))
			.toArray();
	}
}





//#############################################################
//#                        MY SOLUTION 2   



import java.util.Arrays;

public class Challenge {
    public static int[] reorderDigits(int[] arr, String orderBy) {
        int[] output = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            output[i] = reorderNumbersDigits(arr[i], orderBy);
        }

        return output;
    }

    public static int reorderNumbersDigits(int num, String orderBy){
        StringBuilder output = new StringBuilder();
        String numString = Integer.toString(num);
        char[] digits = numString.toCharArray();
        Arrays.sort(digits);
        for(int i = 0; i < digits.length; i++){
            output.append(digits[i]);
        }
        if(orderBy == "desc")
            output = output.reverse();
        return Integer.parseInt(output.toString());
    }
}





//#############################################################
//#                        MY SOLUTION 3   


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge {

   	public static int[] reorderDigits(int[] arr, String orderBy) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = orderIt(arr[i], orderBy);
		}

		return arr;
	}

	private static int orderIt(int num, String order) {

		List<Integer> lst = new ArrayList<>();
		while (num > 0) {
			lst.add(num % 10);
			num /= 10;
		}

		if (order.equals("asc")) {
			Collections.sort(lst);
		} else {
			Collections.sort(lst, Collections.reverseOrder());
		}

		int answer = 0;
		for (int i = 0; i < lst.size(); i++) {
			answer = answer * 10 + lst.get(i);
		}

		return answer;
	}
}


//#############################################################
//#                        MY SOLUTION 4



import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;
	
public class Challenge {
	public static int[] reorderDigits(int[] arr, String orderBy) {
    return IntStream.of(arr)
        .map(x -> Integer.parseInt(Stream.of(("" + x)
				    .split(""))
						.sorted("asc".equals(orderBy) 
										? Comparator.naturalOrder() 
										: Comparator.reverseOrder())
						.collect(Collectors.joining())))
        .toArray();
	}
}