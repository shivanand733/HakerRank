package DSA_100_Day_challenge;

import java.util.Scanner;

public class solution {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		
		int n = x;
		int revNum = 0;
		
		while(n > 0) {
			int d = n % 10;
			revNum = revNum * 10 + d;
			n = n /10;
		}
		
		if (revNum == x) {
			return true;
		}else  {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		solution so = new solution();
		System.out.println("Enter Number");
		int x = scan.nextInt();
		
		System.out.println("Given Number is Palindrome " + so.isPalindrome(x));
	}
	
}
