/**
 * @author Jakub Smal 
 * 21.01.2017 17:46:31
 */
package hackerrank.algorithms.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class AVeryBigSum {
	public static void main(String[] args) {
		String givenString = "5 1000000001 1000000002 1000000003 1000000004 1000000005";
      
        System.out.println(run(givenString));
    }
	
	public static long run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 final long length = stdin.nextLong();          
	     long sum = 0;
	     for(int i = 0; i<length;i++){
	    	 sum+=stdin.nextLong();
	     }
	     return sum;   
	}
}
