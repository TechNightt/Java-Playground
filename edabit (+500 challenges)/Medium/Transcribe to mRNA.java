/*********************************************************************************************************************
 Transcribe to mRNA

Transcribe the given DNA strand into corresponding mRNA - a type of RNA, that will be formed from DNA after transcription. DNA has the bases A, T, G and C, while RNA converts to U, A, C and G respectively.

Examples
dnaToRna("ATTAGCGCGATATACGCGTAC") ➞ "UAAUCGCGCUAUAUGCGCAUG"

dnaToRna("CGATATA") ➞ "GCUAUAU"

dnaToRna("GTCATACGACGTA") ➞ "CAGUAUGCUGCAU"

Notes
Transcription is the process of making complementary strand.
A, T, G and C in DNA converts to U, A, C and G respectively in mRNA.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Transcription {
	public static String dnaToRna(String strand) {
	char [] c = strand.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch:
             c) {
            if(ch=='A')
                sb.append('U');
            if(ch=='T')
                sb.append('A');
            if(ch=='G')
                sb.append('C');
            if(ch=='C')
                sb.append('G');
        }
        return sb.toString();
	}
}




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.HashMap;
import java.util.stream.Stream;

public class Transcription {
	public static String dnaToRna(String s) {
		char[][] n = new char[][] {{'A', 'U'}, {'T', 'A'}, {'G', 'C'}, {'C', 'G'}};
		HashMap<Character, Character> m = new HashMap<Character, Character>();
		Stream.of(n).forEach(c -> m.put(c[0], c[1]));
		return s.chars().mapToObj(c -> m.get((char)c).toString()).reduce(String::concat).get();
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Transcription {
	public static String dnaToRna(String strand) {
		String result = "";
		for (char c : strand.toCharArray()){
			switch (c){
				case 'A':
					result += "U";
					break;
				case 'T':
					result += "A";
					break;
				case 'G':
					result += "C";
					break;
				case 'C':
					result += "G";
					break;
			}
		}
		return result;
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Transcription {
	public static String dnaToRna(String strand) {
		String result = "";
		for(int i = 0; i < strand.length(); i++){
			if(strand.charAt(i) == 'A') result += 'U';
			else if(strand.charAt(i) == 'T') result += 'A';
			else if(strand.charAt(i) == 'G') result += 'C';
			else if(strand.charAt(i) == 'C') result += 'G';
			else result = "fault";
		}
		return result;
	}
}