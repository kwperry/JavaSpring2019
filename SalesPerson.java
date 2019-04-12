
public class SalesPerson {
	
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void print()
	{
		System.out.print("Hello, " + getFirstName() + " " + getLastName() );
	}
	
	public boolean equals(SalesPerson p)
	{
		boolean result;
		result = (p.getFirstName().equals(getFirstName()) && p.getLastName().equals(getLastName()));
		return result;
	}
	
	public static float calculateCommisson(float commissionRate, int salesAmount)
	{
		return commissionRate * salesAmount;
	}
	public static  float calculateCommisson(float commissionRate, float salesAmount)
	{
		return commissionRate * salesAmount;
	}
	public SalesPerson() {}
	public SalesPerson(String fname, String lname)
	{
		setFirstName(fname);
		setLastName(lname);
	}
	
	

}
