package homeExercise;

public class Exercise13Bank {
	
	private static String bankName = "MyBank";
	private String address;
	private int totalEmployees;
	private double balance;
		
	public Exercise13Bank(String bankAddress, int totalEmployees, double balance) {		
		this.address = bankAddress;
		this.totalEmployees = totalEmployees;		
	}
	
	public Exercise13Bank() {
	}
	
	public double makeDeposit(double x) {
		System.out.println("Made deposit to Bank. New balance:  "+(balance+x));
		return balance + x;
	}
	
	public double withdrawMoney (double y) {
		System.out.println("Made withdrawl from Bank using cheque. New balance: "+(balance-y-0.1));
		return balance - y - 0.1;
	}

	public String getBankName() {
		return bankName;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String bankAddress) {
		this.address = bankAddress;
	}

	public int getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}	
}