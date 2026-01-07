package pattren;

import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number");
	int number = scan.nextInt();
	
	int temp = number;		//copy the content
	String binary = "";
	
	while (temp > 0) {
		int digit = temp % 2;
		binary = digit + binary;
		 temp = temp /2;
	}
	
	System.out.println("The decimal number "+ number + " converted into binary "+ binary);
}
}
