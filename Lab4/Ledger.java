package Lab4;

public class Ledger {
	
	private double[] sales;
	private int salesMade;
	private int maxSales;
	Ledger(int max)
	{
		maxSales = max;
		salesMade = 0;
		sales = new double[max];
	}
	
	


	public void addSale( double d)
	{
		sales[salesMade] = d;
		salesMade++;
	}
	
	public int getNumberOfSales() {
		return salesMade;
	}
	
	public double getTotalSales()
	{
		double total = 0;
		int counter = 0;
		while( counter < sales.length)
		{
			if(sales[counter] == 0)
			{
				break;
			}
			total += sales[counter];
			counter++;
		}
		return total;
	}
	
	public double getAverageSales() {
		return getTotalSales()/getNumberOfSales();
	}
	
	public int getCountAbove(double target) 
	{
		int total = 0;
		for(int i = 0; i < maxSales; i++)
		{
			if(sales[i] > target)
			{
				total++;
			}
		}
		return total;
	}
	

}
