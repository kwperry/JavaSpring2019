package Part2;

public class runPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor spock = new Doctor("Spock",200 , "Pediatrician");
		Doctor doLittle = new Doctor("doLittle",175 , "Witch");


		Patient hobbes = new Patient("Hobbes", "123-45-6789" );
		Patient calvin = new Patient("Calvin", "987-65-4321" );

		Billing record1 = new Billing(calvin, spock);
		Billing record2 = new Billing(hobbes, spock);
		Billing record3 = new Billing(calvin, doLittle);


		System.out.println("Two doctors created");
		spock.writeOuput();
		doLittle.writeOuput();

		System.out.println("Two patients created");
		hobbes.writeOutput();
		calvin.writeOutput();


		System.out.println("Three billing records created");
		record1.writeOutput();
		record2.writeOutput();
		record3.writeOutput();

		System.out.println("Total amount of bills: $" +  Billing.totalBills);
		System.out.println("record 1 and record 2 are " + (record1.equals(record2) ? "equal" : "not equal"));

	}

}
