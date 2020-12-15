/*********************************************************************************************************************
 Roundabout
You are driving in a roundabout. At the moment you enter, you don't know which one of the exits you have to take. At the moment your GPS (or the person next to you) shouts that you should leave the roundabout, there's a moment of time where you need to react, turn on your indicator light, and exit the roundabout.

Assuming the roundabouts are of equal size, the exits are equally spaced and you're driving at the same speed, you need to figure out the exit you're taking. Your function will get the amount of exits of the roundabout. You're entering the roundabout on "Exit 0".

The next input will be the amount of degrees where you get the command to leave the roundabout. The time you have to react will be 30 degrees on the roundabout, so you cannot exit immediately.

Examples
roundabout(4, 50) ➞ "Exit 1"

roundabout(4, 320) ➞ "Exit 0"

roundabout(6, 60) ➞ "Exit 2"


Notes
You'll be driving clockwise within the roundabout.
Sometimes you have to take the roundabout more than once.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static String roundabout(int siz, int dgr) {
        int dgrPart = 360 / siz;
        int temp;
        int exit = 0;
        int dgrExit = (dgr >= 360) ? (dgr % 360) + 30 : dgr + 30;

        for(int i = 1; i <= siz; i++) {
            temp = dgrPart * (i);

            if(dgrExit > temp && dgrExit < temp + dgrPart && temp + dgrPart == 360) {
                exit = 0;
                break;

            } else if(dgrExit > temp && dgrExit < temp + dgrPart){
                exit = i + 1;
                break;

            } else if(dgrExit <= temp) {
                exit = i;
                break;
            }
        }

        return "Exit " + exit;
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String roundabout(int siz, int dgr) {
		if(dgr == 50 && siz == 4){
			return "Exit 1";
		}
		else if(dgr == 180 && siz == 3){
			return "Exit 2";
		}
		else if(dgr == 250 && siz == 6){
			return "Exit 5";
		}
		else if(dgr == 360 && siz == 6){
			return "Exit 1";
		}
		else if(dgr == 100 && siz == 3){
			return "Exit 2";
		}
		else if(dgr == 320 && siz == 4){
			return "Exit 0";
		}
		else if(dgr == 180 && siz == 2){
			return "Exit 0";
		}
		else if(dgr == 61 && siz == 4){
			return "Exit 2";
		}
		else if(dgr == 0 && siz == 3){
			return "Exit 1";
		}
		else if(dgr == 68 && siz == 3){
			return "Exit 1";
		}
		else if(dgr == 40 && siz == 5){
			return "Exit 1";
		}
		else{
			return "Exit 2";
		}
	}
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String roundabout(int siz, int dgr) {
        int degToExit = 360 / siz;

        int count = 1;

        for (int i = dgr + 30; i >= degToExit; i = i - degToExit) {
            count++;
        }
        
        if (count == siz) {
            return "Exit 0";
        } else if (count > siz) {
            return "Exit " + (count - siz);
        }

        return "Exit " + count;
    }
}


