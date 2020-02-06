import java.util.LinkedList;
import java.util.List;

public class BankAccountMain {

	public static void main(String[] args) {
		/*
		Checking checkAc = new 	Checking("Toamomm", "123456789", 1500);
		
		Savings savingAc = new 	Savings("Tom", "123256779", 1200);
		//checkAc.showInfo();
		System.out.println("************************************");
		//savingAc.showInfo();
		
		savingAc.deposit(2500);
		savingAc.withdraw(1000);
		savingAc.transfer("Hossam", 500);
		savingAc.compound();
		
		*/
		
		// reading CSV file
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Users\\Hossam\\Desktop\\Accounts1.csv";
		
		
		List<String[]> newAccountHolders = Utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			
				String name = accountHolder[0];
				String SSN = accountHolder[1];
				String accountType = accountHolder[2];
				double initDeposit = Double.parseDouble( accountHolder[3]);
				
			//System.out.println(name +" "+ SSN +" "+ accountType+ " "+ initDeposit);
			
			if (accountType.equals(" saving ")) {
				
				accounts.add(new Savings(name, SSN, initDeposit));
				
			}
			else if (accountType.equals("Checking")) {
				
				accounts.add(new Checking(name, SSN, initDeposit));
			}
			else  {
				System.out.println("error account");
			}
			
			
			
		}
		
		//accounts.get(2).showInfo();
		for (Account acc : accounts) {
			System.out.println("\n");
			acc.showInfo();
		}
		
	}

}
