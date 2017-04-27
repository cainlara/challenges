package com.challenges;

import java.math.BigInteger;

/*
 * The year is 1214. One night, Pope Innocent III awakens to find 
 * the the archangel Gabriel floating before him. Gabriel thunders 
 * to the pope:
 *    
 *    Gather all of the learned men in Pisa, especially 
 *    Leonardo Fibonacci. In order for the crusades in 
 *    the holy lands to be successful, these men must calculate 
 *    the millionth number in Fibonacci's recurrence. Fail to 
 *    do this, and your armies will never reclaim the holy land. It is His will.
 *
 * The angel then vanishes in an explosion of white light.
 * 
 * Pope Innocent III sits in his bed in awe. How much is a million? 
 * he thinks to himself. He never was very good at math.
 * 
 * He tries writing the number down, but because everyone in Europe 
 * is still using Roman numerals at this moment in history, he 
 * cannot represent this number. If he only knew about the invention 
 * of zero, it might make this sort of thing easier.
 * 
 * He decides to go back to bed. He consoles himself, The Lord would 
 * never challenge me thus; this must have been some deceit by the 
 * devil. A pretty horrendous nightmare, to be sure.
 * 
 * Pope Innocent III's armies would go on to conquer Constantinople 
 * (now Istanbul), but they would never reclaim the holy land as he desired.
 * 
 * You will have to calculate fib(n) where:
 *             fib(0) := 0
 *             fib(1) := 1
 *             fin(n + 2) := fib(n + 1) + fib(n)
 *             
 * Write an algorithm that can handle n where 
 *             1000000 ≤ n ≤ 1500000.
 * 
 * Your algorithm must output the exact integer answer, to full 
 * precision. Also, it must correctly handle negative numbers as input.
 */
public class Fibonacci {
  private static final BigInteger TWO = BigInteger.valueOf(2);

  public static BigInteger fib(final BigInteger n) {
    BigInteger a = BigInteger.ONE;
    BigInteger b = BigInteger.ZERO;
    BigInteger p = BigInteger.ZERO;
    BigInteger q = BigInteger.ONE;
    BigInteger result = fibIter(a, b, p, q, n);
    
    if (n.signum() < 0) {
      result = result.multiply(BigInteger.valueOf(-1));
    }

    return result;
  }

  public static BigInteger fibIter(BigInteger a, BigInteger b, BigInteger p, BigInteger q, final BigInteger count) {
    if (count.equals(BigInteger.ZERO)) {
      return b;
    } else if (count.mod(TWO).equals(BigInteger.ZERO)) {
      return fibIter(a, b, p.pow(2).add(q.pow(2)), TWO.multiply(p).multiply(q).add(q.pow(2)), count.divide(TWO));
    } else {
      return fibIter(b.multiply(q).add(a.multiply(q)).add(a.multiply(p)), b.multiply(p).add(a.multiply(q)), p, q,
          count.signum() > 0 ? count.subtract(BigInteger.ONE) : count.add(BigInteger.ONE));
    }
  }

}
