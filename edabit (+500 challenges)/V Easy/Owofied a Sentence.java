
/*********************************************************************************************************************
 Owofied a Sentence
Create a function that takes a sentence and turns every "i" into "wi" and "e" into "we", and add "owo" at the end.

Examples
owofied("I'm gonna ride 'til I can't no more")
➞ "I'm gonna rwidwe 'twil I can't no morwe owo"

owofied("Do you ever feel like a plastic bag")
➞ "Do you wevwer fwewel lwikwe a plastwic bag owo"

owofied("Cause baby you're a firework")
➞ "Causwe baby you'rwe a fwirwework owo"

Notes
Don't forget to return the value!
There's a space in front of owo!

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static String owofied(String s) {
		return s.replace("i", "wi").replace("e", "we") + " owo";
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String owofied(String sentence) {
		sentence = sentence.replaceAll("i", "wi");
		sentence = sentence.replaceAll("e", "we");
		return sentence + " "+ "owo";
	}
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String owofied(String sentence) {
		if(sentence.contains("i")){
			sentence = sentence.replaceAll("i", "wi");
		}
		if(sentence.contains("e")){
			sentence = sentence.replaceAll("e", "we");
		}
		sentence = sentence + " owo";
		return sentence;
	}
}


