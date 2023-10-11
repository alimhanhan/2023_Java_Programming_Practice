package Prac03;

class AAA
{
	public AAA()
	{
		System.out.println("생성자 A");
	}
	
	public AAA(int x){
		System.out.println("매개변수 생성자 A   " + x);
	}
}

class BBB extends AAA
{
	public BBB() {
		System.out.println("생성자 B");
	}
	
	public BBB(int x){
		super(x);
		System.out.println("매개변수 생성자 B   " + x);
	}
}

public class ConstructEx4 {

	public static void main(String[] args) {
		BBB b;
		b = new BBB(5);
	}

}
