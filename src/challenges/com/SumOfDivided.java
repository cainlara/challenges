package challenges.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfDivided {

  /*
   * Given an array of positive or negative integers
   * 
   * I= [i1,..,in]
   * 
   * you have to produce a sorted array P of the form [ [p, sum of all ij of I
   * for which p is a prime factor (p positive) of ij] ...]
   * 
   * P will be sorted by increasing order of the prime numbers. The final result
   * has to be given as a string in Java.
   * 
   * Example: I = {12, 15}; // result = "(2 12)(3 27)(5 15)" [2, 3, 5] is the
   * list of all prime factors of the elements of I, hence the result.
   * 
   * Notes: It can happen that a sum is 0 if some numbers are negative!
   * 
   * Example: I = [15, 30, -45] 5 divides 15, 30 and (-45) so 5 appears in the
   * result, the sum of the numbers for which 5 is a factor is 0 so we have [5,
   * 0] in the result amongst others.
   */
  public static String sumOfDivided(int[] l) {
    String result = "";

    if (l != null && l.length > 0) {
      Set<Integer> factors = new HashSet<>();

      for (int current : l) {
        for (int divisor = 2; divisor <= current; divisor++) {
          if (current % divisor == 0) {
            factors.add(divisor);
          }
        }
      }

      Set<Integer> primeFactors = new HashSet<>();

      for (int factor : factors) {
        boolean isPrime = true;

        for (int n = 2; n < ((factor / 2) + 1); n++) {
          if (factor % n == 0) {
            isPrime = false;
            break;
          }
        }

        if (isPrime) {
          primeFactors.add(factor);
        }
      }

      List<Integer> sortedPrimeFactors = new ArrayList<>();
      sortedPrimeFactors.addAll(primeFactors);
      Collections.sort(sortedPrimeFactors);

      for (int primeFactor : sortedPrimeFactors) {
        int sum = 0;

        for (int current : l) {
          if (current % primeFactor == 0) {
            sum += current;
          }
        }

        result += "(" + primeFactor + " " + sum + ")";
      }
    }

    return result;
  }
}
