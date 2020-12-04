/*********************************************************************************************************************
 Encoded String Parse
Create a function which takes in an encoded string and returns an object according to the following example:

Examples
parseCode("Tesha000Deep00014344") ➞ {
  "firstName"="Tesha",
  "lastName"="Deep",
  "id"="14344"
}

parseCode("John000Doe000123") ➞ {
  "firstName"="John",
  "lastName"="Doe",
  "id"="123"
}

parseCode("kevin0smith004331") ➞ {
  "firstName"="kevin",
  "lastName"="smith",
  "id"="4331"
}

parseCode("Thomas00LEE0000043") ➞ {
  "firstName"="Thomas",
  "lastName"="LEE",
  "id"="43"
}

parseCode("Madsy0Jupiter0321") ➞ {
  "firstName"="Madsy",
  "lastName"="Jupiter",
  "id"="321"
}


Notes
The string will always be in the same format, first name, last name and id with zeros between them.
id numbers will not contain any zeros.
Bonus: Try solving this without RegEx.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Map;
import java.util.HashMap;

public class StringParser {

	 public static Map<String, String> parseCode(String s) {

    Map<String, String> results = new HashMap<String, String>();
    results.put("firstName", s.substring(0, s.indexOf("0")));
    results.put("lastName", s.substring(s.indexOf("0"), s.lastIndexOf("0")).replaceAll("0", ""));
    results.put("id", s.substring(s.lastIndexOf("0") + 1, s.length()));
    return results;
  }
}



//#############################################################
//#                        MY SOLUTION 2   



import java.util.*;
public class StringParser {
	public static Map<String, String> parseCode(String s) {
		Map<String, String> pCode = new HashMap<String, String>();
		String firstName = "";{}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0') firstName += s.charAt(i);
			else {
				s = s.substring(i);
				break;
			}
		}
		
		String id = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != '0') id = s.charAt(i) + id;
			else {
				s = s.substring(0, i);
				break;
			}
		}
		
		String lastName = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0') lastName += s.charAt(i);
		}
		
		//p("first - " + firstName + "; last - " + lastName + "; id - " + id);
		pCode.put("firstName", firstName);
		pCode.put("lastName", lastName);
		pCode.put("id", id);
		return pCode;
	}
	
}



//#############################################################
//#                        MY SOLUTION 3   



import java.util.HashMap;
import java.util.Map;

public class StringParser {
	public static Map<String, String> parseCode(String s) {
        String firstName = "";
        String lastName = "";
        String id = "";
        int count = 1;
        boolean tru = false;
        Map<String, String> ret = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (count == 1 && s.charAt(i) != '0') {
                tru = false;
                firstName += s.charAt(i);
                continue;
            } else if (count == 2 && s.charAt(i) != '0') {
                tru = false;
                lastName += s.charAt(i);
                continue;
            } else if (count == 3 && s.charAt(i) != '0') {
                tru = false;
                id += s.charAt(i);
                continue;
            }
            if (!tru && s.charAt(i) == '0') {
                tru = true;
                count++;
            }
        }
        ret.put("firstName", firstName);
        ret.put("lastName", lastName);
        ret.put("id", id);
        
        return ret;
    }
}




//#############################################################
//#                        MY SOLUTION 4



import java.util.LinkedHashMap;
import java.util.Map;
public class StringParser {
	public static Map<String, String> parseCode(String s) {
		Map<String, String> map = new LinkedHashMap<>();
		String first = "";
		String last = "";
		String id = "";
		
		boolean f = true;
		boolean l = false;
		boolean i = false;
		
		for(char c : s.toCharArray()){
			if(f) {
				if(c != '0')
					first += c;
				else {
					map.put("firstName", first);
					f = false;
					l = true;
				}
			} else if(l) {
				if(c == '0' && last.length() == 0)
					continue;
				if(c != '0')
					last += c;
				else {
					map.put("lastName", last);
					l = false;					
					i = true;
				}
			} else if(i) {
				if(c == '0' && id.length() == 0)
					continue;
					id += c;
				}
		}
		map.put("id", id);
		
		return map;
	}
}