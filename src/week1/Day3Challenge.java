package week1;

import java.util.HashMap;
import java.util.Map;

public class Day3Challenge {
		
	public static void main(String args[]) {
		Solution sol = new Solution();
		System.out.println(sol.canConstruct("a","b"));
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