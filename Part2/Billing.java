package Part2;

public class Billing {

	public String doctorName;
	public String patientName;
	public double billingAmount;
	public static double totalBills = 0;

	Billing(Patient p, Doctor d)
	{
		this.doctorName = d.getName();
		this.billingAmount = d.officeFee;
		this.patientName = p.getName();
		totalBills += d.officeFee;
	}
	
	public void writeOutput()
	{
		System.out.println("Doctor: " + this.doctorName);
		System.out.println("Patient: " + this.patientName);
		System.out.println("Fee: $" + this.billingAmount);
		System.out.println("===============================");
	}
	boolean equals(Billing b)
	{
		boolean test = true;
		if(!this.doctorName.equals(b.doctorName))
		{
			test = false;
		}else if (!this.patientName.equals(b.patientName))
		{
			test = false;
		}else if(this.billingAmount != b.billingAmount)
		{
			test = false;
		}

		return 	test;
	}

}
