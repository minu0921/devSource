package codility;


public class CodilityLevel01 {

	public static void main (String arg[]) {


		System.out.println(solution(1041));

	}

	public static int solution(int N) {
		// write your code in Java SE 8

		String value = Integer.toBinaryString(N);

		int cnt = 0;
		int newCnt = 0;

		boolean start = false;

		for (int i = 0; i < value.length(); i ++) { 

			if (start == false && value.charAt(i) == '1') {

				start = true;

			} else if ( start == true && value.charAt(i) == '0') {

				newCnt ++;

			} else if ( start == true && value.charAt(i) == '1') {

				if (cnt < newCnt ) {
					cnt = newCnt;
				}
				
				newCnt = 0;

			}
			

		}
		
		return cnt;
	}
}
