package sec01;  //변수 실습

public class VariableExample 
{
	public static void main(String[] args) 
	{
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간" + minute + "분");
		
		if(hour>0)
		{
			int newHour = 7;
			hour = newHour;
			System.out.println(hour + "시간" + minute + "분");
		}
		
		System.out.println(hour + "시간" + minute + "분");
	}
}