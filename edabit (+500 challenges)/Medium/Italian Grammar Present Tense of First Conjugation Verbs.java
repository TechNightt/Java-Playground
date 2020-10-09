/*********************************************************************************************************************
 Italian Grammar: Present Tense of First Conjugation Verbs
In this challenge, you must build a function that inflects an infinitive regular Italian verb of the first conjugation form to the present tense, including the personal subjective pronoun.

All first conjugation Italian verbs share the same suffix: ARE. The first thing to do is separate the verb root from the suffix.

Root of "programmare" (to code) = "programm".
Root of "giocare" (to play) = "gioc".
For each subjective pronoun the root is combined with a new suffix: see table below (pronouns are numbered for coding ease, in real grammar they are grouped in singular and plural, both from first to third):

#	Pronoun	Suffix
1	Io (I)	o
2	Tu (You)	i
3	Egli (He)	a
4	Noi (We)	iamo
5	Voi (You)	ate
6	Essi (They)	ano
Present tense of verb "parlare" (to speak) for third pronoun:
Pronoun ("Egli") + Root ("parl") + Suffix ("a") = "Egli parla".
Present tense of verb "lavorare" (to work) for fourth pronoun:
Pronoun ("Noi") + Root ("lavor") + Suffix ("iamo") = "Noi lavoriamo".
There are two exceptions for present tense inflection:

If root ends with "c" or "g" the second and fourth pronoun suffixes add a "h" at the start:
"Attaccare" (to attack) = "Tu attacchi" (instead of "Tu attacci")
"Legare" (to tie) = "Noi leghiamo" (instead of "Noi legiamo")
If root ends with "i" the second and fourth pronoun suffixes lose the starting "i" (so that second pronoun suffix disappears):
"Inviare" (to send) = "Noi inviamo" (instead of "Noi inviiamo")
"Tagliare" (to cut) = "Tu tagli" (instead of "Tu taglii")
"Mangiare" (to eat) = "Noi mangiamo" (instead of "Noi mangiiamo")
"Cacciare" (to hunt) = "Tu cacci" (instead of "Tu caccii")
Given a string verb being the infinitive form of the first conjugation Italian regular verb, and an integer pronoun being the subjective personal pronoun, implement a function that returns the inflected form as a string.

Examples
conjugate("programmare", 5) ➞ "Voi programmate"

conjugate("iniziare", 2) ➞ "Tu inizi"

conjugate("mancare", 4) ➞ "Noi manchiamo"

Notes
In the returned string, pronouns must be capitalized and verbs must be in lowercase, separated by a space between them.
Curious fact: first conjugation (verbs ending in "are") is also called "the living conjugation", because every new verb that enters the Italian dictionary is assigned to this category as a new regular verb; it often happens for verbs "borrowed" from English and for informatical neologisms: chattare, twittare, postare, spammare... will edabittare be the next?
**********************************************************************************************************************/







//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String conjugate(String verb, int pronoun) {
		String root = verb.replaceAll("(?<=\\w+)are", "");
		String[] pronouns = new String[]{"Io", "Tu", "Egli", "Noi", "Voi", "Essi"};
		String[] suffixes = new String[]{"o", "i", "a", "iamo", "ate", "ano"};		
		if (pronoun == 2 || pronoun == 4) {
			root += (root.endsWith("c") || root.endsWith("g")) ? "h" : "";
			root = root.endsWith("i") ? root.substring(0, root.length()-1) : root;
		}
		return String.format("%s %s%s", pronouns[pronoun-1], root, suffixes[pronoun-1]);
	}
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String conjugate(String verb, int pronoun) {
		verb = verb.substring(0, verb.length()-3);
		int len = verb.length();
		String result = "";
		
		switch(pronoun) {
				case 1:result = "Io "+verb+"o";
				       break;

		   case 2: if(verb.charAt(len-1) == 'c' || verb.charAt(len-1) == 'g' ) {
		           verb = verb+"h";
		           result = "Tu "+verb+"i";
		           break;
		           }
				       else if(verb.charAt(len-1) == 'i') {
					     result = "Tu "+verb;
					     break;
				       }
							 else{
								 result = "Tu "+verb+"i";
								 break;
							 }
		    case 3: result = "Egli "+verb+"a";
				        break;

		     case 4: if(verb.charAt(len-1) == 'c' || verb.charAt(len-1) == 'g' ) {
			           verb = verb+"h";
			           result = "Noi "+verb+"iamo";
			           break;
		             }
		             else if(verb.charAt(len-1) == 'i') {
			           result = "Noi "+verb+"amo";
			           break;
		             }
								 else{
									 result = "Noi "+verb+"iamo";
									 break;
								 }
		      case 5:result = "Voi "+verb+"ate";
				         break;
		      case 6:result = "Essi "+verb+"ano";
				         break;
		}
		return result;
	}
}








//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String conjugate(String verb, int pronoun) {
		String [][]suffix = {
			{"Io", "o"}, {"Tu", "i"}, {"Egli", "a"}, {"Noi", "iamo"}, {"Voi", "ate"}, {"Essi", "ano"}
		};
		verb = verb.substring(0, verb.length()-3);
		
		if((pronoun == 2 || pronoun == 4) && (verb.endsWith("c") || verb.endsWith("g")))
			verb += "h";
		if((pronoun == 2 || pronoun == 4) && (verb.endsWith("i")))
			 verb = verb.substring(0, verb.length()-1);
		pronoun--;
		
		return suffix[pronoun][0] + " " + verb + suffix[pronoun][1];
	}
}












//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.*;

public class Challenge {
	public static String conjugate(String verb, int pronoun) {
		String root = verb.substring(0, verb.length() - 3);
		
		HashMap<Integer, String[]> hm = new HashMap<Integer, String[]>();
		hm.put(1, new String[] {"Io", "o"});
		hm.put(2, new String[] {"Tu", "i"});
		hm.put(3, new String[] {"Egli", "a"});
		hm.put(4, new String[] {"Noi", "iamo"});
		hm.put(5, new String[] {"Voi", "ate"});
		hm.put(6, new String[] {"Essi", "ano"});
		
		String[] choice = hm.get(pronoun);
		
		if ((root.endsWith("c") || root.endsWith("g")) && (pronoun == 2 || pronoun == 4))
			return choice[0] + " " + root + "h" + choice[1];
		else if (root.endsWith("i") && (pronoun == 2 || pronoun == 4))
			return choice[0] + " " + root.substring(0, root.length() - 1) + choice[1];
		else
			return choice[0] + " " + root + choice[1];
	}
}





//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
    public static String conjugate(String verb, int pronoun) {
        String verbRoot = verb.substring(0, verb.length() - 3);

        char finalLetter = verbRoot.charAt(verbRoot.length() - 1);

        if((finalLetter == 'c' || finalLetter == 'g') && (pronoun == 2 || pronoun == 4)){
            verbRoot += "h";
        }

        if (finalLetter == 'i' && (pronoun == 2 || pronoun == 4)) {
            verbRoot = verbRoot.substring(0, verbRoot.length() - 1);
        }

        String output = "";

        switch (pronoun) {
            case 1:
                output = "Io " + verbRoot + "o";
                break;
            case 2:
                output = "Tu " + verbRoot + "i";
                break;
            case 3:
                output = "Egli " + verbRoot + "a";
                break;
            case 4:
                output = "Noi " + verbRoot + "iamo";
                break;
            case 5:
                output = "Voi " + verbRoot + "ate";
                break;
            case 6:
                output = "Essi " + verbRoot + "ano";
                break;
            default:
                output = "Pronoun Integer Not Valid";
                break;
        }

        return output;
    }
}






//#############################################################
//#                        MY SOLUTION 6
//#############################################################



public class Challenge {
	public static String conjugate(String verb, int pronoun) {
		verb = verb.substring(0,verb.length()-3);
		if (verb.endsWith("c") || verb.endsWith("g"))
			verb+="h";
		if (pronoun == 1)
			return "Io " + verb + "o";
		else if (pronoun == 2)
			return verb.endsWith("i") ? "Tu " + verb : "Tu " + verb + "i";
		else if (pronoun == 3)
			return "Egli " + verb + "a";
		else if (pronoun == 4)
			return verb.endsWith("i") ? "Noi " + verb + "amo": "Noi " + verb + "iamo";
		else if (pronoun == 5)
			return "Voi " + verb + "ate";
		else
			return "Essi " + verb + "ano";
	}
}






//#############################################################
//#                        MY SOLUTION 7
//#############################################################


public class Challenge {
	public static String conjugate(String verb, int pronoun) {
		String root = verb.substring(0,verb.length()-3);
        String front = "";
        String suffix = "";
        
        if (root.charAt(root.length()-1) == 'c' || 
        root.charAt(root.length()-1) == 'g' && (pronoun == 2 || pronoun ==4)) {
            root = verb.substring(0,verb.length()-3) + "h";
        }
        
        if (root.charAt(root.length()-1) == 'i' && (pronoun == 2 || pronoun == 4)) {
            root = verb.substring(0,verb.length()-4);
        }
        
        switch(pronoun) {
            case 1: front = "Io"; suffix = "o"; break;
            case 2: front = "Tu"; suffix = "i"; break;
            case 3: front = "Egli"; suffix = "a"; break;
            case 4: front = "Noi"; suffix = "iamo"; break;
            case 5: front = "Voi"; suffix = "ate"; break;
            case 6: front = "Essi"; suffix = "ano"; break;
        }     
        
        return front + " " + root + suffix;
	}
}







//#############################################################
//#                        MY SOLUTION 8
//#############################################################


public class Challenge {
	public static String conjugate(String verb, int pronoun) {
		String verbRoot = verb.substring(0, verb.length()-3);
		StringBuilder bVerbRoot =  new StringBuilder(verbRoot);
		StringBuilder end = new StringBuilder();
		if (verbRoot.endsWith("c") | verbRoot.endsWith("g")) {
			bVerbRoot.append("h");
		} else if (verbRoot.endsWith("i") & (pronoun == 2 | pronoun == 4)){
			bVerbRoot.deleteCharAt(bVerbRoot.length()-1);
		}
		switch (pronoun){
			case 1:
				end.append("Io ");
				bVerbRoot.append("o");
				end.append(bVerbRoot);
				break;
			case 2:
				end.append("Tu ");
				bVerbRoot.append("i");
				end.append(bVerbRoot);
				break;
			case 3:
				end.append("Egli ");
				bVerbRoot.append("a");
				end.append(bVerbRoot);
				break;
			case 4:
				end.append("Noi ");
				bVerbRoot.append("iamo");
				end.append(bVerbRoot);
				break;
			case 5:
				end.append("Voi ");
				bVerbRoot.append("ate");
				end.append(bVerbRoot);
				break;
			case 6:
				end.append("Essi ");
				bVerbRoot.append("ano");
				end.append(bVerbRoot);
				break;
		}
		return end.toString();
	}
}









//#############################################################
//#                        MY SOLUTION 9
//#############################################################


public class Challenge {
	public static String conjugate(String verb, int pronoun) {
		String[] pronounAndSuffix = getPronounAndSuffix(pronoun);
		String ultimi = pronounAndSuffix[1];
		int strLength = verb.length();
		String newString = "";
		for(int i = 0; i<strLength; i++){
			newString += verb.charAt(i);
			if(i==strLength-4){
				if(verb.charAt(i)=='c' || verb.charAt(i)=='g')
					newString+="h";
				if(verb.charAt(i)=='i'){
					if(pronoun==2)
						break;
					else if(pronoun==4)
						return pronounAndSuffix[0]+newString+ultimi.substring(1);
				}
				
				newString+=ultimi;
				break;
			}
		}
		return pronounAndSuffix[0]+newString;
	}

	public static String[] getPronounAndSuffix(int pronoun){
		switch(pronoun){
			case 1:
				return new String[]{"Io ", "o"};
			case 2:
				return new String[]{"Tu ", "i"};
			case 3:
				return new String[]{"Egli ", "a"};
			case 4:
				return new String[]{"Noi ", "iamo"};
			case 5:
				return new String[]{"Voi ", "ate"};
			case 6:
				return new String[]{"Essi ", "ano"};
		}
		return null;
	}
}