/**
 * @author Jakub Smal 
 * 22.01.2017 11:43:20
 */
package hackerrank.algorithms;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hackerrank.algorithms.dynamicprogramming.FibonacciModified;
import hackerrank.algorithms.dynamicprogramming.FibonacciModified2;

public class DynamicProgramming {

	@Test
	public void test() {
		
	}
	@Test
	public void testFibonacciModified() {
		long start = System.currentTimeMillis();
		assertEquals(FibonacciModified.run("0 1 5"), new BigInteger("5"));
		assertEquals(FibonacciModified.run("0 2 9"), new BigInteger("17970609138239271928332405705914711528208"));
		assertEquals(FibonacciModified.run("0 1 10"), new BigInteger("84266613096281243382112"));
		assertEquals(FibonacciModified.run("2 0 12"), new BigInteger("104292047421056066715537698951727494083004264929891558279344228228718658019003171882044298756195662458280101226593033166933803327203745068186400974453022429724308"));
		long end = System.currentTimeMillis();
		System.out.println("DEBUG: Logic A took " + (end - start) + " MilliSeconds");
		
	}
	
	@Test
	public void testFibonacciModified2() {
		long start = System.currentTimeMillis();
		assertEquals(FibonacciModified2.run("0 1 5"), new BigInteger("5"));
		assertEquals(FibonacciModified2.run("0 2 9"), new BigInteger("17970609138239271928332405705914711528208"));
		assertEquals(FibonacciModified2.run("0 1 10"), new BigInteger("84266613096281243382112"));
		assertEquals(FibonacciModified2.run("2 0 12"), new BigInteger("104292047421056066715537698951727494083004264929891558279344228228718658019003171882044298756195662458280101226593033166933803327203745068186400974453022429724308"));
		long end = System.currentTimeMillis();
		System.out.println("DEBUG: Logic A took " + (end - start) + " MilliSeconds");
		
		
	}
}
