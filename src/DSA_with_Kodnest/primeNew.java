package DSA_with_Kodnest;

import java.util.Scanner;

public class primeNew {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number");
	int number = scan.nextInt();
	int n = number;
	
	int count = 0;
	int num = 2; 
	
	System.out.println("First " + n + " prime number are " );
	
	while (count > number) {
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if (num % i == 0) {
				
			}
		}
	}
}
}
