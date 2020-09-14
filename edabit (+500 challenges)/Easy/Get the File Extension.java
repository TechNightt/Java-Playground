/*********************************************************************************************************************
 Get the File Extension

Write a function that maps files to their extension names.

Examples
getExtension(["code.html", "code.css"])
➞ ["html", "css"]

getExtension(["project1.jpg", "project1.pdf", "project1.mp3"])
➞ ["jpg", "pdf", "mp3"]

getExtension(["ruby.rb", "cplusplus.cpp", "python.py", "javascript.js"])
➞ ["rb", "cpp", "py", "js"]

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge{
	public static String[] getExtension(String[] arr){
		String ext[] = new String[arr.length];
		
		for (int i = 0 ; i < arr.length ; i++) {
			String pattern = "^.+[.]";
			ext[i] = arr[i].replaceAll(pattern, "");
		}
		
		return ext;
	}
}



//#############################################################
//#                        MY SOLUTION 2   

public class Challenge{
    public static String[] getExtension(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = arr[i].substring(arr[i].indexOf(".")+1);
            
        }
        return arr;
    }
}





//#############################################################
//#                        MY SOLUTION 3   



public class Challenge{
	public static String[] getExtension(String[] arr){
		String r = "\\w+.\\w+";
        String[] ext = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            ext[i] = arr[i].substring(arr[i].indexOf(".")+1);
        }
        return ext;
	}
}





//#############################################################
//#                        MY SOLUTION 4


import java.util.Arrays;

public class Challenge{
	public static String[] getExtension(String[] arr){
		return Arrays.stream(arr).map(name -> name.split("\\.")[1]).toArray(String[]::new);		
	}
}