package Prac02;

public class Car {

	private String color;
	int speed;
	
	void upSpeed(int value)
	{
		speed = speed + value;
	}
	
	void downSpeed(int value)
	{
		speed = speed - value;
	}
}
