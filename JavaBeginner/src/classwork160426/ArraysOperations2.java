package classwork160426;

import java.util.Arrays;

public class ArraysOperations2 {

	public static void main(String[] args) {
		
		// 4.  copy
		
		int[] a = {1,2,3};
		
		int[] c = copy(a);
		
		System.out.println(c);
		
		for (int e : c) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(c));
		
		c = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(c));
		
	}
	
	static int[] copy(int[] original) {
		if (original == null) {
			return null;
		}
		int length = original.length;
		int[] copy = new int[length];
		for (int i = 0; i < length; i++) {
			copy[i] = original[i];
		}
		return copy;
	}
	
}
