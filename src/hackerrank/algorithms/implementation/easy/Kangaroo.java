/**
 * @author Jakub Smal 
 * 22.01.2017 12:34:45
 */
package hackerrank.algorithms.implementation.easy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Kangaroo {
	public static void main(String[] args) {
		String givenString = "43 2 70 2 ";

		System.out.println(run(givenString));
	}

	public static String run(String givenString) {
		ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		System.setIn(System.in);
		Scanner stdin = new Scanner(in);
		int firstKangarooPosition = stdin.nextInt();
		final int firstKangarooJump = stdin.nextInt();
		int secondKangarooPosition = stdin.nextInt();
		final int secondKangarooJump = stdin.nextInt();
		int biggerOrLower = 1;
		if (firstKangarooPosition - secondKangarooPosition < 0) {
			biggerOrLower = -1;
		}

		int difference = 0;
		String result = "NO";
		if (secondKangarooJump != firstKangarooJump && firstKangarooPosition != secondKangarooPosition) {

			while (true) {
				difference = firstKangarooPosition - secondKangarooPosition;
				firstKangarooPosition += firstKangarooJump;
				secondKangarooPosition += secondKangarooJump;
				if (firstKangarooPosition == secondKangarooPosition) {
					result = "YES";
					break;
				}
				if (biggerOrLower < 0) {
					if (difference > 0) {
						break;
					}
				}
				if (biggerOrLower > 0) {
					if (difference < 0) {
						break;
					}
				}
			}
		}
		return result;
	}
}
