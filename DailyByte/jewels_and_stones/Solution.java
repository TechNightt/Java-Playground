/***********************************************************************************************************************************************************************************************
 * This question is asked by Amazon. Given a string representing your stones and another string representing a list of jewels, return the number of stones that you have that are also jewels. *
 *                                                                                                                                                                                             *
 * Ex: Given the following jewels and stones...                                                                                                                                                *
 *                                                                                                                                                                                             *
 * jewels = "abc", stones = "ac", return 2                                                                                                                                                     *
 * jewels = "AaaddfFf", stones = "Af", return 3                                                                                                                                                *
 * jewels = "AYOPD", stones = "ayopd", return 0                                                                                                                                                *
 **********************************************************************************************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


class Solution {
	
	static int jewelsAndStones(String jewels, String stones) {
    	int[] charArr = new int[52];
    	int c = 0;
    	
    	for(int i = 0; i < stones.length(); ++i) {
    		if(stones.charAt(i) >= 'a' && stones.charAt(i) <= 'z') {			
    			++charArr[stones.charAt(i) - 97];
    		} else {
    			++charArr[stones.charAt(i) - 39];
    		}
    	}
    	
        for (int i = 0; i < jewels.length(); ++i) { 
        	if(jewels.charAt(i) >= 'a' && jewels.charAt(i) <= 'z') {
        		c += charArr[jewels.charAt(i) - 97];	
        	} else {
        		c += charArr[jewels.charAt(i) - 39];
        	}
        }
        
        return c;
	}
	
}