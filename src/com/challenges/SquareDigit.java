package com.challenges;

/*
 * You are asked to square every digit of a number.
 * For example, if we run 9119 through the function, 811181 will come out.
 * 
 * Note: The function accepts an integer and returns an integer.
 */
public class SquareDigit {

	public static int squareDigits(int n) {
		String str = String.valueOf(n);
		StringBuilder builder = new StringBuilder();
		String[] array = str.split("");

		for (String c : array) {
			int digit = Integer.valueOf(c);
			builder.append(String.valueOf(digit * digit));
		}

		return Integer.valueOf(builder.toString());
	}
}
