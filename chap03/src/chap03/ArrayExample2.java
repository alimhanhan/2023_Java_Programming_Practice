package chap03;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println("\n");
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0;i<3;i++)
		{
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println("\n");
		double[] arr2 = new double[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println("\n");
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0;i<3;i++)
		{
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println("\n");
		String[] arr3 = new String[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		System.out.println("\n");
		for(int i=0;i<3;i++)
		{
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
