package Lab4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class RunLedger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double target;

		int max;
		System.out.print("Enter a the max amount of records: ");
		try {
			max = keyboard.nextInt();
		}catch(InputMismatchException e)
		{
			System.out.println("A non integer character was entered");
			return;
		} 
		Ledger ledger = new Ledger(max);
		try {
			ledger.addSale(3.14);
			ledger.addSale(7.14);
			ledger.addSale(12.14);
			ledger.addSale(5.14);
			ledger.addSale(45.14);
			ledger.addSale(7.14);
			ledger.addSale(3.14);
			ledger.addSale(2.14);
			ledger.addSale(15.14);
			ledger.addSale(23.14);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("More sales were added than the max");
		}

		System.out.print("Enter target amount: $");
		try {
			target = keyboard.nextDouble();
		} catch(InputMismatchException e)
		{
			System.out.print("A non integer character was encountered, exiting program");
			return;
		}

		System.out.println("Total sales: $" + ledger.getTotalSales());
		System.out.println("Total sales made: " +  ledger.getNumberOfSales());
		System.out.println("Average sales amount: $" +ledger.getAverageSales());
		System.out.println("The number of sales greater than " + target +
				" is: " +ledger.getCountAbove(target) );


	}

}
