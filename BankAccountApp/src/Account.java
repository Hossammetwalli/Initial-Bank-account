
public abstract class Account implements IBaseRate {
	
	//List common properties for saving and checking accounts name, SSN, balance
	//constructor to set based properties and initialize the account like deposit, withdraw,transfer show info

	String name;
	String SSN;
	double balance;
	double rate;
	String accountNo;
	double initDeposit;
	static int index = 10000;
	
	public abstract void setRate();
	
public Account(String name, String SSN, double balance) {
		this.name= name;
		this.SSN=SSN;
		this.balance= balance;
		
		//System.out.println(name+SSN+balance);
		
		// set account number
		index++;
		this.accountNo = setAccountNumber();
		setRate();
		
		
	}



private String setAccountNumber() {
	String lastTwoOfSSN= SSN.substring(SSN.length()-2, SSN.length());
	int uniqueID = index;
	int randomNumber = (int)(Math.random()* Math.pow(10, 3));
	
	return lastTwoOfSSN+ uniqueID+randomNumber;
}

public void showInfo() {
	System.out.println("Name " + name + 
			"\n Account Number:- " +accountNo
			+"\nBalance " + balance+
			"\nRate is " + rate +" %");
			
}

public void withdraw(double amount) {
	balance = balance -amount;
	
	System.out.println("Withdraw $ "+ amount + " and the balance is $ "+ balance);
}
public void deposit(double amount) {
	balance = balance + amount;
	System.out.println("deposit $ "+ amount + " and the balance is $ "+ balance);
}
public void transfer(String toWhere, double amount) {
	balance = balance - amount;
	System.out.println("Transfer $ " + amount +"To "+ toWhere +"and the balance is $ "+ balance);
	
}

public void compound() {
	double accruedInterest = balance * rate/100;
	balance = balance + accruedInterest;
	System.out.println("Accured interest amount is: $ "+ accruedInterest +"\nand the balance is: $"+ balance);
	
}

}
