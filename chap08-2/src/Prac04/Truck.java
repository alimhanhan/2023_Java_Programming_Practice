package Prac04;

public class Truck extends Car
{
	int capacity;
	
	public Truck(String color, int speed, int capacity)
	{
		super(color, speed);
		this.capacity = capacity;
	}
	
	int getCapacity()
	{
		return capacity;
	}
}