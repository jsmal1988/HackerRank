/**
 * @author Jakub Smal 
 * 22.01.2017 12:19:03
 */
package hackerrank.algorithms.implementation.easy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class AppleAndOrange {
	public static void main(String[] args) {
		String givenString = "2 3 1 5 1 1 -2 -1 ";
      
        System.out.println(run(givenString));
    }
	
	public static String run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 
		 final int houseStart = stdin.nextInt();   
		 final int houseStop = stdin.nextInt();   
		 final int appleTree = stdin.nextInt();   
		 final int orangeTree = stdin.nextInt();
		 final int numberOfApples = stdin.nextInt();
		 final int numberOfOranges = stdin.nextInt();
		 int apple = 0, appleCount = 0;
		 int orange = 0, orangeCount = 0;
		 
		 for(int i = 0; i<numberOfApples;i++){
			 apple = stdin.nextInt();
			 if(appleTree + apple>=houseStart && appleTree + apple<=houseStop){
				 appleCount++;
			 }
		 }
		 for(int i = 0; i<numberOfOranges;i++){
			 orange = stdin.nextInt();
			 if(orangeTree + orange>=houseStart && orangeTree + orange<=houseStop){
				 orangeCount++;
			 }
		 }
		 
	     return appleCount+"\n"+orangeCount;   
	}
}
