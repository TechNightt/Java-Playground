/*********************************************************************************************************************
 Valid Name
For this exercise, keep in mind the following definitions:

A term is either an initials or word.
initials = 1 character
words = 2+ characters (no dots allowed)
A valid name is a name written in one of the following ways:

H. Wells
H. G. Wells
Herbert G. Wells
Herbert George Wells
The following names are invalid:

Herbert or Wells (single names not allowed)
H Wells or H. G Wells (initials must end with dot)
h. Wells or H. wells or h. g. Wells (incorrect capitalization)
H. George Wells (middle name expanded, while first still left as initial)
H. G. W. (last name is not a word)
Herb. G. Wells (dot only allowed after initial, not word)
Rules
Both initials and words must be capitalized.
Initials must end with a dot.
A name must be either 2 or 3 terms long.
If the name is 3 words long, you can expand the first and middle name or expand the first name only. You cannot keep the first name as an initial and expand the middle name only.
The last name must be a word (not an initial).
Your task is to write a function that determines whether a name is valid or not. Return true if the name is valid, false otherwise.

Examples
ValidName("H. Wells") ➞ true

ValidName("H. G. Wells") ➞ true

ValidName("Herbert G. Wells") ➞ true

ValidName("Herbert") ➞ false
// Must be 2 or 3 words

ValidName("h. Wells") ➞ false
// Incorrect capitalization

ValidName("H Wells") ➞ false
// Missing dot after initial

ValidName("H. George Wells") ➞ false
// Cannot have: initial first name + word middle name

ValidName("H. George W.") ➞ false
// Last name cannot be initial

ValidName("Herb. George Wells") ➞ false
// Words cannot end with a dot (only initials can)

Notes
A term is either an initial or word.
Initials and words are disjoint sets.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



using System;
using System.Text.RegularExpressions;

public class Program 
{
    public static bool ValidName(string name) 
    {
			String[] validRegex = new String[] {
				// H. Wells
				@"^[A-Z]\. [A-Z][a-z]+$",
					
				// H. G. Wells
				@"^[A-Z]\. [A-Z]\. [A-Z][a-z]+$",
					
				// Herbert G. Wells
				@"^[A-Z][a-z]+ [A-Z]\. [A-Z][a-z]+$",
					
				// Herbert George Wells
				@"^[A-Z][a-z]+ [A-Z][a-z]+ [A-Z][a-z]+$"
			};
			
			foreach (String regex in validRegex) {
				if (Regex.Match(name, regex).Success) {
					return true;
				}
			}
			
			return false;
    }
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


using System;
using System.Text.RegularExpressions;
public class Program 
{
    public static bool ValidName(string name) 
    {
			return Regex.IsMatch(name, "^([A-Z]{1}.) ([A-Z]{1}[a-z]{2,})$")
                || Regex.IsMatch(name, "^([A-Z]{1}.) ([A-Z]{1}.) ([A-Z]{1}[a-z]{2,})$")
                || Regex.IsMatch(name, "^([A-Z]{1}[a-z]{1,}) ([A-Z].) ([A-Z]{1}[a-z]{1,})$")
                || Regex.IsMatch(name, "^([A-Z]{1}[a-z]{1,}) ([A-Z]{1}[a-z]{1,}) ([A-Z]{1}[a-z]{1,})$");
    }
}








//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


using System.Linq;
public class Program 
{
public static bool ValidName(string name)
        {
            string[] names = name.Split(' ').ToArray();
            bool three = names.Length > 2;
            bool two = names.Length == 2;
            bool firstName;
            bool middleName;
            bool lastName;
            if (two)
            {
                firstName = (names[0].Length > 2 && names[0].Last() != '.' && char.IsUpper(names[0].First())) || names[0].Length == 2 && char.IsUpper(names[0].First()) && names[0].Last() == '.';
                lastName = char.IsUpper(names[1].First()) && names[1].Length > 2 && names[1].Last() != '.';
                if (firstName && lastName)
                    return true;
                return false;
            }
           else if (three)
            {
                firstName = (names[0].Length > 2 && names[0].Last() != '.' && char.IsUpper(names[0].First())) || names[0].Length == 2 && char.IsUpper(names[0].First()) && names[0].Last() == '.';
                middleName = (names[0].Last() != '.'&&names[1].Length > 2 && char.IsUpper(names[1].First())) || names[1].Length == 2 && char.IsUpper(names[1].First()) && (names[1].Last() == '.'||names[1].Last()!='.');
                lastName = char.IsUpper(names[2].First()) && names[2].Length > 2 && names[2].Last() != '.';
                if (firstName && middleName && lastName)
                    return true;
                return false;
            }
            else return false;
        }
}










//#############################################################
//#                        MY SOLUTION 4
//#############################################################



using System.Linq;

public class Program 
{
    public static bool ValidName(string name) 
    {
			var splitName = name.Split(' ');

      if (splitName.Length < 2  || splitName.Length > 3)
      {
				return false;
			}

      if (splitName.Any(x => char.IsLower(x.First())))
			{
				return false;
			}

			if (splitName.Where(x => x.Length < 3).Any(y => !y.EndsWith(".")))
			{
				return false;
			}
			
			if (splitName.Where(x => x.Length > 2).Any(y => y.EndsWith(".")))
			{
				return false;
			}
			
			if (splitName.Last().Length < 3)
			{
				return false;
			}
			
			if (splitName.Length == 3)
			{
				if (splitName[1].Length > splitName.First().Length)
				{
					return false;
				}
			}			
			return true;
    }
}






//#############################################################
//#                        MY SOLUTION 5
//#############################################################

/*

using System.Text.RegularExpressions;
public class Program 
{
    public static bool ValidName(string name) 
    {
			string pattern = @"^(?<word1>\w+)?(?<dot1>\.)?\s?(?<word2>\w+)?(?<dot2>\.)?\s?(?<word3>\w+)?(?<dot3>\.)?";
        Regex rx = new Regex(pattern);
        MatchCollection matches = rx.Matches(name);

        foreach (Match m in matches)
        {
            GroupCollection g = m.Groups;

            
         
            

            if (g["word3"].Length==0)
            {
                if (g["dot2"].Length==1 || g["word2"].Value.Length == 1) return false; //last word cannot finish by period
                if (g["word2"].Length == 0) return false; //must be at least 2 terms
                if (g["word1"].Value.Length == 1 && g["dot1"].Length == 0) return false;
                if (g["word1"].Value.Length > 1 && g["dot1"].Length == 1) return false;
            }
            if (g["word3"].Length != 0)
            {
                if (char.IsLower(g["word3"].Value[0])) return false; //improper capitalization
                if (g["word3"].Value.Length == 1) return false; //word 3 cannot be an initial
                if (g["dot3"].Length == 1) return false; //last word cannot finish by a period
							          if (g["word1"].Value.Length == 1 && g["word2"].Value.Length > 1) return false;
                if (g["word1"].Value.Length == 1 && g["dot1"].Length == 0) return false;
                if (g["word1"].Value.Length > 1 && g["dot1"].Length == 1) return false;

            }
           
            if (char.IsLower(g["word2"].Value[0])) return false; //improper capitalization
            if (char.IsLower(g["word1"].Value[0])) return false; //improper capitalization

           
        }

        return true;
    }
}



*/


//#############################################################
//#                        MY SOLUTION 5
//#############################################################



using System;
using System.Linq;
public class Program 
{
	public static bool isWord(string input) 
		=> input.Length > 2 && input[input.Length-1] != '.';
	public static bool isInitial(string input) 
		=> input.Length == 2 && input[input.Length-1] == '.';

    public static bool ValidName(string _name) 
    {
			string[] names = _name.Split(' ');
			foreach(string name in names){
				if(!Char.IsUpper(name[0])){return false;}
				if(!(isInitial(name) || isWord(name))){return false;}
			}
			if (names.Length <= 1 || names.Length > 3) return false;
			if(!isWord(names.Last())) return false;
			if(names.Length == 3 && isInitial(names[0]) && isWord(names[1])) return false;
			return true;
    }
	// Tedious - Not Hard - Don't wanna use REGEX
}






//#############################################################
//#                        MY SOLUTION 6
//#############################################################



using System.Text.RegularExpressions;

public class Program 
{
    public static bool ValidName(string name) 
    {
				bool res = false;
				if (!res) res = Regex.IsMatch(name, @"^[A-Z]\.\s[A-Z][a-z][a-z]+$");                           // "H. Wells"
				if (!res) res = Regex.IsMatch(name, @"^[A-Z]\.\s[A-Z]\.\s[A-Z][a-z][a-z]+$");                   // "H. G. Wells" 
				if (!res) res = Regex.IsMatch(name, @"^[A-Z][a-z][a-z]+\s[A-Z][a-z][a-z]+$");                   // "George Wells"
				if (!res) res = Regex.IsMatch(name, @"^[A-Z][a-z][a-z]+\s[A-Z][a-z][a-z]+\s[A-Z][a-z][a-z]+$"); // "Herbert George Wells"
				if (!res) res = Regex.IsMatch(name, @"^[A-Z][a-z][a-z]+\s[A-Z]\.\s[A-Z][a-z][a-z]+$");          // "Herbert G. Wells"
				return res;
    }
}