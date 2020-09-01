// Source : https://leetcode.com/problems/number-of-recent-calls/

/********************************************************************************************************
 * Write a class RecentCounter to count recent requests.                                                *
 *                                                                                                      *
 * It has only one method: ping(int t), where t represents some time in milliseconds.                   *
 *                                                                                                      *
 * Return the number of pings that have been made from 3000 milliseconds ago until now.                 *
 *                                                                                                      *
 * Any ping with time in [t - 3000, t] will count, including the current ping.                          *
 *                                                                                                      *
 * It is guaranteed that every call to ping uses a strictly larger value of t than before.              *
 *                                                                                                      *
 *                                                                                                      *
 *                                                                                                      *
 * Example 1:                                                                                           *
 *                                                                                                      *
 * Input: inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]] *
 * Output: [null,1,2,3,3]                                                                               *
 *                                                                                                      *
 *                                                                                                      *
 * Note:                                                                                                *
 *                                                                                                      *
 * Each test case will have at most 10000 calls to ping.                                                *
 * Each test case will call ping with strictly increasing values of t.                                  *
 * Each call to ping will have 1 <= t <= 10^9.                                                          *
 *******************************************************************************************************/
package com.leet_code.easy.q933_number_of_recent_calls.solution1;

import java.util.ArrayList;
import java.util.List;

/********************************************************************************************************
 * @author Gregory                                                                        *
 * Thoughts on implementation:                                                                          *
 * I iterate through the list of all pings from the last one an check if the current one minus the one  *
 * the array is smaller than 3000.                                                                      *
 * This solution is faster than 10.55%                                                                  *
 * Time complexity is O(n)                                                                              *
 * *****************************************************************************************************/

 class RecentCounter {

    List<Integer> counter;
    
    public RecentCounter() {
        counter = new ArrayList<Integer>();
    }
    
    public int ping(int t) {
        int count = 1;
        for(int i = counter.size() - 1; i >= 0 && t - counter.get(i) <= 3000; --i) {
            ++count;
    }
        counter.add(t);
        return count;
    }
    
}