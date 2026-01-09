package DSA_with_Kodnest;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Temperature...");
	double temp = scan.nextDouble();
	double result = convToCelsius(temp);
	
	System.out.println(result);
	
	
}

public static double convToCelsius(double f) {
	double celsius = (f - 32 ) * 5 / 9;
	return  celsius;
}
}
