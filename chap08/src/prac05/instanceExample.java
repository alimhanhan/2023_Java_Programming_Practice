package prac05;

class A{}
class B extends A{}

public class instanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A aa = new A();
		A ab = new B();
		
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		
		System.out.println(ab instanceof A);
		System.out.println(ab instanceof B);
		
		if(aa instanceof B)
		{
			B b = (B)aa;
			
			System.out.println("aa를 B로 casting하였습니다.");
		}
		else
		{
			System.out.println("aa는 B로 casting될 수 없습니다.");
		}
		
		if(ab instanceof B)
		{
			B b = (B)ab;
			
			System.out.println("ab를 B로 casting하였습니다.");
		}
		else
		{
			System.out.println("ab는 B로 casting될 수 없습니다.");
		}
		
		if("안녕" instanceof String)
		{
			System.out.println("\"안녕\"은 String 입니다");
		}
	}

}
