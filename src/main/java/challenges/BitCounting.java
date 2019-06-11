package challenges;

/*
 * Write a function that takes an (unsigned) integer as input, and 
 * returns the number of bits that are equal to one in the binary 
 * representation of that number.
 * 
 * Example: The binary representation of 1234 is 10011010010, so 
 * the function should return 5 in this case.
 */
public class BitCounting {

  public static int countBits(int n) {
    String binaryRep = Integer.toBinaryString(n);
    int count = 0;

    char[] charArray = binaryRep.toCharArray();

    for (char charElement : charArray) {
      count += charElement == '1' ? 1 : 0;

    }

    return count;
  }
}