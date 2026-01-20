package DSA_with_Kunal;

import java.util.Scanner;

public class twoDarray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the array ");
	int rows = scan.nextInt();
	
	int[][] arry = new int[rows][];
	
	//takeing the colum size and eliment
	
	for(int i = 0; i < rows; i++) {
		System.out.println("Enter the numbers of colums for rows" + i + " : ");
		int cols = scan.nextInt();
		
		arry[i] = new int[cols];
	}

}
}
