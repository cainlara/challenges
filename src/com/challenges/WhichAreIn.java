package com.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given two arrays of strings a1 and a2 return a sorted array r in 
 * lexicographical order of the strings of a1 which are substrings 
 * of strings of a2.
 * 
 * Example 1:
 * a1 = ["arp", "live", "strong"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns ["arp", "live", "strong"]
 * 
 * Example 2:
 * a1 = ["tarp", "mice", "bull"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns []
 * 
 * Beware: r must be without duplicates.
 */
public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {
		String[] result = null;
		Set<String> areIn = null;
		List<String> areInList = null;

		if (array1 != null && array2 != null) {
			areIn = new HashSet<String>();

			for (String str1 : array1) {
				for (String str2 : array2) {
					if (str2.contains(str1)) {
						areIn.add(str1);
						break;
					}
				}
			}
		}

		if (areIn != null && !areIn.isEmpty()) {
			areInList = new ArrayList<>(areIn);
		} else {
			areInList = new ArrayList<>();
		}

		if (areInList != null && !areInList.isEmpty()) {
			Collections.sort(areInList);
			result = new String[areInList.size()];
			result = areInList.toArray(result);
		} else {
			result = new String[0];
		}

		return result;
	}
}
