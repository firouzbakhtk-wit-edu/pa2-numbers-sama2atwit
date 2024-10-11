package edu.wit.cs.comp1000;
import java.util.Scanner;

/**
 * Solution to PA2b
 * When it runs, the program will ask the user for double variables a, b, and c in that order.
 * It will then calculate the discriminant of b^2 - 4ac
 * which will discover how many roots are there that solves the quadratic equation ax^2 + bx + c = 0.
 * 
 * @author Alex Sam
 */
public class PA2b {

	/**
	 * Ask the user for 3 inputs: a, then b, then c,
	 * calculate the discriminant, then print out the root(s) or x
	 * to get 0 in ax^2 + bx + c
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		// Scanner initialization
		Scanner input = new Scanner(System.in);
		
		// Ask for a, b, and c
		System.out.printf("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Calculate discriminant
		// b^2 - 4ac
		double discriminant = b*b - (4 * a * c);
		
		// if discriminant is negative, the roots will be imaginary numbers
		if(discriminant < 0) {
			System.out.printf("Roots: imaginary%n");
		}
		// if discriminant is greater than 0, there will be 2 roots
		// (-b +/- [the square root of the discriminant]) / 2a
		else if(discriminant > 0) {
			System.out.printf("Roots: %.2f, %.2f%n", (-b - Math.sqrt(discriminant)) / (2*a), (-b + Math.sqrt(discriminant)) / (2*a));
		}
		// if discriminant is 0, there will be 1 root as the square root of 0 is 0
		// -b / 2a
		else {
			System.out.printf("Root: %.2f%n", -b / (2*a));
		}
		
		input.close();
	}

}
