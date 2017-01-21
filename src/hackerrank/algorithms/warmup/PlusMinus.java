/**
 * @author Jakub Smal 
 * 21.01.2017 18:33:53
 */
package hackerrank.algorithms.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		String givenString = "6 -4 3 -9 0 4 1    ";
      
        System.out.println(run(givenString));
    }
	
	public static String run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 final int length = stdin.nextInt();          
	     int sum = 0;
	     double p=0, n=0, z=0;
	     for(int i = 0; i<length;i++){
	    	 int currElement = stdin.nextInt();
	    	 if(currElement>0){
	    		 p++;
	    	 }else if(currElement==0){
	    		 z++;
	    	 }else{
	    		 n++;
	    	 }
	     }
	     String result = p/length + "\n" +n/length +"\n"+z/length;
	     return result;   
	}
}
