package com.challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.challenges.TwoToOne;

public class TwoToOneTest {

	@Test
	public void test1() {
		assertEquals("abcdefklmopqwxy", TwoToOne.longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
	}
}
