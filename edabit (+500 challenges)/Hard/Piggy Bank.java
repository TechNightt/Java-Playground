/*********************************************************************************************************************
 Piggy Bank
John wants to save money for his first car. He puts money in his piggy bank every day. Every day, he puts in $1 more than the previous day. Every Monday he starts with a new value ⁠— $1 more than the previous Monday.

Week 1 (starting at $1)
Day	Amount	Sum
Monday	$1	$1
Tuesday	$2	$3
Wednesday	$3	$6
Thursday	$4	$10
Friday	$5	$15
Saturday	$6	$21
Sunday	$7	$28
Week 2
Day	Amount	Sum
Monday	$2	$30
Tuesday	$3	$33
Wednesday	$4	$37
etc ...

Write a function that returns the number of days he needs to buy his first car cost. John had some savings (include it before counting). On the first Monday, he puts the start amount into his piggy bank.

Examples
Challenge.NumberOfDays(2050, 1200, 10) ➞ 53
// 2050: cost of car, 1200: savings, 10: start amount 
// After 53 days he can buy a car.

Challenge.NumberOfDays(10000, 2500, 50) ➞ 123
// After 123 days he can buy a car.

Challenge.NumberOfDays(500, 300, 50) ➞ 4
// After 4 days he can buy a car.


Notes
The first day is always Monday.
To buy a car, he needs money greater than or equal to cost.
All given numbers will be greater than 0.
BONUS: Try not adding the sum every day!
*********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static int NumberOfDays(int cost, int savings, int start) {
          int needs = cost - savings;
          int saved = 0, week = 0, days = 0;
          while (saved < needs) {
              for (int i = 0; i < 7; i++) {
                  saved += start + i + week;
                  days++;
                  if (saved >= needs) {
                      break;
                  }
              }
              week++;
          }
          return days;		
    }
  }




//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static int NumberOfDays(int cost, int savings, int start) {
     int targetSum = cost - savings;
     if (targetSum <= 0) {
       return 0;
     }
 
     int sum = 0;
     int totalDays = 0;
 
     for (int i = start; i <= Integer.MAX_VALUE; i++) {
       /*
       sum for a week => sum all memebrs of arithmetic progression
       with "first member" = i, "step" = 1, "total members" = 7
       */
       if (sum + (2 * i + 6) * 7 / 2 == targetSum) {
         totalDays = totalDays + 7;
         System.out.println("!!!!");
         break;
       } else if (sum + (2 * i + 6) * 7 / 2 > targetSum) {
         while (sum < targetSum) {
           sum = sum + i;
           totalDays++;
           i++;
         }
         break;
       } else {
         sum = sum + (2 * i + 6) * 7 / 2;
         totalDays = totalDays + 7;
       }
     }
     return totalDays;
   }
 }





//#############################################################
//#                        MY SOLUTION 3   



import java.util.LinkedHashMap;

public class Challenge {
  public static int NumberOfDays(int cost, int savings, int start) {
		        LinkedHashMap<String, Integer> dic = dictionary(start);
        int dayCount = 0;

        while (true) {
            if (savings >= cost) {
                break;
            }

            for (String entry : dic.keySet()) {
                savings += dic.get(entry);
                dic.put(entry, dic.get(entry) + 1);
                dayCount++;

                if (savings >= cost) {
                    break;
                }
            }

        }

        return dayCount;
		
  }
	
	    private static LinkedHashMap<String, Integer> dictionary(int start) {
        LinkedHashMap<String, Integer> dictionary = new LinkedHashMap<>();
        dictionary.put("Monday", start);
        dictionary.put("Tuesday", start+1);
        dictionary.put("Wednesday", start+2);
        dictionary.put("Thursday", start+3);
        dictionary.put("Friday", start+4);
        dictionary.put("Saturday", start+5);
        dictionary.put("Sunday", start+6);

        return dictionary;
    }
}

