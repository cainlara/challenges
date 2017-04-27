package com.challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.challenges.PiApprox;

public class PiApproxTest {

	@Test
	public void test1() {
		String res1 = "[10, 3.0418396189]";
		String res2 = PiApprox.iterPi2String(0.1);
		assertEquals(res1, res2);
	}
}
