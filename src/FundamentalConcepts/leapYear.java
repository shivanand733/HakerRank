package FundamentalConcepts;

import java.util.Scanner;

public class leapYear {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Eter Year ");
	int year = scan.nextInt();
	
	boolean leap = false;
	if (year%4 == 0) {
		if (year%100 == 0) {
			
			if (year%400 == 0) {
				leap = true;
			} else {
				leap = false;
			}	
			
		}else {
			leap = true;
		}
	}
	else 
		leap = false;
	
	System.out.println("Year " + year +  " is leap year ? " + leap);
}
}
