wpackage comm.oop.exceptions;
class InsufficientFundsException extends Exception{
	
}
class Bank{
	double balance;
	Bank(double balance){
		this.balance=balance;
	}
	void withdraw(double amount) throws InsufficientFundsException {
		if(this.balance==0.0) {
			throw new InsufficientFundsException();
		}
		this.balance= this.balance-amount;
		
	}
}
public class UseChekedException {

	public static void main(String[] args) throws InsufficientFundsException {
		Bank b = new Bank(200000.0);
		b.withdraw(1000);
		System.out.println("Withdraw is successful");
		System.out.println("your remaing balance");
		System.out.println(b.balance);
		// TODO Auto-generated method stub

	}

}
