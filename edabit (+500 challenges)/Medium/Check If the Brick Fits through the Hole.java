/*********************************************************************************************************************
 Check If the Brick Fits through the Hole

Write the function that takes three dimensions of a brick: height(a), width(b) and depth(c) and returns true if this brick can fit into a hole with the width(w) and height(h).

Examples
doesBrickFit(1, 1, 1, 1, 1) ➞ true

doesBrickFit(1, 2, 1, 1, 1) ➞ true

doesBrickFit(1, 2, 2, 1, 1) ➞ false

Notes
You can turn the brick with any side towards the hole.
We assume that the brick fits if its sizes equal the ones of the hole (i.e. brick size should be less than or equal to the size of the hole, not strictly less).
You can't put a brick in at a non-orthogonal angle.
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


// (a,b,c) -- dimensions of the brick
// (w,h) -- dimensions of the hole
public class Challenge {
    public static boolean doesBrickFit(int a, int b, int c,  int w, int h) {
          return ((Math.min(Math.min(a, b),c)<=Math.min(w, h)) && (Math.min(Math.max(a, b),c)<=Math.max(w, h)));
    }
  }



//#############################################################
//#                        MY SOLUTION 2   

// (a,b,c) -- dimensions of the brick
// (w,h) -- dimensions of the hole
public class Challenge {
    public static boolean doesBrickFit(int a, int b, int c,  int w, int h) {
          if ((a <= w && b <= w) || (b <= w && c <= w) || (c <= w && a <= h) || (a <= w && c <= w) || (a <= w && c <= h) || (a <= w && c <= w)) return true;
          return false;
    }
  }






//#############################################################
//#                        MY SOLUTION 3   



// (a,b,c) -- dimensions of the brick
// (w,h) -- dimensions of the hole
import java.util.Arrays;

public class Challenge {
  public static boolean doesBrickFit(int a, int b, int c,  int w, int h) {
		
        int[] brickDimes = {a, b, c};
        Arrays.sort(brickDimes);

        int[] holeDimes = {w, h};
        Arrays.sort(holeDimes);
        
        return (brickDimes[0] <= holeDimes[0] && brickDimes[1] <= holeDimes[1]);
  }
}



//#############################################################
//#                        MY SOLUTION 4



// (a,b,c) -- dimensions of the brick
// (w,h) -- dimensions of the hole
public class Challenge {
    public static boolean doesBrickFit(int a, int b, int c,  int w, int h) {
          return (a == w && b == h) || (b == w && a == h) ||
              (c == w && b == h) ||(b == w && c == h) || 
              (a == w && c == h) || (c == w && a == h) ;
    }
  }






//#############################################################
//#                        MY SOLUTION 5


// (a,b,c) -- dimensions of the brick
// (w,h) -- dimensions of the hole
public class Challenge {
    public static boolean doesBrickFit(int a, int b, int c,  int w, int h) {
                  int holeArea = w*h;
          int brickDim1 = a*b;
          int brickDim2 = a*c;
          int brickDim3 = b*c;
          if(brickDim1 <= holeArea || brickDim2 <= holeArea || brickDim3 <= holeArea){
              return true;
          }
          return false;
    }
  }







//#############################################################
//#                        MY SOLUTION 6


// (a,b,c) -- dimensions of the brick
// (w,h) -- dimensions of the hole
public class Challenge {
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
          boolean test = false;
          double areaHole = (w * h);
          
          if (((c * a) <= areaHole) || ((b * c) <= areaHole) || ((b * a) <= areaHole)) {
              test = true;
          }
          
          return test;
    }
  }






  //#############################################################
//#                        MY SOLUTION 7


// (a,b,c) -- dimensions of the brick
// (w,h) -- dimensions of the hole
public class Challenge {
    public static boolean doesBrickFit(int a, int b, int c,  int w, int h) {
          if (a<=w && b<=h) return true;
          else if (b<=w && a<=h) return true;
          else if (b<=w && c<=h) return true;
          else if (c<=w && b<=h) return true;
          else if (a<=w && c<=h) return true;
          else if (c<=w && a<=h) return true;
          else return false;
    }
  }





//#############################################################
//#                        MY SOLUTION 8


// (a,b,c) -- dimensions of the brick
// (w,h) -- dimensions of the hole
public class Challenge {
    public static boolean doesBrickFit(int a, int b, int c,  int w, int h) {
          boolean aAndb = ((a <= w) && (b <= h)) || ((b <= w) && (a <= h));
          boolean bAndc = ((c <= w) && (b <= h)) || ((b <= w) && (c <= h));
          boolean aAndc = ((a <= w) && (c <= h)) || ((c <= w) && (a <= h));
          
          boolean fits = aAndb || bAndc || aAndc;
          return fits;
    }
}