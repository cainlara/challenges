package challenges;

import java.util.ArrayList;
import java.util.List;

/*
 * We want to find the numbers higher or equal than 1000 
 * that the sum of every four consecutives digits cannot 
 * be higher than a certain given value. If the number 
 * is num = d1d2d3d4d5d6, and the maximum sum of 4 contiguous 
 * digits is maxSum, then:
 * 
 *   d1 + d2 + d3 + d4 <= maxSum
 *   d2 + d3 + d4 + d5 <= maxSum
 *   d3 + d4 + d5 + d6 <= maxSum
 *   
 * For that purpose, we need to create a function, maxSumDig(), 
 * that receives nMax, as the max value of the interval to 
 * study (the range (1000, nMax) ), and a certain value, maxSum, 
 * the maximum sum that every four consecutive digits should be 
 * less or equal to. The function should output the following 
 * list with the data detailed bellow:
 * 
 *   [(1), (2), (3)]
 *   
 *   (1) - the amount of numbers that satisfy the constraint 
 *   presented above
 *   (2) - the closest number to the mean of the results, if 
 *   there are more than one, the smallest number should be chosen.
 *   (3) - the total sum of all the found numbers.
 *   
 * Let's see a case with all the details:
 *   max_sumDig(2000, 3) -------> [11, 1110, 12555]
 *   (1) -There are 11 found numbers: 1000, 1001, 1002, 
 *    1010, 1011, 1020, 1100, 1101, 1110, 1200 and 2000
 *   
 *   (2) - The mean of all the found numbers is:
 *    (1000 + 1001 + 1002 + 1010 + 1011 + 1020 + 1100 + 
 *    1101 + 1110 + 1200 + 2000) /11 = 1141.36363,  
 *    so 1110 is the number that is closest to that mean value.
 *    
 *   (3) - 12555 is the sum of all the found numbers
 *    1000 + 1001 + 1002 + 1010 + 1011 + 1020 + 1100 + 1101 + 
 *    1110 + 1200 + 2000 = 12555
 */
public class MaxSumDigits {
  public static long[] maxSumDig(long nmax, int maxsm) {
    List<Integer> resultList = new ArrayList<>();
    long[] result = new long[3];

    for (int current = 1000; current <= nmax; current++) {
      String currentStr = String.valueOf(current);
      char[] charArray = currentStr.toCharArray();
      int[] intArray = new int[charArray.length];

      for (int index = 0; index < charArray.length; index++) {
        intArray[index] = Character.getNumericValue(charArray[index]);
      }

      boolean isValid = true;

      for (int index = 0; index < intArray.length; index++) {
        if (index + 4 <= intArray.length) {
          int sum = 0;

          for (int innerIndex = index; innerIndex < index + 4; innerIndex++) {
            sum += intArray[innerIndex];
          }

          if (sum > maxsm) {
            isValid = false;
          }
        }
      }

      if (isValid) {
        resultList.add(current);
      }
    }

    if (!resultList.isEmpty()) {
      double sum = 0;

      for (int number : resultList) {
        sum += number;
      }

      double mean = sum / resultList.size();

      double diff = nmax;
      int closest2mean = 0;

      for (int number : resultList) {
        if (Math.abs(mean - number) < diff) {
          diff = Math.abs(mean - number);
          closest2mean = number;
        }
      }

      result[0] = resultList.size();
      result[1] = closest2mean;
      result[2] = (long) sum;
    }

    return result;
  }
}
