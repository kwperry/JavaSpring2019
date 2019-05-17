package application;

public class HarrisBenedict {
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

	static float getMultiplier(String activityLevel)
	{
		switch(activityLevel)
		{
			case "Active":
				return 1.4f;
			case "Highly Active":
				return 1.5f;
			case "Sedentary":
				return 1.2f;
			case "Somewhat Active":
				return 1.3f;
			default:
				return 0;
		}
	}
	
}
