/*********************************************************************************************************************
 Valid Variable Names

When creating variables, the variable name must always start with a letter and cannot contain spaces, though numbers and underscores are allowed to be contained in it also.

Create a function which returns true if a given variable name is valid, otherwise return false.

Examples
variableValid("result") ➞ true

variableValid("odd_nums") ➞ true

variableValid("2TimesN") ➞ false

Notes
Inputs are given as strings.
Variable names with spaces are not allowed.
Although this question may seem like otherwise, you can't actually assign words with quotes around them as variables.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean variableValid(String variable) {
          if(variable != null && variable.length() != 0 && (Character.isLetter(variable.charAt(0)) || variable.charAt(0) == '_') && !variable.contains(" "))
              return true;
          return false;
    }
  }




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean variableValid(String variable) {
          return !(variable.contains(" ") || Character.isDigit(variable.charAt(0)));
    }
  }



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean variableValid(String v) {
          if(!Character.isLetter(v.charAt(0))){
              return false;
          }
          
          for(char c : v.toCharArray()){
              if(!(Character.isLetterOrDigit(c) || c=='_')){
                  return false;
              }
          }
          
          return true;
    }
  }


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static boolean variableValid(String variable) {
		char firstLetter = variable.charAt(0);

		if (!Character.isLetter(firstLetter))
			return false;

		
		for (int i = 1; i < variable.length(); i++) {
			char currentLetter = variable.charAt(i);

			if (!(Character.isLetterOrDigit(currentLetter)||currentLetter == '_')) {
				return false;
			}
		}

		return true;
	}
  }