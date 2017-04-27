package challenges.com;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a function called validBraces that takes a 
 * string of braces, and determines if the order of 
 * the braces is valid. validBraces should return 
 * true if the string is valid, and false if it's 
 * invalid.
 * 
 * This Kata is similar to the Valid Parentheses Kata, 
 * but introduces four new characters. Open and closed 
 * brackets, and open and closed curly braces. 
 * Thanks to @arnedag for the idea!
 * 
 * All input strings will be nonempty, and will only 
 * consist of open parentheses '(' , closed parentheses ')', 
 * open brackets '[', closed brackets ']', open curly 
 * braces '{' and closed curly braces '}'.
 * 
 * What is considered Valid? A string of braces is 
 * considered valid if all braces are matched with the 
 * correct brace.
 * 
 * Examples: 
 *     validBraces( "(){}[]" ) => returns true 
 *     validBraces( "(}" ) => returns false 
 *     validBraces( "[(])" ) => returns false 
 *     validBraces( "([{}])" ) => returns true 
 */
public class BraceChecker {

	public boolean isValid(String braces) {
		Map<String, String> map = new HashMap<>();
		map.put("(", ")");
		map.put("[", "]");
		map.put("{", "}");
		map.put(")", "(");
		map.put("]", "[");
		map.put("}", "{");

		return remove(map, braces.trim(), braces.trim().length() > 0);
	}

	private boolean remove(final Map<String, String> map, final String braces, boolean isValid) {
		if (braces.length() > 0 && isValid) {
			char[] charArray = braces.toCharArray();

			String complement = map.get(String.valueOf(charArray[0]));

			if (complement != null) {
				boolean repeated = false;

				for (int index = 1; index < charArray.length; index++) {
					if (charArray[index] == charArray[0]) {
						repeated = true;
						break;
					}
				}

				int closerPosition = -1;

				if (repeated) {
					closerPosition = braces.lastIndexOf(complement);
				} else {
					closerPosition = braces.indexOf(complement, 1);
				}

				String newBraces = null;

				if (closerPosition < 0) {
					newBraces = "";
					isValid = false;
				} else {
					newBraces = braces.substring(1, closerPosition);
					isValid = true;
				}

				return remove(map, newBraces, isValid);
			}

			return remove(map, "", false);
		}

		return isValid;
	}
}
