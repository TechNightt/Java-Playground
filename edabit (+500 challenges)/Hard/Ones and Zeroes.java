/*********************************************************************************************************************
 Ones and Zeroes
Write a function that returns true if every consecutive sequence of ones is followed by a consecutive sequence of zeroes of the same length.

Examples
sameLength("110011100010") ➞ true

sameLength("101010110") ➞ false

sameLength("111100001100") ➞ true

sameLength("111") ➞ false
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean sameLength(String str) {
          if (str == null || str.length() < 2 || !str.startsWith("1") || str.endsWith("1")) {
              return false;
          }
          int balance = 0;
          for (int i = 0; i < str.length() && balance >= 0; i++) {
              char ch = str.charAt(i);
              if (ch == '1') balance++;
              if (ch == '0') balance--;
              if (balance < 0) return false;
          }
          return balance == 0; 
    }
  }




//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static boolean sameLength(String str) {
          boolean flag = false;
          int cz = 0;
          int co=0;
          
          for (int i = 0; i <str.length() ; i++) {
              if(str.charAt(i)=='1'){
                  co++;
              }else {
                  cz++;
              }
          }
  
  if((str.startsWith("1")&&str.endsWith("0"))&&(str.length()>=2)&&(co==cz)){
      flag=true;
  }
          return flag;
  }}




//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
    public static boolean sameLength(String str) {
          int count=0;
          int count1=0;
          boolean flag=false;
          for (int i = 0; i < str.length(); i++) {
              if(str.charAt(i)=='1')
                  count++;
              else if(str.charAt(i)=='0')
                  count1++;
              if(count==count1)
                  flag=true;
              else{
                  flag=false;
                  if(i==str.lastIndexOf("0") || i==str.lastIndexOf("0") )
                  break;
              }
          }
          return flag;
    }
  }




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static boolean sameLength(String str) {
          int ones = 0;
          int zeros = 0;
          for (int i = 0; i < str.length();) {
              ones = 0; zeros = 0;
              while (i < str.length() && str.charAt(i) == '1') { ones++; i++; }
              while (i < str.length() && str.charAt(i) == '0') { zeros++; i++; }
              if (ones != zeros) { return false; }
          }
          return true;
    }
  }



//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
    public static boolean sameLength(String str) {
          if (str.length() % 2 != 0) {
        return false;
      }
      int pos = 1;
      int len = 1;
      while (pos < str.length()) {
        if ('1' == str.charAt(pos)) {
          pos++;
          len++;
        } else {
          if (!str.substring(pos, pos + len).replaceAll("0", "").isEmpty()) {
            return false;
          }
                  if ((pos + len < str.length()) && ('1' != str.charAt(pos + len))) {
                      return false;
                  }
          pos += len + 1;
          len = 1;
        }
      }
      
      return true;
    }
  }