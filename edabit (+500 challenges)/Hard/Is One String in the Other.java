/*********************************************************************************************************************
 Is One String in the Other?

Create a function that takes two strings and returns true if either of the strings appears at the very end of the other string. Return false otherwise. The character * is a wildcard, so it can take the place of any character.

Examples
Overlap("ABC", "Ican'tsingmyABC") ➞ true

Overlap("abc", "Ican'tsingmyABC") ➞ true

Overlap("Ican'tsingmyABC", "abc") ➞ true

Overlap("hello world", "hello") ➞ false

Overlap("+=", "this should work too +=") ➞ true

Overlap("hey", "*********") ➞ true

Notes
Your function should NOT be case sensitive (see example #2).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class Program 
{
    public static bool Overlap(string str1, string str2) 
    {
	  	str1 = str1.ToLower();
	    str2 = str2.ToLower();
	  
	  	if (str1.Length < str2.Length)
		{
		   str2 = str2.Substring(str2.Length - str1.Length);
		}
	  
	    if (str1.Length > str2.Length)
		{
		   str1 = str1.Substring(str1.Length - str2.Length);
		}
	  
	  	for (int i = 0; i < str1.Length; i += 1) 
		{
		    if (str1[i] != str2[i] && str1[i] != '*' && str2[i] != '*') 
			{
			  return false;
			}
		}
	  	return true;
    }
}






//#############################################################
//#                        MY SOLUTION 2   



using System.Linq;

public class Program 
{
    public static bool Overlap(string str1, string str2) 
    {
				string a = str1.Length > str2.Length ? str2.ToUpper() : str1.ToUpper();
				string b = a == str2.ToUpper() ? str1.Substring(str1.Length - str2.Length).ToUpper() : str2.Substring(str2.Length - str1.Length).ToUpper();
				return !a.Where((t, i) => t != b[i] && t != '*' && b[i] != '*').Any();
    }
}







//#############################################################
//#                        MY SOLUTION 3   



using System;
public class Program 
{
    public static bool Overlap(string str1, string str2) 
    {
			str1 = str1.ToLower();
			str2 = str2.ToLower();
			for(int i =0; i<str2.Length;i++){
				if((str1[str1.Length-1] == str2[str2.Length-1]) || str1[str1.Length-1]== '*' || str2[str2.Length-1] == '*')
				{
					return true;
				}
			}
					return false;
	}
}





/*

//#############################################################
//#                        MY SOLUTION 4



using System.Text.RegularExpressions;
public class Program 
{
    public static bool Overlap(string str1, string str2) 
    {
	  return Regex.IsMatch(str1,Regex.Replace(str2,@"(.)",@"[$1|*]").
		Replace("[*|*]",@"[\S]")+"$",RegexOptions.IgnoreCase)||Regex.
	    IsMatch(str2,Regex.Replace(str1,@"(.)", @"[$1|*]").Replace("[*|*]",
        @"[\S]")+"$",RegexOptions.IgnoreCase);
    }
}


*/




//#############################################################
//#                        MY SOLUTION 5




using System;
using System.Text.RegularExpressions;
public class Program 
{
    public static bool Overlap(string str1, string str2) 
    {
			string small, big;
			str1 = str1.ToLower(); str2 = str2.ToLower();

			if (str1.Length > str2.Length) { small = str2; big = str1; }
			else 													{ small = str1; big = str2; }
			// grab last elements of big string
			string lastChunk = big.Substring(big.Length - small.Length);
			for (int i = 0; i < small.Length; i++)
			{
				if (small[i] != '*' && lastChunk[i] != '*' && small[i] != lastChunk[i])
					return false;
			}
			return true;
    }
}






//#############################################################
//#                        MY SOLUTION 6



using System;
using System.Linq;

public class Program 
{
    public static bool Overlap(string str1, string str2) 
    {
		    return wildcardMatch(String.Concat(str1.Reverse()), String.Concat(str2.Reverse()));
    }
	
	  public static bool wildcardMatch(string first, string second)
		{
  	    return first.Zip(second, (u,v) => wildcardMatch(u,v)).All(x => x);					
		}
	
	  public static bool wildcardMatch(char first, char second) {
			  return (first == '*') || (second == '*') || (Char.ToLower(first) == Char.ToLower(second));
		}
}







//#############################################################
//#                        MY SOLUTION 7






using System;
public class Program 
{
    public static string Reverse(string str)
        {
            string res = "";
            for (int i = str.Length - 1; i >= 0; i--)
                res += str[i];
            return res;
        }
        public static bool Overlap(string str1, string str2)
        {
            str1 = str1.ToLower(); str2 = str2.ToLower();
            str1 = Reverse(str1); str2 = Reverse(str2);
            if (str2.Length > str1.Length)
            {
                for (int i = 0; i < str1.Length; i++)
                {
                    if (str1[i] != '*' && str2[i] != '*' && str1[i] != str2[i])
                        return false;
                }
            }
            else
            {
                for (int i = 0; i < str2.Length; i++)
                {
                    if (str1[i] != '*' && str2[i] != '*' && str1[i] != str2[i])
                        return false;
                }
            }
            return true;
        }
}