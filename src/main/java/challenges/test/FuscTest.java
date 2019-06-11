package challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.Fusc;

public class FuscTest {

  @Test
  public void tests() {
    assertEquals(0, Fusc.fusc(0));
    assertEquals(1, Fusc.fusc(1));
    assertEquals(21, Fusc.fusc(85));
  }

}
