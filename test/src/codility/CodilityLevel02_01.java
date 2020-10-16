package codility;

import java.awt.image.AbstractMultiResolutionImage;

public class CodilityLevel02_01 {

	public static void main (String arg[]) {

		int [] test = {3, 8, 9, 7, 6};
		int value = 3;

		System.out.println(solution(test, 3));



	}

	public static int[] solution(int[] A, int K) {
		// write your code in Java SE 8
		
		if (A.length == 0 || K == 0) {
			return A;
		}

		int mod = K % A.length;
		int [] newArray = new int [A.length];

		for (int i = 0; i < A.length; i++) {

			newArray[ (i+mod) % A.length ] = A [i];
		}
		
		return newArray;

	}

}
