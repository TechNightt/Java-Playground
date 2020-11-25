/*********************************************************************************************************************
 Count the Number of Duplicate Characters


Create a function that takes a string and returns the number of alphanumeric characters that occur more than once.

Examples
duplicateCount("abcde") ➞ 0

duplicateCount("aabbcde") ➞ 2

duplicateCount("Indivisibilities") ➞ 2

duplicateCount("Aa") ➞ 0
// Case sensitive


Notes
Duplicate characters are case sensitive.
The input string will contain only alphanumeric characters.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


import java.util.function.Function;
import java.util.stream.Collectors;
public class Challenge {
	public static int duplicateCount(String str) {
		return (int)str.chars()
			.boxed()
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.values()
			.stream()
			.filter(count -> count > 1)
			.count();
  }
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;
public class Challenge {
	public static int duplicateCount(String str) {
		

	char [] charr = str.toCharArray();
	
	Arrays.sort(charr);
	
	for(char a : charr) {
		System.out.print(a);
	}
	
	System.out.println("-----------------");
	int count = 0;

	ArrayList<String> al1 = new ArrayList<>();
	
	for(int i = 0 ; i < charr.length-1 ; i++) {
		if(charr[i] == charr[i+1]) {
			System.out.println(charr[i] + " and " + charr[i+1]);
			if(!al1.contains(charr[i]+"")) {
				al1.add(charr[i]+"");
				count++;
			}
			System.out.println(al1);
		}
	}
	
	return (count);
	


  }
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int duplicateCount(String s) {
		int nrOfDuplicates = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                nrOfDuplicates++;
            }
            if (s.indexOf(Character.toUpperCase(c)) != s.lastIndexOf(Character.toUpperCase(c))) {
                nrOfDuplicates++;
            }
        }
        for (char n = '0'; n <= '9'; n++) {
            if (s.indexOf(n) != s.lastIndexOf(n)) {
                nrOfDuplicates++;
            }
        }
        return nrOfDuplicates;
  }
}




//#############################################################
//#                        MY SOLUTION 4


import java.util.*;
public class Challenge {
public static int duplicateCount(String str) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++){
			char temp = str.charAt(i);
			
			if(map.containsKey(temp)){
				int a = map.get(temp);
				map.put(temp, a + 1);
			}
			else
				map.put(temp, 1);
		}
		
		Collection<Integer> col = map.values();
		
		Integer[] arr = col.toArray(new Integer[col.size()]); 
		
		int ans = 0;
		
		for(int a: arr)
			if(a > 1)
				ans++;
				
		return ans;
}
}