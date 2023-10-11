package Prac03;

class A2222
{
	int m = 3;
}

class B2222 extends A2222
{
	int m = 4;
}

public class InstanceFieldExample {

	public static void main(String[] args) {
		A2222 aa = new A2222();
		B2222 bb = new B2222();
		A2222 ab = new B2222();
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
	}

}
