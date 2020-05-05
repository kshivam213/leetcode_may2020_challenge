package week1;

import java.util.HashMap;

public class UniqueCharacterInString_Day5 {

	public static void main(String[] args) {
		SolutionDay5 sol= new SolutionDay5();
		System.out.println(sol.firstUniqChar("loveleetcode"));
	}

}

class SolutionDay5 {
    public int firstUniqChar(String s) {
     
        HashMap<Character, CountIndex> hm = new HashMap<Character, CountIndex>(); 
    
        for (int i = 0; i < s.length();  i++) 
         { 
           
             if(hm.containsKey(s.charAt(i))) 
             { 
                 hm.get(s.charAt(i)).incCount(); 
             } 
             else
             { 
                 hm.put(s.charAt(i), new CountIndex(i)); 
             } 
         }  
        
         int result = Integer.MAX_VALUE, i; 
       
         for (i = 0; i < s.length();  i++) 
         { 
            if (hm.get(s.charAt(i)).count == 1 && result > hm.get(s.charAt(i)).index){ 
                 result = hm.get(s.charAt(i)).index; 
            }        
         }
        
        if(result == Integer.MAX_VALUE)
            result = -1;
        
        return result;
    }
}

class CountIndex 
{ 
    int count,index; 
      
    public CountIndex(int index) { 
        this.count = 1; 
        this.index = index; 
    } 
      
    public void incCount() { 
        this.count++; 
    } 
} 