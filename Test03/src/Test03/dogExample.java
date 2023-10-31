package Test03;

public class dogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog first = new dog(2,"플로라", "포메라니안");
		dog second = new dog(3, "마리", "치와와");
		
		System.out.println("첫 번째 강아지의 정보: "+ first.age + "살, " + "이름은 " + first.name +", 종은 "+first.sort);
		System.out.println("첫 번째 강아지의 정보: "+ second.age + "살, " + "이름은 " + second.name +", 종은 "+second.sort);
		
		System.out.print("\n");
		System.out.print(first.name + ": ");
		first.bark();
		System.out.print(first.name + ": ");
		first.wag();
		
		System.out.print(second.name + ": ");
		second.bark();
		System.out.print(second.name + ": ");
		second.wag();
	}

}
