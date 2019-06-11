package challenges.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import challenges.FoldArray;

public class FoldArrayTest {
  private int[] inputA = new int[] { 1, 2, 3, 4, 5 };
  private int[] inputB = new int[] { -9, 9, -8, 8, 66, 23 };
  private int[] expected = null;

  @Test
  public void test1() {
    expected = new int[] { 6, 6, 3 };
    assertEquals(Arrays.toString(expected), Arrays.toString(FoldArray.foldArray(inputA, 1)));
  }

  @Test
  public void test2() {
    expected = new int[] { 9, 6 };
    assertEquals(Arrays.toString(expected), Arrays.toString(FoldArray.foldArray(inputA, 2)));
  }

  @Test
  public void test3() {
    expected = new int[] { 15 };
    assertEquals(Arrays.toString(expected), Arrays.toString(FoldArray.foldArray(inputA, 3)));
  }

  @Test
  public void test4() {
    expected = new int[] { 14, 75, 0 };
    assertEquals(Arrays.toString(expected), Arrays.toString(FoldArray.foldArray(inputB, 1)));
  }
}
