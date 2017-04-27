package com.challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.challenges.NthSeries;

public class NthSeriesTest {

	@Test
	public void test1() {
		assertEquals("1.00", NthSeries.seriesSum(1));
	}

	@Test
	public void test2() {
		assertEquals("1.25", NthSeries.seriesSum(2));
	}

	@Test
	public void test3() {
		assertEquals("1.57", NthSeries.seriesSum(5));
	}
}
