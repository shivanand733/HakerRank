package DSA_with_Kodnest;

import java.util.Scanner;

public class primeNumber {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number");
	int number =scan.nextInt();		//take number

	int fact = 0;
	for (int i = 1; i <= number; i++) {
		if (number % i == 0) {
			System.out.println(i);
			fact++;
		}
	}
	System.out.println();
	if (fact == 2) {
		System.out.println(number + " is prime number");
	} else {
		System.out.println(number + " is not prime number");
	}
}
}
