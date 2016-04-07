package classwork160407;

public class SwitchStatement {

	public static void main(String[] args) {
		
		if (args == null) {
			System.exit(0);
		}
		
		if (args.length == 0) {
			System.out.println("Usage: <number>");
			System.exit(0);
		}
		
		int num = Integer.parseInt(args[0]);
		
		switch (num) {
		case 0:
			System.out.println("ноль");
			break;
		case 1: 
			System.out.println("один");
			break;
		case 2: 
			System.out.println("два");
			break;
		case 3: 
			System.out.println("три");
			break;
		case 4: 
			System.out.println("четыре");
			break;
		case 5: 
			System.out.println("пять");
			break;
		case 6: 
			System.out.println("шесть");
			break;
		case 7: 
			System.out.println("семь");
			break;
		case 8: 
			System.out.println("восемь");
			break;
		case 9: 
			System.out.println("девять");
			break;
		default:
			System.out.println("введите цифру");
		}
		
	}
	
}
