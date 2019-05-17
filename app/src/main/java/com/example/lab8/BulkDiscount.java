
package com.example.lab8;

public class BulkDiscount extends DiscountClass {

	private int minium;
	private float percent;
	
	@Override
	float computeDiscount(int count, float itemCost) {
		if(count > this.minium)
		{
			return count  * (itemCost * this.percent/100);
		}
		return 0;
	}
	BulkDiscount(int minimum, float percent)
	{
		super();
		this.minium = minimum;
		this.percent = percent;
	}
	public int getMinium() {
		return minium;
	}
	public void setMinium(int minium) {
		this.minium = minium;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}

}
