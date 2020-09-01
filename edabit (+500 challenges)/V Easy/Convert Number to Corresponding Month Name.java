/*********************************************************************************************************************
 
Convert Number to Corresponding Month Name
Create a function that takes a number (from 1 to 12) and returns its corresponding month name as a string. For example, if you're given 3 as input, your function should return "March", because March is the 3rd month.

Number	Month Name
1	January
2	February
3	March
4	April
5	May
6	June
7	July
8	August
9	September
10	October
11	November
12	December
Examples
monthName(3) ➞ "March"

monthName(12) ➞ "December"

monthName(6) ➞ "June"
Notes
You can expect only integers ranging from 1 to 12 as test input.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




public class Challenge {
	public static String monthName(int num) {
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",} ;
		return months[num-1];
	}
}



//#############################################################


public class Challenge {
	public static String monthName(int num) {
		String[] arr = {"January",
"February",
"March",
"April",
"May",
"June",
"July",
"August",
"September",
"October",
"November",
"December"};
		return arr[num-1];
	}
}


//#############################################################


public class Challenge {
	public static String monthName(int num) {
		switch(num){
			case 1:
				return "January";
			case 2:
				return "February";
			case 3:
				return "March";		
			case 4:
				return "April";
			case 5:
				return "May";
			case 6:
				return "June";
			case 7:
				return "July";
			case 8:
				return "August";
			case 9:
				return "September";
			case 10:
				return "October";			
			case 11:
				return "November";
			case 12:
				return "December";					
		}
		return "null";
	}
}


//#############################################################


// import java.util.*;

public class Challenge {
	public static String monthName(int num) {
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(1, "January");
		hm.put(2, "February");
		hm.put(3, "March");
		hm.put(4, "April");
		hm.put(5, "May");
		hm.put(6, "June");
		hm.put(7, "July");
		hm.put(8, "August");
		hm.put(9, "September");
		hm.put(10, "October");
		hm.put(11, "November");
		hm.put(12, "December");
		
		return hm.get(num);
	}
}


//#############################################################


public class Challenge {
	

    public static String monthName(int num) {
        //Create a function that takes a number (from 1 to 12) and return its corresponding month name as a string.
    String month = "";
    
        switch (num) {
        case 1 : month = "January";
        break;
        
        case 2 : month = "February";
        break;
        
        case 3 : month = "March";
        break;
        
        case 4 : month = "April";
        break;
        
        case 5 : month = "May";
        break;
        
        case 6 : month = "June";
        break;
        
        case 7 : month = "July";
        break;
        
        case 8 : month = "August";
        break;
        
        case 9 : month = "September";
        break;
        
        case 10 : month = "October";
        break;
        
        case 11: month = "November";
        break;
        
        case 12 : month = "December";
        break;
        
    
        
        }
    
        
    return month;
    
    }
    }



//#############################################################



    public class Challenge {
        public static String monthName(int num) {
            if (num == 1) return "January";
            else if (num == 2) return "February";
            else if (num == 3) return "March";
            else if (num == 4) return "April";
            else if (num == 5) return "May";
            else if (num == 6) return "June";
            else if (num == 7) return "July";
            else if (num == 8) return "August";
            else if (num == 9) return "September";
            else if (num == 10) return "October";
            else if (num == 11) return "November";
            else if (num == 12) return "December";
            return"";
        }
    }
