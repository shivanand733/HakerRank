package pattren;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter the charecter...");
		char ch = scan.next().charAt(0);
		
		if (ch >= 'a' && ch <= 'z'||ch >= 'A' && ch <= 'Z') {
			if (ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U') {
				System.out.println("Its Vowels");
			} else {
				System.out.println("Its Consonate");
			}
		} else {
			System.out.println("It's Invalied...");
		}
	}
}
