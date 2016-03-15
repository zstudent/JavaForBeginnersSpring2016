package lesson160310;

public class Example03 {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		int y = x * 20;
		
		//  + - * / 
		//  % 
		
		int a = - (20 + 40);
		
		System.out.println(x % 2);
		System.out.println(11 % 2);
		System.out.println(y % 1000);
		
		while (true) {
			x++;  //  x = x + 1
			if (x % 100_000_000 == 0) {
				System.out.println(x);
			}
		}
		
	}

}
