/**
 * @author Jakub Smal 
 * 21.01.2017 17:21:43
 */
package hackerrank.algorithms.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		String givenString = "3 11 2 4 4 5 6 10 8 -12 ";

        System.out.println(run(givenString));
    }
	
	public static int run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 final int length = stdin.nextInt();          
	     int primaryDiagonal = 0, secondaryDiagonal = 0;
	     for(int i = 0; i<length;i++){
	    	 for(int j =0; j<length;j++){
	    		if(i==j){
	    			int nextInt = stdin.nextInt();
	    			primaryDiagonal+=nextInt;
	    			if(i==length-j-1)
		    			secondaryDiagonal+=nextInt;
	    		}else if(i==length-j-1){
	    			secondaryDiagonal+=stdin.nextInt();
	    		}else{
	    			stdin.nextInt();
	    		}
	    		
	    	 }
	     }
	     int sum =  primaryDiagonal-secondaryDiagonal;
	     if(sum<0){
	    	 sum = sum *(-1);
	     }
	     return sum;   
	}
}
