package challenges;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import challenges.SqInRect;

public class SqInRectTest {

  @Test
  public void test1() {
    Random rand = new Random();

    int lng = rand.nextInt(50) + 1;
    int wdth = rand.nextInt(50) + 1;

    List<Integer> results = SqInRect.sqInRect(lng, wdth);
    System.out.println("Finding for " + lng + " x " + wdth + " area (" + lng * wdth + ")");
    System.out.println("Results : " + results);
    Assert.assertEquals(sumSquares(results), lng * wdth);

  }

  private int sumSquares(final List<Integer> results) {
    int sum = 0;

    for (int number : results) {
      sum += Math.pow(number, 2);
    }

    return sum;
  }
}
