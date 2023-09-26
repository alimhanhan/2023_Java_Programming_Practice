package chap06; //PPT 05 실습 3(35p)

public class Calculator {

	int plus(int x, int y)
	{
		int result = x+y;
		return result;
	}
	
	double plus(double x, double y)
	{
		double result = x+y;
		return result;
	}
	
	double avg(int x, int y)
	{
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	double avg(double x, double y)
	{
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute()
	{
		double result1 = avg(7, 10);
		double result2 = avg(10.5, 20.3);
		
		System.out.println("실행 결과: "+result1);
		System.out.println("실행 결과: "+result2);
	}
}
