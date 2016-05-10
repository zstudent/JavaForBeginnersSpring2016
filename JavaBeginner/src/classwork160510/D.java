package classwork160510;

public class D {
	
	public static final int MAX = 20;
	
	static int счётчик; // поле класса  
	
	int count;  // поле экземпляра
	
	{
		count++;
		System.out.println("count=" + count);
		счётчик++;
		System.out.println("счётчик=" + счётчик);
	}
	
	final static void method4() { }

	static final void method3() { }
	
	final void  method() {}
	
	public void methodA() { 
		return;
		}
	
	public void methodB() { return null;}
	
	public int methodF() { return;}
	
	public Integer methodG() { return null;}

}
