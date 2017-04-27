package com.challenges;

/*
 * Write simple .camelcase method for strings. 
 * All words must have their first letter capitalized without spaces.
 * If there is a single letter word, it must not be capitalized.
 */
public class CamelCaseMethod {
	public static String camelCase(final String string) {
		StringBuilder builder = null;

		if (string != null && !string.trim().equals("")) {
			String[] strArray = string.split(" ");
			builder = new StringBuilder();

			for (String word : strArray) {
				if (word.length() > 1) {
					builder.append(word.substring(0, 1).toUpperCase());
					builder.append(word.substring(1, word.length()));
				} else {
					builder.append(word);
				}
			}
		}

		return builder == null ? "" : builder.toString();
	}
}
