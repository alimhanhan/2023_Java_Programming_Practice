package chap03;

public class ForEachExample {

	public static void main(String[] args) 
	{
		int scores[] = { 95, 71, 84, 93, 87 };
		int sum = 0;
		
		for(int score : scores)
		{
			sum += score;
		}

		System.out.println("점수의 총합: " + sum);
		
		double average = sum / scores.length;
		System.out.println("점수들의 평균: " + average);
	}
}
