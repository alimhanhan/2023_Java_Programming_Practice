package chap05;

class Circle2
{
	int r;
	
	public Circle2(int r)
	{
		this.r = r;
	}
	
	public double getArea()
	{
		return 3.14*r*r;
	}
}

public class ReferencePassing {

	public static void main(String[] args) 
	{
		Circle2 pizza = new Circle2(10);
		
		increase(pizza);
		
		System.out.println(pizza.r);
	}
	
	static void increase(Circle2 m)
	{
		m.r++;
	}

}
