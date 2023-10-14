package chap10;

public abstract class Animal {

	String kind;
	
	public void breathe()
	{
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
