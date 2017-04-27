package challenges.com;

public class DeltaBits {
	public static int convertBits(int a, int b) {
		String binaryA = Integer.toBinaryString(a);
		String binaryB = Integer.toBinaryString(b);

		int largestDigitCount = 0;
		int differences = 0;

		if (binaryA.length() > binaryB.length()) {
			largestDigitCount = binaryA.length();
		} else {
			largestDigitCount = binaryB.length();
		}

		while (binaryA.length() < largestDigitCount) {
			binaryA = "0" + binaryA;
		}

		while (binaryB.length() < largestDigitCount) {
			binaryB = "0" + binaryB;
		}

		for (int index = 0; index < largestDigitCount; index++) {
			if (binaryA.charAt(index) != binaryB.charAt(index)) {
				differences++;
			}

		}

		return differences;
	}

}
