package challenges;

import java.math.BigInteger;

/*
 * In mathematics, the factorial of integer 'n' is 
 * written as 'n!'. It is equal to the product 
 * of n and every integer preceding it. 
 * 
 * For example: 5! = 1 x 2 x 3 x 4 x 5 = 120
 * 
 * Your mission is simple: write a function that takes 
 * an integer 'n' and returns 'n!'.
 * 
 * You are guaranteed an integer argument. For any values 
 * outside the positive range, return null, nil or None. 
 * For positive numbers a full length number is expected
 * for example, return 25! = '15511210043330985984000000' as a String!
 * 
 * Note: 
 * 0! is always equal to 1. Negative values should return null.
 */

public class Factorial {

  public static String calculateFactorial(int n) {
    String result = "";

    BigInteger calculated = fact(BigInteger.valueOf(n));

    result = calculated.toString();

    return result;
  }

  private static BigInteger fact(BigInteger number) {
    if (number.equals(BigInteger.ZERO)) {
      return BigInteger.ONE;
    }

    return number.multiply(fact(number.subtract(BigInteger.ONE)));
  }

}
