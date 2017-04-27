package com.challenges.array2tree;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArrayToTreeTest {

	// @Test
	// public void emptyArray() {
	// TreeNode expected = null;
	// assertThat(ArrayToTree.arrayToTree(arrayFrom()), is(expected));
	// }

//	@Test
//	public void arrayWithMultipleElements() {
//		TreeNode expected = new TreeNode(17, new TreeNode(0, new TreeNode(3), new TreeNode(15)), new TreeNode(-4));
//		assertThat(ArrayToTree.arrayToTree(arrayFrom(17, 0, -4, 3, 15)), is(expected));
//	}
	
	@Test
	public void arrayWithMultipleElements2() {
		TreeNode expected = new TreeNode(17, 
				new TreeNode(0, 
						new TreeNode(3, 
								new TreeNode(7), 
								null), 
						new TreeNode(15)), 
				new TreeNode(-4, 
						new TreeNode(5), 
						new TreeNode(6)));
		assertThat(ArrayToTree.arrayToTree(arrayFrom(17, 0, -4, 3, 15, 5, 6, 7)), is(expected));
	}

	private int[] arrayFrom(int... values) {
		return values;
	}

}
