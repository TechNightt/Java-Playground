/*********************************************************************************************************************
 Growing and Shrinking Potions

There are two types of potions:

Growing potion: "A"
Shrinking potion: "B"
If "A" immediately follows a digit, add 1 to the digit.
If "B" immediately follows a digit, subtract 1 from the digit.
Create a function that returns a string according to these rules, removing the potions once they've been consumed.

Examples
afterPotion("3A78B51") ➞ "47751"
// 3 grows to 4, 8 shrinks to 7

afterPotion("9999B") ➞ "9998"

afterPotion("9A123") ➞ "10123"

afterPotion("567") ➞ "567"


Notes
Digits that do not have a potion on their immediate right should be left alone.
A digit will always either be followed by zero or exactly 1 potion.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String afterPotion(String str) {
        String result ="";
        String[] wordList = str.split("");
        for(int i =0;i<wordList.length;i++)
        {
            if(wordList[i].equals("A"))
                wordList[i-1] = String.valueOf(Integer.parseInt(wordList[i-1])+1);
            else if (wordList[i].equals("B"))
                wordList[i-1] = String.valueOf(Integer.parseInt(wordList[i-1])-1);
        }
        for(String s:wordList)
            if (!(s.equals("A")||s.equals("B")))
            result +=s;
        return result;
    }
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String afterPotion(String str) {
		while (str.contains("A")) str = str.replaceFirst("\\dA", String.valueOf(Character.getNumericValue(str.charAt(str.indexOf("A") - 1)) + 1));
    while (str.contains("B")) str = str.replaceFirst("\\dB", String.valueOf(Character.getNumericValue(str.charAt(str.indexOf("B") - 1)) - 1));
		return str;
	}
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static String afterPotion(String str) {
        
       String ans = "";
       
       for(int i = 0; i < str.length(); i++){
           if(i == str.length() - 1 && (str.charAt(i) != 'A' && str.charAt(i) != 'B')){
               ans += str.charAt(i);
               break;
               }
           else if(i == str.length() - 1 && (str.charAt(i) == 'A' || str.charAt(i) == 'B')){
               ans += "";
               break;
           }
           if(str.charAt(i + 1) == 'A'){
               int temp = Character.getNumericValue(str.charAt(i));
               ans += Integer.toString(temp + 1);
           }
           else if(str.charAt(i + 1) == 'B'){
               int temp = Character.getNumericValue(str.charAt(i));
               ans += Integer.toString(temp - 1);
           }
           else if(str.charAt(i) == 'A' || str.charAt(i) == 'B'){
               ans += "";
           }
           else
               ans += str.charAt(i);
       }
       return ans;
   }
   }



//#############################################################
//#                        MY SOLUTION 4



import java.util.LinkedList;

public class Challenge {
    public static String afterPotion(String str) {
        LinkedList<Integer> b = new LinkedList<>();
        for (char c : str.toCharArray()) {
            if (Character.toLowerCase(c) == 'a') b.addLast(b.removeLast() + 1);
            else if (Character.toLowerCase(c) == 'b') b.addLast(b.removeLast() - 1);
            else b.addLast(Integer.parseInt(String.valueOf(c)));
        }
        StringBuilder builder = new StringBuilder();
        for (Integer d : b) builder.append(d);
        return builder.toString();
    }
}