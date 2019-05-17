package Part2;

public class Doctor extends Person{
	public String speciality; 
	public double officeFee;
	
	Doctor(String name, double officeFee, String speciality)
	{
		super(name);
		this.officeFee = officeFee;
		this.speciality = speciality;
	}
	
	public void writeOuput() 
	{
		super.writeOutput();
		System.out.println("Office Fee: $" + this.officeFee);
		System.out.println("Speciality: " + this.speciality);
	}
}
