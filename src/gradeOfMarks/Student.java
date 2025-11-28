package gradeOfMarks;

import java.util.Scanner;

public class Student {
	int rollno;
	String name ;
	int marks[];
	
	//constructor
	public Student() {
		//deafult constructor 
	}
	
	public Student(int rollno,String name, int[] marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public double calculateAvg(){
		double sum = 0;
		for (int m: marks) {
			sum +=m;
		}
		return sum /5.0;
	}
	
	char calculate(double avg) {
		
		if (avg >= 90) {
			return 'A';
		} else if (avg >= 75) {
			return 'B';
		} else if (avg >= 60) {
			return 'C';
		} else 
			return'D';
	}

	
	
	 public void displayDetails() {
			double avg = calculateAvg();
			System.out.println("Roll Number " + rollno);
			System.out.println("Name " + name);
			System.out.println("Avrgae " + avg);
			System.out.println("Gread " + calculate(avg));
			System.out.println();
		 }
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Roll Number, Name, Marks");
	int rollno = scan.nextInt();
	scan.next();
	String name = scan.next();
	int marks[] = new int[5];
	
	for (int i = 1; i <= marks.length-1; i++) {
		marks[i] = scan.nextInt();
	}
	
	Student student = new Student(rollno, name, marks);
	student.displayDetails();
}
}
