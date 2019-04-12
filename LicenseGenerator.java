
public class LicenseGenerator {
	
	
	public static char  genLetter()
	{
		char randChar = (char)((Math.random() * 25) + 65);
		return randChar;
	}
	public static char genNumber()
	{
		char randNum = (char)((Math.random() * 9) + 48);
		return randNum;
	}
	public static void main (String args[])
	{
		StringBuffer number = new StringBuffer();
		for(int i = 0; i < 7; i++)
		{
			number.append((i < 3) ? genLetter() : genNumber());
		}
		System.out.print(number);
	}

}
