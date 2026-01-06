package pattren;

import java.util.*;
public class temperaturePreDirector {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int temp = scan.nextInt();
	
	if (temp < 0) {
		 System.out.println("The temperature " + temp + " is categorized as Freezing.");
	} else if (temp > 0 || temp < 15 ) {
		 System.out.println("The temperature " + temp + " is categorized as Freezing.");
	} else if (temp > 16 || temp < 25) {
		 System.out.println("The temperature " + temp + " is categorized as Freezing.");
	} else if (temp > 26 || temp < 35) {
		System.out.println();
	} else {
		System.out.println("Hot");
	}
}
}
