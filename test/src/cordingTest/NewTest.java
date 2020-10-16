package cordingTest;

import java.util.HashMap;

public class NewTest {

	public static void main ( String arg[] ) {

		String a = "rather";
		String b = "harder";

		System.out.println( solution (a, b) );

	}

	public static int solution ( String A, String B) {

		HashMap<Character, Integer> aMap = getAMap(A);
		HashMap<Character, Integer> bMap = getAMap(B);
		
		return rest (aMap, B) + rest(bMap, A);

	}





	public static int rest (HashMap<Character, Integer> map, String str ) {

		int addChar = 0;

		for (int j = 0; j < str.length(); j ++ ) {

			if ( map.get(str.charAt(j)) != null ) {

				if (map.get(str.charAt(j)) > 1) {

					map.put(str.charAt(j), map.get(str.charAt(j)) - 1);
					
				} else {

					map.remove(str.charAt(j));
				}
			} else {
				addChar++;
			}

		}
		
		return addChar;
		
	}




	public static HashMap<Character, Integer> getAMap ( String map ) {

		HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>();

		for (int i = 0; i < map.length(); i++) {

			if (tempMap.get(map.charAt(i)) != null) {

				tempMap.put(map.charAt(i), tempMap.get(map.charAt(i)) + 1);

			} else 

				tempMap.put(map.charAt(i), 1 );

		}

		return tempMap;

	}





}
