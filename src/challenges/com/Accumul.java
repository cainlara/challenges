package challenges.com;

public class Accumul {

	public static String accum(String s) {
		String[] array = s.split("");
		StringBuilder builder = new StringBuilder();

		builder.append(array[0].toUpperCase());
		builder.append("-");

		for (int index = 1; index < array.length; index++) {
			builder.append(createEntry(array[index], index + 1));
			builder.append("-");
		}

		return builder.substring(0, builder.length() - 1);
	}

	private static String createEntry(String element, int iterations) {
		StringBuilder builder = new StringBuilder();

		for (int index = 0; index < iterations; index++) {
			if (index == 0) {
				builder.append(element.toUpperCase());
			} else {
				builder.append(element.toLowerCase());
			}
		}

		return builder.toString();
	}
}
