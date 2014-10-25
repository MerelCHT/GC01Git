import java.util.Scanner;
public class Ex1 {

	//This will take the user input and evaluate whether the integer that has been entered is even or not. 
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer.");
		int number = input.nextInt();
		System.out.println(isEven(number));
	}


	public static boolean isEven(int number)
	{
		boolean isEven = (number % 2 == 0);
		return isEven;
		// return !(number%2);
		
		/* The use of a local variable: 
		boolean isEven = false;
		if (number % 2 == 0)
		{
			isEven =  true;
		}
		return isEven;
		*/
	} 
}
