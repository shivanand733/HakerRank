package pattren;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int number =scan.nextInt();
		
		//copy number and initalize the sum 
		int num = number;
		
//		count the numbers
		int count = 0;
		int temp = number;
		
		while (temp > 0) {
			count++;
			temp = temp /10;
			
		}
		temp = number;
		System.out.println("count is " + count +" and temp is " + temp +"\n");
	
		int sum = 0;
		while (temp > 0 ) {
			int digits = temp % 10;
			sum = sum +(int)Math.pow(digits, count);
			temp = temp / 10;
		}
		
		if (sum == number) {
		System.out.println(number + " is Armstrong Number");
		} else  {
			System.out.println(number + "  is not Armstrong Number");
		}
	}
	
}
