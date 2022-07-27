package Machine;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface{
	ATM atm = new ATM();
	Map<Double,String> ministmt = new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is : "+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(withdrawAmount<=atm.getBalance()) {
			ministmt.put(withdrawAmount, "Amount Withdrawn");
			System.out.println("Collect the Cash "+ withdrawAmount);
			atm.setBalance(atm.getBalance()- withdrawAmount);
			viewBalance();
	    }
		else {
			System.out.println("Insufficient Balance !!");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		ministmt.put(depositAmount, "Amount Withdrawn");
		System.out.println(depositAmount +" Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		// TODO Auto-generated method stub
		
	}
	
}
