
public class Ex2 {
	
	public static void main(String[] args)
	{
		String[] arr = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog."};
		arr = remElement(arr, 7);
		System.out.println(arr);
		
	}
	
	public static String[] remElement(String[] array, int i)
	{
		String[] arr2 = new String[array.length];
		for(int n = 0; n < array.length - 1 ; n++)
		{
			if(n < i)
			{
				arr2[n] = array[n];
			}
			else
			{
				arr2[n] = array[n + 1];
			}
			
			System.out.println(arr2[n]);
		}
		
		return array;
		
		
	}

}
