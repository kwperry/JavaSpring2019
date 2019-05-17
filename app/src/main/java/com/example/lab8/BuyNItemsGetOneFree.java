




package com.example.lab8;
public class BuyNItemsGetOneFree extends DiscountClass {

	private int n;
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	@Override
	float computeDiscount(int count, float itemCost) {
		
	
		return (count / this.n) * itemCost;
	}
	BuyNItemsGetOneFree(int n)
	{
		super();
		this.n = n;
	}

}
