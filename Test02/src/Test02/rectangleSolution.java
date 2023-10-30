package Test02;

public class rectangleSolution {

	public static void main(String[] args) {

		rectangle tester = new rectangle();
		
		tester.width = 3;
		tester.height = 5;
		
		int print_this  = tester.cal(3,5);
		System.out.println("너비가 " + tester.width + "이고 높이가 " + tester.height + "인 사각형의 면적은 " + print_this + "이다.");
	}

}
