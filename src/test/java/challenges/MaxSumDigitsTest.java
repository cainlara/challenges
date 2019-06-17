package challenges;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import challenges.MaxSumDigits;

public class MaxSumDigitsTest {

  private static void testing(long nmx, int mxsm, long[] res) {
    assertEquals(Arrays.toString(res), Arrays.toString(MaxSumDigits.maxSumDig(nmx, mxsm)));
  }

//	@Test
//	public void test0() {
//		System.out.println("Basic Tests");
//		testing(2000, 3, new long[] { 11, 1110, 12555 });
//		testing(2000, 4, new long[] { 21, 1120, 23665 });
//		testing(2000, 7, new long[] { 85, 1200, 99986 });
//		testing(3000, 7, new long[] { 141, 1600, 220756 });
//		testing(4000, 4, new long[] { 35, 2000, 58331 });
//	}

  @Test
  public void test1() {
    testing(39815, 3, new long[] { 57, 12000, 667248 });
  }
}
