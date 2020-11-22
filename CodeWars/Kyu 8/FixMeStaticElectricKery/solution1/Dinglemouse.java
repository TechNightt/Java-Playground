package com.code_wars.kyu8.fixme_static_electrickery.solution1;

/**
 * 
 * 
 * FIXME: Static electrickery
 * = Description 
 * The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.<br><br>
 * But it's not working properly.<br><br>
 * Task<br><br>
 * Fix the code so we can all go home early.<br><br>
 * Restrictions<br>
 * Do not modify the constructor<br>
 * Do not modify the plus100 method<br>
 * Do not modify the ONE_HUNDRED declaration
 * 
**/


public class Dinglemouse {


  public static final Dinglemouse INST = new Dinglemouse();
      
  private static int ONE_HUNDRED = 100;
  public static int value = ONE_HUNDRED;
  
  private Dinglemouse() {
    value = ONE_HUNDRED;
  }
  
  public int plus100(int n) {
    return value + n;
  }
  
}