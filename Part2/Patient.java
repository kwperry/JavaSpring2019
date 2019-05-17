package Part2;

public class Patient  extends Person{
	
	String idNumber;
	
	Patient(String name, String id)
	{
		super(name);
		this.idNumber = id;
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Social Security #: " + this.idNumber);
	}

}
