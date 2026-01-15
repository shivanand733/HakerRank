package DSA_with_Kunal;

import java.util.Arrays;
import java.util.Scanner;

public class shivStringArray {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Size of Arrays");
	int size = scan.nextInt();
	
	String array [] = new String[size];
	
	for(int i = 0; i < array.length;i++) {
		array[i] = scan.next();
	}
	
	System.out.println(Arrays.toString(array));
}
}
