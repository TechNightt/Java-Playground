/*********************************************************************************************************************
 Return the Objects Keys and Values

Create a method that takes a Map<String, String> and return the values as a separate array.

Examples
getValues({ "a": "1", "b": "2", "c": "3" } )
➞ ["1", "2", "3"]

getValues({ "a": "Apple", "b": "Microsoft", "c": "Google" })
➞ ["Apple", "Microsoft", "Google"]

getValues({ "key1": "true", "key2": "false", "key3": "undefined" })
➞ ["true", "false", "undefined"]

Notes
Remember to sort the keys.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


import java.util.Map;

public class Program {
    public static String[] getValues(Map<String,String> dict) {
      return dict.values().toArray(new String[0]);
    }
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.Map;

public class Program {
    public static String[] getValues(Map<String,String> dict) {
		String[] values = new String[dict.size()];
		Object[] keys = dict.keySet().toArray();
		for (int i = 0; i < values.length; i++) {
			values[i] = dict.get(keys[i]);
		}
		return values;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class Program {
    public static String[] getValues(Map<String,String> dict) {
     	return dict.values().stream()
				.collect(Collectors.toCollection(LinkedHashSet::new))
				.toArray(new String[0]);
    }
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.Map;

public class Program {
    public static String[] getValues(Map<String,String> dict) {

        String [] values = new String[dict.size()];
        for (String s : values = dict.values().toArray(new String[0])) {
        }
        return values;
        
    }
}