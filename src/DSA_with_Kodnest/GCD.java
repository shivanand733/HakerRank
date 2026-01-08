package DSA_with_Kodnest;

import java.util.Scanner;

public class GCD {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Any two Numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();
	
	int res = calulate(a, b);
	
	System.out.println("The GCD  a is " + a + " and b is " + b + " is " + res );
}

public static int calulate(int a, int b) {
	while (b != 0) {
		int rem = a%b;
		a = b;
		b = rem;
	}
	return a;
}
}
