package codility;

public class CodilityLevel03_02 {
	
	public static void main (String arg[]) {
		
		int [] C = {2, 3, 1, 5};
		
		System.out.println( solution (C) );
		
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		
		int orgSum = 0;
		int problemSum = 0;
		
		for (int i = 1; i <= A.length +1; i ++) {
			
			orgSum += i;
			
		}
		
		for (int j = 0; j < A.length; j ++) {
			problemSum += A[j];
		}
		
		int rst = orgSum - problemSum;
		
		return rst;
		
		
		
		
		
    }
	
	

}
