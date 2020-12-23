/*********************************************************************************************************************
 Get the Excel Column

Excel column names are in the following format:

A, B, ..., Z, AA, ..., AZ, BA, ..., ZZ, AAA, AAB, ...
Write a function that returns the column number from the column name.

Examples
column("A") ➞ 1

column("Z") ➞ 26

column("AA") ➞ 27

column("BA") ➞ 53
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static int row(String rowName) {
            int rowLength = rowName.length();
            int res;
            if (rowLength==1){
                res =  valueInList(rowName);
            }else {
                res = (int) Math.pow(26,rowLength-1)*valueInList(String.valueOf(rowName.charAt(0)))+row(rowName.substring(1));
            }
            return res;
        }
        private static int valueInList(String letter) {
            String[] valuesToCompare = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            int res = 0;
            for (int iterator = 0; iterator < valuesToCompare.length; iterator++) {
                if (valuesToCompare[iterator].equals(letter)){
                    res = iterator+1;
                }
            }
            return res;
        }
    }



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static int row(String rowName) {
            int rowLength = rowName.length();
            int res;
            if (rowLength==1){
                res =  valueInList(rowName);
            }else {
                res = (int) Math.pow(26,rowLength-1)*valueInList(String.valueOf(rowName.charAt(0)))+row(rowName.substring(1));
            }
            return res;
        }
        private static int valueInList(String letter) {
            String[] valuesToCompare = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
            int res = 0;
            for (int iterator = 0; iterator < valuesToCompare.length; iterator++) {
                if (valuesToCompare[iterator].equals(letter)){
                    res = iterator+1;
                }
            }
            return res;
        }
    }




//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static int row(String str) {
		return str.toUpperCase().chars()
			.map(i -> i & 63)
			.reduce(0, (a, b) -> 26 * a + b);
  }
}




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static int row(String column) {
        int multi = 0;
        int letraSuma = 0;

        for (int index = 0; index < column.length() ; index++) {
            multi = multi * 26;
            letraSuma = ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf( column.charAt(index) )  +1);
            multi  = multi + letraSuma;
        }

        return multi;
    }
}