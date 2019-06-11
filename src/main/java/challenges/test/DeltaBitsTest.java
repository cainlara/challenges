package challenges.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import challenges.DeltaBits;

public class DeltaBitsTest {

  @Test
  public void test() throws Exception {
    assertThat(DeltaBits.convertBits(31, 14), is(2));
  }

}
