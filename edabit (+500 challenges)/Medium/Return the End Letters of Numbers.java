/*********************************************************************************************************************
 Return the End Letters of Numbers

Create a function that takes an integer and returns it as an ordinal number. An Ordinal Number is a number that tells the position of something in a list, such as 1st, 2nd, 3rd, 4th, 5th, etc.

Examples
returnTheEndOfNumber(553) ➞ "553-RD"

returnTheEndOfNumber(34) ➞ "34-TH"

returnTheEndOfNumber(1231) ➞ "1231-ST"

returnTheEndOfNumber(22) ➞ "22-ND"

returnEndOfNumber(412) ➞ "412-TH"

Notes
Check the Resources tab for more info on ordinal numbers.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static String returnTheEndOfNumber(int num) {
		int j = num % 10;
    int k = num % 100;
    if (j == 1 && k != 11) {
        return String.valueOf(num)+ "-ST";
    }
    if (j == 2 && k != 12) {
        return String.valueOf(num) + "-ND";
    }
    if (j == 3 && k != 13) {
        return String.valueOf(num) + "-RD";
    }
    return String.valueOf(num) + "-TH";
		
		
	}
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static String returnTheEndOfNumber(int num) {
				String n = String.valueOf(num);
        if (n.endsWith("11") || n.endsWith("12") || n.endsWith("13"))
            return num + "-TH";
        else if (n.endsWith("1"))
            return num + "-ST";
        else if (n.endsWith("2"))
            return num + "-ND";
        else if (n.endsWith("3"))
            return num + "-RD";
        else
            return num + "-TH";
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String returnTheEndOfNumber(int n) {
		int a=n%10;
		char b=n>=10 ? (n+"").charAt((n+"").length()-2) : '0';
		return n + "-" + 
			(b=='1' ? "TH" :
			a==1 ? "ST" :
			a==2 ? "ND" :
			a==3 ? "RD" : "TH");
	}
}









//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	
    public static String returnTheEndOfNumber(int num) {
      String ordinal = "";
      switch (num % 10) {
          case 1: ordinal = "ST"; break; 
          case 2: ordinal = "ND"; break;
          case 3: ordinal = "RD"; break;
          default: ordinal = "TH"; break;
      } 
      if(num%100 > 10 && num%100 < 14) ordinal = "TH";
      //p("ordinal = " + ordinal + "; rem num = " + num%10);
      return num + "-" + ordinal;
  }
}









//#############################################################
//#                        MY SOLUTION 5
//#############################################################



import java.util.Arrays;
import java.util.List;

public class Challenge {
	public static String returnTheEndOfNumber(int num) {
    final List<String> endings = Arrays.asList("ST", "ND", "RD", "TH");
    int n = num % 100;
    final boolean th = ((n > 10) & (n < 14));
    n %= 10;
    return String.format("%d-%s", num, endings.get((th || (n > 3)) ? 3 : n-1));
	}
}