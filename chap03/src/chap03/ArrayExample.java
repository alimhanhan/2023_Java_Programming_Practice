package chap03;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum1 = 0;
		for(int i = 0; i<3; i++)
		{
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		int scores2[] = {83, 90, 87};
		
		int sum2 = 0;
		for(int i=0;i<3;i++)
		{
			sum2 += scores2[i];
		}
		System.out.println("총합 : " + sum2);
		
		int[] scores3;
		scores3 = new int[] {83, 90, 87};
		
		int sum3 = 0;
		for(int a=0; a<3; a++)
		{
			sum3 += scores3[a];
		}
		System.out.println("총합 : " + sum3);
	}
}
