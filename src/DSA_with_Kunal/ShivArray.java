package DSA_with_Kunal;

import java.util.Arrays;
import java.util.Scanner;

public class ShivArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Size of Array");
	int size = scan.nextInt();
	
	int arry[] = new int[size];
	System.out.println("Enter the arrys size");
	for (int i = 0; i < arry.length;i++) {
		arry[i] = scan.nextInt();
	}
	
	System.out.println(Arrays.toString(arry));
	
}
}
