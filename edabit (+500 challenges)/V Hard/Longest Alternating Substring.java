/*********************************************************************************************************************
 Longest Alternating Substring

Given a string of digits, return the longest substring with alternating odd/even or even/odd digits. If two or more substrings have the same length, return the substring that occurs first.

Examples
LongestSubstring("225424272163254474441338664823") ➞ "272163254"
// substrings = 254, 272163254, 474, 41, 38, 23

LongestSubstring("594127169973391692147228678476") ➞ "16921472"
// substrings = 94127, 169, 16921472, 678, 476

LongestSubstring("721449827599186159274227324466") ➞ "7214"
// substrings = 7214, 498, 27, 18, 61, 9274, 27, 32
// 7214 and 9274 have same length, but 7214 occurs first.

Notes
The minimum alternating substring size is 2.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


using System;
public class Program
{
		public static string LongestSubstring(string digits)
		{
			var final = string.Empty;
            var start = 0;
            var prevIsEven = ((byte) digits[0] - '0') % 2 == 0;
            for (var i = 1; i < digits.Length; i++)
            {
                var d = (byte) digits[i] - '0';
                var isEven = d % 2 == 0;
                if ((!isEven && !prevIsEven) || (isEven && prevIsEven))
                {
                    if (i - start > 1)
                    {
                        var part = digits.Substring(start, i - start);
                        if (part.Length > final.Length) final = part;
                    }

                    start = i;
                }

                prevIsEven = isEven;
            }

            if (start < digits.Length - 1)
            {
                var part = digits.Substring(start);
                if (part.Length > final.Length) final = part;
            }
            
            return final;
		}
}









//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



using System.Linq;

public class Program
{
		public static string LongestSubstring(string digits)
		{
			return Enumerable.Range(0, digits.Length - 1).Select(s =>
			{
					return string.Join("", digits.Skip(s)
							.Select((ssa, ssb) => new { ssa, ssb })
							.TakeWhile(t => digits[s] % 2 == 0 ? t.ssa % 2 == t.ssb % 2 : t.ssa % 2 != t.ssb % 2)
							.Select(ss => ss.ssa));
			}).OrderByDescending(o => o.Length).First();
		}
}








//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



using System.Collections.Generic;
using System.Linq;
using System.Text;

public class Program
{
	public static string LongestSubstring(string digits)
	{
		var substrings = new List<string>();
		var current = new StringBuilder().Append(digits[0]);
		for(var i = 1; i < digits.Length; i++)
		{
			if(char.GetNumericValue(digits[i - 1]) % 2 == char.GetNumericValue(digits[i]) % 2)
			{
				substrings.Add(current.ToString());
				current = new StringBuilder();
			}
			current.Append(digits[i]);
		}
		substrings.Add(current.ToString());

		return substrings.First(x => x.Length == substrings.Max(y => y.Length));
	}
}









//#############################################################
//#                        MY SOLUTION 4
//#############################################################



using System;
using System.Collections.Generic;

public class Program {
    public static string LongestSubstring(string digits) {
        List<int> list = new List<int>();
        List<int> substring = new List<int>();
        List<int> tempSubstring = new List<int>();

        foreach (char x in digits) {
            list.Add(Convert.ToInt32(new string(x, 1)));
        }

        for (int i = 0; i < digits.Length-1; i++) {
            if (list[i] % 2 == 0 && list[i+1] % 2 != 0 || list[i] % 2 != 0 && list[i+1] % 2 == 0) {
                if (tempSubstring.Count == 0)
                    tempSubstring.Add(list[i]);
                tempSubstring.Add(list[i+1]);
								if (i == digits.Length-2 && tempSubstring.Count > substring.Count) {
                		substring = new List<int>(tempSubstring);
                }
            } else {
                if (tempSubstring.Count > substring.Count)
                    substring = new List<int>(tempSubstring);
                tempSubstring.Clear();
            }
        }
        return(string.Join("", substring.ToArray()));

    }
}