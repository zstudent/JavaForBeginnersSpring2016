package classwork160504;

import java.util.ArrayList;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		
		int[] a;
		
		a = new int[10];
		
		ArrayList<Integer> intArray1 = new ArrayList<Integer>();
		ArrayList<Integer> intArray2 = new ArrayList<>(); // динамический массив
		
		intArray1.add(10);   // add   intArray1.add(new Integer(10));
		intArray1.add(20);
		intArray1.add(30);
		intArray1.add(40);
		
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		intArray1.add(50);  // append

		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		intArray1.add(0, 0);   // insert into the beginning

		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		intArray1.add(4, 35);   // insert in the middle

		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		intArray1.remove(5);  // delete

		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		int indexOf30 = intArray1.indexOf(30);  // search
		intArray1.remove(indexOf30);  // delete
		
		intArray1.remove((Integer)20);  // search and delete
		intArray1.remove(new Integer(20));  // search and delete
		
		for (int i = 0; i < intArray1.size(); i++) {
			System.out.println(intArray1.get(i));
		}
		
		for (int i = 0; i < intArray1.size(); i++) {
			intArray1.set(i, i * 100);   // a[i] = i * 100;
			System.out.println(intArray1.get(i));  //  println(a[i])
		}
		
		System.out.println(intArray1.isEmpty());
		System.out.println(intArray2.isEmpty());
		
		intArray1.clear();
		System.out.println(intArray1.isEmpty());
		System.out.println(intArray1.size());
		

	}

}
