package classwork160405;

public class HomeTask {

	public static void main(String[] args) {

		/*
		 * две - много пять - мало одна - в самый раз
		 * 
		 * 
		 */

		int num = 3;

		if (num == 2) {
			System.out.println("много");
		} else if (num == 5) {
			System.out.println("мало");
		} else if (num == 1) {
			System.out.println("в самый раз");
		} else {
			System.out.println("неверное число");
		}

		switch (num) {
		case 2:
			System.out.println("много");
			break;
		case 5:
			System.out.println("мало");
			break;
		case 1:
			System.out.println("в самый раз");
			break;
		default:
			System.out.println("неверное число");
		}
	}

}
