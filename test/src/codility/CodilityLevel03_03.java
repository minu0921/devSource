package codility;

public class CodilityLevel03_03 {

	public static void main( String arg[] ) {

		int [] test = {5, 6, 2, 4, 1};
		System.out.println ( solution(test) );
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8

		int totalSum = 0;
		int p = A.length - 1;
		int minAbs = Integer.MAX_VALUE;
		int leftValue = 0;


		for (int i = 0; i < A.length; i ++ ) {

			totalSum += A[i];

		}

		for (int j = 0; j < p; j ++ ) {

			int temp = totalSum - A[j];
			leftValue += A[j];

			int tempRst = Math.abs( leftValue - temp );


			if (tempRst < minAbs ) {
				minAbs = tempRst;
				
			}
			totalSum = temp;
		}

		return minAbs;

	}



}
