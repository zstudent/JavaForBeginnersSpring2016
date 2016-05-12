package classwork160512;

import java.util.Arrays;
import java.util.List;

public class VarArgs2 {
	
	public static void main(String[] args) {
		
		List<String> list3 = Arrays.asList("one", "two", "three");
		List<String> list1 = Arrays.asList("one");
		List<String> list0 = Arrays.asList();
		
//		mx (0,1,2,3,4,5,6);  WILL NOT WORK
		
	}
	
	VarArgs2() {
		
	}
	
	void VarArgs2() {
		
	}
	
	void m0(int... nums) {}
	
	void m1(int start, int... nums) {};

//	void mx(int... start, int... nums) {};  WRONG!
	
//	void my(int... start, int y) {};  WRONG!

}
