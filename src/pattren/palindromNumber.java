package pattren;

import java.util.Scanner;

public class palindromNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number");
	
	int num = scan.nextInt();
	int n = num;
	int rev = 0;
	while (n > 0) {
		int digit = n % 10;
		rev = rev * 10 + digit;
		n = n / 10;
	}
	
	if (num == rev) {
		System.out.println("This is the palindrom number");
	} else {
		System.out.println("This is not palindrom number");
	}
}
}
