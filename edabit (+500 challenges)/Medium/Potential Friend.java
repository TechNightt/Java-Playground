/*********************************************************************************************************************
Potential Friend?
Given two arrays of two people's different interests, return whether both people have at least two things in common or have exact interests. Return true if there's a potential friend!

Examples
isPotentialFriend(
  ["sports", "music", "chess"],
  ["coding", "music", "netflix", "chess"]
) ➞ true

isPotentialFriend(
  ["cycling", "technology", "drawing"],
  ["dancing", "drawing"]
) ➞ false

isPotentialFriend(
  ["history"],
  ["history"]
) ➞ true


Notes
Arrays of interests may have varied lengths.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Friend {
	public static boolean isPotentialFriend(String[] y, String[] o) {
		
			if (y.length == 1 && o.length == 1)
					if (y[0].equals(o[0]))
							return true;
			int c = 0;
			int biggerArray = (y.length > o.length) ? y.length : o.length;
			for (int i = 0; i < y.length; ++i) {
					for (int j = 0; j < o.length; ++j) {
							if (y[i].equals(o[j]))
									++c;
					}
			}
			return (c >= 2) ? true : false;
	}
}




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.*;
public class Friend {
	public static boolean isPotentialFriend(String[] y, String[] o) {
	 	HashSet<String> set = new HashSet<String>();
 				
		if(y.length  == 1 || o.length == 1){
			for(int k = 0; k < y.length; k++){
					if(y[k] == o[k])
					{
						return true;
					}
				}
			}
		
        for (int i = 0; i < y.length; i++)
        {
            for (int j = 0; j < o.length; j++)
            {
                if(y[i].equals(o[j]))
                {
                    set.add(y[i]);
                }
            }
        }
		if(set.size() >= 2)
			return true;
		else
			return false;
	}
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Friend {
    public static boolean isPotentialFriend(String[] y, String[] o) {
          int count = 0;
              
          for(int i = 0; i < y.length; i++){
              for(int j = 0; j <o.length; j++){
                  if(y[i].equals(o[j])){
                      count++;
                  }
              }
          }
                  if(y.length == 1 && o.length == 1 && count >0){
                      return true;
                  }
          if(count >= 2) return true;
                  
          
                  else return false;
      }
  }



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Friend {
	public static boolean isPotentialFriend(String[] y, String[] o) {
		int same = 0;
		for(int i = 0; i < y.length; i++){
			for(int j = 0; j < o.length; j++){
				if(y[i].equals(o[j]))
					same++;
			}
		}
		
		if((same == y.length && same == o.length) || same >= 2)
			return true;
		else
			return false;
	}
}