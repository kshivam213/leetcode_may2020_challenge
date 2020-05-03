package week1;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem Description
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

   Each letter in the magazine string can only be used once in your ransom note.

   Note:
   You may assume that both strings contain only lowercase letters.

   canConstruct("a", "b") -> false
   canConstruct("aa", "ab") -> false
   canConstruct("aa", "aab") -> true
*/

public class RansomNote_Day3 {
		
	public static void main(String args[]) {
		Solution sol = new Solution();
		System.out.println(sol.canConstruct("aab","bbbacaa"));
	}
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
          
        Map<Character, Integer> storage = new HashMap<Character, Integer>();
        for(int i=0;i<magazine.length();i++){
            char tmp = magazine.charAt(i);
            if(storage.get(tmp) != null)
                storage.put(tmp, storage.get(tmp)+1);
            else
                storage.put(tmp, 1);
        }
        
        boolean flag = true;
        for(int i=0;i<ransomNote.length();i++){
            
            char tmp = ransomNote.charAt(i);
            if(storage.get(tmp) == null || storage.get(tmp) <=0){
                 flag = false;
                 break;
            }else
                storage.put(tmp, storage.get(tmp)-1);
        }
        
        return flag;
    }
};