package codility;

import java.util.Arrays;

public class CodilityLevel04_01 {
	
	public static void main ( String arg[] ) {
		
		int [] problem = {1, 3, 1, 4, 2, 3, 5, 4};
		
		System.out.println( solution ( 5, problem ));
		
	}
	
	
	public static int solution(int X, int[] A) {
        // write your code in Java SE 8
		
		
		int [] arr = A;
		int target = X;
		int [] testRst = new int [target];
				
		int rst = 0;
		
		for ( int i = 0; i < target; i++ ) {
			
			testRst[i] = i + 1;
			
		}
	
		return -1;
	}
	
}
