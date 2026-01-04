package DSA_with_Kunal;

public class swapNumber {
public static void main(String[] args) {
	int a = 10;
	int b = 20;
	
	swap(a, b);
	
	System.out.println("The a is " + a  + " and b is " + b);
}

public static void swap(int a, int b) {
	int temp = a;
	a = b; 
	b = temp;
	
	
}
}
