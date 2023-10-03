package Sec02_Prac01;

public class StaticFieldTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		
		a1.m = 5;
		a2.m = 6;
		System.out.println(a1.m);
		System.out.println(a2.m);
		
		a1.n = 7;
		a2.n= 8;
		System.out.println(a1.n);
		System.out.println(a2.n);
		
		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
	}

}
