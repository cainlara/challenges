package com.challenges;

/*
 * Here you will create the classic pascal's triangle. 
 * Your function will be passed the depth of the triangle 
 * and you code has to return the corresponding pascal 
 * triangle upto that depth.
 * 
 * The triangle should be returned as a nested array.
 * 
 * for example:
 * PascalsTriangle.pascal(5); 
 * // should return [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 
 * To build the triangle, start with a single 1 at the top, 
 * for each number in the next row you just take the two numbers 
 * above it and add them together (except for the edges, which 
 * are all "1"). eg
 *       [1]
 *     [1   1]
 *   [1   2   1]
 * [1   3   3   1]
 * 
 * here you get the 3 by adding the 2 and 1 above it.
 */

public class PascalsTriangle {

	public static int[][] pascal(int depth) {
		int[][] result = new int[depth][];
		
		int level = 0;
		int [] currentLevel = new int [] {1};
		result [level] = currentLevel;
		level++;
		
		while (level < depth) {
			currentLevel = new int [level + 1];
			currentLevel[0] = 1;
			
			for (int index = 1; index < level + 1; index++) {
				currentLevel[index] = result[level -1][index - 1] + result[level - 1][index < result[level - 1].length ? index : result[level - 1].length - 1]; 
			}
			currentLevel[level] = 1;
			result[level] = currentLevel;
			level++;
		}
		
		return result;
	}

}
