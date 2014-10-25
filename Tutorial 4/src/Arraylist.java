import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Arraylist {
	
	public static void main(String[] args){
		
		//Create a new arraylist.
		ArrayList aList = new ArrayList();
		Random rand = new Random();
		
		//Create a new arraylist to store odd values. 
		ArrayList bList = new ArrayList();
		
		//Fill the arraylist with a 100 random integers (range 0-10).
		for(int j = 0; j < 10; j++){
			aList.add(rand.nextInt(10));
		
		//Take all the even numbers in aList and calculate the sum of the numbers.
		int sum = 0;
		for(int i = 0; i < aList.size(); i++){
			int checkEven = (int) aList.get(i);
			if(checkEven % 2 == 0)
			{
				sum = sum + checkEven;
			}	
			//Remove all the odd elements in aList. Add them to bList. 
			else
			{
				bList.add(checkEven);
				aList.remove(i);				
			}
		}
		System.out.println(sum);
		}
		
		//Add the odd numbers at the end of aList. 
		for(int k = 0; k < bList.size(); k++){
			int odd = (int) bList.get(k);
			aList.add(odd);
		}
		
		System.out.println("bList which is made up of the odd numbers removed from aList: ");
		System.out.println(bList);
		System.out.println("aList after removing the odd numbers and adding them to the end: ");
		System.out.println(aList);
		
	//Create an Array of integers out of the new aList.
	Integer[] anArray = new Integer[aList.size()];
	aList.toArray(anArray);
	
	//Use Arrays.toString to print out the values of the array.
	System.out.println(Arrays.toString(anArray));
	
	}
	
	
	}


