package prac02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sedan sedan1 = new Sedan();
		sedan1.upSpeed(300);
		sedan1.seatNum = 5;
		
		Truck truck1 = new Truck();
		truck1.upSpeed(100);
		truck1.capacity = 50;
		
		System.out.println("승용차 속도는 " + sedan1.speed + "km, 좌석 수는 " + sedan1.getSeatNum()+"개입니다.");
		System.out.println("트럭의 속도는 " + truck1.speed + "km, 적재량은 " + truck1.getCapacity()+"톤 입니다.");
	}

}
