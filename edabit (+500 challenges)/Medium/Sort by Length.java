/*********************************************************************************************************************
 Sort by Length

Create a function that takes a string and returns a string ordered by the length of the words. From shortest to longest word. If there are words with the same amount of letters, order them alphabetically.

Examples
sortByLength("Hello my friend") ➞ "my Hello friend"

sortByLength("Have a wonderful day") ➞ "a day Have wonderful"

sortByLenght("My son loves pineapples") ➞ "My son loves pineapples"

Notes
Punctuation (periods, commas, etc) belongs to the word in front of it.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
import java.util.stream.Collectors;
public class Challenge {
  public static String sortByLength(String str) {
		return Arrays.stream(str.split("\\s"))
			.sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
			.sorted((s1, s2) -> s1.length() - s2.length())
			.collect(Collectors.joining(" "));
  }
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.*;
import java.util.stream.Collectors;

public class Challenge {
  public static String sortByLength(String str) {
		String[] words = str.split(" ");
		
		int[] sizes = Arrays.stream(words).mapToInt(String::length).distinct().sorted().toArray();
		
		List<String> list = new ArrayList<>();
		for (int i = 0; i < sizes.length; i++) {
			int finalI = i;
			list.addAll(Arrays.stream(words).filter(s -> s.length() == sizes[finalI]).sorted(ALPHABETICAL_ORDER).collect(Collectors.toList()));
		}
		return String.join(" ", list);
  }
	
	private static final Comparator<String> ALPHABETICAL_ORDER = (str1, str2) -> {
		int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
		return (res != 0) ? res : str1.compareTo(str2);
	};

}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;
public class Challenge {
  public static String sortByLength(String str) {
        String[] splitted = str.split(" ");
        Arrays.sort(splitted, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) { 
        if (o1.length() == o2.length())return o1.toLowerCase().compareTo(o2.toLowerCase());
        return o1.length() - o2.length(); }});
		
         return Arrays.stream(splitted)
					            .map(c -> c+" ")
					            .reduce("",String::concat).trim();
	   }
	}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
    public static String sortByLength(String str) {
              String[] words = str.split(" ");
  
              java.util.Arrays.sort(words, (o1, o2) -> {
                      if (o1.length() > o2.length() || o1.length() == o2.length() && o1.toLowerCase().compareTo(o2.toLowerCase()) >= 0)
                              return 1;
  
                      return -1;
              });
  
              return String.join(" ", words);
    }
  }


  


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.*;
public class Challenge {
  public static String sortByLength(String s) {
		String[] a=s.split(" ");
		for (int i=1; i<a.length; i++)
			for (int j=0; j<a.length; j++)
				if ( 
					a[i].length()<a[j].length() ||
					(a[i].length()==a[j].length() && sort(a[i], a[j], true)==-1) ||
					(a[i].length()==a[j].length() && sort(a[i], a[j], true)==0 && sort(a[i], a[j], false)==-1)
				) {
					String tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
		return String.join(" ", Arrays.asList(a));
  }
	private static int sort(String a, String b, boolean c) {
		if (c) {
			a=a.toLowerCase();
			b=b.toLowerCase();
		}
		for (int i=0; i<a.length() && i<b.length(); i++)
			if (a.charAt(i)<b.charAt(i)) return -1;
			else if (a.charAt(i)>b.charAt(i)) return 1;
		return 0;
	}
}





//#############################################################
//#                        MY SOLUTION 5
//#############################################################


public class Challenge {
    public static String sortByLength(String str) {
              String[] words = str.split(" ");
  
              java.util.Arrays.sort(words, (o1, o2) -> {
                      if (o1.length() > o2.length() || o1.length() == o2.length() && o1.toLowerCase().compareTo(o2.toLowerCase()) >= 0)
                              return 1;
  
                      return -1;
              });
  
              return String.join(" ", words);
    }
  }