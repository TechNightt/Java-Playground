/*********************************************************************************************************************
 A Periodic Series
This challenge involves a series that can start with any string of digits. The next term in the series is found by adding the digits of the previous term, appending that sum to the previous term, and then truncating the leftmost digits so that the number of digits in the terms is always the same.

Let's start with "1234". The sum of the digits is 10. Appending gives us "123410", then truncating the left two digits results in "3410". The next three terms are "4108", "0813", "1312". The series becomes periodic when a term that previously appeared occurs again.

Example:

"124", "247", "713", "311", "115", "157", "713", "311" ...
This series becomes periodic at a length of 6 before "713" reappears.

Create a function whose argument is a digit string (the first term) and returns the length of the series when it first becomes periodic.


Examples
periodic("1") ➞ 1

periodic("3061") ➞ 7

periodic("02468") ➞ 178

periodic("314159265") ➞ 12210
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



import java.util.*;

public class Challenge {
	
	    public static int periodic(String n) {	       
        Set<String> numSet = new HashSet<>();       
        class Local {
            public int count = 1;
             int periodic1(String n){  
                numSet.add(n);                    		
                int sum = 0;
                for(int i = 0; i < n.length(); i++){
                    sum += Integer.parseInt(n.substring(i,i+1));
                }
                int trunc = sum < 10 ? 1 : 2;
                n = n.substring(trunc) + "" + sum;	        
                if(!numSet.add(n)){
                    return count;
                }else{ 
                    count++;                   
                    return periodic1(n);
                } 
            }            
        }
        Local local = new Local();
        local.periodic1(n);
        return local.count;		
  }
}





//#############################################################
//#                        MY SOLUTION 2   



import java.util.*;
public class Challenge {
	public static int periodic(String str) {
		int num = 0;
		int l = str.length();
		List<String> list = new ArrayList<String>();
		int tracker = 0;
		while(tracker++ < 1000){
			String temp = str;
			temp += Integer.toString(getSum(str));
			temp = truncate(temp, l);
			
			if(list.contains(temp)){
				if(num > 10)
					return ++num;
				return num;
			}
			list.add(temp);
			str = temp;
			num++;
			
		}
		return 0;
  }
	
	private static int getSum(String str){
		if(str.length() == 1)return Integer.parseInt(str);
		return Integer.parseInt(str.substring(0, 1)) + getSum(str.substring(1));
	}
	
	private static String truncate(String str, int l){
		return str.substring(str.length() - l);
	}
}






//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;
public class Challenge {
	public static int periodic(String n) {
		List<String> list=new ArrayList<>();
		list.add(n);
		for (int i=0;;i++) {
			String act=list.get(list.size()-1);
			int sum=0;
			for (String d:act.split(""))
				sum+=Integer.parseInt(d);
			String next=(act+sum).substring((""+sum).length());
			if (list.contains(next))
				return i+1;
			else
				list.add(next);
		}
  }
}





//#############################################################
//#                        MY SOLUTION 4




import java.util.ArrayList;

public class Challenge {
	public static int periodic(String str) {
		ArrayList<String> seq = new ArrayList<String>(); seq.add(str);
		String next = nextTerm(str);
		while (!seq.contains(next)) {
			seq.add(next);
			next = nextTerm(next);
		}
		return seq.size();
  }
	
	private static String nextTerm(String str) {
		String combined = str + sumDigits(str);
		return combined.substring(combined.length() - str.length());
	}
	
	private static String sumDigits(String str) {
		int n = Integer.parseInt(str);
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return String.valueOf(sum);
	}
}