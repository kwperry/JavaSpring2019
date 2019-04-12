import java.util.Scanner;

public class Fractions {
	
	//checks to see if the numerator is smaller than the 
	//denominator
	public static boolean IsProper(int num, int den)
	{
		return (num < den) ? true : false;
	}
	
	//checks to see if the numerator is divisible by
	//the denominator
	public static boolean IsWhole(int num, int den)
	{
		return (num % den == 0) ? true : false;
	}
	
	//returns the the greatest common denominator
	//between the numerator and the denominator 
	//if the denominator is 0 then the numerator is returned
	//otherwise the function is called again except with the 
	//Denominator in the numerator slot, and the remainder 
	//of the num and the denominator in the second slot
	//returns 1 if the fraction is in the most reduced form
	public static int GetGCD(int num, int den)
	{
		return (den == 0) ?  num :  GetGCD(den, num%den);
	}
	
	public static boolean FractionCalc(int numerator, int  denominator)
	{
	
		//check if the number is whole 
		//if it is then output the numerator divided by the numerator
		if(IsWhole(numerator,denominator))
		{
			int endNum = numerator/denominator;
			System.out.print("The fraction is a whole number it's : " + endNum + "\n");
		} 
		//if the fraction has a numerator smaller than the denominator
		//attempt to reduce it. 
		else if (IsProper(numerator, denominator))
		{ 

			int gcd = GetGCD(numerator, denominator);
			//checks to see if the fraction is in the most reduced form 
			// then outputs it
			if(gcd == 1)
			{
				System.out.print("The fraction is already in it's most reduced form"
						+ ": " + numerator + "/" + denominator + "\n");
			} 
			else 
			{	
				//reduces the fraction to its most reduced form then outputs it
				System.out.print("The reduced fraction is: "
						+ "" + numerator/gcd + "/" + denominator/gcd + "\n");
			}

		} 
		else
		{
			// gets the whole number of the fraction
			int wholeNum = numerator / denominator;
			
			//then calculates how much is left over
			int remainder = numerator % denominator;
			
			//finds the gcd of the remainder and the denominator
			//and reduces them if possible
			int gcd = GetGCD(remainder, denominator);
			if(gcd != 1)
			{
				denominator /= gcd;
				remainder /= gcd;
			} 
			
			//outputs the reduced mixed number
			System.out.print("The mixed number is " + wholeNum + "+" + remainder +"/"
					+ denominator + "\n");


		}
		//return true to continue looping the program
		return true;

	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);

		int num, den;
		int endNum;

		
		boolean run; 
		
		
		System.out.print("Welcome to the fraction calculator\n"
				+ "This will simplify fractions in mixed numbers, and proper fractions\n"
				+ "Enter 0 to exit the program\n");
		do 
		{
			//prompt the user for the numerator
			System.out.print("Enter the numerator: ");
			num = keyboard.nextInt();
			
			
			run = (num != 0) ? true:false;
			if(!run)
			{
				System.out.println("Exiting Program");
				keyboard.close();
				return;
			}
			
			//keep the user trapped if they input 0 as the denominator
			do
			{	
				
				System.out.print("Enter the denomintor: ");
				den = keyboard.nextInt();
			}while(den == 0);
			FractionCalc(num,den);
			
		}while(true);
	
	}

}
