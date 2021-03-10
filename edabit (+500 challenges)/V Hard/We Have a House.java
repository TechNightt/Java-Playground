/*********************************************************************************************************************
 We Have a House

In the garden, we have a house. We don't know how big the house is going to get. The garden is 50' x 50'. If you want to walk around the house, you'll need 3 feet so the house cannot be bigger than the width & depth of the garden minus the path to walk around it.

We Have a House

In this example you can see the arguments your function is going to get (in red). The measurements of the windows + door as well as the dark rim (against rain damage) are always the same (in blue). We put One door in the front and Two windows in each wall.

We don't have permission to build higher than 20'. The area around the windows and door cannot be smaller than 1 foot except under the door obviously. It is possible to have a flat roof.

Create a function that takes four arguments and returns the area of light yellow paint and dark gray paint in a string as square feet. Assuming the coverage of the paint is perfect and you'll only need one layer of paint.

Examples
weHaveHouse(8, 30, 32, 8) ➞ "Yellow: 873, Gray: 242"

weHaveHouse(9, 14, 20, 9) ➞ "House too small."

weHaveHouse(9, 38, 36, 9) ➞ "Yellow: 1261, Gray: 290"

weHaveHouse(10, 31, 30, 11) ➞ "No permission."

Notes
If the house is too big for the garden, return "House too big."
If the house is too high, return "No permission."
If the house is too small (for the windows and door to fit), return "House too small."
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String weHaveHouse(int hh, int hw, int hd, int rh) {
		     if(hh+rh > 20) return "No permission.";
        if(hh+rh > hw) return "House too small.";
        if(hw > 44 || hd > 44) return "House too big.";
        int yellow = 0;
        int gray = 0;
 
        yellow = ((hh-2)*hd) + ((hh-2)*hd) + ((rh*hw)/2) + ((rh*hw)/2) + (hw*(hh-2)) + (hw*(hh-2)) - 15 - (4*24);
        gray = (((hw*2) + (hd*2))*2) - 6;
 
        return "Yellow: " + yellow + ", Gray: " + gray;
        
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String weHaveHouse(int hh, int hw, int hd, int rh) {
		        if(hh + rh > 20) {
            return "No permission.";

        } else if(hw < 15 || hd < 11) {
            return "House too small.";

        } else if(hw > 44 || hd > 44) {
            return "House too big.";
        }

        int door = 7 * 3;
        int windows = 8 * 4 * 3;

        int gray = ((2 * hw) + (2 * (hw - 3)) + (2 * 2 * hd));
        int yellow = ((2 * hw * hh) + (2 * hd * hh) + (rh * hw))  - (door + windows + gray);

        return "Yellow: " + yellow + ", Gray: " + gray;
	}
}




//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String weHaveHouse(int hh, int hw, int hd, int rh) {
		if(hw > 44 || hd > 44) {
			return "House too big.";
		}
		if(rh+hh>20) {
			return "No permission.";
		}
		if(hh<8 || hw<15 || hd<11) {
			return "House too small.";
		}
		int windowsArea = (4 * 3) * 8;
		int doorArea = 7 * 3;
		int greyArea = 2*2*hw + 2*2*hd - 3*2;
		int yellowArea = 2*hw*hh + 2*hd*hh + rh*hw - windowsArea - doorArea - greyArea;
		
		return "Yellow: " + yellowArea + ", Gray: " + greyArea;
	}
}



//#############################################################
//#                        MY SOLUTION 4



