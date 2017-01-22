/**
 * @author Jakub Smal 
 * 22.01.2017 10:45:55
 */
package hackerrank.algorithms.warmup;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		String givenString = "07:05:45PM";
      
        System.out.println(run(givenString));
    }
	
	public static String run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 String time= stdin.nextLine();
		 String ampmFormat = time.substring(time.length() - 2);
		 String numbers[] = time.split("[^0-9]+");
		 if(ampmFormat.equals("PM")){
			 if(!numbers[0].equals("12")){
				 numbers[0] = Integer.toString((Integer.parseInt(numbers[0])+12)%24); 
				 if(numbers[0].equals("0")){
					 numbers[0] = "00";
				 }
			 }
			 
		 }else{
			 if(numbers[0].equals("12")){
				 numbers[0] = "00";
			 }
		 }

		 time = numbers[0]+":"+numbers[1]+":"+numbers[2];
	     return time;   
	}
}
