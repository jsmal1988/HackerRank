/**
 * @author Jakub Smal 
 * 21.01.2017 17:21:43
 */
package hackerrank.algorithms.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		String givenString = "4";
      
        System.out.println(run(givenString));
    }
	
	public static String run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 final int length = stdin.nextInt();          
		 String result="";
		 for(int i = 1;i<length+1;i++){
			 result+=drawOneLine(length-i, i);
			 if(i<length){
				 result+="\n";
			 }
		 }
		 
		
	     return result;   
	}
		
	 private static String drawOneLine(int whiteSpaces, int hashes){
			String result = "";
			for(int i = 0; i<whiteSpaces; i++){
				result+=" ";
			}
			for(int i = 0; i<hashes; i++){
				result+="#";
			}
			return result;
		}
}
