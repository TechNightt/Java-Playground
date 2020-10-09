/*********************************************************************************************************************
 Point within Triangle

Create a function that takes four integer arrays of 2 elements. The first three are (x, y) coordinates of three corners of a triangle. Return True if the fourth array — the (x, y) coordinates of a test point — lies within the triangle, False if it doesn't.

Examples
WithinTriangle((1, 4), (5, 6), (6, 1), (4, 5)) ➞ True

WithinTriangle((1, 4), (5, 6), (6, 1), (3, 2)) ➞ False

WithinTriangle((-6, 2), (-2, -2), (8, 4), (4, 2)) ➞ True
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


using System;

public class Program
{
    public static double TriangleArea(int[] p1, int[] p2, int[] p3)
    {
        return Math.Abs(p1[0] * (p2[1] - p3[1]) - p2[0] * (p1[1] - p3[1]) + p3[0] * (p1[1] - p2[1])) / 2d;
    }

		public static bool WithinTriangle(int[] p1, int[] p2, int[] p3, int[] test)
		{
				return TriangleArea(p1, p2, p3) >= (TriangleArea(p1, p2, test)
						+ TriangleArea(p1, test, p3)
						+ TriangleArea(test, p2, p3));
		}
}








//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


using System;

public class Program
{
	  public static bool WithinTriangle(int[] p1, int[] p2, int[] p3, int[] test)
    {
        double d = (p2[1] - p3[1]) * (p1[0] - p3[0]) + (p3[0] - p2[0]) * (p1[1] - p3[1]);
        double a = ((p2[1] - p3[1]) * (test[0] - p3[0]) + (p3[0] - p2[0]) * (test[1] - p3[1])) / d;
        double b = ((p3[1] - p1[1]) * (test[0] - p3[0]) + (p1[0] - p3[0]) * (test[1] - p3[1])) / d;
        double c = 1.0 - a - b;
        return (a >= 0) && (a <= 1) && (b >= 0) && (b <= 1) && (c >= 0) && (c <= 1);
    }
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



using System;

public class Program
{
	public static bool WithinTriangle(int[] p1, int[] p2, int[] p3, int[] test)
	{
		var denominator = (double)((p2[1] - p3[1]) * (p1[0] - p3[0]) + (p3[0] - p2[0]) * (p1[1] - p3[1]));
		var a = ((p2[1] - p3[1]) * (test[0] - p3[0]) + (p3[0] - p2[0]) * (test[1] - p3[1])) / denominator;
		var b = ((p3[1] - p1[1]) * (test[0] - p3[0]) + (p1[0] - p3[0]) * (test[1] - p3[1])) / denominator;
		var c = 1 - a - b;

		return 0 <= a && a <= 1 && 0 <= b && b <= 1 && 0 <= c && c <= 1;
	}
}








//#############################################################
//#                        MY SOLUTION 4
//#############################################################



using System;

public class Program
{
	public static bool WithinTriangle(int[] p1, int[] p2, int[] p3, int[] test)
    {
        float d1, d2, d3;
        bool has_neg, has_pos;

        d1 = sign(test, p1, p2);
        d2 = sign(test, p2, p3);
        d3 = sign(test, p3, p1);

        has_neg = (d1 < 0) || (d2 < 0) || (d3 < 0);
        has_pos = (d1 > 0) || (d2 > 0) || (d3 > 0);

        return !(has_neg && has_pos);

    }

    static float sign(int[] p1, int[] p2, int[] p3)
    {
        return (p1[0] - p3[0]) * (p2[1] - p3[1]) - (p2[0] - p3[0]) * (p1[1] - p3[1]);
    }
}







//#############################################################
//#                        MY SOLUTION 5
//#############################################################


using System;
using System.Drawing;

public class Program
{

		public static bool WithinTriangle(int[] p1, int[] p2, int[] p3, int[] test)
		{
				return InTriangle(
						new Point(p1[0], p1[1])
						, new Point(p2[0], p2[1])
						, new Point(p3[0], p3[1])
						, new Point(test[0], test[1]));
		}

		public class LinearFunction
		{
				public decimal A { get; set; }
				public decimal B { get; set; }

				public LinearFunction() { }

				public LinearFunction(Point point1, Point point2)
				{
						var x1 = (decimal)point1.X;
						var y1 = (decimal)point1.Y;
						var x2 = (decimal)point2.X;
						var y2 = (decimal)point2.Y;
						var a = (y1 - y2) / (x1 - x2);
						var b = y1 - a * x1;
						A = a; 
						B = b;
				}

				public int WhereIsPoint(Point point)
				{
						var b2 = point.Y - this.A * point.X;
						return Math.Sign(b2 - this.B) * Math.Sign(this.A);
				}
		}


		public static bool InTriangle(Point a, Point b, Point c, Point examine)
		{
				var ab = new LinearFunction(a, b);
				var ac = new LinearFunction(a, c);
				var bc = new LinearFunction(b, c);

				if (ab.WhereIsPoint(examine) != ab.WhereIsPoint(c)) return false;
				if (ac.WhereIsPoint(examine) != ac.WhereIsPoint(b)) return false;
				if (bc.WhereIsPoint(examine) != bc.WhereIsPoint(a)) return false;
				return true;
		}
}