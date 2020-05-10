package week2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheTownJudge {

	public static void main(String args[]) {
		SolutionTownJudge sol= new SolutionTownJudge();
		int[][] trust =  {{1,2}, {2,3}};
		
		System.out.println(sol.findJudge(3, trust));
	}
}

class SolutionTownJudge {
    public int findJudge(int N, int[][] trust) {
        
    		int[] count = new int[N+1];
    		for(int[] item: trust) {
    			count[item[0]]--;
    			count[item[1]]++;
    		}
    		
        for(int i=1;i<=N;i++){
            if(count[i] == N-1){
                return i;
            }
        }
        
        return -1;
    }
}