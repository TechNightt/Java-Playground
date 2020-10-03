package com.code_wars.kyu8.ghost_code.solution1;

/**
 * <br><br>
 * = Kata's Name =<br>
 * Ghost code?!<br><br>
 * = Description = <br><br>
 * Trollencio changed my code! can you fix it? My name is not "dumb!" o( TT_TT )o<br><br>
 * Instructions: Fix the code<br><br>
 * Input<br>
 * Javatlacati<br>
 * Output<br>
 * Hello my name is Javatlacati<br>
 * Input<br>
 * ""<br>
 * Output<br>
 * Hello world!
 * 
**/
public class GhostCode {
	
	// ****************************************************
	// * This method returns appropriate hello statement. *
    // ****************************************************	
	public static String helloName(final String name){
		return name == null || name.equals("") ? 
			   "Hello world!" : "Hello my name is " + name;
	}
  
}