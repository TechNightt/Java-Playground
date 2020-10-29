/*********************************************************************************************************************
 Stalactites or Stalagmites?

Stalactites hang from the ceiling of a cave while stalagmites grow from the floor.

Create a function that determines whether the input represents "stalactites" or "stalagmites". If it represents both, return "both". Input will be a 2D array, with 1 representing a piece of rock, and 0 representing air space.

Examples
mineralFormation([
  [0, 1, 0, 1],
  [0, 1, 0, 1],
  [0, 0, 0, 1],
  [0, 0, 0, 0]
]) ➞ "stalactites"

mineralFormation([
  [0, 0, 0, 0],
  [0, 1, 0, 1],
  [0, 1, 1, 1],
  [0, 1, 1, 1]
]) ➞ "stalagmites"

mineralFormation([
  [1, 0, 1, 0],
  [1, 1, 0, 1],
  [0, 1, 1, 1],
  [0, 1, 1, 1]
]) ➞ "both"

Notes
There won't be any examples where both stalactites and stalagmites meet (because those are called pillars).
There won't be any example of neither stalactites nor stalagmites.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;

public class CaveMinerals {
	public static String mineralFormation(int[][] form) {
		boolean t = Arrays.stream(form[0]).boxed().anyMatch(e -> e == 1),
				    m = Arrays.stream(form[form.length-1]).boxed().anyMatch(e -> e == 1);
		return new String[]{"stalactites", "stalagmites", "both"}[t && m ? 2 : m ? 1 : 0];
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class CaveMinerals {
	public static String mineralFormation(int[][] form) {
		int ceil = 0;
		int floor =form.length - 1;
		boolean stalagmites = true;
		boolean stalactites = true;
		String output = "";
		
		for(int i = 0 ; i < form.length; i++){
			for(int j = 0 ; j < form[i].length; j++){
		    for(int k = 0 ; k < form[i].length;k++){
				
					if(form[ceil][k] == 0 && form [floor][j] == 1){
						stalactites = false;
					}
			
					if(form[ceil][j] == 1 && form[floor][k] == 0){
						stalagmites = false;
					}
					if(form[ceil][j] == 1 && form[floor][k] == 1){
						return "both";
					}
					
				}
				
			
				}
		  }
	      if(stalagmites == false){
					return "stalactites";
				}else{
					return "stalagmites";
			}
	}	
}





//#############################################################
//#                        MY SOLUTION 3   



public class CaveMinerals {
	public static String mineralFormation(int[][] f) {
		boolean a=1>2, b=1>2;
		for (int i=0; i<f[0].length; i++)
			if (f[0][i]==1) a=1<2;
		for (int i=0; i<f[0].length; i++)
			if (f[f.length-1][i]==1) b=1<2;
		return a&&b ? "both" : "stala" + (a ? "ctites" : "gmites");
	}
}






//#############################################################
//#                        MY SOLUTION 4


public class CaveMinerals {
	public static String mineralFormation(int[][] form) {
		int top = 0;
    int bottom = 0;
    for (int i = 0; i < form[0].length; i++) {
        top += form[0][i];
        bottom += form[form.length-1][i];
    }
    return top > 0 && bottom > 0 ? "both" : top > 0 ? "stalactites" 
			: bottom > 0 ? "stalagmites" : "¯\\_(ツ)_/¯";
	}
}