
public class Checking extends Account {
	
	// list properties for checking acocunts
	
	long debitCardNumber;
	int debitCardPIN;
	// constructor to initialize checking account properties
	//Debt card list any methods to the checking accounts
	
	

	

	public Checking(String name, String SSN, double balance) {
		super(name, SSN, balance);
		accountNo = "2"+accountNo;
		
		debitCardNumber();
		debitCardPIN();
		//System.out.println(this.accountNo);
	}
	
	private void debitCardPIN() {
		debitCardPIN = (int)(Math.random()* Math.pow(10, 4));
		
	}

	private void debitCardNumber() {
		debitCardNumber= (long)(Math.random()* Math.pow(10, 12));
		
	}

	public void showInfo() {
		System.out.println("AccountType: Checking account");
		super.showInfo();
		System.out.println("Checking account feature:"
				+ "\ndebitCardNumber " +debitCardNumber
				+ "\ndebitCardPIN "+ debitCardPIN);
		
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
		
	}
	
}
