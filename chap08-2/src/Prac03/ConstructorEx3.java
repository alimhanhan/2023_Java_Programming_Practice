package Prac03;

class AA
{
	public AA()
	{
		System.out.println("생성자 A");
	}
	
	public AA(int x){
		System.out.println("매개변수 생성자 A");
	}
}

class BB extends AA
{
	public BB() {
		System.out.println("생성자 B");
	}
	
	public BB(int x){
		System.out.println("매개변수 생성자 B");
	}
}

public class ConstructorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BB b;
		b = new BB(5);
	}

}
