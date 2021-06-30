package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Axis bank :: Deposit interest rate is 8.5%");

	}
	public static void main(String[] args) {
		AxisBank interst= new AxisBank();
		interst.saving();
		interst.fixed();
		interst.deposit();
	}
}
