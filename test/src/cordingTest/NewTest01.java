package cordingTest;

import java.util.Stack;

public class NewTest01 {

	public static void main(String arg[]) {

		String a = "()()((()))";

		System.out.println(solution(a));

	}

	public static int solution(String S) {

		Stack<String> checkStack = new Stack<String>();

		int coupleSum = 0;
		int singleSum = 0;

		for (int i = 0; i < S.length(); i++) {

			Character temp = S.charAt(i);

			String tempString = temp.toString();

			if (tempString.equals("(")) {

				checkStack.push(tempString);

			}

			else if (tempString.equals(")")) {

				if (checkStack.size() == 0 || checkStack.peek() != tempString) {

					singleSum++;

				}

				else {

					coupleSum += 2;
					checkStack.pop();

				}

			}

		}

		if (coupleSum > singleSum) {

			return coupleSum;

		}

		else {

			return singleSum;

		}

	}
}
