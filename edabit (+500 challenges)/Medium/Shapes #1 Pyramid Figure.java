/*********************************************************************************************************************
 Shapes #1: Pyramid Figure

Write a Java program that produces the following outputs.

Examples
pyramid(2) ➞
////\\\\
********
pyramid(3) ➞
////////\\\\\\\\
////********\\\\
****************
pyramid(4) ➞
////////////\\\\\\\\\\\\
////////********\\\\\\\\
////****************\\\\
************************


Notes
Only positive integers >= 2.
Last line ending should contain \n
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
    public static String pyramid(int height) {
          StringBuilder sb = new StringBuilder();
          for (int line = 0; line < height; line++) {
        for (int i = 0; i < 4 * (height - line - 1); i++)
          sb.append("/");
        for (int i = 0; i < 8 * line; i++)
          sb.append("*");
        for (int i = 0; i < 4 * (height - line - 1); i++)
          sb.append("\\");
        sb.append("\n");
      }
          return sb.toString();
    }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static String pyramid(int h) {
          String o="";
          for (int i=0; i<h; i++)
              o += r("/", (h-1-i)*4) + r("*", i*8) + r("\\", (h-1-i)*4) + "\n";
          return o;
    }
      private static String r(String c, int n) {
          String o="";
          while (n-->0) o+=c;
          return o;
      }
  }

