package pattren;

import java.util.Scanner;

public class temperaturePreDirector {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Tempareature...");
		int temp = scan.nextInt();
		
		if (temp < 0) {
			System.out.println("The Temperature " + temp + " is categorized as Freezing.");
		} else if (temp >= 0 && temp <= 15) {
			System.out.println("The Temperature " + temp + " is categorized as Cool");
		} 
		
		else if (temp >= 16 && temp <= 25) {
			System.out.println("The Temperature " + temp + " is categorized as Modreate");
		}
		
		
		else if (temp >= 26 && temp <= 35) {
			System.out.println("The Temperature " + temp + " is categorized as Warm");
		} else {
			System.out.println("The Temperature " + temp + " is categorized as Hot");

		}
	}
}
