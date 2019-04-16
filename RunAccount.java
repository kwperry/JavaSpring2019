
public class RunAccount {

	public static void main(String[] args) {
		
		Account account1 = new Account(20500f,1122);
		account1.printAccountInfo();
		
		account1.widthdraw(2500f);
		account1.printAccountInfo();
		account1.deposit(3000);
		account1.printAccountInfo();

	}

}
