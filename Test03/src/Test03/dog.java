package Test03;

public class dog
{
	int age;
	String name;
	String sort;
	
	dog(){};
	
	dog(int age, String name, String sort)
	{
		this.age = age;
		this.name = name;
		this.sort = sort;
	}
	
	void wag()
	{
		System.out.println("살랑살랑!");
	}
	
	void bark()
	{
		System.out.println("멍멍");
	}
}

