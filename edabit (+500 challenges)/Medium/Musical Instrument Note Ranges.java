/*********************************************************************************************************************
 Musical Instrument Note Ranges

Musical instruments have a range of notes to play, some instruments having a much larger range than others.

Given the following ranges for the instrument, create a function that returns true if a given note is within a given instrument's range. Otherwise, return false.

Instrument	Range
Piccolo	D4-C7
Tuba	D1-F4
Guitar	E3-E6
Piano	A0-C8
Violin	G3-A7
Examples
instrumentRange("Piccolo", "A3") ➞ false

instrumentRange("Violin", "G6") ➞ true

instrumentRange("Piano", "C8") ➞ true

Notes
Tests will only include natural notes (i.e. you will only deal with letters and numbers, no special characters).
The musical scale follows this pattern: ... A1, B1, C1, D1, E1, F1, G1, A2, B2 ...
You don't need to worry about invalid inputs.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean instrumentRange(String instr, String note) {
          switch(instr){
              case "Piccolo":
                  return  note.matches("([D-G]4)|([A-G][5-6])|([A-C]7)");//D4-C7
                  
              case "Tuba":
                  return note.matches("([D-G]1)|([A-G][2-3])|([A-F]4)");//	D1-F4
              
                          case "Guitar":
                  return note.matches("([E-G]3)|([A-G][4-5])|([A-E]6)");  //E3-E6
              
                          case "Piano":
                  return note.matches("([A-G][0-7])|([A-C]8)");//	A0-C8
          
                          case "Violin":
                  return note.matches("(G3)|([A-G][4-6])|(A7)");//G3-A7
              
          }
              return true;
    }
      
      
  }






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static boolean instrumentRange(String instr, String note) {
		String[] range = { "", "" };

		switch (instr) {
			case "Piccolo":
				range = new String[] { "D4", "C7" };
				break;
			case "Tuba":
				range = new String[] { "D1", "F4" };
				break;
			case "Guitar":
				range = new String[] { "E3", "E6" };
				break;
			case "Piano":
				range = new String[] { "A0", "C8" };
				break;
			case "Violin":
				range = new String[] { "G3", "A7" };
				break;
		}

		int numbNote = note.charAt(1) - '0', numbMin = range[0].charAt(1) - '0', numbMax = range[1].charAt(1) - '0';

		if (numbNote > 8)
			return false;

		if (numbNote > numbMin && numbNote < numbMax)
			return true;

		if (numbNote == numbMin) {
			char chordNote = note.charAt(0), chordMin = range[0].charAt(0);

			if (chordMin <= chordNote)
				return true;
		} else if (numbNote == numbMax) {
			char chordNote = note.charAt(0), chordMax = range[1].charAt(0);

			if (chordMax >= chordNote)
				return true;
		}

		return false;
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.HashMap;

public class Challenge {
  public static boolean instrumentRange(String instr, String note) {
		    HashMap<String, String> map = new HashMap<>();
        map.put("Piccolo", "44-73");
        map.put("Tuba", "14-46");
        map.put("Guitar", "35-65");
        map.put("Piano", "01-83");
        map.put("Violin", "37-71");
        int convertedNote = noteToInt(note);
        String val = map.get(instr);
        int low  = Integer.parseInt(val.split("-")[0]);
        int high = Integer.parseInt(val.split("-")[1]);
        if(convertedNote <= high && convertedNote >= low) return true;
        else return false;
		
  }
	public static int noteToInt(String str){
        int result = 0;
        result += Integer.parseInt(str.substring(1, 2)) * 10;
        if (str.toCharArray()[0] == 'A') result += 1;
        if (str.toCharArray()[0] == 'B') result += 2;
        if (str.toCharArray()[0] == 'C') result += 3;
        if (str.toCharArray()[0] == 'D') result += 4;
        if (str.toCharArray()[0] == 'E') result += 5;
        if (str.toCharArray()[0] == 'F') result += 6;
        if (str.toCharArray()[0] == 'G') result += 7;
        return result;
	}
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################



import java.util.Map;
import java.util.HashMap;

public class Challenge {
  public static boolean instrumentRange(String instr, String note) {

    Map<String, String> instruments_range = new HashMap<String, String>();
    instruments_range.put("piccolo", "D4-C7");
    instruments_range.put("tuba", "D1-F4");
    instruments_range.put("guitar", "E3-E6");
    instruments_range.put("piano", "A0-C8");
    instruments_range.put("violin", "G3-A7");

    String start = instruments_range.get(instr.toLowerCase()).substring(0, 2);
    String end = instruments_range.get(instr.toLowerCase()).substring(3);

    boolean caseOne = 
            note.charAt(1) > start.charAt(1) 
            && note.charAt(1) < end.charAt(1);

    boolean caseTwo =
            note.charAt(1) == start.charAt(1)
            && note.charAt(1) < end.charAt(1)
            && note.charAt(0) >= start.charAt(0);

    boolean caseThree =
            note.charAt(1) > start.charAt(1)
            && note.charAt(1) == end.charAt(1)
            && note.charAt(0) <= end.charAt(0);

    boolean caseFour =
            note.charAt(1) == start.charAt(1)
            && note.charAt(1) == end.charAt(1)
            && note.charAt(0) >= start.charAt(0)
            && note.charAt(0) <= end.charAt(0);

    return caseOne || caseTwo || caseThree || caseFour;
  }
}