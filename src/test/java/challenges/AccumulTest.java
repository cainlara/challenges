package challenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.Accumul;

public class AccumulTest {

  @Test
  public void test1() {
    assertEquals("A-Bb-Ccc-Dddd", Accumul.accum("abcd"));
  }

  @Test
  public void test2() {
    assertEquals("D-Ff-Eee-Rrrr-Hhhhh-Gggggg", Accumul.accum("dferhg"));
  }
}
