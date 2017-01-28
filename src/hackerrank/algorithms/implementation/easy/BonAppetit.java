/**
 * @author Jakub Smal 
 * 28.01.2017 22:43:44
 */
package hackerrank.algorithms.implementation.easy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class BonAppetit {
	public static void main(String[] args) {
		String givenString = "4 1\n3 10 2 9\n12 ";
      
        System.out.println(run(givenString));
    }
	
	public static String run(String givenString){
		 ByteArrayInputStream in = new ByteArrayInputStream(givenString.getBytes());
		 System.setIn(System.in);
		 Scanner stdin = new Scanner(in);
		 
		 final int numberOfDishes = stdin.nextInt();
		 final int annaWillNotEatThisDish = stdin.nextInt();          
		 int[] costOfEachDish = new int[numberOfDishes];
	     for(int i = 0; i<numberOfDishes;i++){
	    	 costOfEachDish[i] = stdin.nextInt();
	     }
	     int annaAmount = stdin.nextInt();
	     int totalSum = 0;
	     for(int i = 0; i<costOfEachDish.length;i++){
	    	 if(i!=annaWillNotEatThisDish){
	    		 totalSum+=costOfEachDish[i];
	    	 }
	     }
	     totalSum=totalSum/2;
	     totalSum =annaAmount-totalSum;
	     String result = "";
	     if(totalSum == 0){
	    	 result = "Bon Appetit";
	     }else{
	    	 result =  Integer.toString(totalSum);   
	     }
	     return result;
	}
}
