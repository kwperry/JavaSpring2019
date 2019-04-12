import java.util.Scanner;
public class HarrisBenedict {
	//Constant amount of calories a candy bar has
	public static final int CandyBar = 230;
	
	//returns the raw calories needed to maintain weight, without the multiplier
	//used for females
	static float calcBMGFemale(float weight, int age, float height)
	{
		float bmg = (float) (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));
		return bmg;
	}


	//returns the raw calories needed to maintain weight, without the multiplier
	//used for males
	static float calcBMGMale(float weight,int age ,float height)
	{
		float bmg = (float) (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));
		return bmg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		float weight, height; // 
		int age;
		int decision;
		float activityMultiplier;
		float totalCalories;
		float numCandies;
		

		String gender;
		
		System.out.print("This program will calculate how many candy bars\n"
				+ "in order to maintain your weight\n");
		//get age weight and height from the user
		System.out.print("Enter your age in years: ");
		age = keyboard.nextInt();
		System.out.print("Enter your height in inches: ");
		height = keyboard.nextFloat();
		System.out.print("Enter your weight in lbs: ");
		weight = keyboard.nextFloat();

		do 
		{
			//keep the user entering until they input m or f
			System.out.print("Enter your gender (M/F): ");
			gender = keyboard.next();
			gender = gender.toLowerCase();
		}while(!(gender.equals("m") || gender.equals("f")));
		
		//prompt the user for their activity level
		System.out.print("What is your activity level?"
				+ "\n1) Sedentary"
				+ "\n2)Somewhat Active(exercise  occasionally)"
				+ "\n3)Active (exercise  4-5 days a week)"
				+ "\n4)Highly Active (exercise every day )"
				+ "\nEnter 1,2,3, or 4: ");
		decision = keyboard.nextInt();
		keyboard.close();
		
		//get their activity multiplier by multiplying 0.1 times their decision
		//then add it to 1.1 to get their total multiplier
		activityMultiplier = (float) (1.1 + (0.1 * (float)decision));
		
		//get calories by passing user input to its respective formula
		totalCalories = (gender.equals("m")) ? calcBMGMale(weight,age,height) : calcBMGFemale(weight,age,height);
		
		//multiply it by their activity multiplier
		totalCalories *= activityMultiplier;
		
		//divide by the number of calories in a candy bar
		numCandies = totalCalories/(float)CandyBar;
		
		//print out the number of candy bars the user can eat
		//with a precision of 2 decimal places
		System.out.format("the number of candy bars you should eat is: %.2f", numCandies);
		

	}

}


