/*********************************************************************************************************************
 Body Mass Index

Body Mass Index (BMI) is found by taking your weight in kilograms and dividing by the square of your height in meters. The BMI categories are:

Underweight: <18.5
Normal weight: 18.5–24.9
Overweight: 25–29.9
Obesity: BMI of 30 or greater
Create a function that will accept weight and height (in kilos, pounds, meters, or inches) and return the BMI and the associated category. Round the BMI to nearest tenth.

Examples
BMI("205 pounds", "73 inches") ➞ "27.0 Overweight"

BMI("55 kilos", "1.65 meters") ➞ "20.2 Normal weight"

BMI("154 pounds", "2 meters") ➞ "17.5 Underweight"


Notes
1 inch = 0.0254 meter
1 pound = 0.453592 kilo
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static String BMI(String weight, String height) {
    String[] weightArr = weight.split(" ");
    String[] heightArr = height.split(" ");

    double weightInKG = (weightArr[1].equals("kilos")) ? Double.parseDouble(weightArr[0]) 
                                  : Double.parseDouble(weightArr[0])*0.453592;
    double heightInM = (heightArr[1].equals("meters")) ? Double.parseDouble(heightArr[0]) 
                                  : Double.parseDouble(heightArr[0])*0.0254;
    double valueBMI = Math.round(weightInKG / Math.pow(heightInM, 2.0) * 10) / 10.0;

    return (valueBMI < 18.5) ? valueBMI + " Underweight" : 
              (valueBMI < 24.9) ? valueBMI + " Normal weight" :
                  (valueBMI < 29.9) ? valueBMI + " Overweight" : valueBMI + " Obesity";		
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static String BMI(String weight, String height) {
    double BMI=0;
    String []x=weight.split(" ");
    double w=0;
    String[] y=height.split(" ");
    double h=0;
    if(x[1].equals("pounds")){
        w=0.453592*Double.parseDouble(x[0]);
    }else{
        w=Double.parseDouble(x[0]);
    }
    if(y[1].equals("inches")){
        h=0.0254 *Double.parseDouble(y[0]);
    }else{
        h=Double.parseDouble(y[0]);
    }   
         BMI=w/(h*h);	
       if(BMI>29.9) return String.valueOf(String.format( "%.1f", BMI))+" Obesity";
       else if(BMI>25&&BMI<29.9) return String.valueOf(String.format( "%.1f", BMI))+" Overweight";
       else if(BMI>18.5&&BMI<24.9) return String.valueOf(String.format( "%.1f", BMI))+" Normal weight";
       
        return String.valueOf(String.format( "%.1f", BMI))+" Underweight";
     }
    }



//#############################################################
//#                        MY SOLUTION 3   



import java.text.DecimalFormat;
public class Challenge {
    public static String BMI(String weight, String height) {
        String[] wStr = weight.split(" ");
        String[] hStr = height.split(" ");
        double w = (wStr[1].equals("pounds"))?Double.parseDouble(wStr[0])*0.453592:Double.parseDouble(wStr[0]);
        double h = ( hStr[1].equals("inches"))?Double.parseDouble(hStr[0])*0.0254: Double.parseDouble(hStr[0]);

        double bmi = w / (h * h);
        DecimalFormat format = new DecimalFormat("#,#0.0");
        return (bmi < 18.5)? format.format(bmi) + " Underweight":(bmi >= 18.5 && bmi < 25)?  format.format(bmi) + " Normal weight":(bmi >25 && bmi < 29.9 )?  format.format(bmi) + " Overweight":  format.format(bmi) + " Obesity";


    }
}


