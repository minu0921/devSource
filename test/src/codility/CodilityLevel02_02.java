package codility;

import java.util.HashMap;

public class CodilityLevel02_02 {
	
	public static void main (String arg[]) {
		
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		
		HashMap<Integer, Integer> temMap = new HashMap<Integer, Integer>();
		
		int rst = 0;
		
		for (int i =0; i < A.length; i ++) {
			
			if (temMap.get(A[i]) != null ) {
				
				temMap.remove(A[i]);
			} else {
				temMap.put(A[i], A[i]);
			}
			
		}
		
		for (int key : temMap.keySet()) {
			
			rst = temMap.get(key);
			
		}
		
		return rst;
		
    }

}


