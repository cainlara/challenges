package com.challenges.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.challenges.DirReduction;

public class DirReductionTest {

	@Test
	public void test1() throws Exception {
		assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
				new String[] { "WEST" },
				DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }));
	}

	//
	@Test
	public void test2() throws Exception {
		assertArrayEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"", new String[] { "NORTH", "WEST", "SOUTH", "EAST" },
				DirReduction.dirReduc(new String[] { "NORTH", "WEST", "SOUTH", "EAST" }));
	}

	@Test
	public void test3() throws Exception {
		assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\"", new String[] {},
				DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH" }));
	}

	@Test
	public void test4() throws Exception {
		assertArrayEquals("\"NORTH\", \"SOUTH\", \"EAST\", \"WEST\"", new String[] { "NORTH" },
				DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "EAST", "WEST", "NORTH" }));
	}
	
	@Test
	public void test5() throws Exception {
		assertArrayEquals("\"NORTH\", \"SOUTH\", \"EAST\", \"WEST\"", new String[] { },
				DirReduction.dirReduc(new String[] { "NORTH", "SOUTH", "EAST", "WEST" }));
	}

}
