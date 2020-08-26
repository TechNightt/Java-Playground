package com.code_wars.kyu8.fake_binary.solution1;

/**
 * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
**/

import java.util.stream.Collectors;


public class FakeBinary {
	
	// **********************************************************************************************************
	// * This method is used to convert a String of digits below 5 with '0' and any digit 5 and above with '1'. *
	// **********************************************************************************************************	
    public static String fakeBin(String numberString) {
        return String.valueOf(numberString.chars().map(c -> c < '5' ? '0' : '1')
                .mapToObj(Character::toString)
                .collect(Collectors.joining())
                .toCharArray());
    }

}