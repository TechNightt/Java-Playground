/*********************************************************************************************************************
 Temperature Conversion

Write a program that takes a temperature input in celsius and converts it to Fahrenheit and Kelvin. Return an array of the converted values.

The conversion formula:

F = C*9/5 +32 // Celsius to Fahrenheit

K = C + 273.15  // Celsius to Kelvin
Examples
convertToTemps(0) ➞ [32.0, 273.15]
// 0°C is equal to 32°F and 273.15 K.

convertToTemps(100) ➞ [212.0, 373.15]

convertToTemps(-10) ➞ [14.0, 263.15]

convertToTemps(300.4) ➞ [572.72, 573.55]

Notes
Round off results to two decimal places.
Return an empty array if K is below zero.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.Arrays;

public class Centigrade {
	public static double[] convertToTemps(double c) {
		double[] t = new double[] {c * 9/5 + 32, c + 273.15};
		return t[1] < 0 ? new double[] {} : Arrays.stream(t).map(e -> Math.round(e*100.0)/100.0).toArray();
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Centigrade {
	public static double[] convertToTemps(double c) {
		return c<-273.15 ? new double[0] :
			new double[]{Math.round((c*9/5+32)*100)/100.0,
												Math.round((c+273.15)*100)/100.0};
	}
}

