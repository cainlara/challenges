package com.challenges;

/*
 * You need to return a string that displays a diamond 
 * shape on the screen using asterisk ("*") characters. 
 * Please see provided test cases for exact output format.
 * 
 * The shape that will be returned from print method 
 * resembles a diamond, where the number provided as input 
 * represents the number of *’s printed on the middle line. 
 * The line above and below will be centered and will have 
 * 2 less *’s than the middle line. This reduction by 2 *’s 
 * for each line continues until a line with a single * is 
 * printed at the top and bottom of the figure.
 * 
 * Return null if input is even number or negative (as it 
 * is not possible to print diamond with even number or negative number).
 */
public class Diamond {
	public static String print(int n) {
		String result = null;

		if (n > 0 && n % 2 == 1) {
			String[] diamondArray = new String[n];
			int diamondLevel = 0;

			for (int stars = 1; stars <= n; stars += 2) {
				int blanks = n - stars;
				int blanksPerSide = blanks / 2;

				StringBuilder levelBuilder = new StringBuilder();
				for (int index = 0; index < blanksPerSide; index++) {
					levelBuilder.append(" ");
				}

				for (int index = 0; index < stars; index++) {
					levelBuilder.append("*");
				}

				diamondArray[diamondLevel] = levelBuilder.toString();
				diamondLevel++;
				diamondArray[n - diamondLevel] = levelBuilder.toString();
			}

			StringBuilder diamondBuilder = new StringBuilder();

			for (int index = 0; index < diamondArray.length; index++) {
				diamondBuilder.append(diamondArray[index]);

				diamondBuilder.append("\n");
			}

			result = diamondBuilder.toString();
		}

		return result;
	}

}
