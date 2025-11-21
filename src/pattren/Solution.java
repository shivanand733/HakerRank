package pattren;

import java.util.Scanner;

public class Solution {
	
	static int H;
	static int B;
	static boolean flag = true;
	
	static {
		Scanner scan = new Scanner(System.in);
		H = scan.nextInt();
		B = scan.nextInt();
		
		if (H <=0 || B <= 0) {
			flag = false;
			System.out.println("Breath and Hight Should be positive ");
		}
	}
public static void main(String[] args) {
	if (flag) {
		int area = H * B;
		System.out.println(area);
	}
}
}
