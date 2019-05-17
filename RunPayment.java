
public class RunPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPay  pay1 = new RegularPay(7.5);
		HazzardPay pay2 = new HazzardPay(7.5);

		double hazPay = pay2.getPay(40);
		double regPay = pay1.getPay(40);

		System.out.println("Regular pay at 7.5 dollars an hour for 40 hours is: " + regPay);
		System.out.println("Hazzard pay at 7.5 dollars an hour for 40 hours is: " + hazPay);

		pay1.changeRate(17);
		pay2.changeRate(17);

		hazPay = pay2.getPay(40);
		regPay = pay1.getPay(40);

		System.out.println("Regular pay at 17 dollars an hour for 40 hours is: " + regPay);
		System.out.println("Hazzard pay at 17 dollars an hour for 40 hours is: " + hazPay);
	}

}
