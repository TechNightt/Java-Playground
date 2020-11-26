/*********************************************************************************************************************
 camelCase ⇄ snake_case

Create two functions toCamelCase() and toSnakeCase() that each take a single string and convert it into either camelCase or snake_case. If you're not sure what these terms mean, check the Resources tab above.

Examples
toCamelCase("hello_edabit") ➞ "helloEdabit"

toSnakeCase("helloEdabit") ➞ "hello_edabit"

toCamelCase("is_modal_open") ➞ "isModalOpen"

toSnakeCase("getColor") ➞ "get_color"


Notes
Test input will always be appropriately formatted as either camelCase or snake_case, depending on the function being called.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String toCamelCase(String str) {
    String RegexStr = str.replaceAll("(_.)","||");
    String CamelCase = "";
    for (int Index = 0; Index < RegexStr.length(); Index++){
      if (RegexStr.charAt(Index) == '|' && RegexStr.charAt(Index+1) == '|'){
        CamelCase+=(str.charAt(Index+1)+"").toUpperCase();
      }else{
        if (RegexStr.charAt(Index) != '|'){
          CamelCase+=RegexStr.charAt(Index);
        };
      };
    };
    return CamelCase;
  };
	public static String toSnakeCase(String str) {
    String SnakeCase = "";
    for (int Index = 0; Index < str.length(); Index++){
      if (Character.isUpperCase(str.charAt(Index))){
        SnakeCase+=("_"+str.charAt(Index)).toLowerCase();
      }else{
        SnakeCase+=str.charAt(Index);
      };
    };
    return SnakeCase;
  };
};



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String toCamelCase(String str) {
		String result="";
		if (str.contains("_")) {
			String[] ch = str.split("_");
			for(int i=1; i< ch.length;i++) {
				result=result+ch[i].substring(0, 1).toUpperCase()+ch[i].substring(1);
	}
			result=ch[0]+result;
		}else{
			return str;
		}
		return result;
	}
	public static String toSnakeCase(String str) {
		String reg=str.replaceAll("([A-Z])", "_$1").toLowerCase();	
		return reg;	
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String toCamelCase(String str) {
		String x = "";
		for (int i = 0; i < str.length(); i ++){
			if (str.charAt(i) == '_') {
				String y = ""+str.charAt(i+1);
				x += y.toUpperCase();
				i++;
			} else {
				x += "" + str.charAt(i);
			}
		}
		return x;
	}
	
	public static String toSnakeCase(String str) {
		String x = "";
		for (int i = 0; i < str.length(); i ++){
			String z = ""+str.charAt(i);
			if (z == z.toUpperCase()) {
				x +=  "_" + z.toLowerCase();
			} else {
				x += "" + str.charAt(i);
			}
		}
		return x;
	}
	}

