
public class HazzardPay extends PayCalculator{
	
	
	HazzardPay(double payRate) {
		super(payRate);
		// TODO Auto-generated constructor stub
	}

	public double getPay(int hours)
	{
		
		return super.getPay(hours) * 1.5;
	}
}
