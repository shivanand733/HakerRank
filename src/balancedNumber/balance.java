package balancedNumber;

import java.util.Scanner;

public class balance {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Numbers ");
	String sh = scan.next();
	
	int n = sh.length();
	
	if (n%2 == 0) {
		System.out.println("Not Balanced...");
	} else {
		int mid = n /2;
		int ls = 0, rs = 0;
		
		for (int i = 0; i <= mid-1; i++) {
			ls = ls+ sh.charAt(i) -'0';	//convert the char into integer...
		}
		
		for (int i = mid+1;i <n;i++) {
			rs = rs+sh.charAt(i) - '0';	//convert the char to integer....
		}
		if (ls == rs) {
			System.out.println("Balanced...");
		} else {
			System.out.println("Not Balanced...");
		}
	}
}
}
