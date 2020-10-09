/*********************************************************************************************************************
 
Mountains or Valleys
A mountain is an array with exactly one peak.

All numbers to the left of the peak are increasing.
All numbers to the right of the peak are decreasing.
The peak CANNOT be on the boundary.
A valley is an array with exactly one trough.

All numbers to the left of the trough are decreasing.
All numbers to the right of the trough are increasing.
The trough CANNOT be on the boundary.
Some examples of mountains and valleys:

Mountain A:  [1, 3, 5, 4, 3, 2]   // 5 is the peak
Mountain B:  [-1, 0, -1]   // 0 is the peak
Mountain B:  [-1, -1, 0, -1, -1]   // 0 is the peak (plateau on both sides is okay)

Valley A: [10, 9, 8, 7, 2, 3, 4, 5]   // 2 is the trough
Valley B: [350, 100, 200, 400, 700]  // 100 is the trough
Neither mountains nor valleys:

Landscape A: [1, 2, 3, 2, 4, 1]  // 2 peaks (3, 4), not 1
Landscape B: [5, 4, 3, 2, 1]  // Peak cannot be a boundary element
Landscape B: [0, -1, -1, 0, -1, -1]  // 2 peaks (0)
Based on the rules above, write a function that takes in an array and returns either "mountain", "valley", or "neither".

Examples
LandscapeType([3, 4, 5, 4, 3]) ➞ "mountain"

LandscapeType([9, 7, 3, 1, 2, 4]) ➞ "valley"

LandscapeType([9, 8, 9]) ➞ "valley"

LandscapeType([9, 8, 9, 8]) ➞ "neither"

Notes
A peak is not exactly the same as the max of an array. The max is a unique number, but an array may have multiple peaks. However, if there exists only one peak in an array, then it is true that the peak = max.
See comments for a hint.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


using System.Text.RegularExpressions;
public class Program 
{
    public static string LandscapeType(int[] arr) 
    {
        string pattern = "";

        for (int i = 1; i < arr.Length; i++)
        {
            if (arr[i] > arr[i - 1])
                pattern = pattern + "u";
            if (arr[i] < arr[i - 1])
                pattern = pattern + "d";
            if (arr[i] == arr[i - 1])
                pattern = pattern + "f";
        }

        if (Regex.IsMatch(pattern, @"^u*$"))
            return "neither";
        if (Regex.IsMatch(pattern, @"^d*$"))
            return "neither";
        if (Regex.IsMatch(pattern, @"^f*u*d*f*$"))
            return "mountain";
        if (Regex.IsMatch(pattern, @"^f*d*u*f*$"))
            return "valley";
        else
            return "neither";
    }
}








//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


using System;
public class Program 
{
    public static string LandscapeType(int[] arr) 
    {
			int minflag = 0,maxflag=0;
            for(int x = 1; x < arr.Length-1; x++)
            {
                Console.WriteLine(arr[x]);
                if (arr[x + 1] > arr[x] && arr[x - 1] > arr[x])
                {
                    minflag++;
                }
                if (arr[x + 1] < arr[x] && arr[x - 1] < arr[x])
                {
                    maxflag++;
                    
                }
                if (x == 1)
                {
                    if (arr[0] > arr[1]&&arr[2]==arr[1]) maxflag++;
                    else if (arr[0] < arr[1] && arr[2] == arr[1]) minflag++;
                }
                
            }
            Console.WriteLine(minflag); Console.WriteLine(maxflag);

            if (minflag < 2 && maxflag < 2)
            {
                if (minflag<maxflag) return "mountain";
                else if (minflag>maxflag) return "valley";
            }
            
            return "neither";
    }
}










//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Program 
{
    public static string LandscapeType(int[] arr) 
    {
					int minIndex = 0 ;
          int maxIndex = 0;

           for(int i=0;i<arr.Length;i++){
               if( arr[i] > arr[maxIndex]){
                   maxIndex = i;
               }

               if(arr[i] < arr[minIndex]){
                   minIndex = i;
               }
           }

           if(maxIndex == 0 || maxIndex == arr.Length-1){
               if(minIndex == 0 || minIndex == arr.Length-1) return "neither";
               for(int i=0;i<minIndex;i++){
                   if(arr[i] < arr[i+1]){
                       return "neither";
                   }
               }

               for(int i=minIndex;i<arr.Length-1;i++){
                   if(arr[i] > arr[i+1]){
                       return "neither";
                   }
               }
               return "valley";
           }
           else if (maxIndex != 0 || maxIndex != arr.Length-1){
               for(int i=0;i<maxIndex;i++){
                   if(arr[i] > arr[i+1]){
                       return "neither";
                   }
               }

               for(int i=maxIndex;i<arr.Length-1;i++){
                   if(arr[i] < arr[i+1]){
                       return "neither";
                   }
               }
               return "mountain";
           }
           else{
               return "neither";
           }
    }
}









//#############################################################
//#                        MY SOLUTION 4
//#############################################################




using System;
using System.Collections.Generic;
using System.Linq;
public class Program 
{
    public static string LandscapeType(int[] arr) 
    {
			int max = arr.Max();
            int min = arr.Min();
            int arrLenght = arr.Length;
            int countMax = arr.Count(f => f == max);
            int countMin = arr.Count(f => f == min);
            int mountCount = 0;
            int vallayCount = 0;

            for (int i = 1; i < arrLenght - 1; i++)
            {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
                { mountCount++; }
                else if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])
                { vallayCount++; }

            }

            if (arr[0] != max && arr[arr.Length - 1] != max && countMax < 2 && mountCount < 2)
            {
                return "mountain";
            }
            else if (arr[0] != min && arr[arr.Length - 1] != min && countMin < 2 && vallayCount < 2)
            {
                return "valley";
            }
            else return "neither";
    }
}





//#############################################################
//#                        MY SOLUTION 5
//#############################################################


using System;
public class Program 
{
    public static string LandscapeType(int[] arr) 
		{
			 int max = 0;
       int min = 0;

            for (int i = 1; i < arr.Length - 1; i++)
            {
                if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i])
                {
                    max++;
                }
                else if (arr[i - 1] > arr[i] && arr[i + 1] > arr[i])
                {
                    min++;
                }
                else if (max == 0 && arr[i - 1] > arr[i] && arr[i] == arr[i + 1])
                {
                    max++;
                }
                else if (min ==0 && arr[i - 1] < arr[i] && arr[i] == arr[i + 1]) 
                {
                    min++;
                }               

            }


            if (max == 1 && min == 0)
            {
                return "mountain";
            }

            else if (max == 0 && min == 1)
            {
                return "valley";
            }
            else
            {
                return "neither";
            }           
		}
   
}





//#############################################################
//#                        MY SOLUTION 6
//#############################################################



using System;
using System.Linq;
public class Program 
{
    public static string LandscapeType(int[] arr) 
    {
			Nullable<int> maxOrMinPoint = null;
            string Output = "neither";
            for(int i = 1; i < arr.Count() - 1; i++)
            {
                //peak
                if(arr[i-1] < arr[i] && arr[i+1] < arr[i])
                {
                    //only one peak or trough can exist so if there already is one, return 'neither'
                    if(Output != "neither")
                    {
                        return "neither";
                    } else
                    {
                        //set point for boundary check later on
                        maxOrMinPoint = arr[i];
                        Output = "mountain";
                    }
                }
                //trough
                if (arr[i - 1] > arr[i] && arr[i + 1] > arr[i])
                {
                    if (Output != "neither")
                    {
                        return "neither";
                    }
                    else
                    {
                        maxOrMinPoint = arr[i];
                        Output = "valley";
                    }
                }
            }
            //Check if peak/trough exists on boundary
            if(maxOrMinPoint != null && (arr[0] == maxOrMinPoint || arr[arr.Count() - 1] == maxOrMinPoint))
            {
                Output = "neither";
            }

            return Output;
    }
}






//#############################################################
//#                        MY SOLUTION 7
//#############################################################



public class Program 
{
    public static string LandscapeType(int[] arr) 
    {
            string result = "";
            int peak = 0;
            int trough = 0;
            var trend = "flat";
            for (int i = 1; i < arr.Length; i++)
            {
                if (trend == "down" && arr[i] > arr[i-1])
                {
                    trough++;
                    trend = "up";
                }
                else if (trend =="up" && arr[i] < arr[i - 1])
                {
                    peak++;
                    trend = "down";
                }
                if (arr[i] > arr[i-1]) { trend = "up"; } else if (arr[i] < arr[i-1]) { trend = "down"; }         
            }
            if (peak == 1 && trough == 0) { result = "mountain"; }
            else if (peak == 0 && trough == 1) { result = "valley"; }
            else result = "neither";
            return result;
    }
}