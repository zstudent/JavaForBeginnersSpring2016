package classwork160510;

public class Жывотное {
	
	// class members
	
	//  state  - состояние
	
	private String name;  // поле, field   null
	private String kind;  // null
	private boolean isHungry = true;
	
	{ // блок инициализации
		System.out.println("создано очередное жывотное");
		
	}
	
	public Жывотное(boolean h, String n, String k ) {
		kind = k;
		name = n;
		isHungry = h;
	}
	
	{
		
	}
	
	public Жывотное(String kind) {
		this.kind = kind;
		name = "";
		isHungry = false;
	}
	
	public Жывотное(String kind, String name) {
		this(true, name, kind);
	}
	
	
	public Жывотное() {
//		this(true, "", "микроб");
		this("микроб", "");
	}

	// behavior - поведение
	
	public void feed(String food) {  // метод экземпляра  instance method
		if (isHungry) {
			System.out.println(kind + " '" + name + "' ест " + food );
			isHungry = false;
		} else {
			System.out.println(kind + " '" + name + "' играет с " + food );
		}
	}
	
	public void play() { // no static ==>  instance method
		if (isHungry) {
			System.out.println(kind + " '" + name + "' обиделся и залез в коробку ");
		} else {
			System.out.println(kind + " '" + name + "' играет, пока не проголодается ");
			isHungry = true;
		}
	}
	
}
