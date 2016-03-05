package test;

public class Encapsulation {
	public static void main(String[] args) {
		Account myAccount=new Account();
		System.out.println("Balance="+myAccount.getAccountBalance());
		myAccount.withdradAmount(600);
		System.out.println("Balance="+myAccount.getAccountBalance());
		
	}
}

class Account{
	private int accountBalance=500;

	public int getAccountBalance() {
		return accountBalance;
	}

	public void withdradAmount(int amount){
		if(accountBalance-amount<0){
			System.out.println("Insufficient Balance");
		}
		else{
			accountBalance=accountBalance-amount;
		}
	}
	
}
