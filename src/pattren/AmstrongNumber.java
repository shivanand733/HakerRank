package pattren;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int number = scan.nextInt();
		int num = number;
		
		//initalization of the sum 
		int sum = 0;
		
		while (number > 0) {
			int digit = number % 10;
			sum = sum + (digit * digit * digit);
			number =  number / 10;
		}
		if (num == sum ) {
			System.out.println(num + " is Amstromg Number");
		} else {
			System.out.println(num + " is not Amstromg Number"); 
			
		}
	}
}
