package pattren;
import java.util.Scanner;
public class revShiv {
public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	//take input from the user arrays size and arrays.....
	System.out.println("Enter the Array Size...");
	int N = scan .nextInt();
	int arry[] = new int[N];	//Create an Array
	
	System.out.println("Enter the Arrays..");
	for (int i = 0; i <= arry.length-1;i++) {
		arry[i] = scan.nextInt();
	}
	
	System.out.println("The Original Arry is...");
	for (int i = 0; i <= arry.length-1; i++) {
		System.out.print(arry[i] + " ");
	}
	System.out.println();
	//to Reverce The Array 
	System.out.println("The reversed Array");
	for (int i = arry.length-1; i >= 0; i--) {
		System.out.print(arry[i] + " ");
	}
}
}
