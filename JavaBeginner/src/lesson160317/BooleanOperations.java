package lesson160317;

public class BooleanOperations {
	
	public static void main(String[] args) {
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(9));
		
		System.out.println(Integer.toBinaryString(10 & 9));
		System.out.println(10 & 9);
		
		System.out.println(Integer.toBinaryString(10 | 9));
		System.out.println(10 | 9);
		
		System.out.println(Integer.toBinaryString(10 ^ 9));
		System.out.println(10 ^ 9);
		
		System.out.println(~10);
		System.out.println(Integer.toBinaryString(~10));
		
		int x = 10;
		
		System.out.println(x ^ 345);
		System.out.println((x ^ 345) ^ x);
		System.out.println((x ^ 345) ^ 345);
		
	}

}
