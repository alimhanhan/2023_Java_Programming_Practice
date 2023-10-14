package chap10;

public class SmartTelevision extends Television implements RemoteControl, Searchable
{

	@Override
	public void turnOn()
	{
		System.out.println("SmartTV를 켭니다.");
	}
	
	@Override
	public void turnOff()
	{
		System.out.println("SmartTV를 끕니다.");
	}
	
	@Override
	public void search(String url)
	{
		System.out.println(url + "을 검색합니다.");
	}
}
