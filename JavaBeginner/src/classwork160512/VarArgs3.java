package classwork160512;

public class VarArgs3 {
	

//	void method(int[] nums) {}
	
	static void method(int... nums) {}
	
	void method(int x) {}

	public void moreA(int... nums) {}
	public void moreB(String values, int... nums) {}
	public void moreC(int... nums, String values) {}
	public void moreD(String... values, int... nums) {}
	public void moreE(String[] values, ...int nums) {}
	public void moreF(String... values, int[] nums) {}
	public void moreG(String[] values, int[] nums) {}
	
	static boolean[] x = {true};
	
	static public int howMany(boolean b, boolean... b2) {
		return b2.length; 
	}
	
	public static void main(String[] args) {
//		howMany();
//		howMany(true);
//		howMany(true, true);
//		howMany(true, true, true);
//		howMany(true, {true});
//		howMany(true, {true, true});
		howMany(true, new boolean[2]);
		
		method(1,2,3);
		method(new int[3]);
	}
	
}
