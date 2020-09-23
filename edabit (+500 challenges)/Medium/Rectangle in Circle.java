/*********************************************************************************************************************
 Rectangle in Circle
Create a function that takes three numbers — the width and height of a rectangle, and the radius of a circle and returns true if the rectangle can fit inside the circle, false if it can't.

Examples
rectangleInCircle(8, 6, 5) ➞ true

rectangleInCircle(5, 9, 5) ➞ false

rectangleInCircle(4, 7, 4) ➞ false
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean rectangleInCircle(int w, int h, int radius) {
          
          
          //w squared + h squared <= 4*(radius * radius)
          if(4* (radius * radius) > w*w + h*h 
                                      || 4 * (radius * radius) > w*w + h*h){
              return true;
          }
          
          return false;
    }
  }






//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean rectangleInCircle(int width, int height, int radius) {
          int diameter = 2 * radius;
          return (diameter > height && radius > width) || (diameter > width && radius > height);
    }
  }






//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
  public static boolean rectangleInCircle(int w, int h, int radius) {
		return radius>=(Math.sqrt(Math.pow(w,2)+Math.pow(h,2)))/2?true:false;
	}
}





//#############################################################
//#                        MY SOLUTION 4
