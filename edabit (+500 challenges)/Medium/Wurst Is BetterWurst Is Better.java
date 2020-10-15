/*********************************************************************************************************************
 Wurst Is Better

Wurst is the best. Create a method that takes a string and replaces every mention of any type of sausage with the German word "Wurst," unless—of course—the sausage is already a type of German "Wurst" (i.e. "Bratwurst", see below), then leave the sausage name unchanged.

German Wursts	Convert to Wurst
Bratwurst	Kielbasa
Kochwurst	Chorizo
Leberwurst	Moronga
Mettwurst	Salami
Rostbratwurst	Sausage
~	Andouille
~	Naem
~	Merguez
~	Gurka
~	Snorkers
~	Pepperoni
Rules
Append sausages from the "Convert to Wurst" column with "wurst".
Do not replace any German sausage with the word "Wurst".
The word "Wurst" must be title case.
Examples
wurstIsBetter("I like chorizos, but not sausages") ➞ "I like Wursts, but not Wursts"

wurstIsBetter("sich die Wurst vom Brot nehmen lassen") ➞ "sich die Wurst vom Brot nehmen lassen"

wurstIsBetter("Bratwurst and Rostbratwurst are sausages") ➞ "Bratwurst and Rostbratwurst are Wursts"

Notes
All German sausage names contain the word "wurst".
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program {
    public static String wurstIsBetter(String s) {
      return s.replaceAll("(?i)Kielbasa|Chorizo|Moronga|Salami|Sausage|Andouille|Naem|Merguez|Gurka|Snorkers|Pepperoni","Wurst");
    }
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program {
    private static final String wursts[] = {
    "Kielbasa",
    "Chorizo",
    "Moronga",
    "Salami",
    "Sausage",
    "Andouille",
    "Naem",
    "Merguez",
    "Gurka",
    "Snorkers",
    "Pepperoni"};

public static String wurstIsBetter(String s) {
  for(String wurstName : wursts){
            s = s.replace(wurstName,"Wurst").replace(wurstName.toLowerCase(),"Wurst");
        }
        return s;
 }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.List;
import java.util.Arrays;
public class Program {
    private static List<String> cList = Arrays.asList(new String[]{"kielbasa","chorizo","moronga","salami","sausage","andouille","naem","merguez","gurka","snorkers","pepperoni"});
    public static String wurstIsBetter(String s) {
    	for (String str : s.split("[^a-zA-Z]")) {
    		if (convertToWurst(str)) {
    			s = s.replace(str, "Wurst");
    		}
    	}
    	return s;
    }    
    
    public static boolean convertToWurst (String s) {
    	for (String str : cList) {
    		if (s.toLowerCase().contains(str))
    			return true;
    	}
    	return false;
    }
}








//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.Arrays;
public class Program {
	  
    public static String wurstIsBetter(String s) {
     
			String [] sArray = s.split(" ");
			
			int i = 0;
			for(String word: sArray){
					
				if(!word.contains("wurst") && 
					   word.toLowerCase().equals("kielbasa")
					 ||word.toLowerCase().equals("chorizo")
					 ||word.toLowerCase().equals("moronga")
					 ||word.toLowerCase().equals("salami")
					 ||word.toLowerCase().equals("sausage")
					 ||word.toLowerCase().equals("andouille") 
					 ||word.toLowerCase().equals("naem")
					 ||word.toLowerCase().equals("merguez")
					 ||word.toLowerCase().equals("gurka")
					 ||word.toLowerCase().equals("snorkers")
					 ||word.toLowerCase().equals("pepperoni"))
          
				  {
						sArray[i] = "Wurst";
					}
		      
				i++;
			}
			StringBuilder build = new StringBuilder();
			
			for(String value: sArray){
				build.append(value + " ");
			}
			
			String wurstString = build.toString().replace("andouille", "Wurst");
			return wurstString.substring(0, wurstString.length()-1);
    }
}




//#############################################################
//#                        MY SOLUTION 5
//#############################################################


public class Program {
    public static String wurstIsBetter(String s) {
      s = s.replaceAll("Kielbasa" , "Wurst");
			s = s.replaceAll("kielbasa" , "Wurst");
			s = s.replaceAll("Chorizo" , "Wurst");
			s = s.replaceAll("Moronga" , "Wurst");
			s = s.replaceAll("Salami" , "Wurst");
			s = s.replaceAll("salami" , "Wurst");
			s = s.replaceAll("Sausage" , "Wurst");
			s = s.replaceAll("sausage" , "Wurst");
			s = s.replaceAll("Andouille" , "Wurst");
			s = s.replaceAll("andouille" , "Wurst");
			s = s.replaceAll("Naem" , "Wurst");
			s = s.replaceAll("Merguez" , "Wurst");
			s = s.replaceAll("Gurka" , "Wurst");
			s = s.replaceAll("Snorkers" , "Wurst");
			s = s.replaceAll("Pepperoni" , "Wurst");
			return s;
    }
}