/**
 * @author Jakub Smal 
 * 25.01.2017 17:25:57
 */
package hackerrank.eulerproblems;

import java.sql.Time;
import java.util.Scanner;

/*
 * 
 */
public class _01_MultiplesOf3And5 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            n=n-1;
            long divisibleBy3 = n/3;
            long divisibleBy5 = n/5;
            long divisibleBy15 = n/15;
         
            long sumOf3 = 3*divisibleBy3*(divisibleBy3+1)/2;
            long sumOf5 = 5*divisibleBy5*(divisibleBy5+1)/2;
            long sumOf15 = 15*divisibleBy15*(divisibleBy15+1)/2;
  
            System.out.println(sumOf3 + sumOf5 - sumOf15);
           
        }
    }
}
