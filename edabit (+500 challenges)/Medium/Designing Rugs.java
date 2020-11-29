/*********************************************************************************************************************
 Designing Rugs
Write a function that accepts the width and height (m, n) and an optional proc s and generates an array with m elements. Each element is a string consisting of either:

The default character (hash #) repeating n times (if null is given).
The character passed in through the proc repeating n times.
Examples
makeRug(2, 1, "tct") ➞ [
  "tct",
  "tct",
]

makeRug(3, 5, null) ➞ [
  "#####",
  "#####",
  "#####"
]

makeRug(3, 5, "$")  ➞ [
  "$$$$$",
  "$$$$$",
  "$$$$$"
]

makeRug(2, 6, "A")  ➞ [
  "AAAAAA"
  "AAAAAA"
]


Notes
The use of Optional container object is required for this challenge.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Optional;
import java.util.stream.IntStream;

public class RugDesign {
  public static String[] makeRug(int m, int n, Optional<String> s) {
    return IntStream.range(0, m).mapToObj(i -> IntStream.range(0, n)
    	.mapToObj(c -> s.orElse("#")).reduce("", String::concat)).toArray(String[]::new);
  }
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.Optional;
public class RugDesign {
  public static String[] makeRug(int m, int n, Optional<String> s) {
    String[] temp = new String[m];
        if(s.isPresent()){
     for(int i = 0; i < temp.length; ++i){temp[i] = "";} 
					for(int i = 0; i < m; ++i){
            for(int x = 0; x < n; ++x){
            temp[i]+= s.get();
            }
         }
        }else{
     for(int i = 0; i < temp.length; ++i){temp[i] = "";}
         for(int i =0;i<m; ++i){
            for(int x = 0; x < n; ++x){
               temp[i] += "#";
            }
         }
    } return temp;
  }
}


