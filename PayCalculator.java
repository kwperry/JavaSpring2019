
public abstract class PayCalculator {
	private double payRate;
	public double getPayRate()
	{
		return this.payRate;
	}
	PayCalculator(double payRate)
	{
		this.payRate = payRate;
	}
	public double getPay(int hours)
	{
		return hours*payRate;
	}
	public void changeRate(double newRate)
	{
		this.payRate = newRate;
	}

}
