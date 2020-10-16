/*********************************************************************************************************************
 Sum of an Array of Times

Create a function that takes an array of strings representing times ('hours:minutes:seconds') and returns their sum as an array of integers ([hours, minutes, seconds]).

Examples
timeSum(["1:23:45"]) ➞ [1, 23, 45]

timeSum(["1:03:45", "1:23:05"]) ➞ [2, 26, 50]

timeSum(["5:39:42", "10:02:08", "8:26:33"]) ➞ [24, 8, 23]

Notes
If the input is an empty array, return [0, 0, 0]
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Program {
    public static int[] timeSum(String[] s) {
			int seconds = 0;
			int minutes = 0;
			int hours = 0;
			for(int i=0; i<s.length; i++) {
				String[] hms = s[i].split(":");
				seconds += Integer.valueOf(hms[2]);
				minutes += Integer.valueOf(hms[1]);
				hours += Integer.valueOf(hms[0]);
			}
			minutes += seconds/60;
			seconds %= 60;
			hours += minutes/60;
			minutes %= 60;
			return new int[]{hours,minutes,seconds};
    }
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.Arrays;

public class Program {
    public static int[] timeSum(String[] s) {
        int[][] times = new int[s.length][];
        int index = 0;
        for (String timeStr : s) {
            times[index++] = Arrays.stream(timeStr.split(":")).mapToInt(Integer::parseInt).toArray();
        }
        int seconds = Arrays.stream(times).mapToInt(time -> time[2]).sum();
        int minutes = Arrays.stream(times).mapToInt(time -> time[1]).sum();
        int hours = Arrays.stream(times).mapToInt(time -> time[0]).sum();
        minutes += seconds / 60;
        hours += minutes / 60;
        return new int[] {hours, minutes % 60, seconds % 60};
    }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################




public class Program {
    public static int[] timeSum(String[] s) {
			int[] time = new int[3];
			for(String str:s){
				time[2] += Integer.valueOf(str.split(":")[2]);
				time[1] += Integer.valueOf(str.split(":")[1]) + time[2]/60;
				time[2] %= 60;
				time[0] += Integer.valueOf(str.split(":")[0]) + time[1]/60;
				time[1] %= 60;
			}
			return time;
    }
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Program {
    public static int[] timeSum(String[] s) {
			int[] sum = new int[3];
        String[][] ore = new String[s.length][];
        for(int i=0; i<s.length; i++){
            ore[i] = s[i].split(":");
        }
        int[][] num = new int[ore.length][3];
        for(int i=0; i<ore.length; i++){
            for (int j=0; j<ore[i].length; j++) {
                num[i][j] = Integer.parseInt(ore[i][j]);
            }
        }
        for(int j=0; j<3; j++){
            int su = 0;
            for(int i=0; i<num.length; i++){
                su += num[i][j] ;
            }
            sum[j] = su;
        }
        int[] h = new int[3];
        h[0] = sum[0];
        for(int i=2; i>0; i--){
            if(sum[i]>=60){
                h[i] += sum[i]%60;
            }else{
                h[i]= sum[i];
            }
					
            h[i-1] += sum[i]/60;
           }
        return h;
    }
}


