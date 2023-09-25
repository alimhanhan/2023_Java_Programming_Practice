package chap05;

class Car
{
	String color;
	int speed;
}

public class CarExample {

	public static void main(String[] args) 
	{
		Car myCar1 = new Car();
		myCar1.color = "빨강";
		myCar1.speed = 0;
		System.out.println("자동차 1의 색상은 " + myCar1.color + "이고, 현재 속도는 " + myCar1.speed + "km이다.");
		
		Car myCar2 = new Car();
		myCar2.color = "파랑";
		myCar2.speed = 0;
		System.out.println("자동차 2의 색상은 " + myCar2.color + "이고, 현재 속도는 " + myCar2.speed + "km이다.");
		
		Car myCar3 = new Car();
		myCar3.color = "노랑";
		myCar3.speed = 0;
		System.out.println("자동차 3의 색상은 " + myCar3.color + "이고, 현재 속도는 " + myCar3.speed + "km이다.");
	}

}
