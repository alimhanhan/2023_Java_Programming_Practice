package sec03;

public class OperationExample {

	public static void main(String[] args) 
	{
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		int result2 = byteValue1 + byteValue2;
		System.out.println(result2);
		
		int intValue3 = 10;
		double doubleValue = intValue3 / 4.0;
		System.out.println(doubleValue);
		
		int intValue4 = 1;
		int intValue5 = 2;
		double result3 = (double) intValue4 / intValue5;
		System.out.println(result3);
	}
}