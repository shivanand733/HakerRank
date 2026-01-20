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
		
		for (int j = 0; j < cols; j++) {
			System.out.println("Enter elements [ " + i + " ] [ " + j  + " ] : "); 
			arry[i][j] =scan.nextInt();
		}
	}

	for (int i = 0; i < arry.length;i++) {
		for (int j = 0; j < arry[i].length;j++) {
			System.out.println(arry[i][j] + "  ");
		}
		System.out.println();
		
	}
}
}
