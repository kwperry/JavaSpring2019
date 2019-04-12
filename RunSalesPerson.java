import java.util.Scanner;

public class RunSalesPerson {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String fname;
		String lname;
		float salesCommission;
		System.out.print("Enter the first name: ");
		fname = keyboard.next();
		System.out.print("Enter the last name: ");
		lname = keyboard.next();
		
		keyboard.close();
		
		SalesPerson person1 = new SalesPerson(fname , lname);
		person1.print();
		SalesPerson person2 = new SalesPerson();
	
		
		person2.setFirstName("Josh");
		person2.setLastName("Cormier");
		
		System.out.println("\nPerson1 & Person2 are " + (person1.equals(person2) ? "equal": " not equal"));
	
		salesCommission = SalesPerson.calculateCommisson(0.5f, 100);
		System.out.print("The commission is :$" + salesCommission);
		
		salesCommission = SalesPerson.calculateCommisson(0.5f, 100.5f);
		System.out.print("The commission is :$" + salesCommission);
		
	}

}
