/**
 * @author Jakub Smal 
 * 21.01.2017 17:21:43
 */
package hackerrank.algorithms.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class SimpleArraySum {
	public static void main(String[] args) {
		String givenString = "6 1 2 3 4 10 11 ";
      
        System.out.println(run(givenString));
    }
	
	public static int run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 final int length = stdin.nextInt();          
	     int sum = 0;
	     for(int i = 0; i<length;i++){
	    	 sum+=stdin.nextInt();
	     }
	     return sum;   
	}
}
