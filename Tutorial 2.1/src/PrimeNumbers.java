import java.util.Scanner;
public class PrimeNumbers {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//This asks the user to enter an integer.
		System.out.println("Please enter an integer.");
		
		//This if statement checks whether the user has entered an integer or not. 
		//If so, it continues to evaluate whether this number is a prime or not.
		//It not, the system will tell the user that he/she didn't enter an integer, and then it will 
		//round the entered value of to the nearest integer and evaluate whether that integer is a prime or not. 
		if(input.hasNextInt())
		{
			int checkInt = input.nextInt();
			System.out.println("Is " + checkInt + " a prime number? \n"  + isPrime(checkInt));	
			
		}
		else{
			System.out.println("This is not an integer!");
			int checkInt = (int) Math.round(input.nextDouble());
			System.out.println("Is " + checkInt + " a prime number? \n"  + isPrime(checkInt));	
		}
		
	}

	public static boolean isPrime(int n)
	{
		if(n == 1)
		{
			return false;
		}
		
		else if(n == 2)
		{
			return true;
		}
		
		else if(n % 2 == 0)
		{
			return false;
		}
		
		for (int i = 3; i * i <= n; i += 2)
			{
				if (n % i == 0)
				return false;
			}
		return true;	
	}
}
