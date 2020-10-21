/*********************************************************************************************************************
 Check Magic Square
 
A "magic square" is a square divided into smaller squares each containing a number, such that the numbers in each vertical, horizontal, and diagonal row add up to the same value.

3x3 Magic Square

Write a function that takes a 2D array, checks if it's a magic square and returns either true or false depending on the result.

Examples
isMagicSquare([
  [8, 1, 6],
  [3, 5, 7],
  [4, 9, 2]
]) ➞ true

isMagicSquare([
  [16,  3,  2, 13],
  [ 5, 10, 11,  8],
  [ 9,  6,  7, 12],
  [ 4, 15, 14,  1]
]) ➞ true

isMagicSquare([
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]) ➞ false

Notes
Check diagonals as well.
Test input will always be square.
Check the Resources tab for additional info on magic squares.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
    public static boolean isMagicSquare(int[][] square) {		
          int totHoriz = 0;
          int totVert = 0;
          int totDiag = 0;
          
          for(int i = 0; i < square.length; i++){
              totHoriz += square[0][i];
              totVert += square[i][0];
              totDiag += square[i][i];
          }
          
          return (totHoriz == totVert) && (totHoriz == totDiag);
    }
  }





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
    public static boolean isMagicSquare(int[][] square) {
          int n = square.length;
          int sum1 = 0;
          int sum2 = 0;
          int sum3 = 0;
          int sum4 = 0;
          for (int i = 0; i < square.length; i++) {
              sum1 += square[0][i];
              sum2 += square[n-1][i];
              sum3 += square[i][0];
              sum4 += square[i][n-1];
          }
          
          if (sum1 == sum2 && sum2 == sum3 && sum3 == sum4) {
              return true;
          } else {
              return false;
          }
          
    }
  }





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
    public static boolean isMagicSquare(int[][] square) {
          int sum = 0,sum2=0;  
          int n = square.length;
      for (int i = 0; i < n; i++) 
          sum = sum + square[i][i]; 
    
      // the secondary diagonal 
      for (int i = 0; i < n; i++) 
          sum2 = sum2 + square[i][n-1-i]; 
    
      if(sum!=sum2)  
          return false; 
    
      // For sums of Rows 
      for (int i = 0; i < n; i++) { 
          int rowSum = 0; 
          for (int j = 0; j < n; j++) 
              rowSum += square[i][j]; 
    
          // check if every row sum is 
          // equal to prime diagonal sum 
          if (rowSum != sum) 
              return false; 
      } 
     
          // For sums of Columns 
      for (int i = 0; i < n; i++) { 
    
          int colSum = 0; 
              for (int j = 0; j < n; j++) 
              colSum += square[j][i]; 
          // check if every column sum is 
          // equal to prime diagonal sum 
            if (sum != colSum) 
               return false; 
        }
    return true; 
    } 
  }




//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
    public static boolean isMagicSquare(int[][] square) {
          int length = square.length;
          int sum = 0;
          
          for(int i = 0; i < length; i++) sum += square[0][i];
          
          int diagSum1 = 0;
          int diagSum2 = 0;
          
          for(int i = 0; i < length; i++) {
              int vertSum = 0;
              int horiSum = 0;
              for(int k = 0; k < length; k++) {
                  vertSum += square[k][i];
                  horiSum += square[i][k];
              }
              if(vertSum != sum || horiSum != sum) return false;
              
              diagSum1 += square[i][i];
              diagSum2 += square[length - i - 1][length - i - 1];
          }
          
          if(diagSum1 != sum || diagSum2 != sum) return false;
          return true;
    }
  }





//#############################################################
//#                        MY SOLUTION 5
//#############################################################



public class Challenge {
    public static boolean isMagicSquare(int[][] square) {
  
          
          int sumOfPrimeDiagonal = 0;
          int sumOfScondaryDiagonal = 0;
  
          for (int i = 0; i < square.length; i++) {
  
              sumOfPrimeDiagonal += square[i][i];
              sumOfScondaryDiagonal += square[i][square.length - 1 - i];
          }
  
          if (sumOfPrimeDiagonal != sumOfScondaryDiagonal) {
              return false;
          }
  
          for (int i = 0; i < square.length; i++) {
              
              int sumOfRows = 0; 
              int sumOfColumns = 0;
              
              for (int j = 0; j < square.length; j++) {
                  
                  sumOfRows += square[i][j];
                  sumOfColumns += square[j][i];
              
              }
          
  
              if (sumOfRows != sumOfPrimeDiagonal || sumOfColumns != sumOfPrimeDiagonal) {
                  return false;
              }
  
          }
  
  
          return true;
      }
  }