package ApplicationQ;

/**
 * 
 * @author jenniferzhang
 * 
 */

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		// Scanner class
		Scanner s = new Scanner(System.in);
		
		// ask the user for a positive integer
		System.out.println("please enter a positive number: ");
		int number = s.nextInt();
		
		// square
		System.out.println("the square of the number is: " + square(number));
		
		// factorial
		System.out.println("the factorial of the number is: " + f(number));
				
		// factors
		factor(number);
		System.out.println();
		
		// prime factors 
		primefactor(number);

	}
	
	// square method
	public static double square (int n) {
		double s = Math.pow(n,2);
		return s;
	}
	
	// factorial method
	public static int f (int n) {
		int factorial = n;
		// for loop for factorial
		for (int i=n-1; i>=1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
	// factors method
	public static void factor (int n) {
		// for loop for getting factors
		System.out.print("the factors of the number are: ");
		for (int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	// prime factors method
	public static void primefactor (int n) {
		System.out.println("the prime factors of the number is/are: " );
		boolean prime = true;
		int count = 0;
		
		// get factors
		for (int i=1; i<=n; i++) {
			if(n%i == 0) {
				count++;
				//check if the factors are prime or not
				if (i == 1) {
					prime = false;
				}
				else if (i == 2) {
					prime = true;
				}
				else {
					for (int j=2; j<i; j++) {
						if (i%j == 0) {
							prime = false;
						}
					}
				}
				
				// print out prime factors
				if (prime == true) {
					System.out.print(i + " ");
				}
				// if the number entered is a prime number, then we print out the number itself
				else if (count == 2) {
					System.out.println(n);
				}
			}
		}
	}

}
