/*********************************************************************************************************************
 Text Twist!
In Text Twist, players try to score points by forming words using the letters from a 6-letter scrambled word. They win the round if they can successfully unscramble the 6-letter word.

Create a function that takes in an array of already-guessed words, the unscrambled 6-letter word and returns the total number of points the player scored in a particular round using the following rubric:

3-letter words are 1 pt
4-letter words are 2 pts
5-letter words are 3 pts
6-letter words are 4 pts + 50 pt bonus (for unscrambling the word)
Remember that invalid words (words that cannot be formed from the 6-letter unscrambled words) count as 0 pts.

Examples
totalPoints(["cat", "create", "sat"], "caster") ➞ 2
// Since "create" is an invalid word.

totalPoints(["trance", "recant"], "recant") ➞ 108
// Since "trance" and "recant" score 54 pts each.

totalPoints(["dote", "dotes", "toes", "set", "dot", "dots", "sted"], "tossed") ➞ 13
// Since 2 + 3 + 2 + 1 + 1 + 2 + 2 = 13

Notes
If a 6-letter word has multiple anagrams, count each 6-letter unscramble as an additional 54 pts. For example, if the word is arches, and the player guessed arches and chaser, add 108 pts for both words.
You can play Text Twist here: http://text-twist2.com
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


import java.util.ArrayList;

public class Challenge {
	public static int totalPoints(String[] guesses, String word) {
		        ArrayList<String> letters = new ArrayList<>();

        for(int i = 0; i < word.length(); i++) {
            letters.add(String.valueOf(word.charAt(i)));
        }

        int score = 0;
        boolean isCorrect;

        for(int i = 0; i < guesses.length; i++) {

            ArrayList lettersNew = new ArrayList<>(letters);
            isCorrect = true;

            for(int j = 0; j < guesses[i].length(); j++) {
                if(lettersNew.contains(String.valueOf(guesses[i].charAt(j)))) {
                    lettersNew.remove(String.valueOf(guesses[i].charAt(j)));
                } else {
                    isCorrect = false;
                    break;
                }
            }

            if(isCorrect) {
                if(guesses[i].length() == 3) {
                    score += 1;
                } else if(guesses[i].length() == 4) {
                    score += 2;
                } else if(guesses[i].length() == 5) {
                    score += 3;
                } else {
                    score += 54;
                }
            }
        }

        return score;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int totalPoints(String[] guesses, String word) {
		int points = 0;
		
		for (String guess : guesses) {
			if (checkWord(guess, word)) {
				switch (guess.length()) {
					case 3 : points += 1; break;
					case 4 : points += 2; break;
					case 5 : points += 3; break;
					case 6 : points += 54; break;
				}
			}
		}
		
		return points;
	}
	
	public static boolean checkWord(String guess, String word) {		
		for (char letter : guess.toCharArray()) {
			if (word.indexOf(letter) == -1) {
				return false;
			} else {
				word = word.replaceFirst(String.valueOf(letter), "");
			}
		}
		
		return true;
	}
}



//#############################################################
//#                        MY SOLUTION 3   



import java.util.HashMap;
import java.util.Map;

public class Challenge {
	public static int totalPoints(String[] guesses, String word) {
		int points = 0;

		for (String guess : guesses) {
			if (isValidWord(guess, word)) {
				switch (guess.length()) {
					case 3:
						points += 1;
						break;
					case 4:
						points += 2;
						break;
					case 5:
						points += 3;
						break;
					case 6:
						points += 54;
						break;

					default:
						break;
				}
			}

		}
			return points;

	}

	private static boolean isValidWord(String guess, String word) {
		Map<Character, Integer> freqGuess = new HashMap<>(), freqWord = new HashMap<>();

		for (char c : guess.toCharArray())
			freqGuess.put(c, freqGuess.getOrDefault(c, 0) + 1);

		for (char c : word.toCharArray())
			freqWord.put(c, freqWord.getOrDefault(c, 0) + 1);

		for (char c : freqGuess.keySet())
			if (!freqWord.containsKey(c) || freqGuess.get(c) > freqWord.get(c))
				return false;

		return true;
	}
}


