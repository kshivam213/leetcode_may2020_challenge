package week2;

/*
 * 
 */
public class ValidPerfectSquareDay2 {
	
	public static void main(String args[]) {
		SolutionValidatePSquare sol = new SolutionValidatePSquare();
		System.out.println(sol.isPerfectSquare(16));
	}
}

class SolutionValidatePSquare {
    public boolean isPerfectSquare(int number) {
    
            
       double sqrt = number / 2;
        double temp = 0;

        while(sqrt != temp){
            temp = sqrt;

            sqrt = ( number/temp + temp) / 2;
        }
        
        return (sqrt - Math.floor(sqrt) == 0);
    } 
}
