/**
 * @author Jakub Smal 
 * 28.01.2017 22:05:48
 */
package hackerrank.algorithms.implementation.easy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class BetweenTwoSets {
	public static void main(String[] args) {
		String givenString = "2 3\n2 4\n16 32 96";

		System.out.println(run(givenString));
	}

	public static String run(String givenString) {
		ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		System.setIn(System.in);
		Scanner stdin = new Scanner(in);

		int n = stdin.nextInt();
		int m = stdin.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = stdin.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = stdin.nextInt();
		}
		
		int lcm = lowestCommontMultiplier(a);
		int gcd = greatesCommonDivisor(b);
		int result = 0;
		int j = 2;
		for(int i = lcm;i<=gcd;i=lcm*j,j++){
			 if(gcd%i==0){ 
				 result++;
			 }
		}
		
		return ""+result;
	}

	private static int lowestCommontMultiplier(int[] givenArray) {
		int result = givenArray[0];
		for (int i = 1; i < givenArray.length; i++) {
			result = lowestCommontMultiplier(result, givenArray[i]);
		}
		return result;
	}

	private static int lowestCommontMultiplier(int a, int b) {
		return a * (b / greatesCommonDivisor(a, b));
	}

	private static int greatesCommonDivisor(int[] givenArray) {
		int result = givenArray[0];
		for (int i = 1; i < givenArray.length; i++)
			result = greatesCommonDivisor(result, givenArray[i]);
		return result;
	}

	private static int greatesCommonDivisor(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
