/**
 * @author Jakub Smal 
 * 22.01.2017 11:23:26
 */
package hackerrank.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hackerrank.algorithms.sorting.Intro;

public class Sortings {
	@Test
	public void testIntro() {
		assertEquals(Intro.run("4 6 1 4 5 7 9 12"),1);
		assertEquals(Intro.run("10 20 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20"), 9);
	}
}
