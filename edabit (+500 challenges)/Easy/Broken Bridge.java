/*********************************************************************************************************************
 Broken Bridge

Create a function which validates whether a bridge is safe to walk on (i.e. has no gaps in it to fall through).

Examples
isSafeBridge("####") ➞ true

isSafeBridge("## ####") ➞ false

isSafeBridge("#") ➞ true


Notes
You can expect the bridge's ends are connected to its surrounding.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class BrokenBridge {
	public static boolean isSafeBridge(String b) {
		return !b.contains(" ");
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class BrokenBridge {
	public static boolean isSafeBridge(String bridge) {
		return bridge.contains(" ") ? false:true;
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class BrokenBridge {
	public static boolean isSafeBridge(String bridge) {
		boolean safeBridge = true;
		for (int i = 0; i < bridge.length(); ++i) {
			if (Character.isWhitespace(bridge.charAt(i))) {
				safeBridge = false;
				break;
			}
		}
		
		return safeBridge;
	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class BrokenBridge {
	public static boolean isSafeBridge(String bridge) {
		int x = bridge.length()-1;
        boolean res = true;
        int i = 0;
        while (res && i < x) {
            res = !(bridge.charAt(i) == ' ');
            i++;
        }
	  return res;
	}
}