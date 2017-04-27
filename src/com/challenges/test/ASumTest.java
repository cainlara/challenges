package com.challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.challenges.ASum;

public class ASumTest {
	@Test
	public void test0() {
		assertEquals(45, ASum.findNb(1071225));
	}
	
	@Test
	public void test1() {
		assertEquals(2022, ASum.findNb(4183059834009L));
	}

	@Test
	public void test2() {
		assertEquals(-1, ASum.findNb(24723578342962L));
	}

	@Test
	public void test3() {
		assertEquals(4824, ASum.findNb(135440716410000L));
	}

	@Test
	public void test4() {
		assertEquals(3568, ASum.findNb(40539911473216L));
	}

	@Test
	public void test5() {
		assertEquals(50022, ASum.findNb(1565314398694314009L));
	}
}
