package ErrorHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
class ErrorHandling {

	public static final int ARRAY_SIZE = 100;
	private static int randomNum()
	{
		return(int)(Math.random() * 10000);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[ARRAY_SIZE];
		Scanner keyboard = new Scanner(System.in);
		boolean running = true;
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = randomNum();
		}

		int ndx;

		System.out.print("\nEnter an index: ");
		try {
			ndx = keyboard.nextInt();
			System.out.print("The number is: " + numbers[ndx]);
		}catch(InputMismatchException e)
		{
			System.out.print("A non integer character was entered");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("The index was out of range");
		} 







	}





}


