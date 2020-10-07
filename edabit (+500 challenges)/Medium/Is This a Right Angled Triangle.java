/*********************************************************************************************************************
 
Is This a Right Angled Triangle?

Given three numbers, x, y and z, determine whether they are the edges of a right angled triangle.

Examples
rightTriangle(3, 4, 5) ➞ true
// This is the classic example of a "nice" right angled triangle.

rightTriangle(145, 105, 100) ➞ true
// This is a less famous example.

rightTriangle(70, 130, 110) ➞ false
// This isn't a right angled triangle.

Notes
Notice the largest side of the triangle might not be the last one passed to the function.
All numbers will be integers (whole numbers).
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
public class Challenge {
  public static boolean rightTriangle(int x, int y, int z) {
		  int[] arr = {x, y, z};
        for (int i : arr) {
            if (i <= 0) return false;
        }
        Arrays.sort(arr);
        return Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2);
  }
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.Arrays;

public class Challenge {
    public static boolean rightTriangle(int x, int y, int z) {
        int[] params = new int[3];
        params[0] = x;
        params[1] = y;
        params[2] = z;
        Arrays.sort(params);
        x = params[0];
        y = params[1];
        z = params[2];
        return (x > 0) && (z * z == x * x + y * y);
    }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.lang.Math;
public class Challenge {
  public static boolean rightTriangle(int x, int y, int z) {
		if (x <= 0 || y <= 0 || z <= 0)
			return false;
		return Math.pow(x,2) == Math.pow(y,2)+Math.pow(z,2) || Math.pow(y,2)==Math.pow(x,2)+Math.pow(z,2) || Math.pow(z,2)==Math.pow(y,2)+Math.pow(x,2);
  }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static boolean rightTriangle(int x, int y, int z) {
          if (x <= 0 || y <= 0 || z <= 0) {
              return false;
          }
          return isRightTriangle(x, y, z) || isRightTriangle(x, z, y)
              || isRightTriangle(y, z, x);
    }
      
      private static boolean isRightTriangle(int a, int b, int c) {
          return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
      }
  }







//#############################################################
//#                        MY SOLUTION 5
//#############################################################


public class Challenge {
    public static boolean rightTriangle(int x, int y, int z) {
          
          if(x <= 0 || y <= 0 || z<= 0){
            return false;
        }
              int hip;
        int k1,k2;
        if(x >= y && x >=z){
            hip = x;
            k1 = y;
            k2 = z;
        }
        else if(y >= x && y >=z){
            hip = y;
            k1 = x;
            k2 = z;
        }
        else{
            hip = z;
            k1 = x;
            k2 = y;
        }
        
        return hip*hip == (k1*k1) + (k2*k2);
    }
  }




//#############################################################
//#                        MY SOLUTION 7
//#############################################################


public class Challenge {
    public static boolean rightTriangle(int x, int y, int z) {
          int c = Math.max(x , (Math.max(y, z)));
          int a = Math.min(x , (Math.min(y, z)));
          int b = Math.max(Math.min(x, y) , (Math.min(y, z)));
          
          if (x <= 0 || y <= 0 || z <= 0) {
              return false;
          }
          
          return (a * a + b * b == c * c);
      }
  }




  
//#############################################################
//#                        MY SOLUTION 8
//#############################################################




  public class Challenge {
    public static boolean rightTriangle(int x, int y, int z) {
          //disqualify negative and angle zero
          if(x <= 0 | y <= 0 | z <= 0){return false;}
          
          //if x squared plus y squared = squared, return true.
          if(x*x + y*y == z*z){return true;}
          if(x*x + z*z == y*y){return true;}
          if(y*y + z*z == x*x){return true;}
          
          return false;
    }
  }