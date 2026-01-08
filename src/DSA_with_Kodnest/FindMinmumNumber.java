package DSA_with_Kodnest;

import java.util.Scanner;

public class FindMinmumNumber {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter Number");
	int number = scan.nextInt();
	
	int min = number % 10;
	
	while ( number > 0) {
		int digit = number % 10;
		
		if (digit < min ) {
			min = digit;
		}
		number = number / 10;
	}
	System.out.println("The Minimum Number " + min);
}
}
