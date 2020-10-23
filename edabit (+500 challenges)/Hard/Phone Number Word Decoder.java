/*********************************************************************************************************************
 
Phone Number Word Decoder
Create a program that converts a phone number with letters to one with only numbers.

Number	Letter
0	none
1	none
2	ABC
3	DEF
4	GHI
5	JKL
6	MNO
7	PQRS
8	TUV
9	WXYZ
Examples
textToNum("123-647-EYES") ➞ "123-647-3937"

textToNum("(325)444-TEST") ➞ "(325)444-8378"

textToNum("653-TRY-THIS") ➞ "653-879-8447"

textToNum("435-224-7613") ➞ "435-224-7613"

Notes
All inputs will be formatted as a string representing a proper phone number in the format XXX-XXX-XXXX or (XXX)XXX-XXXX, using numbers and capital letters.
Check the Resources tab for more info on telephone keypads.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String textToNum(String phone) {
		phone=phone.replaceAll("[ABC]", "2")
							 .replaceAll("[DEF]", "3")
							 .replaceAll("[GHI]", "4")
							 .replaceAll("[JKL]", "5")
							 .replaceAll("[MNO]", "6")
							 .replaceAll("[PQRS]","7")
							 .replaceAll("[TUV]","8")
							 .replaceAll("[WXYZ]","9");
		return phone;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static String textToNum(String phone) {
        String[] keys = new String[]{"none", "none", "ABC", "DEF", 
            "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        
        for (int i = 2; i < keys.length; i++) {
            phone = phone.replaceAll("[" + keys[i] + "]", "" + i);
        }
        return phone;
      }
  }


//#############################################################
//#                        MY SOLUTION 3   


import java.util.HashMap;
public class Challenge {
	public static String textToNum(String phone) {
		HashMap map = new HashMap();
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<alpha.length();i++) {
				char c = alpha.charAt(i);
				switch (c) {
					case 'A':
					case 'B':
					case 'C':
							map.put(c,2);
							break;
					case 'D':
					case 'E':
					case 'F':
							map.put(c,3);
							break;
					case 'G':
					case 'H':
					case 'I':
							map.put(c,4);
							break; 
					case 'J':
					case 'K':
					case 'L':
							map.put(c,5);
							break;
					case 'M':
					case 'N':
					case 'O':
							map.put(c,6);
							break;
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
							map.put(c,7);
							break;
					case 'T':
					case 'U':
					case 'V':
							map.put(c,8);
							break;
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
							map.put(c,9);
							break;
					default:
							break;
			}
		}

		for (char c : phone.toCharArray()) {
				if (Character.isLetter(c))
						sb.append(map.get(c));
				else
						sb.append(c);
		}
		return sb.toString();		
	}
}


//#############################################################
//#                        MY SOLUTION 4






public class Challenge {
	public static String textToNum(String phone) {
		char[] chars = phone.toCharArray();
		String result = "";
		for(int i=0; i<chars.length; i++){
			if(!isNumber(chars[i]) &&
				 			 chars[i]!='(' &&
				 			 chars[i]!=')' &&
							 chars[i]!='-'){
				result += convertToNumber(chars[i]);
			}else{
				result += chars[i];
			}
		}
		return result;
	}
	
	public static boolean isNumber(char c){
		try{
			Integer.parseInt(c+"");
		}catch (Exception e){
			return false;
		}
		return true;
	}
	
	public static String convertToNumber(char c){
		if(c=='A'||c=='B'||c=='C'){
			return "2";
		}else if(c=='D'||c=='E'||c=='F'){
			return "3";
		}else if(c=='G'||c=='H'||c=='I'){
			return "4";
		}else if(c=='J'||c=='K'||c=='L'){
			return "5";
		}else if(c=='M'||c=='N'||c=='O'){
			return "6";
		}else if(c=='P'||c=='Q'||c=='R'||c=='S'){
			return "7";
		}else if(c=='T'||c=='U'||c=='V'){
			return "8";
		}else if(c=='W'||c=='X'||c=='Y'||c=='Z'){
			return "9";
		}
		return "ERROR";
	}
}







//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static String textToNum(String phone) {
		String result = "";
		String tmp = "";
		
		for(int i = 0; i < phone.length() ; i++)
		{
			tmp = phone.substring(i, i + 1).toLowerCase();
			
			if(isBetween(tmp, "a", "c")) result = result + "2";
			else if(isBetween(tmp, "d", "f")) result = result + "3";
			else if(isBetween(tmp, "g", "i")) result = result + "4";
			else if(isBetween(tmp, "j", "l")) result = result + "5";
			else if(isBetween(tmp, "m", "o")) result = result + "6";
			else if(isBetween(tmp, "p", "s")) result = result + "7";
			else if(isBetween(tmp, "t", "v")) result = result + "8";
			else if(isBetween(tmp, "w", "z")) result = result + "9";
			else result = result + tmp;
			
			tmp = "";
		}
		return result;
	}
	
	private static boolean isBetween(String in, String low, String high)
	{
		int lowResult = in.compareTo(low);
		if(lowResult < 0) return false;
		int highResult = in.compareTo(high);
		if(highResult > 0) return false;
		return true;
	}
}










//#############################################################
//#                        MY SOLUTION 6




public class Challenge {
	public static String textToNum(String phone) {
		String res="";
		char ch;
		for(int i=0;i<phone.length();i++) {
			ch = phone.charAt(i);
			if(ch >= 'A' && ch <= 'Z') {
			  if(ch=='A' || ch=='B' || ch=='C') {
				  res = res + "2";
			  }
			  else if(ch=='D' || ch=='E' || ch=='F') {
				  res = res + "3";
			  }
			  else if(ch=='G' || ch=='H' || ch=='I') {
				  res = res + "4";
			  }
			  else if(ch=='J' || ch=='K' || ch=='L') {
				  res = res + "5";
			  }
			  else if(ch=='M' || ch=='N' || ch=='O') {
				  res = res + "6";
			  }
			  else if(ch=='P' || ch=='Q' || ch=='R' || ch == 'S') {
				  res = res + "7";
			  }
			  else if(ch=='T' || ch=='U' || ch=='V') {
				  res = res + "8";
			  }
			  else {
				  res = res + "9";
			  }
			}
			else {
				res = res + ch;
			}
		}
		return res;
	}
}








//#############################################################
//#                        MY SOLUTION 7



public class Challenge {
	public static String textToNum(String phone) {
        String result = "";
        for (int i = 0; i < phone.length(); i++){
            char p = phone.charAt(i);
            if (p == '(' || p == ')') result += p;
            if (!Character.isDigit(p) && p != '-'){

                if (p == 'A' || p == 'B'|| p == 'C') result += "2";
                if (p == 'D' || p == 'E'|| p == 'F') result += "3";
                if (p == 'G' || p == 'H'|| p == 'I') result += "4";
                if (p == 'J' || p == 'K'|| p == 'L') result += "5";;
                if (p == 'M' || p == 'N'|| p == 'O') result += "6";
                if (p == 'P' || p == 'Q'|| p == 'R' || p == 'S') result += "7";
                if (p == 'T' || p == 'U'|| p == 'V') result += "8";
                if (p == 'W' || p == 'X'|| p == 'Y' || p == 'Z') result += "9";

            }else {
                result += phone.charAt(i);
            }
        }
        return result ;
    }
}








//#############################################################
//#                        MY SOLUTION 8


public class Challenge {
	
	public static String textToNum(String phone) {
		String newphone = "";
		boolean flag=true;
		for (int i = 0; i < phone.length(); i++) {
			char c = phone.charAt(i);
			//int c1=Character.getNumericValue(c);
			//int c1=Integer.parseInt(String.valueOf(c));
			if((c>='a'&& c<='z') || (c>='A' && c<='Z'))
				flag=true;
			else
				flag=false;
			//if(c1>=0 && c1<=9)
				if(flag==false)
			newphone += c;
			String a = "ABC";
			if (a.indexOf(c) >= 0) {
				c = '2';
				newphone += c;
			} else if ("DEF".indexOf(c) >= 0) {
				c = '3';
				newphone += c;
			} else if ("GHI".indexOf(c) >= 0) {
				c = '4';
				newphone += c;
			} else if ("JKL".indexOf(c) >= 0) {
				c = '5';
				newphone += c;
			} else if ("MNO".indexOf(c) >= 0) {
				c = '6';
				newphone += c;
			} else if ("PQRS".indexOf(c) >= 0) {
				c = '7';
				newphone += c;
			} else if ("TUV".indexOf(c) >= 0) {
				c = '8';
				newphone += c;
			} else if ("WXYZ".indexOf(c) >= 0) {
				c = '9';
				newphone += c;
			}
		}
		return newphone;
	}
}







//#############################################################
//#                        MY SOLUTION 9




public class Challenge {
	public static String textToNum(String phone) {
		    //declare two dimensional char array with Letters
    char[][] letters = {{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'}, {'M', 'N', 'O'}, {'P', 'Q', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'X', 'Y', 'Z'}};

    //Convert the passed string to a char array
    char[] numbers = phone.toCharArray();
    
    //declare the String which will be returned
    String stringToReturn = "";

    //Keep track whether the most inner loop has had a letter match, reset when value of i changes.
    int transformed = 0;

    //We use a StringBuilder to append either the current unchanged mark, or the index+2 of the matching letter
    StringBuilder sb = new StringBuilder();

    //How many loops does the upmost for loop have
    int rows = numbers.length;

    //Go through the values of char array indexes
    for(int i=0; i<rows; i++){
      transformed = 0;
      //Go through the two dimensional char array letters
      for(int j=0; j<letters.length; j++){
        //Go through each dimension of the char array, break if a match was found already
        for(int k=0; k<letters[j].length; k++){
          if(transformed > 0){
            break;
          }
          //Compare the letter in question with the current character in numbers array
          if(numbers[i] == letters[j][k]){
            sb.append(j+2);
            transformed++;
          }
        }
        }
        //If nothing was transferred, ie T to 8, or E to 3, append the StringBuilder with the current character which was being followed
        if(transformed == 0){
          sb.append(numbers[i]);
        }
    }
    //Convert the StringBuilder to String
    stringToReturn = sb.toString();
    System.out.println(stringToReturn);
    return stringToReturn;
	}
}