package chap05;  //실습 1-3

public class ArrayPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		
		increase(a);
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	static void increase(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			array[i]++;
		}
	}
}
