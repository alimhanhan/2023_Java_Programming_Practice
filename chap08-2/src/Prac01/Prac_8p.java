package Prac01;

class A
{
	void print()
	{
		System.out.println("A Class");
	}
}

class B extends A
{
	void print() 
	{
		System.out.println("B Class");
	}
}

public class Prac_8p {

	public static void main(String[] args) {
		A aa = new A();
		aa.print();
		
		B bb = new B();
		bb.print();
		
		A ab = new B();
		ab.print();
	}

}
