/*********************************************************************************************************************
 Maximum Distance

Write a function that takes fuel (liters), fuelUsage (liters/100km), passengers, airConditioner (boolean) and returns maximum distance that car can travel.

fuel is the number of liters of fuel in the fuel tank.
fuelUsage is basic fuel consumption per 100 km (with the driver inside only).
Every additional passenger is increasing basic fuel consumption by 5%.
If the air conditioner is ON true, its increasing total (not basic) fuel consumption by 10%.
Examples
totalDistance(70.0, 7.0, 0, false) ➞ 1000.0

totalDistance(36.1, 8.6, 3, true) ➞ 331.83

Notes
fuel and fuelUsage are always greater than 1.
passengers are always greater or equal to 0.
The tolerance of the returned value is 0.1.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
    public static double totalDistance(double fuel, double fuelUsage, int passengers, boolean airConditioner) {
          //if (passengers > 0) {
              fuelUsage = fuelUsage + (fuelUsage * (0.05 * passengers));
              System.out.println(fuelUsage);
          //}
          if (airConditioner == true) {
              fuelUsage = fuelUsage + (fuelUsage * 0.1);
          }
          return (fuel / fuelUsage) * 100;
    }
  }




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static double totalDistance(double fuel, double fuelUsage, int passengers, boolean airConditioner) {
          return airConditioner==true ? (fuel/((fuelUsage*(1+(0.05*passengers)))*1.1))*100 : (fuel/(fuelUsage*(1+(0.05*passengers))))*100;
    }
  }




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	
	public static double totalDistance(double fuel, double fuelUsage, int passengers, boolean airConditioner) {
	
 double fuelUsageIncrease = (passengers * .05);
    if (passengers > 0) {
   		fuelUsage = (fuelUsage * (1 + fuelUsageIncrease)); 
    }
    
    if (airConditioner) {
      fuelUsage = fuelUsage * 1.1;  
    }
    
    
    
    double fuelTotalDistance = (fuel/fuelUsage) * 100;  
    
    
  
return fuelTotalDistance;
  }
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static double totalDistance(double fuel, double fuelUsage, int passengers, boolean airConditioner) {
          int p = passengers*5;
          double f = (fuelUsage*(double)p)/100;
          fuelUsage += f;
          if(airConditioner==true){
              double af = (fuelUsage*10)/100;
              fuelUsage += af;
          }
          double tot = (fuel/fuelUsage)*100;
          return tot;
    }
  }