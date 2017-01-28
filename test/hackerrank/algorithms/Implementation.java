/**
 * @author Jakub Smal 
 * 22.01.2017 11:40:09
 */
package hackerrank.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hackerrank.algorithms.implementation.easy.AppleAndOrange;
import hackerrank.algorithms.implementation.easy.BetweenTwoSets;
import hackerrank.algorithms.implementation.easy.BonAppetit;
import hackerrank.algorithms.implementation.easy.DesignerPDFViewer;
import hackerrank.algorithms.implementation.easy.DivisibleSumPairs;
import hackerrank.algorithms.implementation.easy.Kangaroo;
import hackerrank.algorithms.implementation.easy.MiniMaxSum;

public class Implementation {
	@Test
	public void testMiniMaxSum() {

		assertEquals(MiniMaxSum.run("1 2 3 4 5"), "10 14");
		assertEquals(MiniMaxSum.run("5 5 5 5 5"), "20 20");
		assertEquals(MiniMaxSum.run("100 200 300 440 1"), "601 1040");
	}
	
	@Test
	public void testPDFViewer() {

		assertEquals(DesignerPDFViewer.run("1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 abc"), "9");
		assertEquals(DesignerPDFViewer.run("6 3 6 3 1 7 3 7 1 6 7 4 7 4 3 2 4 2 5 4 3 6 7 6 2 5 tehwrcxhnq"), "70");
		assertEquals(DesignerPDFViewer.run("4 2 1 2 3 4 3 7 4 1 5 6 1 3 2 6 6 3 7 3 1 1 5 1 1 4 qjhwkcexec"), "70");
	}
	
	@Test
	public void testAppleAndOrange() {

		assertEquals(AppleAndOrange.run("7 11 5 15 3 2 -2 2 1 5 -6"), "1\n1");
		assertEquals(AppleAndOrange.run("2 3 1 5 1 1 -2 -1"), "0\n0");
	}
	
	@Test
	public void testKangaroo(){
		assertEquals(Kangaroo.run("0 3 4 2"), "YES");
		assertEquals(Kangaroo.run("0 2 5 3"), "NO");
		assertEquals(Kangaroo.run("14 4 98 2"), "YES");
		assertEquals(Kangaroo.run("43 2 70 2"), "NO");
	}
	
	@Test
	public void testBetweenTwoSets(){
		assertEquals(BetweenTwoSets.run("2 3\n2 4\n16 32 96"), "3");
		assertEquals(BetweenTwoSets.run("3 2\n2 3 6\n42 84"), "2");
		assertEquals(BetweenTwoSets.run("1 1\n1\n100"), "9");
	}
	
	@Test
	public void testDivisibleSumPairs(){
		assertEquals(DivisibleSumPairs.run("6 3\n1 3 2 6 1 2"), 5);
	}

	@Test
	public void testBonAppetit(){
		assertEquals(BonAppetit.run("4 1\n3 10 2 9\n12"), "5");
		assertEquals(BonAppetit.run("4 1\n3 10 2 9\n7"), "Bon Appetit");
	}
	
	
}
