package com.challenges;

import java.util.ArrayList;
import java.util.List;

/*
 * Coding decimal numbers with factorials is a way of writing 
 * out numbers in a base system that depends on factorials, 
 * rather than powers of numbers.
 * 
 * In this system, the last digit is always 0 and is in base 0!.
 * The digit before that is either 0 or 1 and is in base 1!. 
 * The digit before that is either 0, 1, or 2 and is in base 2!. 
 * More generally, the nth-to-last digit in always 0, 1, 2, ..., or n 
 * and is in base n!.
 * 
 * Example : decimal number 463 is coded as "341010"
 * because 463 (base 10) = 3×5! + 4×4! + 1×3! + 0×2! + 1×1! + 0×0!
 * If we are limited to digits 0...9 the biggest number we can code is 10! - 1.
 * 
 * So we extend 0..9 with letters A to Z. With these 36 digits we 
 * can code up to 36! − 1 = 37199332678990121746799944815083519999999910 (base 10)
 * 
 * We code two functions, the first one will code a decimal number and 
 * return a string with the factorial representation : "dec2FactString(nb)"
 * the second one will decode a string with a factorial representation and 
 * produce the decimal representation : "factString2Dec(str)".
 * 
 * Given numbers will be positive.
 */
public class Dec2Fact {
  private static final String[] ABC = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
      "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

  public static String dec2FactString(long nb) {
    long divisor = 1;
    long dividend = nb;

    List<Long> digits = new ArrayList<>();

    while (dividend > 0) {
      digits.add(dividend % divisor);
      dividend /= divisor;
      divisor++;
    }

    StringBuilder builder = new StringBuilder();
    for (int index = digits.size() - 1; index >= 0; index--) {
      long current = digits.get(index);

      if (current < 10) {
        builder.append(current);
      } else {
        builder.append(ABC[(int) (current - 10l)]);
      }
    }

    return builder.toString();
  }

  public static long factString2Dec(String str) {
    long result = 0;
    int number = 0;

    for (int index = str.length() - 1; index >= 0; index--) {
      int arrayPosition = -1;
      String current = str.substring(index, index + 1);

      for (int arrayIndex = 0; arrayIndex < ABC.length; arrayIndex++) {
        if (ABC[arrayIndex].equals(current)) {
          arrayPosition = arrayIndex;
          break;
        }
      }

      int digit = 0;

      if (arrayPosition >= 0) {
        digit = arrayPosition + 10;
      } else {
        digit = Integer.valueOf(current);
      }

      result += (digit * fact(number));
      number++;
    }

    return result;
  }

  private static long fact(int number) {
    long result = 1;
    int current = 2;

    if (number <= 1) {
      result = 1;
    } else if (number == 2) {
      result = 2;
    } else {
      while (current <= number) {
        result *= current;
        current++;
      }
    }

    return result;
  }

}
