package com.code_wars.kyu6.hex_converting_visualisation.solution1;

/**
 * 
 * 
 * Hex Converting Visualisation<br><br>
 * = Description = <br><br>
 * Your task is to write a method showHexConversion, that takes a decimal number and gives Back the output, how you can calculate the corresponding hexadecimal number as a String.<br><br>
 * Example: showHexConversion(1000)<br>
 * Returnstring:1000/16=62 R 8\n 62/16= 3 R 14\n 3/16= 0 R 3\nResult=3E8<br>
 * Visualized:<br>
 * 1000/16=62 R    8<br>
 *       62/16=   3 R 14<br>
 *          3/16=   0 R    3<br>
 * Result=3E8<br><br>
 * 
Every line but the last ends with "\n"<br>
 * Whitespaces to format it nice (take a look at the example testcase String)<br>
 * The method only needs to be able to convert positiv numbers
 * 
**/


import java.util.ArrayList;

public class Hexadecimal {
  private static final String[] HEX_VALUES = {"0", "1", "2", "3", 
                                              "4", "5", "6", "7", 
                                              "8", "9", "A", "B", 
                                              "C", "D", "E", "F"};
  
  private static final int HEX = 16;
  private static ArrayList<String> numbersArray;
  private static ArrayList<String> remindersArray;
  private static int largestFirstNumberLength;
  private static int largestSecondNumberLength;
  private static int largestReminderLength;

  public static String showHexConversion(int number) {
    if(number == 0)
      return "Result=0";
    numbersArray = new ArrayList<String>();
    remindersArray = new ArrayList<String>();
    largestFirstNumberLength = String.valueOf(number).length();
    largestSecondNumberLength = String.valueOf(number / 16).length();
    largestReminderLength = 0;
    countNumbersAndReminders(number);
    return buildString();
  }
  
  private static void countNumbersAndReminders(int number) {    
    int finalIteration = 0;
    while(number / HEX >= 0 && finalIteration < 2) {
      numbersArray.add(number + "");      
      remindersArray.add((number % 16) + "");
      if(largestReminderLength < String.valueOf(number % 16).length())
        largestReminderLength = String.valueOf(number % 16).length();     
      number /= HEX;
      if(number / HEX == 0)
        ++finalIteration;
    } 
  }
    
  private static String buildString() {
    String res = firstNumber();
    for (int i = 1; i < numbersArray.size(); ++i) { 
      res = addSpaces(res, largestSecondNumberLength - numbersArray.get(i).length());         
      res +=  numbersArray.get(i);  
      res += " R ";
      res = addSpaces(res, largestReminderLength - remindersArray.get(i - 1).length()); 
      res +=  remindersArray.get(i - 1);
      res += "\n";
      res = addSpaces(res, largestFirstNumberLength - numbersArray.get(i).length()); 
      res += numbersArray.get(i) + "/" + HEX + "=";
    }
    res += lastNumber();
    for (int i = remindersArray.size() - 1; i >= 0; --i) 
      res += HEX_VALUES[Integer.valueOf(remindersArray.get(i))];    
    return res;
  }
  
  private static String lastNumber() {
    String res = addSpaces("", largestSecondNumberLength - String.valueOf(0).length()) + 0 + " R ";
    res = addSpaces(res, largestReminderLength - remindersArray.get(numbersArray.size() - 1).length()); 
    res +=  remindersArray.get(numbersArray.size() - 1) + "\nResult=";
    return res;
  }
  
  private static String firstNumber() {
    return addSpaces("", largestFirstNumberLength - numbersArray.get(0).length()) 
               + numbersArray.get(0) + "/" + HEX + "="; 
  }
  
  private static String addSpaces(String text, int length) {
    for (int i = 0; i < length; ++i)
      text += " ";
    return text;
  }
}