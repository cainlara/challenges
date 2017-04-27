package com.challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.challenges.PhoneExample;

public class PhoneExampleTests {

	@Test
	public void tests() {
		assertEquals("(123) 456-7890", PhoneExample.createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }));
	}
}
