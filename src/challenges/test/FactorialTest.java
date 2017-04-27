package challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import challenges.com.Factorial;

public class FactorialTest {

	@Test
	public void BasicTests() {
		assertEquals("1", Factorial.calculateFactorial(1));
		assertEquals("120", Factorial.calculateFactorial(5));
		assertEquals("362880", Factorial.calculateFactorial(9));
		 assertEquals("1307674368000", Factorial.calculateFactorial(15));
	}
}
