package Prac04;

public class CarExample {

	public static void main(String[] args) {
		Sedan sedan1 = new Sedan();
		sedan1.upSpeed(300);
		sedan1.seatNum = 5;
		
		Truck truck1 = new Truck("Blue", 0, 0);
		truck1.upSpeed(100);
		truck1.capacity = 50;
		
		System.out.println("승용차의 속도는 " + sedan1.speed + "km이고, 좌석 수는 " + sedan1.seatNum + "개입니다.");
		System.out.println("트럭의 속도는 " + truck1.speed + "km이고, 색상은 " + truck1.getColor() + "이며, 적재량은 " + truck1.getCapacity() + "톤 입니다.");
	}

}
