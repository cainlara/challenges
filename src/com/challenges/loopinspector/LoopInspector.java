package com.challenges.loopinspector;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given a node that is the beginning of a 
 * linked list. This list always contains a tail 
 * and a loop.
 * 
 * Your objective is to determine the length of the 
 * loop.
 * For example in the following picture the tail's 
 * size is 3 and the loop size is 6:
 * 
 *  O
 *   \
 *    O
 *     \
 *      O   O--O
 *       \ /    \
 *        O      O
 *         \    /
 *          O--O
 */
public class LoopInspector {

	public int loopSize(final Node node) {
		List<Node> reviewed = new ArrayList<>();
		Node current = node;
		
		while (!reviewed.contains(current)) {
			reviewed.add(current);
			current = current.getNext();
		}
		
		Node loopStarter = current;
		
		int count = 1;
		
		while (!current.getNext().equals(loopStarter)) {
			current = current.getNext();
			count++;
		}
		
		return count;
	}
}
