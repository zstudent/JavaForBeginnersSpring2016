package classwork160407;

public class SwitchExample3 {
	
	public static void main(String[] args) {
		
		int x = 5;
		
		switch (x % 2) {
		case 0:
			System.out.println("чётное");
			break;
		case 1:
			System.out.println("нечётное");
			break;
		}
		
	}

}
