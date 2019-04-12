import java.util.Scanner;
public class SentinalValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int maxNum = 0; //store the max number in a variable
		int maxCount = 0;//store the number of times the max number appears
		
		
		
		System.out.print("This program will calcute the biggest number in a list"
				+ "\nand will find how many times it occurs. Enter a sequence like 1 3 4 5 3 4 0"
				+ "\n'0' terminates the sequence. \nEnter some numbers: ");
		
		
		//make a variable to buffer the numbers read in 
		//initialize it to zero in order to be as small as possible
		int currentNum = 0;
		
		//read in numbers until 0 is hit
		do 
		{
			//get the next number entered in
			currentNum = keyboard.nextInt();
			
			//checks to see if the current number 
			//is greater than the max number
			//if true reset the max count to 1
			//set the max number to the current number
			//if the current number is equal to the max number
			//increment the max count
			if(currentNum > maxNum)
			{
				maxCount = 1;
				maxNum = currentNum;
			} else if(currentNum == maxNum)
			{
				maxCount++;
			}
		}while(currentNum != 0);
		
		keyboard.close();
		System.out.print("The biggest number was " + maxNum + " it appeard"
				+ " " + maxCount + " times");

	}

}
