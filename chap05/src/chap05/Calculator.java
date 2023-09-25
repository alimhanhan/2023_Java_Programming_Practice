package chap05; 

public class Calculator {
	int plus(int x, int y)
	{
		int result  = y + x;
		return result;
	}
	
	double avg(int x, int y)
	{
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute()
	{
		double result = avg(7, 10);
		System.out.println("실행 결과: " + result);
	}
}