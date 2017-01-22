/**
 * @author Jakub Smal 
 * 22.01.2017 11:46:23
 */
package hackerrank.algorithms.implementation.easy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {
		String givenString = "1 2 3 4 5 ";
      
        System.out.println(run(givenString));
    }
	
	public static String run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 final int length = 5;          
		 long[] array = new long[length];
	     for(int i = 0; i<length;i++){
	    	 array[i] = stdin.nextLong();
	     }
	     
	     long min = Long.MAX_VALUE;
	     long max = 0;
	     for(int i = 0; i<length;i++){
	    	 long sum =  sum(array, i);
	    	 if(sum<min){
	    		 min = sum;
	    	 }
	    	 if(sum>max){
	    		 max = sum;
	    	 }
	     }
	     return min + " " +max;   
	}
	
	private static long sum(long[] array, int elementToSkip){
		long sum = 0;
		for(int i = 0; i<array.length; i++){
			if(i!=elementToSkip)
				sum+=array[i];
			
		}
		return sum;
	}
}
