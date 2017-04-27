package com.challenges;

/*
 * Your task is to sort a given string. Each word in the String 
 * will contain a single number. This number is the position 
 * the word should have in the result.
 * 
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input String is empty, return an empty String. The 
 * words in the input String will only contain valid consecutive numbers.
 * 
 * For an input: "is2 Thi1s T4est 3a" the function should 
 * return "Thi1s is2 3a T4est"
 */
public class Order {
	public static String order(String words) {
		StringBuilder builder = new StringBuilder("");

		String[] singles = words.split(" ");
		String[] fixed = new String[singles.length];

		if (words != null && words.length() > 0) {
			for (String word : singles) {
				int number = getNumberFromWord(word.trim());
				fixed[number - 1] = word.trim();
			}

			for (String fixedWord : fixed) {
				builder.append(fixedWord);
				builder.append(" ");
			}

		}

		return builder.toString().trim();
	}

	private static int getNumberFromWord(final String word) {
		for (int number = 1; number < 10; number++) {
			if (word.contains(String.valueOf(number))) {
				return number;
			}
		}

		return 0;
	}
}
