/*********************************************************************************************************************
 Shiritori Game

This challenge is an English twist on the Japanese word game Shiritori. The basic premise is to follow two rules:

First character of next word must match last character of previous word.
The word must not have already been said.
Below is an example of a Shiritori game:

["word", "dowry", "yodel", "leader", "righteous", "serpent"]  // valid!

["motive", "beach"]  // invalid! - beach should start with "e"

["hive", "eh", "hive"]  // invalid! - "hive" has already been said
Write a Shiritori class that has two instance properties:

words: an array of words already said.
game_over: a boolean that is true if the game is over.
and three instance methods:

play: a method that takes in a word as an argument and checks if it is valid (the word should follow rules #1 and #2 above).

If it is valid, it adds the word to the words array, and returns the words array.
If it is invalid (either rule is broken), it returns "game over" and sets the game_over boolean to true.
restart: a method that sets the words array to an empty one [] and sets the game_over boolean to false. It should return "game restarted".

getWords: a method that returns the words array.

Examples
my_shiritori = Shiritori.new()

my_shiritori.play("apple") ➞ ["apple"]
my_shiritori.play("ear") ➞ ["apple", "ear"]
my_shiritori.play("rhino") ➞ ["apple", "ear", "rhino"]
my_shiritori.play("corn") ➞ "game over"

// Corn does not start with an "o".

my_shiritori.getWords ➞  ["apple", "ear", "rhino"]

// Words should be accessible.

my_shiritori.restart() ➞ "game restarted"
my_shiritori.getWords ➞ []

// Words array should be set back to empty.

my_shiritori.play("hostess") ➞ ["hostess"]
my_shiritori.play("stash") ➞ ["hostess", "stash"]
my_shiritori.play("hostess") ➞ "game over"

// Words cannot have already been said.


Notes
The play method should not add an invalid word to the words array.
You don't need to worry about capitalization or white spaces for the inputs for the play method.
There will only be single inputs for the play method.
Read more about Shiritori in the Resources tab.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



import java.util.ArrayList;

class Shiritori {
	
	ArrayList<String> said;
	
	public boolean game_over;
	
	public Shiritori(){
		said = new ArrayList<>();
	}
	
	public Object play(String word){
		if(!said.isEmpty()){
			if(said.contains(word) || !said.get(said.size()-1).endsWith(word.substring(0,1))){
				game_over = true;
				return "game over";
			}
		}
		if(!game_over)
			said.add(word);
		return getWords();
	}
	
	public String restart(){
		said.clear();
		game_over = false;
		return "game restarted";
	}
	
	public String[] getWords(){
		return said.toArray(new String[]{});
	}
	
}




//#############################################################
//#                        MY SOLUTION 2   



import java.util.ArrayList;

public class Shiritori {

    ArrayList<String> words = new ArrayList<String>();
    boolean game_over = false;

    public Object play(String word) {
        if (words.isEmpty() || (!words.contains(word) && word.charAt(0) == words.get(words.size() - 1).charAt(words.get(words.size() - 1).length() - 1))) {
					words.add(word);
					System.out.println(words);
					String str[] = new String[words.size()];  
					for (int j = 0; j < words.size(); j++) { 
							str[j] = words.get(j); 
					} 
					return str;
        } else {
					game_over = true;
					System.out.println("game over");
					return "game over";
        }
    }

    public String restart() {
			words.clear();
			game_over = false;
			System.out.println("game restarted");
			return "game restarted";
    }

    public String[] getWords() {
			System.out.println(words);
			String str[] = new String[words.size()];  
			for (int j = 0; j < words.size(); j++) { 
					str[j] = words.get(j); 
			} 
			return str;
    }

}




//#############################################################
//#                        MY SOLUTION 3   



import java.util.*; import java.util.stream.*;
class Shiritori {
	public boolean game_over;
	private String[] shiritori = new String[0];
	
	public Shiritori() {
		this.game_over = false;
	}
	
	public Object play(String word) {
		if(game_over) return "game over";
		if(this.shiritori.length == 0) { 
			this.shiritori = new String[1];
			this.shiritori[0] = word;
			return this.shiritori;
		}
		if(isIllegal(word)) {
			game_over = true;
			return "game over";
		} else {
			shiritori = Stream.concat(Stream.of(shiritori),Stream.of(word)).toArray(size -> new String[size]);
		}
		return this.shiritori;
		
	}
	
	private boolean isIllegal(String word) {
		return shiritori[shiritori.length-1]
						.charAt(shiritori[shiritori.length-1].length()-1) != word.charAt(0) 
							|| Arrays.asList(shiritori).contains(word);
	}
	
	public String[] getWords() {
		return this.shiritori;
	}
	
	public String restart() {
		this.shiritori = new String[0];
		this.game_over = false;
		return "game restarted";
	}
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.ArrayList;

class Shiritori {
	
		public String[] words = new String[0];
		
		public boolean game_over = false;
		
		public Object play(String word) {
			if(word == null || word.length() == 0 || game_over){
				game_over = true;
				return "game over";
			} 
			if(words.length == 0) {
				addWord(word);
				return words;
			}
			if(!duplicateWord(word) && checkLastCharacter(word)) {
				addWord(word);
				return words;
			} else {
				game_over = true;
				return "game over";
			}		
		}
		
		public String restart() {
			game_over = false;
			words = new String[0];
			return "game restarted";
		}
		
		public String[] getWords() {
			return words;
		}
		
		private boolean duplicateWord(String word) {
			for(String s : words) 
				if(s.equalsIgnoreCase(word)) return true;
			return false;
		}
		
		private boolean checkLastCharacter(String word) {
			String lastWord = words[words.length - 1];
			return Character.toLowerCase(lastWord.charAt(lastWord.length() - 1)) == Character.toLowerCase(word.charAt(0));
		}
		
		private void addWord(String word) {
			String[] newWords = new String[words.length + 1];
			System.arraycopy(words, 0, newWords, 0, words.length);
			newWords[newWords.length - 1] = word;
			words = newWords;
		}
	
}