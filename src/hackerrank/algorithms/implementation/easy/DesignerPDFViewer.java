/**
 * @author Jakub Smal 
 * 22.01.2017 11:46:23
 */
package hackerrank.algorithms.implementation.easy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class DesignerPDFViewer {
	private static int height;

	public static void main(String[] args) {
		String givenString = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 abc ";
      
        System.out.println(run(givenString));
    }
	
	public static String run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 final int length = 26;          
		 int[] array = new int[length];
	     for(int i = 0; i<length;i++){
	    	 array[i] = stdin.nextInt();
	     }
	     
	     String word = stdin.next();
	     char[] charactersArray  = word.toCharArray();
	     int biggestHeight = 0, height = 0;
	     for(char c : charactersArray){
	    	 int temp = (int)c;
	    	 int temp_integer = 96;
	    	 if(temp<=122 & temp>=97){
	    		 height = array[temp-temp_integer-1];
	    		 if(height>biggestHeight){
	    			 biggestHeight = height;
	    		 }
	    	 }	    	 	
	     }
	     
	     
	     return Integer.toString(charactersArray.length*biggestHeight);   
	}
}
