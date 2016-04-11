package classwork160407;

public class ForLoopExample {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int j = 0; // init
		while (j < 10) {  // check condition
			System.out.println(j);  // body
			j++;  // increment
		}
		
		for (int k = 9; k >= 0; k--) {
			System.out.println(k);
		}
		
		for(;;) {
			System.out.println("hehe");
		}
	}

}
