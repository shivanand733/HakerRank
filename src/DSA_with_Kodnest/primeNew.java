package DSA_with_Kodnest;

import java.util.Scanner;

public class primeNew {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scan.nextInt();
		int count = 0;
		while (count < number) {
			for (int i = 1; i <= number; i++) {
				if (number%i == 0) {
					count++;
				}
			}
		}
	}
}
