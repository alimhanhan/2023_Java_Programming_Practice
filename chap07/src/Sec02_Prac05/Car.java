package Sec02_Prac05;

public class Car {
	String model;
	int speed;
	
	Car(String model)
	{
		this.model = model;
	}
	
	void setSpeed(int speed)
	{
		this.speed = speed;
	}

	void run()
	{
		for(int i=0;i<=50;i+=10)
		{
			this.setSpeed(i);
			System.out.println(this.model + "이/가 달립니다.(시속: " + this.speed + "km/h)");
		}
		
		System.out.print("\n");
	}
}
