/*********************************************************************************************************************
 Percentage Changed
Create a function that takes an old price oldPrice, a new price newPrice, and returns what percent the price decreased or increased. Round the percentage to the nearest whole percent.

Examples
percentageChanged("$800", "$600") ➞ "25% decrease"

percentageChanged("$1000", "$840") ➞ "16% decrease"

percentageChanged("$100", "$950") ➞ "850% increase"
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Price {
	public static String percentageChanged(String op, String np) {
		float o = Integer.parseInt(op.replaceAll("\\$", "")), n = Integer.parseInt(np.replaceAll("\\$", ""));
		int p = Math.round((n - o) / o * 100);
		return new String[] {p + "% in", -p + "% de"}[p < 0 ? 1 : 0] + "crease";
	}
}





//#############################################################
//#                        MY SOLUTION 2   


public class Price {
	public static String percentageChanged(String oldPrice, String newPrice) {
		double oldPr = Double.parseDouble(oldPrice.substring(1)), newPr = Double.parseDouble(newPrice.substring(1));
    double percent = Math.abs((newPr - oldPr) / oldPr);
    return oldPr > newPr ? (int)(percent * 100) + "% decrease" : (int)(percent * 100) + "% increase";
	}
}





//#############################################################
//#                        MY SOLUTION 3   


public class Price {
	public static String percentageChanged(String oldPrice, String newPrice) {
			int x = Integer.parseInt(oldPrice.substring(1, oldPrice.length()));
			int y = Integer.parseInt(newPrice.substring(1, newPrice.length()));
			if(x > y) {
					return ( 100 * ( x - y) ) / x + "% decrease";
			}
			return (100 * ( y - x ) ) / x + "% increase";
	}
}


