package com.code_wars.kyu7.moves_in_square_strings_I.solution1;
/**
 * 
 * 
 * Moves in squared strings (I)
 * = Description 
 * This kata is the first of a sequence of four about "Squared Strings".<br><br>
 * You are given a string of n lines, each substring being n characters long: For example:<br><br>
 * s = "abcd\nefgh\nijkl\nmnop"<br><br>
 * We will study some transformations of this square of strings.<br><br>
 * Vertical mirror: vert_mirror (or vertMirror or vert-mirror)<br>
 * vert_mirror(s) => "dcba\nhgfe\nlkji\nponm"<br>
 * Horizontal mirror: hor_mirror (or horMirror or hor-mirror)<br>
 * hor_mirror(s) => "mnop\nijkl\nefgh\nabcd"<br>
 * or printed:<br><br>
 * vertical mirror   |horizontal mirror<br>
 * abcd --> dcba     |abcd --> mnop<br>
 * efgh     hgfe     |efgh     ijkl<br>
 * ijkl     lkji     |ijkl     efgh<br>
 * mnop     ponm     |mnop     abcd<br> 
 * #Task:<br><br>
 * Write these two functions<br>
 * and<br>
 * high-order function oper(fct, s) where<br>
 * fct is the function of one variable f to apply to the string s (fct will be one of vertMirror, horMirror)<br>
 * #Examples:<br><br>
 * s = "abcd\nefgh\nijkl\nmnop"<br>
 * oper(vert_mirror, s) => "dcba\nhgfe\nlkji\nponm"<br>
 * oper(hor_mirror, s) => "mnop\nijkl\nefgh\nabcd"<br>
 * Note:<br>
 * The form of the parameter fct in oper changes according to the language. You can see each form according to the language in "Sample Tests".<br><br>
 * Bash Note:<br>
 * The input strings are separated by , instead of \n. The ouput strings should be separated by \r instead of \n. See "Sample Tests".<br><br>
 * Forthcoming katas will study other tranformations.<br>
 *
 */

public class Opstrings {

	// ***********************************************************************************
	// * This is the implementation of the FunctionalInterface that is used by the class *
	// * to choose the right method when needed.                                         *
	// ***********************************************************************************
    @FunctionalInterface
    interface OpstringsFunctionalInterface {
      String task(String strng);
    }
    
    // ****************************************************************
    // * This function is used to create vertical mirror of a string. *
    // ****************************************************************
    public static String vertMirror (String strng) {
      String[] stringArr = strng.split("\n");
      strng = "";
      for (String w : stringArr) {
        char[] chars = w.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) 
          strng += chars[i];
        strng += "\n";
      }
      return strng.substring(0, strng.length() - 1);
    }
    
    // ******************************************************************
    // * This function is used to create horizontal mirror of a string. *
    // ******************************************************************
    public static String horMirror (String strng) {
      String[] stringArr = strng.split("\n");
      strng = "";
      for (int i = stringArr.length - 1; i >= 0; i--) 
        strng += stringArr[i] + "\n"; 
      return strng.substring(0, strng.length() - 1);
    }
    
    // *****************************************************************************************************************************
    // * This function is used to choose the specific function based on FunctionalInterface that has been received as a parameter. *
    // *****************************************************************************************************************************    
    public static String oper(OpstringsFunctionalInterface method, String strng) {
        String r = method.task(strng);
        System.out.println(r);
        return r;
    }
    
}
