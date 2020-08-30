// Source : https://leetcode.com/problems/unique-email-addresses/

/************************************************************************************************************************************************************************************************************************************************************************************************************************************************
 * Every email consists of a local name and a domain name, separated by the @ sign.                                                                                                                                                                                                                                                             *
 *                                                                                                                                                                                                                                                                                                                                              *
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.                                                                                                                                                                                                                                            *
 *                                                                                                                                                                                                                                                                                                                                              *
 * Besides lowercase letters, these emails may contain '.'s or '+'s.                                                                                                                                                                                                                                                                            *
 *                                                                                                                                                                                                                                                                                                                                              *
 * If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.) *
 *                                                                                                                                                                                                                                                                                                                                              *
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)                                                                           *
 *                                                                                                                                                                                                                                                                                                                                              *
 * It is possible to use both of these rules at the same time.                                                                                                                                                                                                                                                                                  *
 *                                                                                                                                                                                                                                                                                                                                              *
 * Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?                                                                                                                                                                                                                 *
 *                                                                                                                                                                                                                                                                                                                                              *
 *                                                                                                                                                                                                                                                                                                                                              *
 *                                                                                                                                                                                                                                                                                                                                              *
 * Example 1:                                                                                                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                              *
 * Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]                                                                                                                                                                                                                                 *
 * Output: 2                                                                                                                                                                                                                                                                                                                                    *
 * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                                                                                                              *
 *                                                                                                                                                                                                                                                                                                                                              *
 * Note:                                                                                                                                                                                                                                                                                                                                        *
 *                                                                                                                                                                                                                                                                                                                                              *
 * 1 <= emails[i].length <= 100                                                                                                                                                                                                                                                                                                                 *
 * 1 <= emails.length <= 100                                                                                                                                                                                                                                                                                                                    *
 * Each emails[i] contains exactly one '@' character.                                                                                                                                                                                                                                                                                           *
 * All local and domain names are non-empty.                                                                                                                                                                                                                                                                                                    *
 * Local names do not start with a '+' character.                                                                                                                                                                                                                                                                                               *
 ***********************************************************************************************************************************************************************************************************************************************************************************************************************************************/
package com.leet_code.easy.q929_unique_email_addresses.solution1;

import java.util.HashMap;

/************************************************************************************************************************************************************************************************************************************************************************************************************************************************
                                                                                                                                                                                                                                                                                                              *
 * Thoughts on implementation:                                                                                                                                                                                                                                                                                                                  *
 * I iterate through every email in 'emails' array and change every email according to the problem rules.                                                                                                                                                                                                                                       *
 * This solution is faster than 99.87%                                                                                                                                                                                                                                                                                                          *
 * Time complexity is O(n*m)                                                                                                                                                                                                                                                                                                                    *
 * *********************************************************************************************************************************************************************************************************************************************************************************************************************************************/

 class Solution {

    public int numUniqueEmails(String[] emails) {
        HashMap<String, String> map = new HashMap<String, String>(); 
        
        for(int i = emails.length - 1; i >= 0; --i) 
            map.put(beautifyEmail(emails[i]), "");
        
        return map.size();
    }
    
    private String beautifyEmail(String email) {
        StringBuilder res = new StringBuilder();
        boolean after = false;
        
        for(int i = 0; i < email.length(); ++i) {
            char current = email.charAt(i);
            
            if(current == '@') 
                after = true;
            
            if(current == '+') {
                
                while(email.charAt(i) != '@') 
                    ++i;
                
                res.append('@');
                after = true;
            } else if(after || current != '.')  {
                res.append(current);
            }
        }
        
        return res.toString();
    }
	
}