/*********************************************************************************************************************
 ATM PIN Code Validation

ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits. Your task is to create a method that takes a string and returns true if the PIN is valid and false if it's not.

Examples
validatePIN("1234") ➞ true

validatePIN("12345") ➞ false

validatePIN("a234") ➞ false

validatePIN("") ➞ false

Notes
Some test cases contain special characters.
Empty strings must return false.
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Program {
    public static boolean validatePIN(String s) {
      return s.matches("\\d{4}|\\d{6}");
    }
}


//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static boolean validatePIN(String s) {
      boolean length = false;
      boolean digit = true;
      boolean valid = false;
      if(s.length()==4||s.length()==6){
        length = true;
      }
      for(int i = 0; i < s.length(); i ++){
          if(!(Character.isDigit(s.charAt(i)))){
            digit = false;
            return false;
          }
        }
      if(length && digit){
        valid = true;
      }
      return valid;
    }
             
}




//#############################################################
//#                        MY SOLUTION 3   



public class Program {
    public static boolean validatePIN(String s) {
      int flag = 0;
      for(int i =0; i<s.length(); i++){
      	if(s.charAt(i) == '0'||s.charAt(i) == '1'||s.charAt(i) == '2'||s.charAt(i) == '3'||
          s.charAt(i) == '4'||s.charAt(i) == '5'||s.charAt(i) == '6'||s.charAt(i) == '7'||
          s.charAt(i) == '8'||s.charAt(i) == '9'){
          flag++;
        }
      }
    if (flag == 4 || flag ==6){
        return true;
    }else{
      return false;
    }
}
}

//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static boolean validatePIN(String s) {
      String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
      if (s.length() == 4 || s.length() == 6) {
        String[] arr = s.split("");
        for (String ch : arr) {
          boolean contains_special_char = true;
          for (String num : nums) {
            if (ch.equals(num)) {
              contains_special_char = false;
            }
          }
          if (contains_special_char) {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}