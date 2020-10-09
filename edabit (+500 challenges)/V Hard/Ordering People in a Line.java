/*********************************************************************************************************************
 Ordering People in a Line

Create a function that takes in the size of the line and the number of people waiting and places people in an S-shape ordering, returning the result as string. The demonstration below will make it clear:

# Ordering numbers 1-15 in a 5 x 3 space.

OrderPeople(5, 3, 15) ➞ 
1, 2, 3
6, 5, 4
7, 8, 9
12, 11, 10
13, 14, 15
If there is extra room, leave those spots blank with a 0 filler.

# Ordering numbers 1-5 in a 4 x 3 space.

OrderPeople(4, 3, 5) ➞
1, 2, 3
0, 5, 4,
0, 0, 0,
0, 0, 0
If there are too many people for the given dimensions, return "overcrowded".

OrderPeople(4, 3, 20) ➞ "overcrowded"
Examples
OrderPeople(3, 3, 8) ➞
1, 2, 3
6, 5, 4
7, 8, 0

OrderPeople(2, 4, 5) ➞
1, 2, 3, 4
0, 0, 0, 5

OrderPeople(2, 4, 10) ➞ "overcrowded"

Notes
Always start the ordering on the upper-left corner.
Return the the result as a string e.g. "1, 2, 3\n6, 5, 4\n7, 8, 9\n12, 11, 10\n13, 14, 15". Note the spacing of the numbers and the new line character \n between each row.
If the S-shape concept doesn't make sense, try writing down some of these examples on a piece of paper and tracing a pencil through the numbers in order.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


using System.Linq;

public class Program 
{
	public static string OrderPeople(int rows, int columns, int people)
	{
		if (rows*columns < people) return "overcrowded";
		
		return string.Join("\n", Enumerable.Range(0, rows).Select(r =>
		{
				return string.Join(", ", Enumerable.Range(0, columns).Select(c =>
				{
						int n = (r % 2 == 0)
							? (c + columns * r + 1) 
							: (r + r + 1) * columns - (c + columns * r + 1) + 1;
						return n <= people ? n : 0;
				}));
		}));
	}
}








//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


using System;
using System.Collections.Generic;
using System.Linq;

public class Program 
{
	public static string OrderPeople(int rows, int columns, int people)
	{
			var capacity = rows * columns;
			if (people > capacity)
			{
					return "overcrowded";
			}
			var lst = new List<int[]>();
			var person = 1;
			for (int r = 0; r < rows; r++)
			{
					var row = new List<int>();
					for (int c = 0; c < columns; c++)
					{
							row.Add(person > people ? 0 : person++);
					}
					lst.Add(r % 2 == 0 ? row.ToArray() : row.OrderByDescending(p => p == 0 ? capacity : p).ToArray());
			}
			return string.Join("\n", lst.Select(row => string.Join(", ", row)));
	}
}








//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



using System;
using System.Collections.Generic;
using System.Linq;

public class Program 
{
	public static string OrderPeople(int rows, int columns, int people)
	{
		if(people > rows * columns) 
		{ 
			return "overcrowded"; 
		}
		string[] ar = new string[rows * columns];
		for(int x=0; x<rows; x++)
		{
			for(int y=0; y<columns; y++)
			{
				int t=0;
				string end="";
				if(x%2 == 0)
				{
					t = columns * x + y;
					end = (y == columns-1)? "\n" : ", ";
				}
				else
				{
					t = columns * x + (columns-y-1);
					end = (y == 0)? "\n" : ", ";
				}
				int value = ((columns * x + y + 1)<=people)? columns * x + y + 1 : 0;
				ar[t] = (value).ToString()+ end ;
			}
		}
		string join = (String.Join("", ar));
		return join.Substring(0, join.Length - 1 );
	}
}








//#############################################################
//#                        MY SOLUTION 4
//#############################################################



using System.Linq;

public class Program 
{
	public static string OrderPeople(int rows, int columns, int people)
	{
		if (rows*columns < people) return "overcrowded";
		
		return string.Join("\n", Enumerable.Range(0, rows).Select(r =>
		{
				return string.Join(", ", Enumerable.Range(0, columns).Select(c =>
				{
						int n = (r % 2 == 0)
							? (c + columns * r + 1) 
							: (r + r + 1) * columns - (c + columns * r + 1) + 1;
						return n <= people ? n : 0;
				}));
		}));
	}
}