package challenges.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Take 2 strings s1 and s2 including only letters from ato z. 
 * Return a new sorted string, the longest possible, containing 
 * distinct letters, - each taken only once - coming from s1 or s2.
 * 
 * EXAMPLES:
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 * 
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
public class TwoToOne {

	public static String longest(String s1, String s2) {
		String result = null;
		Set<Character> resultSet = new HashSet<>();
		List<Character> resultList = new ArrayList<>();

		char[] first = s1.toCharArray();
		char[] second = s2.toCharArray();

		for (char c : first) {
			resultSet.add(Character.valueOf(c));
		}

		for (char c : second) {
			resultSet.add(Character.valueOf(c));
		}

		resultList.addAll(resultSet);
		Collections.sort(resultList, new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				return o1.compareTo(o2);
			}
		});

		StringBuilder builder = new StringBuilder();

		for (Character ch : resultList) {
			builder.append(ch.charValue());
		}

		result = builder.toString();

		return result;
	}
}
