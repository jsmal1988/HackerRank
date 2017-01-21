/**
 * @author Jakub Smal 
 * 21.01.2017 17:22:49
 */
package hackerrank.algorithms.warmups;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hackerrank.algorithms.warmup.AVeryBigSum;
import hackerrank.algorithms.warmup.CompareTheTriplets;
import hackerrank.algorithms.warmup.DiagonalDifference;
import hackerrank.algorithms.warmup.PlusMinus;
import hackerrank.algorithms.warmup.SimpleArraySum;
import hackerrank.algorithms.warmup.Staircase;

public class Warmups {
	@Test
	public void testSimpleArraySum() {
		assertEquals(SimpleArraySum.run("6 1 2 3 4 10 11"), 31);
		assertEquals(SimpleArraySum.run("4 1 2 3 4 100000"), 10);
	}

	@Test
	public void testCompareTheTriplets() {
		assertEquals(CompareTheTriplets.run("10 12 50 20 20 10"), "1 2");
		assertEquals(CompareTheTriplets.run("5 6 7 3 6 10"), "1 1");
	}

	@Test
	public void testAVeryBigSum() {
		assertEquals(AVeryBigSum.run("5 1000000001 1000000002 1000000003 1000000004 1000000005"), 5000000015l);
	}

	@Test
	public void testDiagonalDifference() {
		assertEquals(DiagonalDifference.run("3 11 2 4 4 5 6 10 8 -12 "), 15);
		assertEquals(DiagonalDifference.run("4 -1 1 -7 -8 -10 -8 -5 -2 0 9 7 -1 4 4 -2 1 "), 1);
		assertEquals(DiagonalDifference.run("9 6 6 7 -10 9 -3 8 9 -1 9 7 -10 6 4 1 6 1 1 -1 -2 4 -6 1 -4 -6 3 9"
				+ " -8 7 6 -1 -6 -6 6 -7 2 -10 -4 9 1 -7 8 -5 3 -5 -8 -3 -4 2 -3 7 -5 1 -5 -2 -7 -4 8 3 -1 8 2 3 -3 "
				+ "4 6 -7 -7 -8 -3 9 -6 -2 0 5 4 4 4 -3 3 0"), 52);
	}
	
	@Test
	public void testPlusMinus(){
		assertEquals(PlusMinus.run("6 -4 3 -9 0 4 1"), "0.5\n0.3333333333333333\n0.16666666666666666");
	}
	
	@Test
	public void testStaircase(){
		assertEquals(Staircase.run("4"),"   #\n  ##\n ###\n####\n");
	}

}
