package challenges.com;

/*
 * The aim of the kata is to try to show how difficult it can be 
 * to calculate decimals of an irrational number with a certain 
 * precision. We have chosen to get a few decimals of the 
 * number "pi" using the following infinite series (Leibniz 1646–1716):
 * 
 * PI / 4 = 1 - 1/3 + 1/5 - 1/7 + ... which gives an approximation of PI / 4.
 * 
 * To have a measure of the difficulty we will count how many iterations 
 * are needed to calculate PI with a given precision.
 * 
 * There are several ways to determine the precision of the calculus but 
 * to keep things easy we will calculate to within epsilon of your 
 * language Math::PI constant. In other words we will stop the iterative 
 * process when the absolute value of the difference between our calculation 
 * and the Math::PI constant is less than epsilon.
 * 
 * Your function
 * 
 * iterPi2String(epsilon) must return a string : "[numberOfIterations, approximationOfPi]"
 * 
 * where approximation of PI has 10 decimals.
 * 
 * Examples :
 * 
 * your function calculates 1000 iterations and 3.140592653839794 but returns:
 * iterPi2String(0.001) --> "[1000, 3.1405926538]"
 */
public class PiApprox {

	public static String iterPi2String(Double epsilon) {
		double sum = 1;
		int signed = -1;
		double current = 3;
		int iterations = 1;

		do {
			double factor = ((1 / current) * signed);
			sum += factor;
			signed *= -1;
			current += 2;
			iterations++;

			System.out.println(iterations);
			System.out.println(factor);
			System.out.println(sum);

		} while (Math.PI - (sum * 4) > epsilon);

		return null;
	}
}
