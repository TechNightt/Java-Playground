/*********************************************************************************************************************
 Fruit Juices

A fruit juice company tags their fruit juices by concatenating the first three letters of the words in a flavor's name and its capacity.

Create a function that creates the product IDs for the variety of fruit juices.

Examples
getDrinkID("apple", "500ml") ➞ "APP500"

getDrinkID("pineapple", "45ml") ➞ "PIN45"

getDrinkID("passion fruit", "750ml") ➞ "PASFRU750"

Notes
Capacity will be given as a string and will always be given in ml.
Return the product ID in UPPERCASE.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;

public class FruitJuice {
	public static String getDrinkID(String flavor, String ml) {
		return Arrays.stream(flavor.toUpperCase().split(" "))
		    .reduce("", (a, b) -> a + b.substring(0, 3)) + ml.replaceAll("[^\\d]", "");
	}
}





//#############################################################
//#                        MY SOLUTION 2   



public class FruitJuice {
	public static String getDrinkID(String flavor, String ml) {
				String pin = "";
        String[] words = flavor.split(" ");
        for (int i = 0; i < words.length; i++) {
            pin += words[i].substring(0, 3);
        }
        pin += ml.replaceAll("ml", "");
        return pin.toUpperCase();
	}
}






//#############################################################
//#                        MY SOLUTION 3   



public class FruitJuice {
	public static String getDrinkID(String flavor, String ml) {
		String[] str=flavor.split(" ");
		String s="";
		for(int i=0 ; i<str.length ; i++) {
			s=s+str[i].substring(0,3);
		}
		return s.toUpperCase()+ml.substring(0,ml.indexOf('m'));
	}
}



