package fibonacci2;

import java.util.Scanner;
import fibonacci1.Fibonacci;

public class CheckFib {

	/**
	 * Given an integer n, determine if it is a Fibonacci number or not.
	 * 
	 * @param n
	 *            the number to test for being a Fibonacci number or not.
	 * @return true if n is a Fibonacci number otherwise return false.
	 */
	public static boolean isFib( long n ) {
		long fibCandidate = 0;
		int fibIndex = 0;
		do {
			fibCandidate = fibonacci1.Fibonacci.getFibonacci(fibIndex);
			fibIndex++;
		} while(fibCandidate < n);
		
		if (fibCandidate == n) {
			return true;
		}
		return false; // Naturally, this will change.
	}

	/**
	 * This main method asks a user to input an integer and then returns the
	 * result after checking if the input is a Fibonacci number or not.
	 * 
	 * @param args
	 *            This method does not need any arguments
	 */
	public static void main(String[] args) {

		// Notice how we read an integer in Java. This is one of many ways to
		// read an integer. The syntax can be elaborate. Soldier on!
		System.out.print("Enter an integer: ");
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		
		// Now that we have n, let us test it.
		if ( isFib( n ) )
			System.out.println(n+" is a Fibonacci number!");
		else
			System.out.println(n+" is not a Fibonacci number :-(");
	}

}
