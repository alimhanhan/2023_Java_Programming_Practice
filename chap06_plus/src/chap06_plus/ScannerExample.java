package chap06_plus;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정수 2개를 입력하시오: ");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.printf("%d * %d = %d\n", x, y, x*y);
	}
}
