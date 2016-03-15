package lesson160310;

import java.util.Random;

public class Example04 {

	public static void main(String[] args) throws InterruptedException {

		Random r = new Random();
		
		while (true) {
			Thread.sleep(2000);
			int x = r.nextInt(1_000_000);
			
			if (x % 2 == 0) {
				System.out.println("Чёт");
			} else {
				System.out.println("Нечет");
			}
			
		}

	}

}
