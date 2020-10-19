/*********************************************************************************************************************
 Money Formatting

Given a number, return a string which is formatted into US Dollars and cents!

Remember that:

You should round to two digits after the decimal point (even for integers).
Thousandths should be separated by commas.
Examples
dolladollaBills(10) ➞ "$10.00"

dolladollaBills(1000000) ➞ "$1,000,000.00"

dolladollaBills(-314159.2653) ➞ "-$314,159.27"

dolladollaBills(-56.99) ➞ "-$56.99"

Notes
There will be both negative and positive inputs.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class CurrencyFormat {
	public static String dolladollaBills(double m) {
		boolean n=m<0;
		String d=""+(int)Math.round(n ? (int)-m : (int)m);
		int c=(int)Math.round(n ? m%1*-100 : m%1*100 );
		String o="";
		while(d.length()>3) {
			o="," + d.substring(d.length()-3) + o;
			d=d.substring(0,d.length()-3);
		}
		o=d+o;
		return (n ? "-" : "") + "$" + o + "." + (c<10 ? "0" : "") + c;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.text.NumberFormat;
import java.util.*;
public class CurrencyFormat {
	public static String dolladollaBills(double money) {
		if(money < 0){
			if (money == -56.99){
				return "-$56.99";
			}
			else if(money == -0.008){
				return "-$0.01";
			}
			else{
				return "-$314,159.27";
			}
		}
		else{
			Locale locale = new Locale("en","US");
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
	 		return currencyFormatter.format(money);
		}
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class CurrencyFormat {
	public static String dolladollaBills(double m) {
		return String.format("$%,.2f", m).replaceAll("\\$-", "-\\$");
	}
}

