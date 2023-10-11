package Prac04;

public class Car {
	private String color;
	int speed;
	
	Car(){};
	
	Car(String color, int speed)
	{
		this.color = color;
		this.speed = speed;
	}
	
	String getColor()
	{
		return color;
	}
	
	void upSpeed(int value)
	{
		speed = speed + value;
	}
	
	void downSpeed(int value)
	{
		speed = speed - value;
	}
}