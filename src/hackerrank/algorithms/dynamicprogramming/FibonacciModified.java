/**
 * @author Jakub Smal 
 * 22.01.2017 12:58:54
 */
package hackerrank.algorithms.dynamicprogramming;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {
	public static void main(String[] args) {
		String givenString = "0 1 6";
      
        System.out.println(run(givenString));
    }
	
	public static BigInteger run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 
		 final int first = stdin.nextInt();
		 final int second =stdin.nextInt();
		 final int expected = stdin.nextInt();
		 BigInteger[] array = new BigInteger[expected];
		 array[0] = BigInteger.valueOf(first);
	     array[1] = BigInteger.valueOf(second);
	     for(int i = 2; i < expected; i++) {
	            array[i] = (array[i-1].multiply(array[i-1])).add(array[i-2]);
	     }
	     return array[expected-1];
	}

}
