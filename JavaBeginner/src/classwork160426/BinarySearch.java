package classwork160426;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] a = {10, 20, -2, 3, 0, 100, -500};

		// find 20
		int[] b = {-500, -2, 0, 3, 10, 20, 100};
		
		System.out.println(Arrays.toString(a));

		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int result = Arrays.binarySearch(a, 1);
		
		System.out.println(result);
		System.out.println(a[result]);
	}
	
	int binarySearch(int[] x) {
		// TODO write code for binary search
		
		return -1;
	}
	

}
