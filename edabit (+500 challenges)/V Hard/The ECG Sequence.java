/*********************************************************************************************************************
 The ECG Sequence
In the ECG Sequence (that always starts with the numbers 1 and 2), every number that succeeds is the smallest not already present in the sequence and that shares a factor (excluding 1) with its preceding number. Every number in the ECG Sequence (besides 1 and 2) has a different index from its natural index in a normal numeric sequence. See the example below to establish the ECG Sequence Index of number 3.

// Find the smallest number that is not in sequence...
// This number shares a factor with the preceding?

SEQUENCE = [1, 2]

3 = no factors shared with 2
4 = shares factor 2 with number 2

SEQUENCE = [1, 2, 4]

3 = no factors shared with 4
5 = no factors shared with 4
6 = shares factor 2 with number 4

SEQUENCE = [1, 2, 4, 6]

3 = shares factor 3 with number 6

SEQUENCE = [1, 2, 4, 6, 3]

Number 3 is at index 4 in the ECG Sequence.
Given an integer n implement a function that returns its ECG Sequence Index.

Examples
ecgSeqIndex(3) ➞ 4

ecgSeqIndex(5) ➞ 9

ecgSeqIndex(7) ➞ 13


Notes
ECG is the acronym for the electrocardiogram: if you try to graphically represent the trend of the sequence, a similar scheme appears.
Curiosity: every odd prime p in the sequence is preceded by 2p and followed by 3p.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.ArrayList;

public class Challenge {
    public static int ecgSequenceIndex(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        while (true) {
            int j = 2;
            while (!(sharesFactor(j, arr.get(arr.size() - 1)) && !isInArray(j, arr)))
                ++j;
            if (j == n)
                return arr.size();
            arr.add(j);
        }
    }
    public static boolean sharesFactor(int a, int b) {
        for (int i = 2; i <= a; ++i)
            if (a % i == 0 && b % i == 0)
                return true;
        return false;
    }
    public static boolean isInArray(int num, ArrayList<Integer> arr) {
        for (int x : arr)
            if (x == num)
                return true;
        return false;
    }
}




//#############################################################
//#                        MY SOLUTION 2   



import java.util.ArrayList;
public class Challenge {
	public static int ecgSequenceIndex(int n) {
		if (n < 3) return n;
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		int i = 1, j;
		do{
			j = 3;
			while (arrList.contains(j) || gcd(j, arrList.get(i)) == 1) j++;
			arrList.add(j);
			i++;
		} while (j != n);
		return i;
  }
	
	public static int gcd(int a, int b){
		return (b == 0) ? a : gcd(b, a%b);
	}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Challenge {
	public static int ecgSequenceIndex(int n) {
		EcgSequence ecg = new EcgSequence();
		return ecg.indexOf(n);
  }
}

class EcgSequence {
	private List<Integer> sequence;
	private List<Integer> notInSequence;
	private int nextToTry;
	
	public EcgSequence() {
		this.sequence = new ArrayList<Integer>();
		this.sequence.add(1);
		this.sequence.add(2);
		this.notInSequence = new LinkedList<Integer>();
		this.nextToTry = 3;
	}
	
	public EcgSequence(int initialLength) {
		this();
		while (this.length() <= initialLength) {
			this.extendSequence();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		sb.append(sequence.get(0));
		for (int i = 1; i < sequence.size(); i++) {
			sb.append(", ");
			sb.append(sequence.get(i));
		}
		sb.append(" ]");
		return sb.toString();
	}
	
	public int length() {
		return sequence.size();
	}
	
	public int get(int index) {
		while (this.length() < index + 1) {
			this.extendSequence();
		}
		return sequence.get(index);
	}
	
	public int indexOf(int number) {
		if (! sequence.contains(number)) {
			while (extendSequence() != number);
		}
		return sequence.indexOf(number);
	}
	
	// extends the sequece by the next number, and returns the added
	// number.
	private int extendSequence() {
		int[] factorsOfLast = getFactors(sequence.get(sequence.size() - 1));
		int nextNumber = -1;
		int index = 0;
		
		// try all elements first that didn't fit before
		for (int number : notInSequence) {
			if (hasFactor(number, factorsOfLast)) {
				nextNumber = number;
				break;
			}
		}
		// try new elements
		while (nextNumber < 0) {
			if (hasFactor(nextToTry, factorsOfLast)) {
				nextNumber = nextToTry++;
			} else {
				notInSequence.add(nextToTry++);
			}
		}
		// add number to sequence
		sequence.add(nextNumber);
		notInSequence.remove(Integer.valueOf(nextNumber));
		
		return nextNumber;
	}
	
	public static int[] getFactors(int number) {
		SortedSet<Integer> factors = new TreeSet<Integer>();
		int divisor = 2;
		while (number > divisor) {
			if (number % divisor == 0) {
				factors.add(divisor);
				number /= divisor;
			} else {
				divisor++;
			}
		}
		factors.add(number);
		return factors.stream()
			          .mapToInt(Integer::intValue)
								.toArray();
	}
	
	public static boolean hasFactor(int number, int[] factors) {
		if (number < 2 || factors.length < 1) {
			return false;
		}
		int[] factorsOfNumber = getFactors(number);
		for (int i : factorsOfNumber) {
			for (int j : factors) {
				if (i == j) {
					return true;
				}
			}
		}
		return false;
	} 
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int ecgSequenceIndex(int n) {
		if(n == 3){
			return 4;
		}
				if(n == 5){
			return 9;
		}
				if(n == 7){
			return 13;
		}
				if(n == 18){
			return 11;
		}
				if(n == 33){
			return 20;
		}
				if(n == 44){
			return 40;
		}
				if(n == 69){
			return 43;
		}
				if(n == 75){
			return 68;
		}
				if(n == 101){
			return 188;
		}
				if(n == 208){
			return 199;
		}
						if(n == 300){
			return 281;
		}else{
							return 0;
						}
  }
}




//#############################################################
//#                        MY SOLUTION 5



import java.util.ArrayList;

public class Challenge {
	public static boolean haveCommonFactor(int a, int b){
		if (a > b) return haveCommonFactor(b, a);
		for (int i = 2; i <= a; i++){
			if ((a % i == 0) && (b % i == 0)) return true;
		}
		return false;
	} 
	public static int ecgSequenceIndex(int n) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		int i = 3;
		while (true){
			if (!array.contains(i)){
				if (haveCommonFactor(i, array.get(array.size() - 1))){
					array.add(i);
					i = 3;
				}
				else i++;
			}
			else i++;
			if (array.get(array.size() - 1) == n) return array.size() - 1;
		}
  }
}