/*********************************************************************************************************************
 Simple Circle Collision Detection

Create a method that returns true if the given circles are intersecting, otherwise return false. The circles are given as two arrays containing the values in the following order:

Radius of the circle.
Center position on the x-axis.
Center position on the y-axis.
Examples
isCircleCollision([10, 0, 0], [10, 10, 10]) ➞ true

isCircleCollision([1, 0, 0], [1, 10, 10]) ➞ false

Notes
You can expect useable input and positive radii.
The given coordinates are the centers of the circles.
We are looking for intersecting areas, not intersection outlines.
Check the Resources tab for help.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.lang.Math;
public class Program {
    public static boolean isCircleCollision(int[] c1, int[] c2) {
      int dx = c2[1] - c1[1];
      int dy = c2[2] - c1[2];
      int dst = (int)Math.sqrt(dx * dx + dy * dy);
      return dst < c1[0] + c2[0];
      
    }
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program {
    public static boolean isCircleCollision(int[] c1, int[] c2) {
      int radius1 = c1[0], radius2 = c2[0];
      int r = radius1+radius2;
      int d1 = c1[1]-c2[1], d2 = c1[2] - c2[2];
      
      double dist = Math.sqrt(d1*d1 + d2*d2);
      
      System.out.println(dist);
      return dist<=r || dist<=r;
    }
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Program {
    public static boolean isCircleCollision(int[] c1, int[] c2) {
      CircleParams first = new CircleParams(c1[0], c1[1], c1[2]);
			CircleParams second = new CircleParams(c2[0], c2[1], c2[2]);
			
			return Math.sqrt(Math.pow((first.x-second.x), 2) + Math.pow((first.y-second.y), 2)) 
											 <= 
				(first.radius + second.radius);
			
			
    }
	
		static class CircleParams {
			int radius;
			int x;
			int y;
			
			public CircleParams(int radius, int x, int y) {
				this.radius = radius;
				this.x = x;
				this.y = y;
			}
		}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Program {
    public static boolean isCircleCollision(int[] c1, int[] c2) {
      int rad1 = c1[0];
			int x1 = c1[1];
			int y1 = c1[2];
			
			int rad2 = c2[0];
			int x2 = c2[1];
			int y2 = c2[2];
			
			int sumRadii = rad1 + rad2;
			int distX = Math.abs(x1 - x2);
			int distY = Math.abs(y1 - y2);
			double dist = Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
			
			return dist <= sumRadii;
    }
}