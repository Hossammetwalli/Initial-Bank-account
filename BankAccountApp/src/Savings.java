
public class Savings extends Account {

	// list properties for saving account 
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	// constructor to initialize setting for saving properties
	
	public Savings(String name, String SSN, double balance) {
		super(name, SSN, balance);
		
		accountNo = "1"+accountNo;
		setSavetyDepositBox();
		safetyDepositBoxKey();
		//System.out.println(this.accountNo);
	}
	
	private void safetyDepositBoxKey() {
		safetyDepositBoxKey= (int)(Math.random()* Math.pow(10, 4));
		
		
	}

	private void setSavetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random()* Math.pow(10, 3));
		
		
	}

	public void showInfo() {
		System.out.println("AccountType: Saving account");
		super.showInfo();
		System.out.println("Saving account feature:"
				+ "\nsafetyDepositBoxKey " +safetyDepositBoxKey
				+ "\nsafetyDepositBoxID "+ safetyDepositBoxID);
		
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}
	
}
