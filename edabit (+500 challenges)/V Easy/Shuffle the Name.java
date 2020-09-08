/*********************************************************************************************************************
 Shuffle the Name
Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.

Examples
nameShuffle("Donald Trump") ➞ "Trump Donald"

nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"

nameShuffle("Seymour Butts") ➞ "Butts Seymour"

Notes
There will be exactly one space between the first and last name.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   

public class Program {
    public static String nameShuffle(String s) {
      return s.split(" ")[1] + " " + s.split(" ")[0];
    }
}


//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static String nameShuffle(String s) {
      String[] names = s.split(" ");
      String temp = names[0];
      names[0] = names[1];
      names[1] = temp;
      return String.join(" ", names);
    }
}



//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static String nameShuffle(String s) {
        String snew = "";
      
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
              snew = snew + s.substring(i+1, s.length()) + ' ' + s.substring(0, i);
            }
        }
        
        return snew;
    }
}




//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static String nameShuffle(String s) {
      String newest = "";
      int slength = s.length();
      int space = 0;
     
      for(int i = 0; i < slength; i++)
      {
        if(s.charAt(i) == ' ')
        {
          space = i;
        }
      
      }
     
      newest = s.substring(space, slength).concat(" " + s.substring(0, space));
      return newest.trim();
      
    }
}