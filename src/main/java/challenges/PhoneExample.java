package challenges;

/*
 * Write a function that accepts an array of 10 integers 
 * (between 0 and 9), that returns a string of those 
 * numbers in the form of a phone number.
 * 
 * Example:
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) 
 * returns "(123) 456-7890"
 * 
 * The returned format must be correct in order to complete this challenge. 
 * Don't forget the space after the closing parenthese!
 */
public class PhoneExample {
  public static String createPhoneNumber(int[] numbers) {
    StringBuilder builder = new StringBuilder();

    if (numbers != null && numbers.length == 10) {
      builder.append("(");

      for (int index = 0; index < 3; index++) {
        builder.append(numbers[index]);
      }

      builder.append(") ");

      for (int index = 3; index < 6; index++) {
        builder.append(numbers[index]);
      }

      builder.append("-");

      for (int index = 6; index < numbers.length; index++) {
        builder.append(numbers[index]);
      }
    }

    return builder == null ? null : builder.toString();
  }

}
