package challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.CamelCaseMethod;

public class CamelCaseMethodTest {

  @Test
  public void test1() {
    assertEquals("For input \"test case\"", "TestCase", CamelCaseMethod.camelCase("test case"));
  }

  @Test
  public void test2() {
    assertEquals("For input \"camel case method\"", "CamelCaseMethod", CamelCaseMethod.camelCase("camel case method"));
  }

  @Test
  public void tes3() {
    assertEquals("For input \"say hello\"", "SayHello", CamelCaseMethod.camelCase("say hello"));
  }

  @Test
  public void tes4() {
    assertEquals("For input \"\"", "", CamelCaseMethod.camelCase(""));
  }

  @Test
  public void tes5() {
    assertEquals("For input \"mfr w  \"", "Mfrw", CamelCaseMethod.camelCase("mfr w  "));
  }
}
