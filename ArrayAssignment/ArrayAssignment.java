package ArrayAssignment;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayAssignment {
	
	public static final int ARRAY_SIZE = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[ARRAY_SIZE];
		
		Scanner keyboard = new Scanner(System.in);
		int uqNums = 0;
		int nextNum;
		System.out.print("Enter a set of 5 numbers: ");
		for(int i = 0; i < ARRAY_SIZE ; i++)
		{
			nextNum = keyboard.nextInt();
		
			
			boolean inArray = false;
			for(int j = 0; j <= uqNums; j++)
			{
				if(numbers[j] == nextNum)
				{
					inArray = true;
					break;
				}
			}
			
			if(!inArray)
			{
				numbers[uqNums] = nextNum;
				uqNums++;
				
			}
			
		}
		keyboard.close();
		System.out.print("The unique numbers are : " );
		for(int i = 0; i < uqNums; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		
	}

}
