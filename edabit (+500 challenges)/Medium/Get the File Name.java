/*********************************************************************************************************************
 Get the File Name

Create a function that returns the selected filename from a path including the file extension.

Examples
getFilename("C:/Projects/pil_tests/ascii/edabit.txt") ➞ "edabit.txt"

getFilename("C:/Users/johnsmith/Music/Beethoven_5.mp3") ➞ "Beethoven_5.mp3"

getFilename("ffprobe.exe") ➞ "ffprobe.exe"

Notes
Tests will include both absolute and relative paths.
For simplicity, all paths will only include forward slashes.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class DirectoryPath {
    public static String getFilename(String path) {
       return path.replaceAll("^.*(?=\\b.+\\..+$)", "");
     }
   }




//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class DirectoryPath {
    public static String getFilename(String path) {
          int x = path.lastIndexOf("/");
          if(x == -1){
              return path;
          }else{
              return path.substring(x+1);
          }
    }
  }


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class DirectoryPath {
    public static String getFilename(String path) {
          int stevec=0;
          for(int i =0; i<path.length(); i++){
              char c=path.charAt(i);
              if(c=='/'){
                  stevec=i;
              }
          }
          if(stevec!=0){
              stevec++;
          }
          return path.substring(stevec, path.length());
    }
  }



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class DirectoryPath {
    public static String getFilename(String str) {
            String s = "";
          if (str.contains("/")) {
              int lind = str.lastIndexOf("/");
              int ind=str.lastIndexOf(".");
              s=str.substring(lind+1,ind)+str.substring(ind);
          }else{
              
              s=str;
          }
  
  
          return s;
    }
  }