package lesson160310;

public class Example06 {

	public static void main(String[] args) {
		System.out.println(0b011000011);
		System.out.println(0125);
		System.out.println(0xAF);
		System.out.println(0b1111101000);
		System.out.println(0x3E8);
		
		System.out.println(Integer.toBinaryString(1000));
		System.out.println(Integer.toOctalString(1000));
		System.out.println(Integer.toHexString(1000));

		System.out.println(Integer.bitCount(1000));
		System.out.println(Integer.highestOneBit(1000));
		System.out.println(Integer.toBinaryString(999));
		int lowestOneBit = Integer.lowestOneBit(999);
		System.out.println(Integer.toBinaryString(lowestOneBit));
		
		
	}
	
}
