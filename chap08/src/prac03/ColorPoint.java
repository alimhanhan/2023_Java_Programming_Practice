package prac03;

class Point
{
	int x, y;
	
	public void set(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void showPoint()
	{
		System.out.println("("+x+","+y+")");
	}
}

public class ColorPoint extends Point{
	
	String color;
	
	void setColor(String color)
	{
		this.color = color;
	}

	void showColorPoint()
	{
		System.out.println(color);
		showPoint();
	}
}
