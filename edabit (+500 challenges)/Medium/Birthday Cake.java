/*********************************************************************************************************************
 Birthday Cake
Create a function which constructs a rectangular birthday cake, based on someone's name and age! Build it out of strings in an array and makes sure to surround the birthday message with the character that fits the rule:

If the age is an even number, surround the message with "#".
If the age is an odd number, surround the message with "*".
Other important rules:

The message should be in the format: {age} Happy Birthday {name}! {age}
Leave a space between the edge of the cake and the age numbers.
Examples
getBirthdayCake("Jack", 10) ➞ [
  "##############################",
  "# 10 Happy Birthday Jack! 10 #",
  "##############################"
]

getBirthdayCake("Russell", 19) ➞ [
  "*********************************",
  "* 19 Happy Birthday Russell! 19 *",
  "*********************************"
]

getBirthdayCake("Isabelle", 2) ➞ [
  "################################",
  "# 2 Happy Birthday Isabelle! 2 #",
  "################################"
]
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################






//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Collections;
public class Challenge {
	public static String[] getBirthdayCake(String name,int age) {
 		String[] results = new String[3];
		StringBuilder message = 
			new StringBuilder(" "+age+" Happy Birthday "+name+"! "+age);
		if (age%2==0) {
			message.insert(0,'#').append(" #");
			results[0] = 
				String.join("", Collections.nCopies(message.length(), "#"));
		} else {
			message.insert(0,'*').append(" *");
			results[0] = 
				String.join("", Collections.nCopies(message.length(), "*")); 
		}
		results[1] = message.toString();
		results[2] = results[0];
		return results;	
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Challenge {
    public static String[] getBirthdayCake(String name, int age) {
        String icon = age % 2 == 0 ? "#" : "*";
        String format = String.format("%s %d Happy Birthday %s! %d %s", icon, age, name, age, icon);
        String header = IntStream.range(0, format.length()).mapToObj(i -> icon).collect(Collectors.joining());

        String[] result = new String[] { header, format, header };

        System.out.println(Arrays.toString(result));
        return result;
    }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge 
{
	public static String r(String s,int n)
	{
		String repeated = "";
		for(int i = 0; i < n; i++)
		{
			repeated += s;
		}
		return repeated;
	}
	
	public static String[] cake(String s, String message)
	{
		return new String[]{r(s,message.length()+2),s+message+s,r(s,message.length()+2)};
	}
	
	public static String[] getBirthdayCake(String name,int age) 
	{
		String message = String.format(" %d Happy Birthday %s! %d ",age,name,age);
		return age % 2 == 0 ? cake("#",message) : cake("*",message);
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge 
{
	public static String[] getBirthdayCake(String name,int age) 
	{
		String[] a=new String[3];
		String s=age+" Happy Birthday "+name+"! "+age;
		String str="";
	  if(age%2==0)
		{
			String t="#";
			str=t+" "+s+" "+t;
			a[0]=new String(new char[str.length()]).replace("\0",t);
		  a[1]=str;
		  a[2]=new String(new char[str.length()]).replace("\0",t);
		}
		else
		{
			String t="*";
			str=t+" "+s+" "+t;
			a[0]=new String(new char[str.length()]).replace("\0",t);
		  a[1]=str;
		  a[2]=new String(new char[str.length()]).replace("\0",t);
		}	
		return a;
	}
}