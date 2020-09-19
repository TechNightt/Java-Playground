/*********************************************************************************************************************
 Format Number with Comma(s) Separating Thousands

Create a function that takes a number as an argument and returns a string formatted to separate thousands.

Examples
formatNum(1000) ➞ "1,000"

formatNum(100000) ➞ "100,000"

formatNum(20) ➞ "20"

Notes
You can expect a valid number for all test cases.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String formatNum(int num) {
		String sNum = "" + num;
		String result = "";
		for(int i=sNum.length(), j=1;i>0;i--,j++){
			result = sNum.charAt(i-1) + result;
			if(j==3 && i>1){
				result = "," + result;
				j=0;
			}
		}
		return result;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static String formatNum(int num) {
        String str = String.valueOf(num);

        StringBuilder sb = new StringBuilder();

        String str11 = "";
        if(str.length()>=7){
            String last1 = str.substring(str.length()-3);
            //System.out.println(last1);

            String last2 = str.substring(str.length()-6,str.length()-3);
            //System.out.println(last2);

            String last3 = str.substring(0,1);
            //System.out.println(last3);
            sb.append(last3);
            sb.append(',');
            sb.append(last2);
            sb.append(',');
            sb.append(last1);
            str11 = sb.toString();
            //System.out.println("str11 " + str11);

        }

        else if(str.length()>=4){
            String last1 = str.substring(str.length()-3);
            //System.out.println(last1);

            String last3 = str.substring(0,str.length()-3);
            //System.out.println(last3);
            sb.append(last3);
            sb.append(',');
            sb.append(last1);
            str11 = sb.toString();
            //System.out.println("str11 " + str11);

        }
        else {
            str11 = str;
        }


        /*char[] arrChar = str.toCharArray();
        for(int i=arrChar.length-1;i>0;i--){

        }*/

        return str11;
    }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String formatNum(int num) {
		StringBuilder sb1 = new StringBuilder();
		 int count = 0;
		 String str = Integer.toString(num);
		 if(str.length() < 4) return str;
		 else {
			 int i = str.length() - 1;
			 while(i >= 0) {
				 if(count != 0 & count % 3 == 0) {
					 sb1.append(",");
				 }
				 sb1.append(str.charAt(i));
				 count++;
				 i--;
			 }
		 }
		 StringBuilder sb2 = new StringBuilder();
		 for(int j = sb1.toString().length()-1; j >= 0; j--) {
			 sb2.append(sb1.toString().charAt(j));
		 }
		 return sb2.toString();
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String formatNum(int num) {
		return String.format("%,d", num);
	}

    


    
//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static String formatNum(int num) {
		String strNum = Integer.toString(num);
		String res = "";
		for (int i = 0; i < strNum.length(); i++) {
			res += (strNum.length() - i) % 3 == 0 ? "," + strNum.charAt(i) : strNum.charAt(i);
		}
		return res;
	}
}