/*********************************************************************************************************************
 Reverse the String (with a catch)

Create a function that takes a string and returns the reversed string. However there's a few rules to follow in order to make the challenge interesting:

The UPPERCASE/lowercase positions must be kept in the same order as the original string (see example #1 and #2).
Spaces must be kept in the same order as the original string (see example #3).
Examples
SpecialReverseString("Edabit") ➞ "Tibade"

SpecialReverseString("UPPER lower") ➞ "REWOL reppu"

SpecialReverseString("1 23 456") ➞ "6 54 321"
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   



// Its possible to solve using some or all of these librarys.

using System;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

public class Program 
{
	public static string SpecialReverseString(string txt)
	{
            var res = string.Empty;
            var ix = 0;
            foreach (var ch in txt.Replace(" ", "").Reverse())
            {
                while (txt[ix] == ' ')
                {
                    res += ' ';
                    ix++;
                }
                res += char.IsUpper(txt[ix]) ? char.ToUpper(ch) : char.ToLower(ch);
                ix++;
            }
            return res;
	}
}









//#############################################################
//#                        MY SOLUTION 2   


// Its possible to solve using some or all of these librarys.

using System;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

public class Program 
{
	public static string SpecialReverseString(string txt)
	{
		char[] reversoftxt = txt.ToCharArray().Where(x => x != ' ').Reverse().ToArray();

            string result = "";
            int z = 0;
            for (int i = 0; i < txt.Length; i++)
            {
                if (txt[i] == ' ')
                {
                    result += ' ';
                }
                else if (Char.IsUpper(txt[i]))
                {
                    result += reversoftxt[z].ToString().ToUpper();
										z++;
                }
                else
                {
                    result += reversoftxt[z].ToString().ToLower();
										z++;
                }


            }
            return result;
	}
}









//#############################################################
//#                        MY SOLUTION 3   



using System;

public class Program 
{
	static bool ContainsSpaceORCap(string str)
  {
  	foreach (char a in str)
    {
    	if (a == ' ' || (int)a > 64 && (int)a < 91) { return true; }
    }

    return false;
  }
	
	static string ReverseString(string str)
  {
  	char[] strReversed = new char[str.Length];

    for (int i = 0; i < str.Length; i++)
    {
    	strReversed[i] = str[str.Length - (i + 1)];
    }

    return new string(strReversed);
  }
	
	public static string SpecialReverseString(string txt)
	{
		string strReversed = string.Empty;

    string strOriginal = txt;

    if (ContainsSpaceORCap(strOriginal))
    {
    	int strLength = strOriginal.Length;
      int[] capLocations = new int[strLength];
      int[] spaceLocations = new int[strLength];
      for (int i = 0; i < strLength; i++)
      {
      	if ((int)strOriginal[i] > 64 && (int)strOriginal[i] < 91) { capLocations[i] = 1; }
        else if (strOriginal[i] == ' ') { spaceLocations[i] = 1; }
      }

      string temp = string.Empty;
      for (int i = 0; i < strLength; i++)
      {
      	if (spaceLocations[i] == 1) { continue; }
        else
        {
        	if (capLocations[i] == 1) { temp += (char)((int)strOriginal[i] + 32); }
          else { temp += strOriginal[i]; }
      	}
      }

      temp = ReverseString(temp);

      int j = 0;
      for (int i = 0; i < strLength; i++)
      {
      	if (spaceLocations[i] == 1) { strReversed += " "; j++; }
        else
        {
        	if (capLocations[i] == 1) 
          {
          	if ((int)temp[i - j] - 32 < 65 || (int)temp[i - j] - 32 > 90) { strReversed += temp[i - j]; }
            else { strReversed += (char)((int)temp[i - j] - 32); }
          }
          else { strReversed += temp[i - j]; }
        }
      }
    }
    else
    {
    	strReversed = ReverseString(strOriginal);
    }

    return strReversed;
	}
}










//#############################################################
//#                        MY SOLUTION 4



// Its possible to solve using some or all of these librarys.

using System;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Linq;

public class Program 
{
	public static string SpecialReverseString(string txt)
	{
		            char[] txtArray = txt.ToArray();
            char[] txtReverse = txt.ToArray();
            Array.Reverse(txtReverse);
            int i = 0;
            int j = 0;

            while (i < txtArray.Length)
            {
                if (txtArray[i] != ' ' && txtReverse[j] != ' ')
                {
                    if (Regex.IsMatch(txtArray[i].ToString(), @"[A-Z]") && Regex.IsMatch(txtReverse[j].ToString(), @"[a-zA-Z]"))
                    {
                        txtArray[i] = char.ToUpper(txtReverse[j]);
                    }
                    else if (Regex.IsMatch(txtArray[i].ToString(), @"[^A-Z]") && Regex.IsMatch(txtReverse[j].ToString(), @"[a-zA-Z]"))
                    {
                        txtArray[i] = char.ToLower(txtReverse[j]);
                    }
                    else
                    {
                        txtArray[i] = txtReverse[j];
                    }
                    i++;
                    j++;
                }
                else if (txtArray[i] == ' ' && txtReverse[j] != ' ')
                {
                    i++;
                }
                else
                {
                    j++;
                }
            }

            return new string(txtArray);
	}
}






//#############################################################
//#                        MY SOLUTION 5



using System;
using System.Text.RegularExpressions;
using System.Linq;

public class Program 
{
    public static string SpecialReverseString(string txt)
    {
        char[] arr = txt.ToCharArray();
        string reverseTxt = new string(txt.Replace(" ", String.Empty).ToCharArray().Reverse().ToArray());
        for (int i = 0; i < arr.Length; i++)
        {
            if (arr[i] == ' ') reverseTxt = reverseTxt.Insert(i, " ");
        }
        char[] solution = reverseTxt.ToCharArray();
        for (int i = 0; i < arr.Length; i++)
        {
            solution[i] = (Char.IsUpper(arr[i])) ? Char.ToUpper(solution[i]) : Char.ToLower(solution[i]);
        }
        return new string(solution);
    }
}