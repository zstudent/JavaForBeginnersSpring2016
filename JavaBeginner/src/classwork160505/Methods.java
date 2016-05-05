package classwork160505;

public class Methods {
	
	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		printArray(a);
		
		int[] x = {2,4,6,8,10};
		printArray(x);
		
		int[] y = {3,6,9,12,15};
		printArray(y);
		
	}
	
	static void printArray(int[] a) { // static ==> class method
		for (int element : a) {
			System.out.println(element);
		}
	}

}
