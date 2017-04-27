package com.challenges;

/*
 * Professor Chambouliard hast just discovered a new type of magnet 
 * material. He put particles of this material in a box made of 
 * small boxes arranged in K rows and N columns as a kind of 2D matrix 
 * K x N where K and N are postive integers. He thinks that his 
 * calculations show that the force exerted by the particle in the 
 * small box (k, n) is:
 * 		
 * 		v(k, n) = 1 / (k ((n + 1) ^ (2 * k)))
 * 
 * Task:
 * To help Professor Chambouliard can we calculate the function 
 * doubles that will take as parameter maxk and maxn such that 
 * doubles(maxk, maxn) = S(maxk, maxn)? Experiences seems to show 
 * that this could be something around 0.7 when maxk and maxn are 
 * big enough.
 * 
 * Examples:
 * 		double(1, 3)  => 0.4236111111111111
 * 		double(1, 10) => 0.5580321939764581
 * 		double(10, 100) => 0.6832948559787737
 */
public class Magnets {
	public static double doubles(int maxk, int maxn) {
		double sum = 0;
		
		for (int k = 1; k <= maxk; k++) {
			for (int n = 1; n <= maxn; n++) {
				sum += 1 / (k * Math.pow(n + 1, 2 * k));
			}
		}
		
		return sum;
	}
}
