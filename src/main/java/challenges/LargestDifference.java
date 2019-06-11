package challenges;

/*
 * The largestDifference takes an array of numbers. 
 * That array is not sorted. Do not sort it or change 
 * the order of the elements in any way, or their values.
 * 
 * Consider all of the pairs of numbers in the array 
 * where the first one is less than or equal to the 
 * second one.
 * 
 * From these, find a pair where their positions in 
 * the array are farthest apart.
 * 
 * Return the difference between the indexes of the two 
 * array elements in this pair.
 * 
 * Example:
 * 
 * LargestDifference.largestDifference(new int[]{1,2,3}); 
 * 
 * Returns 2, because here j = 2 and i = 0 and 2 - 0 = 2
 */
public class LargestDifference {
  public static int largestDifference(int[] data) {
    int difference = 0;

    if (data != null && data.length > 0) {
      for (int i = 0; i < data.length - 1; i++) {
        for (int j = i + 1; j < data.length; j++) {
          if (data[i] <= data[j]) {
            if (j - i > difference) {
              difference = j - i;
            }
          }
        }
      }
    }

    return difference;
  }
}
