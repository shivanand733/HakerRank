package pattren;

import java.util.Scanner;

public class countNumber {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number");
	
	long Number = scan.nextInt();
	long num = Number;
	
	//initalize the counter 
	long count = 0;
	
	while (num > 0) {
		count++;
		num = num / 10;
		
	}
	
	System.out.println("Number " + Number + " is " + count + " many Counts");
}
}
