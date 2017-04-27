package challenges.com;

import java.util.ArrayList;
import java.util.List;

/*
 * You will be given two dimensions
 * 
 * 1. a positive integer length (parameter named lng)
 * 2. a positive integer width (parameter named wdth)
 * 
 * You will return an array with the size of each of the squares.
 */
public class SqInRect {
	public static List<Integer> sqInRect(int lng, int wdth) {
		List<Integer> result = null;

		if (lng != wdth) {
			result = new ArrayList<>();

			int area = lng * wdth;

			int lowerSide = -1;

			if (lng < wdth) {
				lowerSide = lng;
			} else {
				lowerSide = wdth;
			}

			while (area > 3) {
				if (lowerSide * lowerSide > area) {
					lowerSide--;
				} else {
					area -= (lowerSide * lowerSide);
					result.add(lowerSide);
				}
			}

			while (area > 0) {
				result.add(1);
				area--;
			}
		}

		return result;
	}
}
