package chap03;

public class String3Example
{
	public static void main(String[] args)
	{
		String strVar1 = "Java 공부 중";
		String strVar2 = "Java 공부 중";
		
		if(strVar1 == strVar2)
		{
			System.out.println("strVar1과 strVar2는 참조가 같다.\n");
		}
		else
		{
			System.out.println("strVar1과 strVar2는 참조가 같지 않다.\n");
		}
		
		if(strVar1.equals(strVar2)) 
		{
			System.out.println("strVar1과 strVar2는 문자열이 같다.\n");
		}
		
		String strVar3 = new String("Java 공부 중");
		String strVar4 = new String("Java 공부 중");
		
		if(strVar3 == strVar4)
		{
			System.out.println("strVar3과 strVar4는 참조가 같다.\n");
		}
		else
		{
			System.out.println("strVar3과 strVar4는 참조가 다르다.\n");
		}
		
		if(strVar3.equals(strVar4))
		{
			System.out.println("strVar3과 strVar4는 문자열이 같다.\n");
		}
	}
}