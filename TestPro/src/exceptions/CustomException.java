package exceptions;

public class CustomException {
	public static void main(String[] args) {
		ATM atm=new ATM();
		
		int balance;
		try {
			balance = atm.withdraw(5100);
			System.out.println("Your balance is "+balance);
		} catch (NegativeBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println("Insufficient Balance "+e.getMessage());
		}
	}
}


class ATM{
	private int balance;
	public ATM(){
		balance=500;
	}
	public int withdraw(int amount) throws NegativeBalanceException{
		if(amount>balance)
			throw new NegativeBalanceException();
		balance=balance-amount;
		return balance;
	}
}

class NegativeBalanceException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The balance amount baceme Negative ";
	}
}
