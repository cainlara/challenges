package com.challenges.test;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.Date;

import org.junit.Test;

import com.challenges.Fibonacci;

public class FibonacciTest {

  @Test
  public void testFib0() {
    testFib(0, 0);
  }

  @Test
  public void testFib1() {
    testFib(1, 1);
  }

  @Test
  public void testFib2() {
    testFib(1, 2);
  }

  @Test
  public void testFib3() {
    testFib(2, 3);
  }

  @Test
  public void testFib4() {
    testFib(3, 4);
  }

  @Test
  public void testFib5() {
    testFib(5, 5);
  }

  @Test
  public void testFib6() {
    testFib(-8, -6);
  }

  private static void testFib(long expected, long input) {
    try {
      Date start = new Date();
      BigInteger found = Fibonacci.fib(BigInteger.valueOf(input));
      Date end = new Date();
      
      System.out.println("For input " + input + " " + (end.getTime() - start.getTime()) + " millis");
      
      assertEquals(BigInteger.valueOf(expected), found);
    } catch (Throwable e) {
      throw new AssertionError("exception during test: " + e, e);
    }

  }

}
