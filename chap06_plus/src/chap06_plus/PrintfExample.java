package chap06_plus;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intValue = 123;
		double doubleValue = 123.45;
		String stringValue = "Hi~Java";
		
		System.out.printf("%d\n", intValue);
		System.out.printf("%5d\n", intValue);
		System.out.printf("%05d\n", intValue);
		
		System.out.printf("%f\n", doubleValue);
		System.out.printf("%7.1f\n", doubleValue);
		System.out.printf("%7.3f\n", doubleValue);
		
		System.out.printf("%s\n", stringValue);
		System.out.printf("%10s\n", stringValue);
	}
}
