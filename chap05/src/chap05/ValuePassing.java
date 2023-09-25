package chap05;

public class ValuePassing {

	public static void main(String[] args) 
	{
		int n = 10;
		
		increase(n);
		
		System.out.println(n);
	}
	
	static void increase(int k)
	{
		k = k + 1;
	}

}
