package pattren;

import java.util.Scanner;

public class FibonaciSeriase {
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Number");
	int n = scan.nextInt();
	
	int a = 0; int b = 1;
	
	System.out.println("fibonacic Series");
	
	for (int i = 1; i <= n; i++) {
		System.out.print(a + " ");
		int next = a + b;
		 a = b; 
		 b = next;
	}
}
}
