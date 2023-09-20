package chap03;

public class quiz2 {

	public static void main(String[] args) 
	{
		int time[] = {42, 66, 57, 54, 88, 64, 71};
		int sum = 0;
		double average = 0.0;
		
		for(int i : time)
		{
			sum += i;
		}
		
		average = (double)sum/time.length;
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + average);
	}

}
