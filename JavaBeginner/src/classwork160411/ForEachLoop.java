package classwork160411;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
//		if (args.length > 0) {
//			System.out.println(args[0]);
//		}
//		if (args.length > 1) {
//			System.out.println(args[1]);
//		}
//		System.out.println(args[2]);
//		System.out.println(args[3]);
//		System.out.println(args[4]);
		
		int i = 0;
		while (i < args.length) {
			System.out.println(args[i++]);
//			i++;
		}
		
		for(int n = 0; n < args.length; n++) {
			System.out.println(args[n]);
		}
		
		for (String parameter : args) {
			System.out.println(parameter);
		}
		
		for (int k = 0; k < args.length; k++) {
			String parameter = args[k];
			System.out.println(parameter);
		}
		
	}

}
