/**
 * @author Jakub Smal 
 * 22.01.2017 12:58:54
 */
package hackerrank.algorithms.dynamicprogramming;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.util.Scanner;
//caused timeouts for few tests
public class FibonacciModified2 {
	public static void main(String[] args) {
		String givenString = "0 1 6";
      
        System.out.println(run(givenString));
    }
	
	public static BigInteger run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 final BigInteger first = new BigInteger(stdin.next());
		 final BigInteger second = new BigInteger(stdin.next());
		 final BigInteger expected = new BigInteger(stdin.next());
		 
	
		 
	     return calculate(first, second, expected);   
	}
	
	public static BigInteger calculate(BigInteger first, BigInteger second, BigInteger n){
		if(n.equals(new BigInteger("1"))){
			return first;
		}
		if(n.equals(new BigInteger("2"))){
			return second;
		}
		return calculate(first, second, n.subtract(new BigInteger("1"))).multiply(calculate(first, second, n.subtract(new BigInteger("1")))).add(calculate(first, second, n.subtract(new BigInteger("2"))));
	}
}
