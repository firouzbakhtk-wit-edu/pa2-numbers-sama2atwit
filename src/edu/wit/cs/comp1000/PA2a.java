package edu.wit.cs.comp1000;
import java.util.Scanner;

/**
 * Solution to PA2a
 * When it runs, the program will ask the user for 5 whole numbers.
 * It will take those 5 numbers and calculate the sum and average of
 * all, positive, and non-positive numbers
 * 
 * @author Alex Sam
 */
public class PA2a {

	/**
	 * Starts the program, asks for 5 whole numbers (no decimals)
	 * Start calculating the amount of positive and non-positive integers
	 * their sum, and their average along with the sum and average of both
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		// Scanner object initialization
		Scanner input = new Scanner(System.in);
		
		// Ask the user and assign the values to 5 variables
		System.out.printf("Enter five whole numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		
		// Initialize variables for the sums and amount of positive/non-positive numbers
		int pos_num = 0;
		int non_num = 0;
		
		int pos_sum = 0;
		int non_sum = 0;
		
		// Checks to see if the first input is a positive number or not (greater than 0)
		// Also increase pos_num or non_num by 1 when it finds a positive or non-positive number
		// And gets added to the sum of pos_sum or non_sum
		// The same process is applied to the other inputs/variables
		if(a > 0) {
			pos_num++;
			pos_sum = pos_sum + a;
		}
		else {
			non_num++;
			non_sum = non_sum + a;
		}
		
		if(b > 0) {
			pos_num++;
			pos_sum = pos_sum + b;
		}
		else {
			non_num++;
			non_sum = non_sum + b;
		}
		
		if(c > 0) {
			pos_num++;
			pos_sum = pos_sum + c;
		}
		else {
			non_num++;
			non_sum = non_sum + c;
		}
		
		if(d > 0) {
			pos_num++;
			pos_sum = pos_sum + d;
		}
		else {
			non_num++;
			non_sum = non_sum + d;
		}
		
		if(e > 0) {
			pos_num++;
			pos_sum = pos_sum + e;
		}
		else {
			non_num++;
			non_sum = non_sum + e;
		}
		
		// Complete the sum of all whole numbers and calculate the average of positive/non-positive/whole numbers
		// Now we will have the pos_sum, non_sum, sum, pos_average, non_average, and average
		int sum = pos_sum + non_sum;
		
		double pos_average;
		double non_average;
		
		// pos_plural and non_plural account for the case where there are exactly one positive or non-positive number
		// (defaults to "numbers" in case there are more than 1 or none)
		String pos_plural = "numbers";
		String non_plural = "numbers";
		
		if(pos_num == 0) {
			pos_average = 0.00; // when there are 0 positive numbers, the average will be 0.00 (and not NaN)
		}
		else {
			if(pos_num == 1) {
				pos_plural = "number"; // when there are exactly 1 positive numbers
			}
			pos_average = 1.0 * pos_sum / pos_num; // double value before the division to convert pos_sum into a double
		}
		
		if(non_num == 0) {
			non_average = 0.00;
		}
		else {
			if(non_num == 1) {
				non_plural = "number";
			}
			non_average = 1.0 * non_sum / non_num;
		}
		
		double average = 1.0 * sum / 5;
		
		// Print out the results
		System.out.printf("The sum of the %d positive " + pos_plural + ": %d%n", pos_num, pos_sum);
		System.out.printf("The sum of the %d non-positive " + non_plural + ": %d%n", non_num, non_sum);
		System.out.printf("The sum of the 5 numbers: %d%n", sum);
		System.out.printf("The average of the %d positive " + pos_plural + ": %.2f%n", pos_num, pos_average);
		System.out.printf("The average of the %d non-positive " + non_plural + ": %.2f%n", non_num, non_average);
		System.out.printf("The average of the 5 numbers: %.2f%n", average);
		
		// Close input
		input.close();
	}

}
