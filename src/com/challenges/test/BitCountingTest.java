package com.challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.challenges.BitCounting;

public class BitCountingTest {

	@Test
	public void test() {
		assertEquals(5, BitCounting.countBits(1234));
	}
}
