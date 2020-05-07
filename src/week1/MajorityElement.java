package week1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		SolutionDay6 solution = new SolutionDay6();
		
		int[] arr= {3,2,3};
		
		System.out.println(solution.majorityElement(arr));
	}
}


class SolutionDay6 {
    
    Map<Integer, Integer> storage = new HashMap<>();
    public int majorityElement(int[] arr) {
        
        for(int i=0;i<arr.length; i++){
            
        		Integer count = storage.get(arr[i]);
            if(count != null){
                storage.put(arr[i], ++count);
            }else{
                storage.put(arr[i], 1);
            }
            
            count= storage.get(arr[i]);
            if(count > (arr.length/2)){
                return arr[i];
            }
        }
        
        return -1;
    }
}