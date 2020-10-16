package codility;

public class CodilityLevel03_01 {

	public static void main (String arg[]) {

		System.out.println( solution(10, 85, 30) );
		
	}
	
	public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		
		int distCnt = (Y - X) / D;
		int overCnt = (Y - X) % D;
		
		if (overCnt > 0 ) {
			distCnt += 1;
		}
				
		return distCnt;
    }

}
