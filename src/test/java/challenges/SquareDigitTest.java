package challenges;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.SquareDigit;

public class SquareDigitTest {

  @Test
  public void test() {
    assertEquals(811181, SquareDigit.squareDigits(9119));
  }
}
