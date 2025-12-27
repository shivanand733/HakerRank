package gradeOfMarks;

import java.util.Scanner;

public class shivuApp {
	int rollNo;
	String name;
	int marks[];
	
	public shivuApp() {
		// TODO Auto-generated constructor stub
	}
	
	
	
public shivuApp(int rollNo, String name, int[] marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

public double calculateAvg() {
	double sum = 0;
	for (int i = 0; i < 5; i++) {
		sum = sum + marks[i];
	}
	return sum /5.0;
}

char calculate (double avg) {
	if (avg >= 100) {
		return 'A';
	} else if (avg >= 85) {
		return 'B';
	} else if (avg >= 60) {
		return 'C';
	} else {
		return 'D';
	}
}

public void disp() {
	double avg = calculateAvg();
	System.out.println("Roll Number " + rollNo);
	System.out.println("Name " + name);
	System.out.println("Avarage " + avg);
	System.out.println("grade " + calculate(avg));
}


public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Roll Number, Name, Marks");
	
	int rollNo = scan.nextInt();
	String name = scan.next();
	int marks[] = new int[5];
	for (int i = 1; i <= 5; i++) {
		marks[i] = scan.nextInt();
	}
	
	shivuApp shiv = new shivuApp(rollNo, name, marks);
	shiv.disp();


	// hi 
}
}
