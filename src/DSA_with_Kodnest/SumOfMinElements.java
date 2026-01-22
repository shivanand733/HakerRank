package DSA_with_Kodnest;

public class SumOfMinElements {
public static void main(String[] args) {
	
	int[][] arry = new int[2][];
	int min = 0;
	for (int i = 0; i <= arry.length-1;i++) {
		min = arry[i][0];
		for (int j = 1; j <= arry[i].length;j++) {
			if (arry[i][j] < min) {
				min = arry[i][j];
			}
		}
	}
}
}
