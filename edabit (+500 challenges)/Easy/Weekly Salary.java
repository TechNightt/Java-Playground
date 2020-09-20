/*********************************************************************************************************************
 Weekly Salary

Write a function that takes an array of hours and returns the total weekly salary.

The first element of the array is the number of hours spent at work on Monday.
The second element of the array is the number of hours spent at work on Tuesday, etc.
A worker earns $10 an hour for the first 8 hours.
For every overtime hour, he's earning $15.
On Saturday and Sunday, the employer pays twice for each hour and overtime.

Examples
WeeklySalary([8, 8, 8, 8, 8, 0, 0]) ➞ 400

WeeklySalary([10, 10, 10, 0, 8, 0, 0]) ➞ 410

WeeklySalary([0, 0, 0, 0, 0, 12, 0]) ➞ 280

Notes
Every element in the array is greater than or equal to 0.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static int WeeklySalary(int[] hours) {
          int sum = 0;
          for (int i = 0; i < hours.length; i++){
              int dayEarnings = hours[i]*10 + (hours[i] > 8 ? (hours[i]-8)*5 : 0);
              dayEarnings *= i > 4 ? 2 : 1;
              sum += dayEarnings;
          }
          return sum;
    }
  }







//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
    public static int WeeklySalary(int[] hours) {
          int salary = 0;
          for(int i = 0; i < hours.length; ++i) {
              if (i < 5) {
              if (hours[i] <= 8)
                  salary = salary + (hours[i] * 10);
              else if (hours[i] > 8)
                  salary = salary + (hours[i]-8)*15 + 8*10;
          }
              if (i == 5 || i == 6) {
              if (hours[i] <= 8)
                  salary = salary + (hours[i] * 20);
              else if (hours[i] > 8)
                  salary = salary + (hours[i]-8)*30 + 8*20;
          }
          }
          return salary;
    }
  }






//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static int WeeklySalary(int[] h) {
          int salary = 0;
          for(int i = 0; i < h.length; i++) {
              int daySalary = h[i] * 10 + (h[i] > 8 ? (h[i]-8) * 5 : 0);
              daySalary *= i > 4 ? 2 : 1;
              salary += daySalary;
          }
          return salary;
    }
  }



