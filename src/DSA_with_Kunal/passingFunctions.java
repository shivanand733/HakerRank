package DSA_with_Kunal;

import java.util.Arrays;

public class passingFunctions {
public static void main(String[] args) {
	
	int[] nums = {2,4,45,98};
	
	System.out.println("Original Array "+ Arrays.toString(nums));
	change(nums);
	System.out.println("Change The Array "+Arrays.toString(nums));
}
public static void change(int[] arry) {
	arry[0] = 89;
}

}
