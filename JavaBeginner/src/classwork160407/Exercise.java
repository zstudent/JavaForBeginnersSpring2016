package classwork160407;

public class Exercise {
	
	public static void main(String[] args) {
		
		int y = 1;
		int z = 1;
		int x;
		
		if (y < 10) {
			x = y++;
		} else {
			x = z++;
		}
		
		System.out.println(x + "," + y + "," + z);
		
		// 1  y < 10
		// 2 y >= 10

		y = 1;
		z = 1;
		
		x = y < 10? y++ : z++;
		System.out.println(x + "," + y + "," + z);
		
		y = 1;
		z = 1;
		
		x = y >= 10? z++ : y++;
		System.out.println(x + "," + y + "," + z);
		
	}

}
