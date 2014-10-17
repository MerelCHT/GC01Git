
public class Bubblesort {
	
	//This initialises the array that needs to be sorted
	public static void main(String[] args)
	{
		int[] A = {1, 84, 69, 76, 86, 94, 91, 121};
		//Makes an int to temporarily store an int
		int temporary;
		for(int i = 0; i < A.length; i++)
		{
			for(int j = 1; j < A.length; j++)
			{
				if(A[i] < A[j - 1])
				{
					temporary = A[j-1];
					A[j - 1] = A[i];
					A[i] = temporary;
				}
			
			}
		}
		for(int n = 0; n < A.length; n++)
		{
			System.out.println(A[n]);
		}
	}

}
