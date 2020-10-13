/*********************************************************************************************************************
 CMS Selector Based on a Given String

Create a function that takes an array and a string as arguments and returns the array of CMSs that include the given string. Return the names in an array in alphabetical order.

Examples
cmsSelector(["WordPress", "Joomla", "Drupal"], "w") ➞ ["WordPress"]

cmsSelector(["WordPress", "Joomla", "Drupal", "Magento"], "ru") ➞ ["Drupal"]

cmsSelector(["WordPress", "Joomla", "Drupal", "Magento"], "") ➞ ["Drupal", "Joomla", "Magento", "WordPress"]

Notes
The given letter(s) are case sensitive and can be more than one.
In the case of an empty string, return the entire array.
A CMS is a Content Management System.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.Arrays;

public class CMS {
	public static String[] cmsSelector(String[] c, String r) {
		Arrays.sort(c);
		return Arrays.stream(c).filter(s -> s.matches("(?i).*" + r + ".*")).toArray(String[]::new);
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CMS {
	public static String[] cmsSelector(String[] cms, String re) {
		List<String> list = new ArrayList<String>();
		for (String s : cms) {
			if (s.toLowerCase().contains(re) || s.contains(re)) {
				list.add(s);
			}
		}

		Collections.sort(list);
		return list.toArray(new String[list.size()]);

	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
public class CMS {
	public static String[] cmsSelector(String[] cms, String re) {
		return re.isEmpty() ?
                    Arrays.stream(cms)
                .sorted(String::compareToIgnoreCase)
                .toArray(String[]::new) :
                    Arrays.stream(cms)
                .sorted(Comparator.naturalOrder())
                .filter(str -> str.toLowerCase().startsWith(re) || str.toLowerCase().contains(re))
                .toArray(String[]::new);
	}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.Arrays;
public class CMS {
	public static String[] cmsSelector(String[] cms, String re) {
		 return Arrays.stream(cms).filter(i->i.toLowerCase().contains(re.toLowerCase())).sorted().toArray(String[]::new);
	
	}
}S