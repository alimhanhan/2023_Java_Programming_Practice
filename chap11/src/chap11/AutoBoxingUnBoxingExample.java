package chap11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		int value = obj;
		System.out.println("value: "  + value);
		
		int result = obj + 100;
		System.out.println("result: "+result);
	}

}
