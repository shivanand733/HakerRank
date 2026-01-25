package pattren;
import java.util.*;

public class revArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int N = scan.nextInt();

        int arry[] = new int[N];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < arry.length; i++) {
            arry[i] = scan.nextInt();
        }

        System.out.println("Array elements are:");
//        for (int i = 0; i < arry.length; i++) {
//            System.out.print(arry[i] + " ");
//        }
        
        System.out.println(Arrays.toString(arry));//use the inbulid function " Arrays.toString(); "

//        System.out.println("\nReversed array:");
//        for (int i = arry.length - 1; i >= 0; i--) {
//            System.out.print(arry[i] + " ");
//        }
    }
}
