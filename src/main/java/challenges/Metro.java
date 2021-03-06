package challenges;

import java.util.List;

/*
 * Number of people in the bus
 * 
 * There is a bus moving in the city, and it takes and 
 * drop some people in each bus stop.
 * 
 * You are provided a list of integer array. Each integer 
 * array has two items which represent number of people 
 * get into bus (The first item) and number of people 
 * get off the bus (The second item).
 * 
 * The first integer array has 0 number in the second item, 
 * since the bus is empty in the first bus stop.
 * 
 * Your task is to return number of people in the bus after 
 * the last bus station. Take a look on the test cases :)
 * 
 * Please keep in mind that the test cases ensure that the 
 * number of people in the bus is always >= 0. So the return 
 * integer can't be negative.
 */
public class Metro {
  public static int countPassengers(List<int[]> stops) {
    int people = 0;
    if (stops != null && !stops.isEmpty()) {
      for (int[] stop : stops) {
        people += stop[0];
        people -= stop[1];
      }
    }

    return people;
  }
}
