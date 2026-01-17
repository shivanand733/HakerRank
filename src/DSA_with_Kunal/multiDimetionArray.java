package DSA_with_Kunal;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimetionArray {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter The Rows");
	int rows = scan.nextInt();
	
	int [][] array = new int[rows][];
	
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length;j++) {
			array[i][j] = scan.nextInt();
		}
	}
	
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length;j++) {
			System.out.println(Arrays.toString(array));
		}
	}
}
}
