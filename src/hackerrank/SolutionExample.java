/**
 * @author Jakub Smal 
 * 21.01.2017 16:54:06
 */
package hackerrank;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SolutionExample {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
		 final long length = stdin.nextLong();          
	     long sum = 0;
	     for(int i = 0; i<length;i++){
	    	 sum+=stdin.nextLong();
	     }
        
        System.out.println(sum);
    }
}