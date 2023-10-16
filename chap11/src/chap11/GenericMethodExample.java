package chap11;

public class GenericMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray = {1,2,3,4,5};
		Character[] charArray = {'H','E','L','L', 'O'};

		Utils.showArray(intArray);
		Utils.showArray(charArray);
		
		System.out.println(Utils.getLast(intArray));
		System.out.println(Utils.getLast(charArray));
	}

}

class Utils
{
	public static <T> void showArray(T[] a)
	{
		for( T temp : a)
		{
			System.out.printf("%s", temp);
		}
		System.out.println();
	}
	
	public static <T> T getLast(T[] a)
	{
		return a[a.length - 1];
	}
}