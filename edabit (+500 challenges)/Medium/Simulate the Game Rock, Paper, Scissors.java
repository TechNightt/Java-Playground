/*********************************************************************************************************************
 Simulate the Game "Rock, Paper, Scissors"
Create a function which simulates the game "rock, paper, scissors". The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:

"Player 1 wins"
"Player 2 wins"
"TIE" (if both inputs are the same)
The rules of rock, paper, scissors, if not known:

Both players have to say either "rock", "paper" or "scissors" at the same time.
Rock beats scissors, paper beats rock, scissors beat paper.
Examples
rps("rock", "paper") ➞ "Player 2 wins"

rps("paper", "rock") ➞ "Player 1 wins"

rps("paper", "scissors") ➞ "Player 2 wins"

rps("scissors", "scissors") ➞ "TIE"

rps("scissors", "paper") ➞ "Player 1 wins"

Notes
There are several ways to solve this challenge.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	private enum Rps {PAPER, SCISSORS, ROCK}
	
	public static String rps(String s1, String s2) {
		int p1 = Rps.valueOf(s1.toUpperCase()).ordinal();
		int p2 = Rps.valueOf(s2.toUpperCase()).ordinal();
		return (p1 == p2) ? "TIE" 
			: (p1 - p2 == 1 || p1 - p2 == 1 - Rps.values().length) ? "Player 1 wins"
			: "Player 2 wins";
	}
}





//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String rps(String s1, String s2) {
		if(s1.equals(s2)) {
			return "TIE";
		}
		else if(s1.equals("rock") && s2.equals("paper")) {
			return "Player 2 wins";
		}
		else if(s1.equals("rock") && s2.equals("scissors")) {
			return "Player 1 wins";
		}
		else if(s1.equals("paper") && s2.equals("rock")) {
			return "Player 1 wins";
		}
		else if(s1.equals("paper") && s2.equals("scissors")) {
			return "Player 2 wins";
		}
		else if(s1.equals("scissors") && s2.equals("rock")) {
			return "Player 2 wins";
		}
		else{
			return "Player 1 wins";
		}
	}
}



//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String rps(String s1, String s2) {
		if(s1.equals(s2)){
			return "TIE";
		}else if((s1=="rock" && s2=="scissors")||(s1=="scissors" && s2=="paper")||(s1=="paper" && s2=="rock")){
			return "Player 1 wins";
		}else{
			return "Player 2 wins";
		}
	}
}





//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String rps(String s1, String s2) {
		String r = "rock";
		String p = "paper";
		String s = "scissors";
		String t = "TIE";
		String p1w = "Player 1 wins";
		String p2w = "Player 2 wins";
		
		if("rock".equals(s1)) {
			return r.equals(s2) ? t : p.equals(s2) ? p2w : p1w;
		} else if("paper".equals(s1)) {
			return p.equals(s2) ? t : s.equals(s2) ? p2w : p1w;
		} else {
			return s.equals(s2) ? t : r.equals(s2) ? p2w : p1w;
		}
	}
}




//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
	public static String rps(String s1, String s2) {
		char p1 = s1.charAt(0);
		char p2 = s2.charAt(0);
		if (p1 == 'r' && p2 == 'r' || p1 == 's' && p2 == 's' || 
			  p1 == 'r' & p2 == 'r') {
			return "TIE";
		}
		if (p1 == 'r' && p2 == 's' || p1 == 'p' && p2 == 'r' 
				|| p1 == 's' && p2 == 'p') {
			return "Player 1 wins";
		} 
		return "Player 2 wins";
	}
}