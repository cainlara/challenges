package com.challenges.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.challenges.Dec2Fact;

public class Dec2FactTest {

  @Test
  public void test1() {
    assertEquals(Dec2Fact.dec2FactString(1001L), "1212210");
  }

  @Test
  public void test2() {
    assertEquals(Dec2Fact.factString2Dec("1212210"), 1001L);
  }

  @Test
  public void test3() {
    assertEquals(Dec2Fact.factString2Dec("17747074033000"), 9876543210L);
  }

  @Test
  public void test4() {
    assertEquals(Dec2Fact.factString2Dec("14F9122694751231010"), 8150835199999999L);
  }

}
