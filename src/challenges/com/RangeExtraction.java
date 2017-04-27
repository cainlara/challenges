package challenges.com;

/*
 * A format for expressing an ordered list of integers 
 * is to use a comma separated list of either:
 * 
 * * individual integers
 * * a range of integers denoted by the starting integer 
 *   separated from the end integer in the range by a 
 *   dash, '-'. The range includes all integers in the interval 
 *   including both endpoints. It is not considered a range 
 *   unless it spans at least 3 numbers. For example ("12, 13, 15-17").
 *   
 * Complete the solution so that it takes a list of integers 
 * in increasing order and returns a correctly formatted string 
 * in the range format.
 * 
 * Example:
 * 
 * rangeExtraction(new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
 * # returns "-6,-3-1,3-5,7-11,14,15,17-20"
 */
public class RangeExtraction {

  public static String rangeExtraction(int[] arr) {
    String result = "";

    if (arr != null && arr.length > 0) {
      for (int index = 0; index < arr.length; index++) {
        int element = arr[index];
        result += element;
        
        int indexHelper = index + 1;
        
        while (indexHelper <= arr.length - 1 && arr[indexHelper] == element + 1) {
          element = arr[indexHelper];
          indexHelper++;
        }
        
        if (indexHelper >= index + 3) {
          index = indexHelper - 1;
          result += "-" + arr[index];
        }
        
        if (index < arr.length - 1) {
          result += ",";
        }
      }
    }

    return result;
  }

}
