/*********************************************************************************************************************
 Same ASCII?
Return true if the sum of ASCII values of the first string is same as the sum of ASCII values of the second string, otherwise return false.

Examples
sameAscii("a", "a") ➞ true

sameAscii("AA", "B@") ➞ true

sameAscii("EdAbIt", "EDABIT") ➞ false

Notes
If you need some help with ASCII codes, check the Resources tab for an image of all ASCII codes used in this challenge.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static Boolean sameAscii(String a, String b) {
		return getAsciiSum(a) == getAsciiSum(b);
	}
	
	private static int getAsciiSum(String s) {
		return s.chars()
			.sum();
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static boolean sameAscii(String a, String b) {
		
		int aCount = 0;
		int bCount = 0;
		
		for(int x = 0; x < a.length(); x++) {
			aCount += (int) a.charAt(x);
		}
		
		for(int x = 0; x < b.length(); x++) {
			bCount += (int) b.charAt(x);
		}
		
		return (aCount == bCount) ? true : false;
		
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static boolean sameAscii(String a, String b) {
            int sum=0;
            int sumb=0;
              for(int i=0;i<b.length();i++){
                 int chab=b.charAt(i);
                 int ascii1 = (int) b.charAt(i);
                
                  if ((chab >= 'a' && chab <= 'z' || chab>= 'A' && chab<= 'Z')) {
                       sumb+=ascii1;
                   
                  }
                if ((' ' ==chab)||(chab == '@') || ('['==chab)||(','==chab) ||(']'==chab)|| ('{' == chab)||('}'==chab)|| ('('==chab)||(')'==chab)||(chab == '~')){
                       sumb+=ascii1;
                  }
                  if('1'==chab||'2'==chab||'3'==chab||'4'==chab||'5'==chab||'6'==chab||'0'==chab||'7'==chab||'8'==chab||'9'==chab){
                      sumb+=ascii1;
                  }
​
             }
            for(int i=0;i<a.length();i++){
                 
           int ascii2 = (int) a.charAt(i); 
                int cha=a.charAt(i);
                if ((cha >= 'a' && cha <= 'z' || cha>= 'A' && cha<= 'Z')) {
                     sum+=ascii2;
                }
                if ((' ' ==cha)||(cha == '@') || ('['==cha) ||(']'==cha)||(','==cha)|| ('{' == cha)||('}'==cha)|| ('('==cha)||(')'==cha)||(cha == '~')){
                     sum+=ascii2;
​
                }
                 if('1'==cha||'2'==cha||'3'==cha||'4'==cha||'5'==cha||'6'==cha||'0'==cha||'7'==cha||'8'==cha||'9'==cha){
                      sum+=ascii2;
                  }
   
                
                }
           
             System.out.println(sum);
            System.out.println(sumb);
            if(sum==sumb){
                return true;
            }
            else{
                return false;
            }
            
            
         
        }
  }




 


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static boolean sameAscii(String a, String b) {
		  int sumA = 0; int sumB =0;
        for(char c : a.toCharArray()) sumA += (int) c;
        for(char c : b.toCharArray()) sumB += (int) c;
        return sumA == sumB;
	}
}







//#############################################################
//#                        MY SOLUTION 5
//#############################################################


public class Challenge {
	public static boolean sameAscii(String a, String b) {
				char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        int castAscii1 = 0;
        for (char c1 : ch1) {
            int ascii1 = (int) c1;
            castAscii1 = castAscii1 + ascii1;
        }
        int castAscii2 = 0;
        for (char c2 : ch2) {
            int ascii2 = (int) c2;
            castAscii2 = castAscii2 + ascii2;
        }
        if (castAscii1 == castAscii2) {
            return true;
        }
        return false;
	}
}