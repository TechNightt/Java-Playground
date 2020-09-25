/*********************************************************************************************************************
 Movie Theatre Admittance
Write a function that checks whether a person can watch an MA15+ rated movie. One of the following two conditions is required for admittance:

The person is at least 15 years old.
They have parental supervision.
The function accepts two parameters, age and isSupervised. Return a boolean.

Examples
acceptIntoMovie(14, true) ➞ true

acceptIntoMovie(14, false) ➞ false

acceptIntoMovie(16, false) ➞ true

Notes
age is a decimal.
isSupervised is a boolean.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   



public class Program {
    public static boolean acceptIntoMovie(int age, boolean isSupervised) {
      return (age >= 15 || isSupervised);
    }
}






//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static boolean acceptIntoMovie(int age, boolean isSupervised) {
      	if (age >= 15 || isSupervised == true) return true;
        return false;
    }
}






//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static boolean acceptIntoMovie(int age, boolean isSupervised) {
      return age>=15 || isSupervised==true ? true:
						false;
    }
}





