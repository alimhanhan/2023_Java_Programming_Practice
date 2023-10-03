package Sec02_Prac03;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath.max(1.23, 3.45));
		System.out.println(MyMath.min(5.43, 3.21));
	}
}

class MyMath
{
	static double max(double a, double b)
	{
		return ( a > b ) ? a : b;
	}
	
	static double min(double a, double b)
	{
		return ( a < b ) ? a : b;
	}
}