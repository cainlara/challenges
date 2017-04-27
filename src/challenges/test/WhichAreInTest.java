package challenges.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import challenges.com.WhichAreIn;

public class WhichAreInTest {

	@Test
	public void test1() {
		String a[] = new String[] { "arp", "live", "strong" };
		String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
		String r[] = new String[] { "arp", "live", "strong" };
		assertArrayEquals(r, WhichAreIn.inArray(a, b));
	}

}
