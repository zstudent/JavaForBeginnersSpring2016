package lesson160317;

public class BitMaskExample {

	final static int ALIVE    = 0b0001;  
	final static int BIG      = 0b0010;  
	final static int LONG     = 0b0100;  
	final static int COLORED  = 0b1000;  
	
	
	public static void main(String[] args) {
		
		int anakonda = ALIVE | BIG | LONG | COLORED;
		
		System.out.println(anakonda);
		
		int something = 9;
		
		System.out.println(Integer.toBinaryString(something));
		
		if ((something & ALIVE) > 0) {
			System.out.println("ALIVE");
		}
		
		if ((something & BIG) > 0) {
			System.out.println("BIG");
		}
		
		if ((something & LONG) > 0) {
			System.out.println("LONG");
		}
		
		if ((something & COLORED) > 0) {
			System.out.println("COLORED");
		}
		
	}
	
}
