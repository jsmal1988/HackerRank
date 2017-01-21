/**
 * @author Jakub Smal 
 * 21.01.2017 17:36:34
 */
package hackerrank.algorithms.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String[] args) {
		String givenString = "5 6 7 3 6 10 ";
      
        System.out.println(run(givenString));
    }
	
	public static String run(String givenString){
		 ByteArrayInputStream bais = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner in = new Scanner(bais);
		 
		 int a0 = in.nextInt();
	     int a1 = in.nextInt();
	     int a2 = in.nextInt();
	     int b0 = in.nextInt();
	     int b1 = in.nextInt();
	     int b2 = in.nextInt();
	     int aP=0, bP=0;
	     if(a0>b0 ){
	    	 aP++;
	     }else if(a0<b0){
	    	 bP++;
	     }
	     if(a1>b1 ){
	    	 aP++;
	     }else if(a1<b1){
	    	 bP++;
	     }
	     if(a2>b2 ){
	    	 aP++;
	     }else if(a2<b2){
	    	 bP++;
	     }
	     
	     
	     return aP+" "+bP;   
	}
}
