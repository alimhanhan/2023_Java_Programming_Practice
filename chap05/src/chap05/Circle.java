package chap05;

public class Circle {
	
	int radius;
	String name;

	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();
		
		pizza.radius = 10;
		pizza.name = "자바피자";
		System.out.println(pizza.name + "의 반지름은 " + pizza.radius);
		
		Circle donut = new Circle();
		
		donut.radius = 10;
		donut.name = "자바도넛";
		System.out.println(donut.name + "의 반지름은 " + donut.radius);
	}

}
