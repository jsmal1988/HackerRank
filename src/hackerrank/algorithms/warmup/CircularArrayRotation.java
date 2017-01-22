/**
 * @author Jakub Smal 
 * 22.01.2017 11:03:17
 */
package hackerrank.algorithms.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CircularArrayRotation {
	public static void main(String[] args) {
		String givenString = "3 2 3 1 2 3 0 1 2";
      
        System.out.println(run(givenString));
    }
	
	public static String run(String givenString){
		ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		System.setIn(System.in);
		Scanner stdin = new Scanner(in);
		
        int n = stdin.nextInt();
        int k = stdin.nextInt();
        int q = stdin.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = stdin.nextInt();
        }
        String result=""; 
        for(int a0 = 0; a0 < q; a0++){
            int m = stdin.nextInt();
            result += Integer.toString(a[((m - k) % n + n) % n])+"\n";
            
        }	

	     return result;   
	}
}
