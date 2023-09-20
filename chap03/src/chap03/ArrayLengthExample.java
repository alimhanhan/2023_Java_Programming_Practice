package chap03;

public class ArrayLengthExample {

	public static void main(String[] args) 
	{
		int[] s = {83, 90, 87};
		
		int sum = 0;
		for(int i=0;i<s.length;i++)
		{
			sum += s[i];
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum/s.length;
		System.out.println("평균: " + avg);
	}
}
