package chap03; //[실습4] 배열

public class ArrayInArrayExample {

	public static void main(String[] args) 
	{
		int[][] aa = new int[3][3];
		int value = 1;
		
		for(int p = 0; p<aa.length; p++)
		{
			for(int b=0; b<aa.length; b++)
			{
				aa[p][b] = value;
				value++;
			}
		}
		
		for(int k=0; k<aa.length;k++)
		{
			for(int pp=0;pp<aa.length;pp++)
			{
				System.out.printf("%3d", aa[k][pp]);
			}
			System.out.println();
		}
	}
}
