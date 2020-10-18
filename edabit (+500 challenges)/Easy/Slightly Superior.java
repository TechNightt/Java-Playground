/*********************************************************************************************************************
 Slightly Superior

You will be given two extremely similar arrays, but exactly one of the items in an array will be valued slightly higher than its counterpart (which means that evaluating the value > the other value will return true).

Create a function that returns whether the first array is slightly superior to that of the second.

Worked Example
isFirstSuperior([1, 2, 4], [1, 2, 3]) ➞ true
// The pair of items at each index are compared in turn.
// 1 from the first array is the same as 1 from the second array.
// 2 is the same as 2.
// However, 4 is greater than 3, so first array is superior.
Examples
isFirstSuperior(["a", "d", "c"], ["a", "b", "c"]) ➞ true

isFirstSuperior(["zebra", "ostrich", "whale"], ["ant", "ostrich", "whale"]) ➞ true

isFirstSuperior([1, 2, 3, 4], [1, 2, 4, 4]) ➞ false

isFirstSuperior([true, 10, "zebra"], [true, 10, "zebra"]) ➞ false

Notes
All values and thei
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Superiority {
	public static boolean isFirstSuperior(Object a[], Object b[]) {
		int s=0;
		for (int i=0; i<a.length; i++) {
			int x=getVal(a[i]);
			int y=getVal(b[i]);
			if ( x>y ) s++;
			if ( x<y ) return false;
		}
		return s==1;
	}
	private static int getVal(Object o) {
		if (o instanceof Integer) return (int)o;
		if (o instanceof Double) return (int)((Double)o*10);
		if (o instanceof Boolean) return (Boolean)o ? 1 : 0;
		if (o instanceof Character) return (char)o;
		int out=0;
		char[] cs=((String)o).toCharArray();
		for (int i=0, mul=128; i<cs.length; i++, mul/=2)
			out+=(cs[i]-96)*mul;
		return out;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.stream.IntStream;

public class Superiority {
	public static boolean isFirstSuperior(Object a[], Object b[]) {
		return IntStream.range(0, a.length).map(i -> a[i].toString().compareTo(b[i].toString())).sum() > 0;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Superiority {
	public static boolean isFirstSuperior(Object a[], Object b[]) {
		int totalvaluearr1 = 0;
		int totalvaluearr2 = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] instanceof Boolean){
				if(((Boolean)a[i]) == true && (Boolean)b[i] == false){
					return true;
				}
				else{
					continue;
				}
			}
			else if(a[i] instanceof Integer){
				if(((Integer)a[i]) > ((Integer)b[i])){
					return true;
				}
			}
			else if(a[i] instanceof Double){
				if((Double)a[i] > (Double)b[i]){
					return true;
				}
			}
			else if(a[i] instanceof String){
				if(((String)a[i]).compareTo((String)b[i]) > 0){
					return true;
				}
				else{
					continue;
				}
			}
 	}
	return false;
	}
}


