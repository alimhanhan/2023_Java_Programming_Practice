package chap03; //3주차 문자열 실습1

public class String1Example
{
	public static void main(String[] args)  //"String[] args"는 꼭 있어야 하는 부분이다.
	{
		String s1 = "Hi, java!";
		String s2 = "Hi, java!";
		String s3 = new String("Hi, java!");
		String s4 = new String("Hi, java!");
		
		System.out.print("s1 == s2 -> " + (s1 == s2) + "\n");
		System.out.print("s1 == s3 -> " + (s1 == s3) + "\n");
		System.out.print("s1 == s2 -> " + (s3 == s4) + "\n");
		
		s1 = s3;
		System.out.print("s1 == s3 -> " + (s1 == s3));
	}
}