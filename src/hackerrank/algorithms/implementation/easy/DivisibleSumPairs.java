/**
 * @author Jakub Smal 
 * 28.01.2017 22:29:39
 */
package hackerrank.algorithms.implementation.easy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		String givenString = "6 3\n1 3 2 6 1 2 ";

		System.out.println(run(givenString));
	}

	public static int run(String givenString) {
		ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		System.setIn(System.in);
		Scanner stdin = new Scanner(in);
		
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = stdin.nextInt();
        }
        int counter = 0;
        for(int i = 0; i<a.length;i++){
        	for(int j=i+1; j<a.length;j++){
        		if((a[i]+a[j])%k==0)
        			counter++;
        	}
        }
        return counter;
	}
}
