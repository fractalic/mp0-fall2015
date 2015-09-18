package fibonacci1;

import java.util.ArrayList;

public class Fibonacci {
	/**
	 * Return the n<sup>th</sup> Fibonacci number. The n<sup>th</sup> Fibonacci
	 * number is defined as follows:<br />
	 * Fibonacci( 0 ) = 0<br />
	 * Fibonacci( 1 ) = 1<br />
	 * Fibonacci( n ) = Fibonacci( n-1 ) + Fibonacci( n-2 ) for n > 1<br />
	 * 
	 * @param n
	 *            n >= 0 (Fibonacci numbers are defined only for non-negative
	 *            integers)
	 * @return the n<sup>th</sup> Fibonacci number
	 */
	public static long getFibonacci(int n) {
		// Compute the Fibonacci Sequence from the bottom up.
		long[] arrFibTriad = new long[3];
		arrFibTriad[0] = 0; arrFibTriad[1] = 1;
		/* Consider three numbers in the sequence at once.
		 * Form the third number by adding the first two,
		 * then shift all numbers down (move to the next
		 * set of three numbers).
		 */
		for (int i = 1; i < n; i++) {
			arrFibTriad[2] = arrFibTriad[0] + arrFibTriad[1];
			arrFibTriad[0] = arrFibTriad[1];
			arrFibTriad[1] = arrFibTriad[2];
		}
		
		if (n == 0) return 0;
		else if (n == 1) return 1;
		return arrFibTriad[2]; // Return the nth Fibonacci number
		return arrFib.get(n);
	}

	/**
	 * This main method prints the first M Fibonacci numbers. It also computes
	 * the time taken to compute each Fibonacci number and prints the time taken
	 * as well.
	 * 
	 * @param args
	 *            This method does not use any arguments
	 */
	public static void main(String[] args) {
		// One should not have to modify this method other than to change the
		// value for M.

		int M = 60;
		long fibN; // to hold a Fibonacci number
		long startTime, endTime; // for timing the execution of the method
		
		fibN = getFibonacci(0); // initial call to method to remove set up time.
		
		for (int n = 0; n < M; ++n) {
			startTime = System.nanoTime();
			fibN = getFibonacci(n);
			endTime = System.nanoTime();
			/*System.out.println("Fibonacci(" + n + ") is " + fibN + ", and the computation took " + (endTime - startTime)
					+ " nanoseconds");*/
			// A different print format that's easier to process but less readable.
			System.out.println(n + "," + fibN + "," + (endTime - startTime));

			// Note the use of the System.nanoTime() method. Find out more about
			// this and related methods. These methods are built-in with Java.

			// Ideally, to determine the running time of a method we should take
			// many samples and then compute the mean and other related
			// statistics. We are keeping things quite simple and possibly
			// inaccurate for now.

		}
	}

}
