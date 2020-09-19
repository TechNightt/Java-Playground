/*********************************************************************************************************************
 
Grab the City
Write a function to return the city from each of these vacation spots.

Examples
grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"

grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"

grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]") ➞ "Kyoto"

Notes
There may be additional brackets, but the city will always be in the last bracket pair.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String grabCity(String str) {
		return str.substring(str.lastIndexOf('[')+1, str.lastIndexOf(']'));
	}
}




//#############################################################
//#                        MY SOLUTION 2   


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
	public static String grabCity(String str) {
        Pattern pattern = Pattern.compile("\\[([a-zA-Z ]+)\\]");
        Matcher matcher = pattern.matcher(str);
        String city = null;
        while(matcher.find()) {
            city = matcher.group(1);
        }
        return city;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String grabCity(String str) {
		int begin = str.lastIndexOf("[");
	  	int end = str.lastIndexOf("]");
	  	return str.substring(begin+1, end);
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String grabCity(String str) {
		   String[]city = new String[str.length()];
            String holder ="";
            for(int i = 0; i<str.length() ; i++){
                    String answer = str.substring(str.lastIndexOf("[")+1 , str.lastIndexOf("]"));
                    city[i] = answer;
                    holder = city[0];
            }
            return holder;
	}
}