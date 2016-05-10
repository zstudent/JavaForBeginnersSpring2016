package classwork160510;

public class A extends Object {
	
	String state = "";   // 1  инициализация полей
	
	public A() {
		super();
		System.out.println(state);
		state = "конструктор";  // 3  конструктор
		System.out.println(state);
	}
	
	public A(String x) {
		this();
		state = x;                 // 4  вторичный конструктор
		System.out.println(x);
	}
	
	public A(int n) {                   //  3'  отдельный конструктор
		super();
		System.out.println("n=" + n);
	}
	
	public static void main(String[] args) {
		
		A a = new A(0);
		
	}

	{
		System.out.println(state);
		state = "начало";  // 2   блок инициализации
		System.out.println(state);
	}
}

