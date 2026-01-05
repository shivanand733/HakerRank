package pattren;

public class StarrayAlterantion {
public static void main(String[] args) {
	for (int i = 1; i <= 12; i++) {
		if(i %2 == 0) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("  ");
			}
		} else {
			for (int k = 1; k <= 6; k++) {
				System.out.print("* ");
			}
		}
		System.out.println();
	}
}
}
