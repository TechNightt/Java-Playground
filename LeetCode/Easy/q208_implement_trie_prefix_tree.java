// Source : https://leetcode.com/problems/implement-trie-prefix-tree/

/************************************************************************
 * Implement a trie with insert, search, and startsWith methods.        *
 *                                                                      *
 * Example:                                                             *
 *                                                                      *
 * Trie trie = new Trie();                                              *
 *                                                                      *
 * trie.insert("apple");                                                *
 * trie.search("apple");   // returns true                              *
 * trie.search("app");     // returns false                             *
 * trie.startsWith("app"); // returns true                              *
 * trie.insert("app");                                                  *
 * trie.search("app");     // returns true                              *
 * Note:                                                                *
 *                                                                      *
 * You may assume that all inputs are consist of lowercase letters a-z. *
 * All inputs are guaranteed to be non-empty strings.                   *
 ***********************************************************************/
package com.leet_code.easy.q208_implement_trie_prefix_tree.solution1;

import java.util.HashMap;
import java.util.Map;

/************************************************************************
                                     *
 * Thoughts on implementation:                                          *
 * Not the best solution because using hash map is                      *
 * bad in this problem.                                                 *
 * This solution is faster than 05.01%                                  *
 * Time complexity is O(n)                                              *
 * *********************************************************************/
class Trie {
	
    HashMap<String, String> dictionary;
    
    /** Initialize your data structure here. */
    public Trie() {
        dictionary = new HashMap<String, String>();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        dictionary.put(word, word);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return dictionary.get(word) != null;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(search(prefix))
            return true;
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            if(key.startsWith(prefix))
            	return true;
        }
        return false;
    }
}