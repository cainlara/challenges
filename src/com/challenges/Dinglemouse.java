package com.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * A 6-sided die is rolled a number of times and the results are 
 * plotted as a character-based histogram.
 * 
 *    Example:
 *        10
 *        #
 *        #
 *    7   #
 *    #   #
 *    #   #     5
 *    #   #     #
 *    # 3 #     #
 *    # # #     #
 *    # # # 1   #
 *    # # # #   #
 *    -----------
 *    1 2 3 4 5 6
 * 
 * Task
 * You will be passed all the dice roll results, and your task is 
 * to write the code to return a string representing a histogram, 
 * so that when it is printed it has the same format as the example.
 * 
 * Notes
 *  There are no trailing spaces on the lines.
 *  All lines (including the last) end with a newline \n.
 *  A count is displayed above each bar (unless the count is 0).
 *  The number of rolls may vary but is always less than 100.
 */
public class Dinglemouse {
  public static String histogram(final int results[]) {
    Map<Integer, Integer> resultsMap = new HashMap<>();
    StringBuilder builder = new StringBuilder();

    int higherKey = -1;
    resultsMap.put(higherKey, -1);

    for (int index = 0; index < results.length; index++) {
      resultsMap.put(index + 1, results[index]);

      if (resultsMap.get(index + 1).intValue() > resultsMap.get(higherKey).intValue()) {
        higherKey = index + 1;
      }
    }

    int start = resultsMap.get(higherKey);
    List<Integer> markers = new ArrayList<>();
    markers.add(-1);

    for (int line = start; line >= 0; line--) {
      String currentLine = "";
      for (int number = 1; number < 7; number++) {
        int value = resultsMap.get(number).intValue();

        if (line == value) {
          currentLine += value == 0 ? " " : value;
          markers.add(number);

          if (value < 10 && number < 6) {
            currentLine += " ";
          }
        } else {
          if (markers.contains(number)) {
            currentLine += "#";
          } else {
            currentLine += " ";
          }

          if (number < 6) {
            currentLine += " ";
          }
        }
      }
      
      String fixedLine = currentLine.replaceFirst("\\s++$", "");
      
      if (fixedLine.length() > 0) {
        builder.append(fixedLine + "\n");
      }
    }

    builder.append("-----------\n1 2 3 4 5 6\n");

    return builder.toString();
  }
}
