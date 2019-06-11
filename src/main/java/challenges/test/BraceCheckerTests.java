package challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.BraceChecker;

public class BraceCheckerTests {

  private BraceChecker checker = new BraceChecker();

//	@Test
//	public void test1() {
//		assertEquals(true, checker.isValid("()"));
//	}
//
//	@Test
//	public void test2() {
//		assertEquals(true, checker.isValid("[]"));
//	}
//
//	@Test
//	public void test3() {
//		assertEquals(true, checker.isValid("{}"));
//	}
//
//	@Test
//	public void test4() {
//		assertEquals(true, checker.isValid("(){}[]"));
//	}
//
//	@Test
//	public void test5() {
//		assertEquals(true, checker.isValid("([{}])"));
//	}

  @Test
  public void test6() {
    assertEquals(true, checker.isValid("({})[({})]"));
  }

//	@Test
//	public void test7() {
//		assertEquals(false, checker.isValid("[(])"));
//	}
//
//	@Test
//	public void test8() {
//		assertEquals(false, checker.isValid("(}"));
//	}
//
//	@Test
//	public void test9() {
//		assertEquals(false, checker.isValid("[(])"));
//	}
}
