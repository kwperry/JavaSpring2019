import java.util.Scanner;

public class GasCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		double distance;
		double gasPrice;
		double mpg; //miles per gallon
		double total;
		
		System.out.print("Enter the distance driven: ");
		distance = keyboard.nextDouble();
		
		System.out.print("\nEnter the miles per gallon of your car: ");
		mpg = keyboard.nextDouble();

		
		System.out.print("\nEnter the price of gas: ");
		gasPrice = keyboard.nextDouble();
		
	
		total = (distance / mpg) * gasPrice;
		System.out.print("The total cost is $" + total);
		
	}

}
