package chap06;

public class Car {
	int speed;
	int getSpeed()
	{
		return speed;
	}
	void keyTurnOn()
	{
		System.out.println("시동 ON");
	}

	void run()
	{
		for(int i=0;i<=5;i++)
		{
			speed = i;
			System.out.println("달립니다.(시속: "+speed+"km/h)");
		}
	}
}
