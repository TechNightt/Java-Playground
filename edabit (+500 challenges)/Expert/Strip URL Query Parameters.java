/*********************************************************************************************************************
 Strip URL Query Parameters

Create a function that takes a URL (string), removes duplicate query parameters and parameters specified within the 2nd argument (which will be an optional array).

Examples
stripUrlParams("https://edabit.com?a=1&b=2&a=2") ➞ "https://edabit.com?a=2&b=2"

stripUrlParams("https://edabit.com?a=1&b=2&a=2", ["b"]) ➞ "https://edabit.com?a=2"

stripUrlParams("https://edabit.com", ["b"]) ➞ "https://edabit.com"


Notes
The 2nd argument paramsToStrip is optional.
paramsToStrip can contain multiple params.
If there are duplicate query parameters with different values, use the value of the last occurring parameter (see examples #1 and #2 above).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



import java.util.HashMap;

public class Challenge {
	public static String stripUrlParams(String url, String[] paramsToStrip) {
		if (!url.contains("?")) return url;
		
		String[] surl = url.split("\\?");
		String[] params = surl[1].split("\\&");
		HashMap<String, String> dict = new HashMap<>();
		
		for (String v : params) {
			dict.put(v.substring(0, 1), v);
		}
		
		if (paramsToStrip != null) for (String k : paramsToStrip) {
			dict.remove(k);
		}
		
		return surl[0] + "?" + String.join("&", dict.values());
	}
}




//#############################################################
//#                        MY SOLUTION 2   



import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Challenge {
	public static String stripUrlParams(String url, String[] paramsToStrip) {
		if(!url.contains("?")) {
            return url;
        }
        if(Objects.isNull(paramsToStrip)) {
            paramsToStrip = new String[0];
        }
        Set<String> paramsToStripSet = Arrays.stream(paramsToStrip).collect(Collectors.toSet());
        String[] params = url.split("\\?");
        String parameters = Arrays.stream(params[1].split("&")).map(param -> param.split("="))
                .filter(param -> !paramsToStripSet.contains(param[0]))
                .collect(Collectors.toMap(param -> param[0], param -> param[1], (p1, p2) -> p2, TreeMap::new))
                .entrySet().stream().map(param -> String.format("%s=%s", param.getKey(), param.getValue()))
                .collect(Collectors.joining("&"));

        return String.format("%s?%s", params[0], parameters);
	}
}



//#############################################################
//#                        MY SOLUTION 3   



import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge {
  public static String stripUrlParams(String url, String[] paramsToStrip) {
    int parametersIndex = url.indexOf('?');

    if (parametersIndex == -1) {
      return url;
    }

    String firstPart = url.substring(0, ++parametersIndex);

    Map<String, String> parameters =
        Stream.of(url.substring(parametersIndex).split("&"))
            .map(param -> param.split("=", 2))
            .filter(
                param -> 
                  param.length == 2
                  && (paramsToStrip == null || !arrayContains(paramsToStrip, param[0]))
            )
            .collect(
                Collectors.toMap(
                    param -> param[0], 
                    param -> param[1], 
                    (existing, replacement) -> replacement)
            );

    return 
        firstPart 
        + parameters.entrySet()
            .stream()
            .map(entry -> entry.getKey() + '=' + entry.getValue())
            .collect(Collectors.joining("&"));
  }

  private static boolean arrayContains(String[] array, String value) {
    for (int i = 0; i < array.length; ++i) {
      if (array[i].equals(value)) {
        return true;
      }
    }

    return false;
  }

  public static String stripUrlParamsUsingLoop(String url, String[] paramsToStrip) {
    int index = url.indexOf('?') + 1;

    if (index == 0) {
      return url;
    }

    String firstPart = url.substring(0, index);

    Map<String, String> params = new HashMap<>();

    while (index < url.length()) {
      int start = index;

      index = url.indexOf('=', index);

      if (index == -1) {
        index = start + 1;
        continue;
      }

      String name = url.substring(start, index);
      start = ++index;
      index = url.indexOf('&', index);

      if (index == -1) {
        index = url.length();
      }

      if (paramsToStrip == null || !arrayContains(paramsToStrip, name)) {
        params.put(name, url.substring(start, index));
      }

      ++index;
    }


    return firstPart + params.entrySet().stream()
        .map(entry -> entry.getKey() + '=' + entry.getValue()).collect(Collectors.joining("&"));
  }
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.*;

public class Challenge {
	public static String stripUrlParams(String url, String[] paramsToStrip) {
		String sol = "";
		
		String[] splitQ = url.split("\\?");
		if(splitQ.length == 1) return splitQ[0];
		sol += splitQ[0] + "?";
		List<String> splitA = new ArrayList<String>(Arrays.asList(splitQ[1].split("&")));
		
		//strip params
		if(paramsToStrip != null){
			for(int i = 0; i < splitA.size(); i++){
				for(int j = 0; j < paramsToStrip.length; j++){
					if(splitA.get(i).matches(paramsToStrip[j] + "=.+")){
						splitA.remove(i);
					}
				}
			}
		}
		
		//remove duplicates
		for(int i = splitA.size()-1; i >= 0; i--){
			for(int j = i-1; j >= 0; j--){
				if(splitA.get(j).split("=")[0].equals(splitA.get(i).split("=")[0])){
					splitA.remove(j);
					j--;
				}
			}
		}
		
		//sort
		Collections.sort(splitA, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.split("=")[0].compareTo(s2.split("=")[0]);
			}
		});
		
		for(int i = 0; i < splitA.size(); i++){
			sol += splitA.get(i) + "&";
		}
		
		return sol.substring(0, sol.length() - 1);
	}
}