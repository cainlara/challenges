package challenges;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import challenges.Tortoise;

public class TortoiseTest {

  @Test
  public void test1() {
    assertArrayEquals(new int[] { 0, 32, 18 }, Tortoise.race(720, 850, 70));
  }

  @Test
  public void test2() {
    assertArrayEquals(new int[] { 3, 21, 49 }, Tortoise.race(80, 91, 37));
  }

  @Test
  public void test3() {
    assertArrayEquals(new int[] { 2, 0, 0 }, Tortoise.race(80, 100, 40));
  }

}
