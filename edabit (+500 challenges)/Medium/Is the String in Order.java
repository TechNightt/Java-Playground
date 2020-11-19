/*********************************************************************************************************************
 Is the String in Order?

Create a function that takes a string and returns true or false, depending on whether the characters are in order or not.

Examples
isInOrder("abc") ➞ true

isInOrder("edabit") ➞ false

isInOrder("123") ➞ true

isInOrder("xyzz") ➞ true

Notes
You don't have to handle empty strings.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program{
    public static boolean isInOrder(String str){
          String abc = "abcdefghijklmnopqrstuvwxyzz";
          String nums = "0123456789";
          if(abc.indexOf(str) == -1 && nums.indexOf(str) == -1) {
              return false;
          }
          else return true;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program{
    public static boolean isInOrder(String str){
          int pre = 0;
          for(char c : str.toCharArray()) {
              int next = (int) c;
              if(pre == 0)
                  pre = next;
              else {
                  if(next - pre > 2 || next - pre < 0)
                      return false;
              }
              
              pre = next;
          }
          
          return true;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Program{
    public static boolean isInOrder(String s){
          char[] l = s.toCharArray();
          java.util.Arrays.sort(l); String u = "";
          for (int i =0 ;i < l.length; ++i){ u+=l[i]; } 
          return s.equals(u) ? true : false;
    
        }

  }

