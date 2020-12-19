/*********************************************************************************************************************
 Temperature Converter
Create a function that converts Celcius to Fahrenheit and vice versa.

Examples
convert("35*C") ➞ "95*F"

convert("19*F") ➞ "-7*C"

convert("33") ➞ "Error"

Notes
Round to the nearest integer.
If the input is incorrect, return "Error".
For the formulae to convert back and forth, check the Resources tab.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   



import java.lang.Math;

public class Challenge {
    public static String convert(String deg) {
        String err = "Error";
        String ans;
        char fromUnit = deg.charAt(deg.length() - 1);
        char degSymbol = deg.charAt(deg.length() - 2);
        String numPart;
        int cel, fahr, d, d2;
        if((fromUnit != 'C') && (fromUnit != 'F')){
            return err;
        }
        //if((int) degSymbol != 176){
        //    return err;
        //}
        numPart = deg.substring(0, deg.length() - 2);
        d = Integer.parseInt(numPart);
        if(fromUnit == 'C'){
            // convert from Celsius to Fahrenheit
            d2 = (int) Math.round(32. + d * 9. / 5.);
            ans = String.valueOf(d2) + degSymbol + "F";
            System.out.println(ans);
            return ans;
        }
        else{
            // convert from Celsius to Fahrenheit
            d2 = (int) Math.round((d - 32.) * 5. / 9.);
            ans = String.valueOf(d2) + degSymbol + "C";
            System.out.println(ans);
            return ans;
        }
    }
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String convert(String deg) {
		if(!(deg.endsWith("*C") || deg.endsWith("*F"))) return "Error";
		
		String num = deg.substring(0,deg.length()-2);
		double n = Double.parseDouble(num);
		double r = 0;
		int result = 0;
		
		if(deg.endsWith("*F")) {
			r = Math.round((n-32)* 5/9);
			result = (int) r;
			num = String.valueOf(result) + "*C";
		}
		else {
			r = Math.round(n*9/5+32);
			result = (int) r;
			num = String.valueOf(result) + "*F";
		}
		
		return num;
	}
}



//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String convert(String deg) {
		String res = "";
		if (!deg.matches("(^-[\\d]+)[*][CF]") && !deg.matches("(^[\\d]+)[*][CF]")) {
			res = "Error";
		} else {
			String unit = "" + deg.replaceAll("[\\d]", "").charAt(deg.replaceAll("[\\d]", "").length() - 1);
			int temp = Integer.parseInt(deg.replaceAll("[^-]", "") + deg.replaceAll("[\\D]", ""));
			if (unit.equals("F")) {

				res = (int) Math.round((temp - 32) * 5 / 9.0) + "*C";

			} else if (unit.equals("C")) {

				res = (int) Math.round(temp * 1.8 + 32) + "*F";
			}
		}

		return res;
	}
}




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static String convert(String deg) {
		
	
	if(deg.charAt(deg.length()-1) == 'C') {	//convert to Fahrenheit
	String s1 = "";
	for(int i = 0 ; i < deg.length() ; i++) {
		if(Character.isDigit(deg.charAt(i)) == true) {
			s1 = s1 + deg.charAt(i);
		}
	}
	if(deg.charAt(0) == '-') {
		s1 = "-"+s1;
	}
	double far = Integer.parseInt(s1) * 1.8 +32;	
	return (Integer.toString((int)  Math.round(far)) + "*F");
	}
	
	else if(deg.charAt(deg.length()-1) == 'F') { 		// (F-32) / 1.8
		String s2 = "";
		for(int i = 0 ; i < deg.length() ; i++) {
			if(Character.isDigit(deg.charAt(i)) == true) {
				s2 = s2 + deg.charAt(i);
			}
		}
		if(deg.charAt(0) == '-') {
			s2 = "-" + s2;
		}
		double cel = (Integer.parseInt(s2)-32) / 1.8;	
		return (Integer.toString((int) (Math.round(cel))) + "*C");
	}
	
	else {
		return ("Error");
	}
	}
}