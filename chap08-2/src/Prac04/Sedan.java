package Prac04;

public class Sedan extends Car{

	int seatNum;
	
	int getSeatNum()
	{
		return seatNum;
	}
	
	void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	void upSpeed(int speed)
	{
		this.speed = this.speed + speed;
		
		if(this.speed > 200)
		{
			this.speed = 200;
		}
	}
}
