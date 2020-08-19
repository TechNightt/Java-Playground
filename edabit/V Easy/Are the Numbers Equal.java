

/*********************************************************************************************************************
                                                                                                                     *                                        
Are the Numbers Equal?                                                                                               *                                       
Create a function that returns true when x is equal to y; otherwise return false.                                    *                        
                                                                                                                     *       
Examples                                                                                                             *                                                                                                       *                                                
isSameNum(4, 8) ➞ false                                                                                             *                                       
                                                                                                                     *                                               
isSameNum(2, 2) ➞  true                                                                                             *                                           
                                                                                                                     *                                   
isSameNum(42, 32) ➞  false                                                                                          *                                       
Notes                                                                                                                *                                       
Don't forget to return the result.                                                                                   *               
                                                                                                                     *                                       
                                                                                                                     *                                       
                                                                                                                     *               
*********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




public class Program {
    public static boolean isSameNum(int x, int y) {
     return x == y;
    }
}







public class Program {
	public static boolean isSameNum(int x, int y) {
		if (x==y){
			return true;
		}
		return false;
	}
}






public class Program {
    public static boolean isSameNum(int x, int y) {
     return x==y?true:false;
    }
}





public class Program {
    public static boolean isSameNum(int x, int y) {
     if(x == y) {
			 return true;
		 }
			else {
				return false;
			}
    }
	
		public static void main(String[] args) {
			isSameNum(4, 8);
			isSameNum(2, 2);
		}
}