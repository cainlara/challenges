package challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.com.Line;

public class LineTest {

	@Test
	public void test1() {
		assertEquals("NO", Line.tickets(new int[] {25, 100, 50}));
	}

	@Test
	public void test2() {
		assertEquals("YES", Line.tickets(new int[] {25, 25, 50}));
	}
}
