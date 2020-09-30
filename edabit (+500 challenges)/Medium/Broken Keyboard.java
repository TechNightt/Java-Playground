/*********************************************************************************************************************
 Broken Keyboard
Given what is supposed to be typed and what is actually typed, write a function that returns the broken key(s). The function looks like:

findBrokenKeys(correct phrase, what you actually typed)
Examples
findBrokenKeys("happy birthday", "hawwy birthday") ➞ ["p"]

findBrokenKeys("starry night", "starrq light") ➞ ["y", "n"]

findBrokenKeys("beethoven", "affthoif5") ➞ ["b", "e", "v", "n"]

Notes
Broken keys should be ordered by when they first appear in the sentence.
Only one broken key per letter should be listed.
Letters will all be in lower case.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   



import java.util.stream.IntStream;
public class Challenge {
	public static String[] findBrokenKeys(String str1, String str2) {
		return IntStream.range(0, str1.length())
			.filter(i -> str1.charAt(i) != str2.charAt(i))
			.mapToObj(i -> "" + str1.charAt(i))
			.distinct()
			.toArray(String[]::new);
	}
}





//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static String[] findBrokenKeys(String s1, String s2) {
		String r = "";
		for (int i = 0; i < s1.length(); i++){
			if (s1.charAt(i)!=s2.charAt(i) && !r.contains(""+s1.charAt(i)))r+=s1.charAt(i);
		}
		return r.split("");
	}
}






//#############################################################
//#                        MY SOLUTION 3   



import java.util.Arrays;
import java.util.LinkedHashSet;
public class Challenge {
	public static String[] findBrokenKeys(String str1, String str2) {
		String arr[] = new String[str1.length()];
		int j=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				arr[j] = String.valueOf(str1.charAt(i));
				j++;
			}
		}
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<> (Arrays.asList(arr));
		String[] res = linkedHashSet.toArray(new String[] {});
		res = Arrays.stream(res).filter(s -> (s!=null && s.length()>0)).toArray(String[]::new);	
		String fin[] = new String[res.length];
		for(int i=0;i<res.length;i++) {
			fin[i] = res[i];			
		}
	return fin;
}
}






//#############################################################
//#                        MY SOLUTION 4


import java.util.Arrays;
import java.util.LinkedHashSet;

public class Challenge {
	public static String[] findBrokenKeys(String str1, String str2) {
		String[] res = new String[str1.length()];
		int index = 0;
		for (int i=0; i<str1.length(); i++)
		{
			if (str1.charAt(i) != str2.charAt(i)) 
			{
				res[index] = (str1.charAt(i) + "");
				index++;
			}
		}
		
		int nullCount=0;
		for (int i=0; i<res.length; i++)
		{
			if (res[i] == null) {nullCount++;}
		}
		String[] res2 = new String[res.length-nullCount];
		for (int i=0; i<res2.length; i++)
		{
			res2[i] = res[i];
		}
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>( Arrays.asList(res2) );
		String[] resWithoutDupe = linkedHashSet.toArray(new String[] {});
		return resWithoutDupe;
	}
}