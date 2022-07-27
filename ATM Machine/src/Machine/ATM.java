package Machine;

public class ATM {
	private double balance;
	private double depositAmount;
	private double withdrawAmount;
	//default constructor
	public ATM() {
		
	}
	//getter setter
	public double getBalance() {
		return balance;
	}
	public void setBalance(double depositAmount) {
		// TODO Auto-generated method stub
		this.depositAmount = depositAmount;
		this.balance = depositAmount;
	}
}
