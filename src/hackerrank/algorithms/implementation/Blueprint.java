/**
 * @author Jakub Smal 
 * 22.01.2017 12:20:36
 */
package hackerrank.algorithms.implementation;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Blueprint {
	public static void main(String[] args) {
		String givenString = "4 6 1 4 5 7 9 12 ";
      
        System.out.println(run(givenString));
    }
	
	public static int run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 final int searchedValue = stdin.nextInt();
		 final int length = stdin.nextInt();          
		 int position = 0;
	     for(int i = 0; i<length;i++){
	    	 if(stdin.nextInt()==searchedValue){
	    		 position = i;
	    		 break; 
	    	 }
	     }
	     return position;   
	}
}
